package com.example;

public class SmartCamera extends Device {

    public SmartCamera(String location) {
        super(location);
    }

    @Override
    public void action() {
        startRecording();
    }

    public void detectMotion() {
        if (mediator != null) {
            mediator.detect(this);
        }
    }

    private void startRecording() {
        System.out.println("Camera at " + location + " started recording.");
    }
}
