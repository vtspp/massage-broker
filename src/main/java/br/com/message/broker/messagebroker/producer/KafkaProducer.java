package br.com.message.broker.messagebroker.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class KafkaProducer {
    @Value("${spring.kafka.producer.topic-name}")
    private String topic;
    private KafkaTemplate<String, String> template;

    public void producer (String message) {
        log.info("Payload producer: {}", message);
        this.template.send(this.topic, message);
    }
}