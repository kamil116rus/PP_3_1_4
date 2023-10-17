FROM  openjdk:17
LABEL authors="kamil"
ADD /target/spring-boot_security-demo-0.0.1-SNAPSHOT.jar backend.jar

#ENTRYPOINT ["top", "-b"]
ENTRYPOINT ["java", "-jar", "backend.jar"]