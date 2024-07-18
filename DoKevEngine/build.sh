#!/bin/sh

kotlinc src -include-runtime -d bin/dokev.jar

if [ $? -eq 0 ]; then
    echo "\033[32m✓ 빌드에 성공하였습니다.\033[0m"
    java -jar bin/dokev.jar
else
    echo "\033[31m✘ 빌드에 문제가 생겼습니다!\033[0m"
fi