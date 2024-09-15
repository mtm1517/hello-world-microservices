FROM openjdk:21
EXPOSE 8080
ADD target/hello_world-0.0.1-SNAPSHOT.jar hello_world.jar

ENTRYPOINT ["java", "-jar", "hello_world.jar"]