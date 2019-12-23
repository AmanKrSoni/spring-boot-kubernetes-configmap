FROM openjdk:8-jre-alpine
COPY target/spring-kubernetes-configmap.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /app.jar