REM maven itself uses a batch file so each mvn must be preceded by "call"
REM the -f flag specifies where the pom.xml is found for the project
REM mvn install will save the target output to %userprofile%\.m2\repository ...

call mvn install -f D:\com.scrapPlant.test\com.scrapPlant.test\pom.xml

call mvn install -f D:\com.scrapPlant.test\com.scrapPlant.test\pom.xml

pause