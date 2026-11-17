param(
    [string]$Seed = '',
    [int]$Month = 11,
    [int]$LimitMs = 20000,
    [int]$StopMs = 8000,
    [switch]$Parity,
    [string]$Persons = '',
    [string]$Out = '',
    [switch]$Quiet
)

$ErrorActionPreference = 'Stop'
$root = $PSScriptRoot
$build = Join-Path $root 'build'
New-Item -ItemType Directory -Force -Path $build | Out-Null

$sources = Get-ChildItem (Join-Path $root 'src') -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -encoding UTF-8 -d $build -cp (Join-Path $root 'libs\*') @sources
if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

$cp = "$build;" + (Join-Path $root 'libs\*')
$a = @()
if ($Seed) { $a += @('--seed', $Seed) }
$a += @('--month', $Month, '--limit-ms', $LimitMs, '--stop-ms', $StopMs)
if ($Parity) { $a += '--parity' }
if ($Persons) { $a += @('--persons', $Persons) }
if ($Out) { $a += @('--out', $Out) }
if ($Quiet) { $a += '--quiet' }

java '-Dfile.encoding=UTF-8' '-Dstdout.encoding=UTF-8' -cp $cp app.familymeal.solver.Main @a
exit $LASTEXITCODE
