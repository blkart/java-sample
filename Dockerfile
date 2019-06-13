FROM harbor.ngcp.com/library/java:openjdk-8-jre-alpine

WORKDIR /home

COPY target/*.jar /home

ENTRYPOINT java -jar *.jar


