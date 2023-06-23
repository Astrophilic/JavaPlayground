package designpatterns.observerpattern.chatroomexample;

public class ChatContext {

    public static void runChatExample(){
        ChatRoomBase chatRoomBase = new ChatRoomConcrete();

        User user = new UserConcrete("user1");
        user.setChatRoom(chatRoomBase);
        User user2 = new UserConcrete("user2");
        user2.setChatRoom(chatRoomBase);
        chatRoomBase.register(user);
        chatRoomBase.register(user2);

        user.sendMessage("hello this is user 1");
        user2.sendMessage("hi user2 here");
    }
}
