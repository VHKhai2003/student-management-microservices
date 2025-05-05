package com.vhkhai.student_service.service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "topic1", groupId = "vhkhai")
    public void consume(String message) {
        System.out.println("Message received: " + message);
    }
}
