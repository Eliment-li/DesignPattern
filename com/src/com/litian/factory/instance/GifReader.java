package com.litian.factory.instance;

import com.litian.factory.frame.ImageReader;

public class GifReader extends ImageReader {
    @Override
    public void Read() {
            System.out.println("读取GIF");
    }
}
