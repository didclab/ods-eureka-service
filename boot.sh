export EUREKA_USER=admin
export EUREKA_PASS=admin
nohup java -jar ods-discovery-service-0.0.1-SNAPSHOT.jar -Xms 500m -Xmx 800m -XX:+UseG1GC &
