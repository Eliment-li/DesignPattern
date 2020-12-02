package com.litian.observer.frame;

import java.util.ArrayList;
import java.util.List;

public  abstract class Stock {
    private List observers=new ArrayList<>();
    public  void  addObserver(Observer observer){
        observers.add(observer);

    }
    public void deleteObserver(Observer observer){
        observers.remove(observer);

    }
    public  void  nofity(){
        for(Object o:observers){
            Observer observer= (Observer) o;
            observer.update(this);
        }
    }
    public abstract void getCurrentPrice();
    public  abstract void execute();
}
