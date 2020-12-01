package com.litian.factory.instance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JpegReader extends ImageReader {
    @Override
    public FileInputStream Read(String Path) {
        try {
            System.out.println("读取Jpeg");
            FileInputStream inStream = new FileInputStream(Path);
            return inStream;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
