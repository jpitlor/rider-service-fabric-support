param
(
    [Hashtable[]]
    $Profiles
)

Import-Module $([IO.Path]::Combine($PSScriptRoot, "..", "service-fabric-sdk", "ServiceFabricSDK.psm1"))
Import-Module $(Join-Path $PSScriptRoot "Utils.psm1")

$clusters = New-List
foreach ($profile in $profiles)
{
    $c = @{
        "profile" = $profile
        "connection" = Connect-ServiceFabricCluster "$($profile["host"])`:$($profile["port"])"
        "applications" = New-List
    }
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
                    $p["instances"].Add($instance)
                }
                $s["partitions"].Add($p)
            }
            $a["services"].Add($s)
        }
        $c["applications"].Add($a)
    }
    $result.Add($c)
}

$clusters | ConvertTo-Json -Depth 100