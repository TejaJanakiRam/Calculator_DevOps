FROM openjdk:11
COPY ./output/first.jar ./
WORKDIR ./
CMD [ "java","-cp","first.jar","org.example.Main" ]