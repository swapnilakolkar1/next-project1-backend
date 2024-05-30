FROM amazoncorretto:21
COPY target/*.jar application.jar
ENTRYPOINT ["java","-jar","application.jar"]
