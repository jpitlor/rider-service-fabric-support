param
(
    [PSCustomObject[]]
    $Profiles
)

Import-Module $([IO.Path]::Combine($PSScriptRoot, "service-fabric-sdk", "ServiceFabricSDK.psm1"))
Import-Module $(Join-Path $PSScriptRoot "Utils.psm1")

$clusters = New-List
foreach ($profile in $profiles)
{
    [void](Connect-ServiceFabricCluster `
        -TimeoutSec 5 `
        -ConnectionEndpoint "$($profile.host)`:$($profile.port)")
    $c = @{
        "Profile" = $profile
        "ApplicationTypes" = New-List
    }
    foreach ($application in Get-ServiceFabricApplication)
    {
        $applicationType = Get-ServiceFabricApplicationType -ApplicationTypeName $application.ApplicationTypeName

        $a = @{
            "Name" = $applicationType.ApplicationTypeName
            "RegisteredVersions" = @($applicationType.ApplicationTypeVersion)
            "Application" = $application
            "ServiceTypes" = New-List
        }
        foreach ($service in Get-ServiceFabricService -ApplicationName $application.ApplicationName.ToString())
        {
            $s = @{
                "Service" = $service
                "PartitionTypes" = New-List
            }
            foreach ($partition in Get-ServiceFabricPartition -ServiceName $service.ServiceName.ToString())
            {
                $p = @{
                    "Partition" = $partition
                    "Instances" = New-List
                }
                foreach ($instance in Get-ServiceFabricReplica -PartitionId $partition.PartitionId.ToString())
                {
                    $p["Instances"].Add($instance)
                }
                $s["PartitionTypes"].Add($p)
            }
            $a["ServiceTypes"].Add($s)
        }
        $c["ApplicationTypes"].Add($a)
    }
    $clusters.Add($c)
}

ConvertTo-Json -Depth 100 $clusters