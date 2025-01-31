@echo off
cd /d %~dp0
echo Running Maven Tests...
mvn clean test
pause
