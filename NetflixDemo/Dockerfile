# ---------- BUILD STAGE ----------
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy pom.xml (FROM inner folder)
COPY NetflixDemo/pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy source code (FROM inner folder)
COPY NetflixDemo/src ./src

# Build the jar
RUN mvn clean package -DskipTests

# ---------- RUN STAGE ----------
FROM eclipse-temurin:17-jdk

WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
