#!/bin/bash

CURL_RESPONSE=$(curl -u $TOMCAT_USER:$TOMCAT_PASSWORD -T $WAR_PATH http://$TOMCAT_HOST:$TOMCAT_PORT/manager/text/deploy?path=/$CONTEX_NAME&update=true)

echo \"$CURL_RESPONSE\"

if [[ $CURL_RESPONSE == *\"FAIL\"* ]]; then
echo \"war deployment failed\"
exit 1
else
echo \"war deployed successfully \
exit 0
fi
