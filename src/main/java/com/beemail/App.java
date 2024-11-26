package com.beemail;

import java.util.ArrayList;
import java.util.List;

public class App implements MessageMediator {

    private static App app = null;

    public static App getInstance() {
        if (app == null) {
            app = new App();
        }
        return app;
    }

    private App() {}

    private final List<User> users = new ArrayList<>();

    private User findUserById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }

    @Override
    public void add(User user) {
        users.add(user);
        user.setMediator(this);
    }

    @Override
    public void deliver(User sender, String recipientId, String content) {
        User recipient = findUserById(recipientId);
        Message message = new Message(content, sender, recipient);
        recipient.receiveMessage(message);
        message.markDelivered();
    }
}




