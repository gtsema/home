#!/bin/bash

CURL_RESPONSE=$(curl -u $TOMCAT_USER:$TOMCAT_PASSWORD http://$TOMCAT_HOST:$TOMCAT_PORT/manager/text/undeploy?path=/$CONTEX_NAME)

if [[ $CURL_RESPONSE == *FAIL* ]]; then
  echo "war deployment failed"
  exit 1
else
  echo "war deployed successfully"
  exit 0
fi;
