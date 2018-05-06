rem mvn clean compile package && java -jar ./eureka-server/target/eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer1 & java -jar ./eureka-server/target/eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer2

start cmd /k "java -jar ./eureka-server/target/eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer1"
start cmd /k "java -jar ./eureka-server/target/eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer2"

start cmd /k "java -jar ./hello-service/target/hello-service-1.0-SNAPSHOT.jar --server.port=8011"
start cmd /k "java -jar ./hello-service/target/hello-service-1.0-SNAPSHOT.jar --server.port=8012"

rem http://localhost:9001/feign-consumer http://localhost:9001/feign-consumer2 http://localhost:9001/feign-consumer3
start cmd /k "java -jar ./feign-consumer/target/feign-consumer-1.0-SNAPSHOT.jar"
rem http://localhost:9000/ribbon-consumer
start cmd /k "java -jar ./ribbon-consumer/target/ribbon-consumer-1.0-SNAPSHOT.jar"