package Design_Patterns.Behavioral_Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

interface Subject{
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}

interface Observer{
    void notify(String message);
}

class YoutubeChannel implements Subject{
    private String name;
    private String status;
    private List<Observer> observers;

    public YoutubeChannel(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println(observer + " subscribed to " + this.name);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println(observer + " unsubscribed from " + this.name);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.notify(this.status);
        }
    }
}

class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println(this.name + " received notification: " + message);
    }

    @Override
    public String toString() {
        return this.name;
    }
}


public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel("Channel 1");
        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");
        Subscriber subscriber3 = new Subscriber("Subscriber 3");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        channel.setStatus("New video uploaded");

        channel.unsubscribe(subscriber2);

        channel.setStatus("New video uploaded");
    }
}
