FROM openjdk:17-jdk
VOLUME /tmp
ARG JAR_FILE=./build/libs/spamProcessor-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} spamProcessorApp.jar

ENTRYPOINT ["java","-jar","/spamProcessorApp.jar"]