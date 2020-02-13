package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    int state;
    public void add(Observer o){
        observers.add(o);
    }
    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
    public int getState(){
        return state;
    }
    public void setState(int state){
        this.state = state;
        this.notifyAllObservers();
    }
}
