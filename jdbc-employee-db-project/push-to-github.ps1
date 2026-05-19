Set-Location "$PSScriptRoot"

$gitPath = 'C:\Program Files\Git\cmd\git.exe'
if (-not (Test-Path $gitPath)) {
    Write-Error "Git executable not found at $gitPath. Install Git or update the path in this script."
    exit 1
}

& $gitPath init
& $gitPath add .
& $gitPath commit -m "Initial commit"
& $gitPath branch -M main
& $gitPath remote add origin https://github.com/nandankrishna11/Java-JDBC.git
& $gitPath push -u origin main
