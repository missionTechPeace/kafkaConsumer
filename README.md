# simple kafkaConsumer comsuming string and json messages

Here I have implemented a simple kafka consumer with spring boot.

  For creating a kafka consumer you have to add below dependencies in your maven.

    <dependency>
         <groupId>org.springframework.kafka</groupId>
         <artifactId>spring-kafka</artifactId>
         <version>2.2.5.RELEASE</version>
    </dependency>
    <dependency>
         <groupId>org.apache.kafka</groupId>
         <artifactId>kafka-clients</artifactId>
    </dependency>
    
    I have also added the lombok so don't forget to configure the lombok in your IDE. and below dependency in your maven file.
   
    <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.6</version>
            <scope>provided</scope>
    </dependency>
   
   
    To run this project create below two kafka topics with below command :
    
    bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic string_msg
    bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic user_json
   
    After creating the above kafka topics start the kafka consumer and produce message with below commands and see the logs in  consumer
    bin/kafka-console-producer.sh --broker-list localhost:9092 --topic user_json
    bin/kafka-console-producer.sh --broker-list localhost:9092 --topic string_msg
