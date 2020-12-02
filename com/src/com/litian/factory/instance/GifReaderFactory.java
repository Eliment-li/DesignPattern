package com.litian.factory.instance;

import com.litian.factory.frame.ImageReader;
import com.litian.factory.frame.ImageReaderFactory;
import com.litian.factory.instance.GifReader;

/**
 * 具体工厂类
 */
public class GifReaderFactory extends ImageReaderFactory {

    @Override
    protected ImageReader createReader() {
      return new GifReader();
    }


}
