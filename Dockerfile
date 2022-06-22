FROM openjdk:11

WORKDIR /app

COPY ./build/libs/hello-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "hello-0.0.1-SNAPSHOT.jar"]