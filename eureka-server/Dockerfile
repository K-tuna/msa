FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY ./build/libs/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "/eureka-server.jar"]
