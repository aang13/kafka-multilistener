package com.kafka.config;

public class Greeting {
    
    private String message;
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        return "Greeting{" +
                "message='" + message + '\'' +
                '}';
    }
    
    public Greeting(String message) {
        this.message = message;
    }
    
    public Greeting(){}
    
}
