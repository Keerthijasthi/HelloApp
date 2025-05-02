# Use JDK 21 base image
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY target/HelloApp-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "app.jar"]
