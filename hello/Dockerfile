FROM openjdk:21
EXPOSE 8080
ADD target/hello-0.0.1-SNAPSHOT.jar hello.jar
ENTRYPOINT ["java", "-jar", "hello.jar"]