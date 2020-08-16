package javaLang.observer.Test2;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public String name;

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

        notifyAllObserver();
    }

    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
