package com.ahmad.learningactuator.actuator.service;

public class Greetings {

    public Greetings(long id, String content) {
        this.id = id;
        this.message = content;
    }

    private final long id;
    private final String message;



    public long getId() {
        return id;
    }

    public String getContent() {
        return message;
    }

}
