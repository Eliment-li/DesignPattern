package com.litian.strategy;

import com.litian.strategy.book.Book;
import com.litian.strategy.instance.ComputerBookStrategy;
import com.litian.strategy.instance.LanguageBookStrategy;
import com.litian.strategy.instance.NovelBookStragety;

public class Main {
    public static void main(String[] args) {

        Book ComputerBook=new Book("计算机网络",200,new ComputerBookStrategy());
        Book LanguageBook=new Book("计算机网络",200,new LanguageBookStrategy());
        Book NovelBook=new Book("计算机网络",200,new NovelBookStragety());

        System.out.println(ComputerBook.toString());
        System.out.println(LanguageBook.toString());
        System.out.println(NovelBook.toString());
    }
}
