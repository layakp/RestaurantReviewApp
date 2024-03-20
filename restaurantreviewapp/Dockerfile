# base image with jdk 17
FROM amazoncorretto:17.0.7-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/restaurantreviewapp-0.0.1-SNAPSHOT.jar /app

# Command to run the Spring Boot application
CMD ["java", "-jar", "restaurantreviewapp-0.0.1-SNAPSHOT.jar"]
