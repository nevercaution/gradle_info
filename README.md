# Gradle Info

set value in gradle and use value by code    
build.gradle > application.xml > @Value  

## build
```$xslt
$ ./gradlew clean build
```

## run 
```$xslt
$ java -jar build/libs/gradle_info-0.0.1-SNAPSHOT.jar
```

## how to use
```$xslt
$ curl localhost:8080/main

teddy.bear, version : 1.0.1-SNAPSHOT
```
