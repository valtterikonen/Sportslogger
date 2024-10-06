# Use an official OpenJDK runtime as the base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the host to the container
COPY target/SportsLogger-1.0.jar /app/SportsLogger.jar

# Specify the command to run the Java application
CMD ["java", "-jar", "SportsLogger.jar"]

