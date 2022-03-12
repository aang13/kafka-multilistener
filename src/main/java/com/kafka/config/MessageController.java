package com.kafka.config;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/message")
public class MessageController {
    
//    private KafkaTemplate<String, Object> kafkaTemplate;
//    
//    
//    public MessageController(KafkaTemplate<String, Object> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//    
//    @PostMapping
//    public void publish(@RequestBody Greeting greeting){
//        kafkaTemplate.send("greeting", greeting);
//    }
}
