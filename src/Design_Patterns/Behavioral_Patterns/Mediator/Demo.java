package Design_Patterns.Behavioral_Patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    void sendMsg(String msg, User user);
    void addUser(User user);
}

class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMsg(String msg, User user) {
        for(User u: users){
            if(u != user){
                u.receiveMsg(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}

abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void sendMsg(String msg);
    public abstract void receiveMsg(String msg);
}

class BasicUser extends User {
    public BasicUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(this.name + " sends message: " + msg);
        chatMediator.sendMsg(msg, this);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(this.name + " received message: " + msg);
    }
}

class PremiumUser extends User {
    public PremiumUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(this.name + " sends message: " + msg);
        chatMediator.sendMsg(msg, this);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(this.name + " received message: " + msg);
    }
}

public class Demo {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new BasicUser(chatMediator, "user1");
        User user2 = new BasicUser(chatMediator, "user2");
        User user3 = new PremiumUser(chatMediator, "user3");
        User user4 = new PremiumUser(chatMediator, "user4");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.sendMsg("Hello");
        user3.sendMsg("Hi");
    }
}