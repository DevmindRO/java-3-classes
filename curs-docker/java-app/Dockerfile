# Ubuntu based jdk 15 image
FROM openjdk:15-alpine

#Port used for connection
EXPOSE 8081

#Copy the jar applicalion to docker container
COPY target/**.jar /opt/app/**.jar


#Command thar automatically runs the app once the docker containter starts
CMD ["java", "-jar", "/opt/app/**.jar"]
