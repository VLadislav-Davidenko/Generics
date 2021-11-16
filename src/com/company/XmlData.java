package com.company;


public class XmlData extends AbstractData implements Storable<XmlData> {
    final Typ type = Typ.XML;
    String data;

    public XmlData(long id) {
        super(id);
    }


    @Override
    public XmlData read() {
        return null;
    }

    @Override
    public void write(XmlData name) {
    }

    @Override
    public Typ getType() {
        return type;
    }
}



