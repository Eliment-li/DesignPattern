package com.litian.observer.instance;


import com.litian.observer.frame.Observer;
import com.litian.observer.frame.Stock;

/**
 * 股民（实际观察者）
 */
public class Holder implements Observer {
    @Override
    public void update(Stock stock) {
        System.out.println("股票价格发生改变，当前价格："+stock.getCurrentPrice());

    }
}