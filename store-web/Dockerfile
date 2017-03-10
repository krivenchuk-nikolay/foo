FROM java:8-jre-alpine
ADD target/store-web-*.jar /opt/foo/store-web.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/foo/store-web.jar"]