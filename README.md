## REST_API_WITH_QUARKUS Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode
 * mvn clean install
 * mvn quarkus:dev
 Now server will be started on http://localhost:8080
 
 ### This will use H2 inmemory DB and some data that will be loaded during server startup. 
 Test data are kept under resources folder with file name as import.sql. 
  It will expose couple of Rest APIs
 * Get http://localhost:8080/api/v1/user
 *  curl -d '{"name": "manzarul", "email": "xyz@gmail.com"}' -H "Content-Type: application/json" http://localhost:8080/api/v1/user

#### Ref here to deploy application on kubernetes : **https://redhat-developer-demos.github.io/quarkus-tutorial/quarkus-tutorial/kubernetes.html**
 
