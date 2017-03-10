FROM java:8-jre-alpine
#ADD config/* /opt/foo/
ADD target/order-service*.jar /opt/foo/order-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/foo/order-service.jar"]