package com.company;

import java.nio.charset.StandardCharsets;

public class Main {


    public static void main(String[] args) {
        XmlData xml = new XmlData(DocumentProcessorUtil.ID_COUNTER++);
        byte[] b = "Данные в байтах".getBytes(StandardCharsets.UTF_8);
        BinaryData bin = new BinaryData(DocumentProcessorUtil.ID_COUNTER++);
        NumericData num = new NumericData(DocumentProcessorUtil.ID_COUNTER++);

        DocumentProcessorUtil.build(xml,"<?xml version=\"1.0\"?><Tests>qwerty</Tests>");
        DocumentProcessorUtil.build(bin,b);
        DocumentProcessorUtil.build(num,123.1241241);


    }
}
