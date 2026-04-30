package com.college.oop.enumerations;

public class TrafficLight {
    private TrafficLightState state;
    private boolean isSoundEnabled;
    private boolean isEnabled;
    private int timer;

    public TrafficLight() {
    }

    public TrafficLight(boolean isSoundEnabled, boolean isEnabled, int timer) {
        this.isSoundEnabled = isSoundEnabled;
        this.isEnabled = isEnabled;
        this.timer = timer;
        this.state = TrafficLightState.IDLE;
    }

    public TrafficLight(TrafficLightState state, boolean isSoundEnabled, boolean isEnabled, int timer) {
        this.state = state;
        this.isSoundEnabled = isSoundEnabled;
        this.isEnabled = isEnabled;
        this.timer = timer;
    }

    public boolean isSoundEnabled() {
        return isSoundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        isSoundEnabled = soundEnabled;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public void visualize() {
        System.out.println("Current light status:");
        System.out.printf("- Is enabled: %b%n", isEnabled);
        System.out.printf("- Is sound enabled: %b%n", isSoundEnabled);
        System.out.printf("- Time to state change: %d%n", timer);
    }

    public TrafficLightState getState() {
        return state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }
}
