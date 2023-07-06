package org.example.mediator;

import org.example.component.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/4/2023 15:00
 */
public class ChatAppImpl implements ChatApp{
    private List<User> users;

    public ChatAppImpl(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users){
            if (u != user){
                u.receiveMessage(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
