package org.example.component;

import org.example.mediator.ChatApp;

/**
 * Created by: Xayrullayev Bexzod
 * Date: 7/4/2023 15:02
 */
public class UserImpl extends User{

    public UserImpl(ChatApp app, String name){
        super(app, name);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("[" + this.name + "] Message sent: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("[" + this.name + "] Message received: " + msg);
    }
}
