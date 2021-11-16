package com.company;

import java.util.Arrays;

public class BinaryData extends AbstractData implements Storable<BinaryData>{
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
