# Project
This Application is use understand the basic security mechanism in spring boot application.

##
Create Project
```bash
https://start.spring.io
```
# Build
```bash
mvn clean install
```


## Dockerization

### Maven
wouterd
alexec
spotify
fabric8io

Here i am using maven spotify plugin to create the docker image for this application.
Use the below command to create the docker image.
For creating please use your repository to create the image which will be easy to push image in your docker hub.
update in your pom.xml.
<docker.image.prefix> <your repo name> </docker.image.prefix>

```bash
mvn install dockerfile:build
```

### Push docker images

docker login 
```bash
docker push <repository-name>/<artifact-name>
```

## Running

The application can be start is either locally using maven or start in docker container.

### Running the application in local environment
Using eclipse:It can be run as java application or run configuration to provide the program arguments.
You can run using maven command as:

```bash
mvn spring-boot:run
```

### Running the application in docker container

```bash
docker run -p 8080:8080 falcon007/spring-boot-app:0.0.1 
```
```bash
docker-compose  pull
```
```bash
docker-compose  up
```

## Looking docker image
```bash
docker exec -it <containerID> bash
```

## Testing
```bash
http://localhost:8080/
```



