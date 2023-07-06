package org.example;

import org.example.component.User;
import org.example.component.UserImpl;
import org.example.mediator.ChatApp;
import org.example.mediator.ChatAppImpl;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/4/2023 14:53
 */
public class Main {
    public static void main(String[] args) {
        ChatApp app = new ChatAppImpl();
        User user1 = new UserImpl(app, "Obivan");
        User user2 = new UserImpl(app, "Alisa");
        User user3 = new UserImpl(app, "John");
        User user4 = new UserImpl(app, "Lisa");

        app.addUser(user1);
        app.addUser(user2);
        app.addUser(user3);
        app.addUser(user4);

        user1.sendMessage("Hello there!");
    }
}