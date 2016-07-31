set JAVA_CMD="C:\Program Files\Java\jre1.8.0_77\bin\java"

set config_path=config
set jar_path=lib\*

set classpath=.;%config_path%;%jar_path%

set main_class=${main.class}


%JAVA_CMD% -Dspring.profiles.active=h2 -classpath %classpath% %main_class% 


