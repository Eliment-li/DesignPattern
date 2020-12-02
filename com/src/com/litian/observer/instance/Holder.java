package com.litian.observer.instance;


import com.litian.observer.frame.Observer;
import com.litian.observer.frame.Stock;

import java.time.LocalTime;

/**
 * 股民（实际观察者）
 */
public class Holder implements Observer {
    @Override
    public void update(Stock stock) {
        System.out.println(LocalTime.now().toString()+"  股票价格发生改变，当前价格："+stock.getCurrentPrice());

    }
}
