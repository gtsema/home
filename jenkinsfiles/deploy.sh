#!/bin/bash

CURL_RESPONSE=$(curl -u $TOMCAT_USER:$TOMCAT_PASSWORD -T $WAR_PATH http://$TOMCAT_HOST:$TOMCAT_PORT/manager/text/deploy?path=/$CONTEX_NAME&update=true)

if [[ $CURL_RESPONSE == *OK* ]]; then
  echo "war deployed successfully"
  exit 0
else
  echo "war deployment failed"
  exit 1
fi;
