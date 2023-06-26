#!/bin/bash

#Identify the IDs for the built images
ID_DATABASE=$(docker image ls | grep spring-app-db | tr -s ' ' | cut -d ' ' -f3)
ID_FLYWAY=$(docker image ls | grep spring-app-db-flyway | tr -s ' ' | cut -d ' ' -f3)
ID_API=$(docker image ls | grep spring-app-api | tr -s ' ' | cut -d ' ' -f3)

#Remove only the created images, not the helper images such as openjdk:15 and postgres:11.1-alpine
docker image rm -f $ID_DATABASE $ID_API $ID_FLYWAY