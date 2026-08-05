# Spring Boot Hello World Sample

This is a simple Spring Boot REST API application that exposes a `/hello` endpoint returning a greeting message.

## Build

To build the application, run:
```bash
mvn -B package
```

## Run

To run the application, execute:
```bash
java -jar target/demo-1.0.0.jar
```

The application will start on `http://localhost:8080`. You can test the endpoint:
```bash
curl http://localhost:8080/hello
```

## Note

This application was written and built by an AI agent inside a sandboxed harness.
