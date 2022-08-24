# spring-retry
Simple project to show a little about the spring-retry functionality.

##Overview

Api that generate a random number and try to match with a URL parameter.


```shell
curl --request GET \
  --url 'http://localhost:8080/retry?number=2'
```

##Pre-requisites
* JAVA 17
* Gradle

## Execute project

1. Run to build the application
```
$ gradle clean build
```

2. Run to start the application

```
./gradlew bootRun
```


