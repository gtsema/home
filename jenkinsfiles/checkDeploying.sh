#!/bin/bash

CURL_RESPONSE=$(curl -u $TOMCAT_USER:$TOMCAT_PASSWORD http://$TOMCAT_HOST:$TOMCAT_PORT/manager/text/list)

if [[ $CURL_RESPONSE == *"/:running:0:ROOT"* ]]; then
  echo "deployed"
else
  echo "undeployed"
fi;
