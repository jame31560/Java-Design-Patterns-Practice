package app;

import java.util.ArrayList;

/**
 * NewsData
 */
public class NewsData implements Subject {

    private ArrayList<Observer> observers;
    private String news;

    public NewsData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("System: Public news '" + news + "'.");
        System.out.println("System: " + this.observers.size() + " Subscriber");
        this.observers.forEach(o -> o.update(this.news));
    }

    public void publicNews(String news) {
        this.news = news;
        this.notifyObservers();
    }
}
