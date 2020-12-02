package com.litian.strategy.instance;

import com.litian.strategy.frame.Strategy;

public class LanguageBookStrategy  implements Strategy {
    @Override
    public double getFinalPrice(double price) {
        return price-2;//优惠两元
    }
}
