package com.company;

import java.nio.charset.StandardCharsets;

public class Main {


    public static void main(String[] args) {
        XmlData xml = new XmlData(DocumentProcessorUtil.ID_COUNTER++);
        byte[] b = "Данные в байтах".getBytes();
        BinaryData bin = new BinaryData(DocumentProcessorUtil.ID_COUNTER++);
        NumericData num = new NumericData(DocumentProcessorUtil.ID_COUNTER++);

        DocumentProcessorUtil.build(xml,"<?xml version=\"1.0\"?><Tests>qwerty</Tests>");
        DocumentProcessorUtil.build(bin,b);
        DocumentProcessorUtil.build(num,123.1241241);

        StringData convert = DocumentProcessorUtil.convert(xml);
        StringData convert1 = DocumentProcessorUtil.convert(bin);
        StringData convert2 = DocumentProcessorUtil.convert(num);

        System.out.println(convert.data);
        System.out.println(convert.id);
        System.out.println(convert.type);

        System.out.println("=".repeat(30));

        System.out.println(convert1.data);
        System.out.println(convert1.id);
        System.out.println(convert1.type);

        System.out.println("=".repeat(30));

        System.out.println(convert2.data);
        System.out.println(convert2.id);
        System.out.println(convert2.type);

        System.out.println("=".repeat(30));

        String s = xml.convertToString();
        System.out.println(s);

        String s1 = bin.convertToString();
        System.out.println(s1);

        String s2 = num.convertToString();
        System.out.println(s2);




    }
}
