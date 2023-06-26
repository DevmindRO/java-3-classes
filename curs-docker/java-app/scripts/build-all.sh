#!/bin/bash

# Build the database image using docker-compose
docker-compose build spring-app-db

# Build the flyway image using docker build
docker build --tag spring-app-db-flyway database/

# Build the flyway image using docker-compose
# docker-compose build spring-app-db-flyway

# Build the application image using docker build
docker build --tag spring-app-api .

# Build the application image using docker-compose
# docker-compose build spring-app-api