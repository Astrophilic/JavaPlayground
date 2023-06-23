package designpatterns.observerpattern.chatroomexample;

public interface User {

    void setChatRoom(ChatRoomBase chatRoom);

    void sendMessage(String message);

    void receiveMessage(String message);
}
