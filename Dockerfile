FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/mcf-0.0.2-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
