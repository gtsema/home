#!/bin/bash

CURL_RESPONSE=$(curl -u $1:$2 -T $1 http://$TOMCAT_HOST:$TOMCAT_PORT/manager/text/deploy?path=/$CONTEX_NAME&update=true)

if [[ $CURL_RESPONSE == *OK* ]]; then
  echo "war deployed successfully"
  exit 0
else
  echo "war deployment failed"
  exit 1
fi;
