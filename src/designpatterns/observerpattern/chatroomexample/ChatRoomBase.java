package designpatterns.observerpattern.chatroomexample;

public interface ChatRoomBase {


    void register(User user);

    void derregister(User user);

    void notifyUsers(String message);

    void updateMessage(String message);
}
