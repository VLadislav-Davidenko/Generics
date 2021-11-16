package com.company;

public class BinaryData extends AbstractData implements Storable<BinaryData>{
    final Typ type = Typ.BIN;
    byte[] data;

    public BinaryData(long id) {
        super(id);
    }


    @Override
    public BinaryData read() {
        return null;
    }

    @Override
    public void write(BinaryData data) {


    }

    @Override
    public Typ getType() {
        return type;
    }
}
