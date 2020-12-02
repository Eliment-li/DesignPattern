package com.litian.factory;

import com.litian.factory.instance.GifReader;
import com.litian.factory.instance.GifReaderFactory;
import com.litian.factory.frame.ImageReaderFactory;
import com.litian.factory.frame.ImageReader;
import com.litian.factory.instance.JpegReaderFactory;
import com.litian.factory.instance.TiffReaderFactory;

/**
 * @author li
 * 工厂方法模式 测试类
 */
public class Main {
    public static void main(String[] args) {
        ImageReaderFactory gifReaderFactory=new GifReaderFactory();
        ImageReaderFactory jepgReaderFactory=new JpegReaderFactory();
        ImageReaderFactory tiffReaderFactory=new TiffReaderFactory();

        ImageReader GifReader=gifReaderFactory.Create();
        ImageReader JpegReader=jepgReaderFactory.Create();
        ImageReader TiffReader=tiffReaderFactory.Create();

        GifReader.Read();
        JpegReader.Read();
        TiffReader.Read();
    }

}
