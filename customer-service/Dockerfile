FROM java:8-jre-alpine
#ADD config/* /opt/foo/
ADD target/customer-service*.jar /opt/foo/customer-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/foo/customer-service.jar"]