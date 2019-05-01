package com.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "string_msg", groupId = "testGroup", containerFactory = "kafkaListenerContainerFactory")
    public void listenString(String message) {
        log.info("Received Messasge in group testGroup: " + message);
    }

    @KafkaListener(topics = "user_json", groupId = "jsonGroup", containerFactory = "userConcurrentKafkaListenerContainer")
    public void listenJson(User message) {
        log.info("Received Messasge in group user_json : " + message);
    }


}
