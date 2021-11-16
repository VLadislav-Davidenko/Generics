package com.company;

import java.util.Arrays;

public class BinaryData extends AbstractData implements Storable<byte[]>{
    final Typ type = Typ.BIN;
    byte[] data = {1,2,3,4};

    public BinaryData(long id) {
        super(id);
    }

    @Override
    public String convertToString() {
        return Arrays.toString(data);
    }


    @Override
    public byte[] read() {
        return null;
    }

    @Override
    public void write(byte[] name) {
        data = name;
    }

    @Override
    public Typ getType() {
        return type;
    }
}
