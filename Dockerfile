
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/taskforge_backend-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -Dserver.port=${PORT:-8080} -jar app.jar --spring.profiles.active=prod"]