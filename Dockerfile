FROM adoptopenjdk/openjdk11
LABEL maintainer="test_user@gmail.com"
EXPOSE 8081
COPY target/wep-app-1.0.jar web-app-1.0.jar
ENTRYPOINT ["java","-jar","/web-app-1.0.jar"]