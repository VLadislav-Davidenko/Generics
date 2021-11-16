package com.company;

public class NumericData extends AbstractData implements Storable<NumericData>{
    final Typ type = Typ.NUM;
    Number data;

    public NumericData(long id) {
        super(id);
    }


    @Override
    public NumericData read() {
        return null;
    }

    @Override
    public void write(NumericData data) {

    }

    @Override
    public Typ getType() {
        return type;
    }
}
