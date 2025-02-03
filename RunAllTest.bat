@echo off
cd /d %~dp0
echo Running Maven Tests...
mvn install
pause
