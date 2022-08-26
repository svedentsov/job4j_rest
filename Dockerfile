FROM openjdk
WORKDIR rest
ADD target/rest-1.0.jar app.jar
ENTRYPOINT java -jar app.jar