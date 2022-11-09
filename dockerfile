FROM openjdk:19
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} java-play-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/java-play-0.0.1-SNAPSHOT.jar"]