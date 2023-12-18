FROM adoptopenjdk/openjdk11
EXPOSE 8081
COPY target/web-app-0.0.1-SNAPSHOT.jar web-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/web-app-0.0.1-SNAPSHOT.jar"]


#FROM openjdk:11
#ARG JAR_FILE=target/web-app-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]