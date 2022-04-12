package com.kafka.config;

import org.springframework.kafka.annotation.*;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(id="multiGrp", topics = {"greeting", "people"})
public class KafkaListeners {
    
    @KafkaHandler
    public void greeting(Greeting greeting){
        System.out.println("Recieved "+greeting);
    }
    
    @KafkaHandler
    public void greeting(People people){
        System.out.println("Recieved "+people);
    }
    
    @KafkaHandler(isDefault = true)
    public void listenDefault(Object object) {
        System.out.println("This is default"+ object);
    }
}
