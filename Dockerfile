# Use an official OpenJDK image as the base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /usr/src/sportslogger

# Copy the built JAR file from Maven target directory to the container
COPY target/sportslogger-1.0-SNAPSHOT.jar sportslogger.jar

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "sportslogger.jar"]
