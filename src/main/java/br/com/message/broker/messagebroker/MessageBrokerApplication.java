package br.com.message.broker.messagebroker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MessageBrokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageBrokerApplication.class, args);
	}

}