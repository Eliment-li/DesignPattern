package com.litian.strategy.book;

import com.litian.strategy.frame.Strategy;

public class Book {
    private String name;
    private Strategy strategy;
    private double price;
    private double finalPrice;
    public double getFinalPrice(){
        return strategy.getFinalPrice(this.price);

    }
    public Book(String name,double price,Strategy strategy){
        this.name=name;
        this.price=price;
        this.strategy=strategy;
        finalPrice=this.getFinalPrice();
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", price=" + price +
                ", finalPrice=" + finalPrice +
                '}';
    }
}
