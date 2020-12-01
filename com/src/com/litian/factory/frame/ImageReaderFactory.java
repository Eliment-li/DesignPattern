package com.litian.factory.frame;


import com.litian.factory.instance.ImageReader;

public abstract  class ImageReaderFactory {

    public final ImageReader Create(){
        ImageReader imageReader=createReader();
        return imageReader;

    }
    protected  abstract  ImageReader createReader();
}
