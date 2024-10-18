FROM openjdk:17-jdk-alpine
WORKDIR /app

COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]