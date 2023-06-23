package designpatterns.observerpattern.chatroomexample;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomConcrete implements ChatRoomBase{
    private List<User> userList = new ArrayList<>();
    @Override
    public void register(User user) {
        this.userList.add(user);
    }

    @Override
    public void derregister(User user) {
        this.userList.remove(user);
    }

    @Override
    public void notifyUsers(String message) {
        for(User user : userList){
            user.receiveMessage(message);
        }
    }

    @Override
    public void updateMessage(String message){
        this.notifyUsers(message);
    }
}
