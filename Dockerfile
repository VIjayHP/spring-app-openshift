FROM openjdk:8 
ADD target/springboot-mongodb-proj-0.0.1-SNAPSHOT.jar springboot-mongodb-proj-0.0.1-SNAPSHOT.jar
EXPOSE 8899
ENTRYPOINT ["java","-jar","springboot-mongodb-proj-0.0.1-SNAPSHOT.jar"]