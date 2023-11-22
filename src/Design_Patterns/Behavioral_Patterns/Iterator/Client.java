package Design_Patterns.Behavioral_Patterns.Iterator;

import java.util.ArrayList;

class User{
    private String name;
    private String userId;

    public User(String name, String userId){
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

class myIterator{
    private int index;

    public boolean hasNext(){
        return false;
    }

    public Object next(){
        return null;
    }
}

class myIteratorImpl extends myIterator{
    private ArrayList<User> userList;
    private int index;

    public myIteratorImpl(ArrayList<User> userList){
        this.userList = userList;
    }

    @Override
    public boolean hasNext(){
        if(index < userList.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next(){
        if(this.hasNext()){
            return userList.get(index++);
        }
        return null;
    }
}

class UserManagement{
    private ArrayList<User> userList = new ArrayList<User>();

    public void addUser(User user){
        userList.add(user);
    }

    public void getUser(int index){
        userList.get(index);
    }

    public myIterator getIterator(){
        return new myIteratorImpl(userList);
    }
}

public class Client {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("John", "1"));
        userManagement.addUser(new User("Mary", "2"));
        userManagement.addUser(new User("Tom", "3"));

        myIterator iterator = userManagement.getIterator();
        while(iterator.hasNext()){
            User user = (User)iterator.next();
            System.out.println("Name: " + user.getName() + ", ID: " + user.getUserId());
        }
    }
}
