rem mvn clean compile package && java -jar ./eureka-server/target/eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer1 & java -jar ./eureka-server/target/eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer2

start cmd /k "java -jar ./eureka-server/target/eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer1"
start cmd /k "java -jar ./eureka-server/target/eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer2"

rem start cmd /k "java -jar ./hello-service/target/hello-service-1.0-SNAPSHOT.jar --server.port=8011"
rem start cmd /k "java -jar ./hello-service/target/hello-service-1.0-SNAPSHOT.jar --server.port=8012"

rem 测试 http://localhost:9001/feign-consumer http://localhost:9001/feign-consumer2 http://localhost:9001/feign-consumer3
rem start cmd /k "java -jar ./feign-consumer/target/feign-consumer-1.0-SNAPSHOT.jar"
rem 测试 http://localhost:9000/ribbon-consumer
rem start cmd /k "java -jar ./ribbon-consumer/target/ribbon-consumer-1.0-SNAPSHOT.jar"

rem start cmd /k "java -jar ./api-gateway/target/api-gateway-1.0-SNAPSHOT.jar"

rem start cmd /k "java -jar ./config-server/target/config-server-1.0-SNAPSHOT.jar"
rem 客户端启动时，Eureka 还没初始化完成，应用会报错，初始化完成后手动启动
rem 客户端添加 retry 功能，可以排除这个问题
rem start cmd /k "java -jar ./config-client/target/config-client-1.0-SNAPSHOT.jar --server.port=7002"
rem start cmd /k "java -jar ./config-client/target/config-client-1.0-SNAPSHOT.jar --server.port=7003"