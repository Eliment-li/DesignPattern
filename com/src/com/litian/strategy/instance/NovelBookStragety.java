package com.litian.strategy.instance;

import com.litian.strategy.frame.Strategy;

public class NovelBookStragety implements Strategy {
    @Override
    public double getFinalPrice(double price) {
        int discount=(int)(price/100);
        discount*=10;//每满100减10
        return price-discount;
    }
}
