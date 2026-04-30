package com.college.oop.enumerations;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        light.visualize();

        light.setState(TrafficLightState.ALLOWED);

        System.out.println(TrafficLightState.ALLOWED);
        System.out.println(TrafficLightState.ALLOWED.ordinal());
        System.out.println(TrafficLightState.WARNING.ordinal());
        System.out.println(TrafficLightState.WARNING);


        TrafficLightState newState = TrafficLightState.valueOf("WARNING");
        TrafficLightState[] possibleStates = TrafficLightState.values();

        System.out.println();
        for (var curr_state : possibleStates) {
            System.out.printf("State: %s -> int value: %d%n%n", curr_state, curr_state.ordinal());
            curr_state.printMessage();
        }

        TrafficLightState state1 = TrafficLightState.DISALLOWED;
        TrafficLightState.ALLOWED.printMessage();
    }
}
