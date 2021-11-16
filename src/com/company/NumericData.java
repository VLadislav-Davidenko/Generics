package com.company;

public class NumericData extends AbstractData implements Storable<Number>{
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
    public Number read() {
        return null;
    }

    @Override
    public void write(Number name) {
        data = name;

    }

    @Override
    public Typ getType() {
        return type;
    }
}
