package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        System.out.println("\nPrețul s-a schimbat");
        this.price = price;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(price);
        }
    }
}
