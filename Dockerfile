FROM java:8-jre-alpine
ADD config/* /opt/foo/
ADD target/foo-*.jar /opt/foo/foo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/foo/foo.jar"]