FROM adoptopenjdk:17-jdk-hotspot
LABEL maintainer="test_user@gmail.com"
EXPOSE 8081
COPY target/wep-app-1.0.jar JenkinsCICD-1.0.jar
ENTRYPOINT ["java","-jar","/web-app-1.0.jar"]