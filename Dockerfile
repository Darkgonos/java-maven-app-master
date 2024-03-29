FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY /target/java-maven-app-1.1.0-SNAPSHOT.jar /
WORKDIR /

ENTRYPOINT ["java","-jar","java-maven-app-1.1.0-SNAPSHOT.jar"]