package com.litian.observer;

import com.litian.observer.frame.Observer;
import com.litian.observer.frame.Stock;
import com.litian.observer.instance.Holder;
import com.litian.observer.instance.StockMaoTai;
/**
 * @author li
 * 观察者模式 测试类
 */
public class Main {
    public static void main(String[] args) {

        Stock stock= new StockMaoTai();
        Observer observer1=new Holder();

        stock.addObserver(observer1);
        stock.execute();


    }
}
