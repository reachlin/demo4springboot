# demo4springboot

## Features enabled

### REST API

Check files in controller folder.

### MongoDB integration

The DB configuration is in `application.yml` by env. var, `MONGO_URL`. The default port is 37017.

### Actuator

Check system properties and health. The default mounted path is `/actuator`, e.g. `http://localhost:8080/actuator/health`.

### DATA REST API

Automatically generate REST API from data model, `https://spring.io/guides/gs/accessing-mongodb-data-rest/`. It is mounted to `/api`.
Basically, api endpoints are discovered from repository interfaces. Most basic CRUD end points are already implemented, just declaration is enough to expose them.
More complex api logic can be implemented in CustomXXXRepositoryImpl classes.

## Local Development

1. Start mongodb `docker-compose up -d`. The default port is 37017.
2. Build and run pom.xml in Intellij IDE. Check application.yml for db config.