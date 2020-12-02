package com.litian.observer.instance;


import com.litian.observer.frame.Stock;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Random;

/**
 * 茅台股票
 */
public class StockMaoTai extends Stock {
    private Random random=new Random();
    private int currentPrice=1;
    private int lastPrice=1;
    @Override
    public int getCurrentPrice() {
        return currentPrice;
    }

    @Override
    public void execute() {
        try{
            while (true){
                currentPrice=random.nextInt(1000);
                double change=((double)currentPrice-(double)lastPrice)/lastPrice;//变化幅度
                change=Math.abs(change);
                //System.out.println("last"+lastPrice+"   cur"+currentPrice+"   "+change);
                lastPrice=currentPrice;

                //变化幅度大于5%，通知股民
                if (change>=0.05) {
                    nofityObserver();
                }
                Thread.sleep(1000);

            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
