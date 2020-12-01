package com.litian.factory;

import com.litian.factory.instance.GifReader;
import com.litian.factory.instance.GifReaderFactory;
import com.litian.factory.frame.ImageReaderFactory;
import com.litian.factory.frame.ImageReader;

/**
 * @author li
 * 工厂方法模式 测试类
 */
public class Main {
    public static void main(String[] args) {
        ImageReaderFactory factory=new GifReaderFactory();
        ImageReader GifReader=factory.Create();

        ImageReader JpegReader=factory.Create();
        ImageReader TiffReader=factory.Create();
        GifReader.Read();
        JpegReader.Read();
        TiffReader.Read();
    }


   /* ImageReader jpegReader=factory.Create();
    ImageReader tiffReader=factory.Create();*/

}
