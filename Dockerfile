FROM openjdk:11
COPY ./output/first.jar ./
WORKDIR ./
CMD [ "java","-cp","Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main" ]