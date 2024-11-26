package com.example;

import java.util.List;

public interface Mediator {
    void addDevice(Device device);
    void addDevice(List<Device> devices);
    void detect(Device device);
}
