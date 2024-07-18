kotlinc src -include-runtime -d bin/dokev.jar

if ($LASTEXITCODE -eq 0) {
    Write-Host "✓ 빌드에 성공하였습니다." -ForegroundColor Green
    java -jar bin/dokev.jar
} else {
    Write-Host "✘ 빌드에 문제가 생겼습니다!" -ForegroundColor Red
}