package designpatterns.observerpattern.chatroomexample;

public class UserConcrete implements User{

    private ChatRoomBase chatRoom;
    private String userId;
    public UserConcrete(String user2) {
        userId = user2;
    }


    @Override
    public void setChatRoom(ChatRoomBase chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public void sendMessage(String message) {
        chatRoom.updateMessage(message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("notified "+userId+":: "+message);
    }
}
