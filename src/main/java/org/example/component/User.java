package org.example.component;

import org.example.mediator.ChatApp;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/4/2023 14:58
 */
public abstract class User {
    protected ChatApp mediator;
    protected String name;

    public User(ChatApp mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String msg);
    public abstract void receiveMessage(String msg);
}
