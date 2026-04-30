package com.college.oop.enumerations;

public enum TrafficLightState {
    IDLE("This is IDLE state"), // 0
    SPARKLING("This is SPARKLING state"), // 1
    ALLOWED(""), // 2
    WARNING(""),
    DISALLOWED(""),
    PREPARE_ALLOWED(""),
    WAITING("");

    private String text_message;

    TrafficLightState(String text_message) {
        this.text_message = text_message;
    }

    public void printMessage() {
        System.out.printf("Message from %s: %s%n", this, this.text_message);
    }
}
