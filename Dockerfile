FROM eclipse-temurin:17-jdk
COPY target/hello-world-crud-1.0.jar app.jar
CMD ["java", "-jar", "app.jar"]