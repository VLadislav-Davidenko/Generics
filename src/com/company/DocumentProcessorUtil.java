package com.company;


public class DocumentProcessorUtil {
    public static int ID_COUNTER = 0;

    private DocumentProcessorUtil() {
    }

    public static <T extends AbstractData & Storable> StringData convert(T  data){
        StringData std = new StringData(++ID_COUNTER, data.getType(), data);
        return std;
    }
    public static <T> void build(Storable storeObj, T data){
        storeObj.write(data);
    }
}
