package com.litian.strategy.instance;

import com.litian.strategy.frame.Strategy;

public class ComputerBookStrategy implements Strategy {
    @Override
    public double getFinalPrice(double price) {
        return price*0.9;//10%的折扣
    }
}
