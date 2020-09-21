FROM tomcat:8.5.54
VOLUME /tmp
COPY web-module/target/web-module-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/web-module-1.0-SNAPSHOT.war
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -Dspring.profiles.active=demo -Djava.security.egd=file:/dev/./urandom -jar /usr/local/tomcat/webapps/web-module-1.0-SNAPSHOT.war" ]