# CDI event error handler

This is a solution to the very annoying problem with Payara silently ignoring any exceptions thrown in asynchronous CDI event handlers.

## interceptor

`mvn install` will build the CDI interceptor, package it into a JAR file, and install it into your local Maven repo.

## sample-app

`mvn package payara-micro:start` will build the sample app and start it in a new Payara Micro instance.

Test the behavior of the interceptor in the sample app like this: `curl -v localhost:8080/event -X POST -H "Content-Type: text/plain" -d "hello world"`