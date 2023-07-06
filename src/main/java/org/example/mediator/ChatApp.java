package org.example.mediator;

import org.example.component.User;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/4/2023 14:53
 */

public interface ChatApp {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
