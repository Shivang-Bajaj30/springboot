FROM maven:3.9.9-eclipse-temurin-23-noble AS build
WORKDIR /app
COPY pom.xml .
RUN mvn clean package -DskipTests

FROM openjdk:23-jdk-slim
WORKDIR /app
COPY --from=build /app/target/splitify-backend-0.0.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]