@echo off

rmdir /Q /S "build/libs"
gradlew build
pause
