package com.litian.factory.instance;

import com.litian.factory.frame.ImageReader;
import com.litian.factory.frame.ImageReaderFactory;
import com.litian.factory.instance.JpegReader;
/**
 * 具体工厂类
 */
public class JpegReaderFactory extends ImageReaderFactory {
    @Override
    protected ImageReader createReader() {
        return  new JpegReader();
    }
}
