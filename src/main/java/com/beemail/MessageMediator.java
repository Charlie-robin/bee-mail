package com.beemail;

public interface MessageMediator {
    void add(User user);
    void deliver(User sender, String recipientId, String content);
}
