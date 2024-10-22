package observer;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FA22-BSE-068
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void deAttach(Observer observer) {
        observers.remove(observer);
    }

    public void toggle(Observer observer, boolean isActive) {
        observer.setIsActive(isActive);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            if (observer.isIsActive()) {
                observer.update();
            }
        }
    }
}
