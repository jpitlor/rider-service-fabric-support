param
(
    [Hashtable[]]
    $Clusters,

    [String]
    $LibPath
)

#Join-Path $LibPath "ServiceFabricSDK.psm1" | Import-Module -Name "$_"
#Join-Path $LibPath "Utils.psm1" | Import-Module -Name "$_"

function Get-ServiceFabricSdkModulesPath
{
    if ([string]::IsNullOrEmpty($SdkModulesPath) -eq $False -and $(Test-Path $SdkModulesPath -PathType Container)) {
        return $SdkModulesPath
    }

    $RegKey = "HKLM:\SOFTWARE\Microsoft\Service Fabric SDK"
    return (Get-ItemProperty -Path $RegKey -Name FabricSDKPSModulePath).FabricSDKPSModulePath
}

$ModuleFolderPath = Get-ServiceFabricSdkModulesPath
Import-Module "$ModuleFolderPath\ServiceFabricSDK.psm1"

function New-List
{
    New-Object System.Collections.Generic.List[Hashtable]
}

$result = New-List
foreach ($cluster in $clusters)
{
    $c = @{}
    $c["connection"] = Connect-ServiceFabricCluster "$($cluster["host"])`:$($cluster["port"])"
    $c["applications"] = New-List
    foreach ($application in Get-ServiceFabricApplication)
    {
        $a = @{
            "application" = $application
            "services" = New-List
        }
        foreach ($service in Get-ServiceFabricService -ApplicationName $application.ApplicationName.ToString())
        {
            $s = @{
                "service" = $service
                "partitions" = New-List
            }
            foreach ($partition in Get-ServiceFabricPartition -ServiceName $service.ServiceName.ToString())
            {
                $p = @{
                    "partition" = $partition
                    "instances" = New-List
                }
                foreach ($instance in Get-ServiceFabricReplica -PartitionId $partition.PartitionId.ToString())
                {
#                    $p["instances"].Add($instance)
                }
                $s["partitions"].Add($p)
            }
            $a["services"].Add($s)
        }
        $c["applications"].Add($a)
    }
    $result.Add($c)
}

$result