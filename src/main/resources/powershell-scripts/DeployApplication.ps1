param(
    [String]
    $DeployApplicationScriptPath,

    [String]
    $PublishProfileFile,

    [String]
    $ApplicationPackagePath
)

# connect
& "$DeployApplicationScriptPath" -PublishProfilePath $PublishProfileFile -ApplicationPackagePath $ApplicationPackagePath -OverwriteBehavior "SameAppTypeAndVersion" -ErrorAction "Stop"