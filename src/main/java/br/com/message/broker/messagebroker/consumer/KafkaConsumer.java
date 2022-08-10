package br.com.message.broker.messagebroker.consumer;

import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class KafkaConsumer {

    @KafkaListener (topics = "${spring.kafka.consumer.topic-name}", groupId = "${spring.kafka.consumer.client-id}")
    public void consumer (ConsumerRecord<String, String> payload) {
        log.info("Topic name: {}", payload.topic());
        log.info("payload: {}", payload.value());
    }
}