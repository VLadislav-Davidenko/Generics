package com.company;

public class NumericData extends AbstractData implements Storable<NumericData>{
    final Typ type = Typ.NUM;
    Number data = 123;

    public NumericData(long id) {
        super(id);
    }

    @Override
    public String convertToString() {
        return data.toString();
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
