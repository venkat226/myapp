FROM maven:3-openjdk-8 as builder
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
ADD . /usr/src/app
RUN mvn install
CMD java -jar /usr/src/app/target/Final_Task-0.0.1-SNAPSHOT.war --server.port=8085
