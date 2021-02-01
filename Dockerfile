FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/*.jar jenkins-proj.jar
ENTRYPOINT ["java","-jar","/jenkins-proj.jar"]
EXPOSE 8081