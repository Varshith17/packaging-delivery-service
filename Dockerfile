FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/packaging-delivery-service-0.0.1-SNAPSHOT.jar packaging-delivery-service.jar
ENTRYPOINT ["java","-jar", "/packaging-delivery-service.jar" ]