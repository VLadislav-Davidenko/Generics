package com.company;


public class XmlData extends AbstractData implements Storable<String> {
    final Typ type = Typ.XML;
    String data;

    public XmlData(long id) {
        super(id);
    }

    @Override
    public String convertToString() {
        return data;
    }


    @Override
    public String read() {
        return null;
    }

    @Override
    public void write(String name) {
        data = name;

    }

    @Override
    public Typ getType() {
        return type;
    }
}



