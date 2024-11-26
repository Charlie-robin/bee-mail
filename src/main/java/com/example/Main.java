package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = SmartHome.getInstance();

        SmartCamera cameraLivingRoom = new SmartCamera("Living Room");
        SmartCamera cameraKitchen = new SmartCamera("Kitchen");
        SmartLight lightLivingRoom = new SmartLight("Living Room");
        SmartLight lightKitchen = new SmartLight("Kitchen");

        smartHome.addDevice(List.of(cameraLivingRoom, cameraKitchen, lightLivingRoom, lightKitchen));

        cameraLivingRoom.detectMotion();

    }
}
