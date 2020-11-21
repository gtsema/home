#!/bin/bash

CURL_RESPONSE=$(curl -u $TOMCAT_USER:$TOMCAT_PASSWORD http://$TOMCAT_HOST:$TOMCAT_PORT/manager/text/undeploy?path=/$CONTEX_NAME)

if [[ $CURL_RESPONSE == *OK* ]]; then
  echo "war undeployed successfully"
  exit 0
else
  echo "war undeployment failed"
  exit 1
fi;
