package com.litian.factory.frame;


/**
 * 抽象工厂类
 */
public abstract  class ImageReaderFactory {

    public final ImageReader Create(){
        ImageReader imageReader=createReader();
        return imageReader;

    }
    protected  abstract  ImageReader createReader();
}
