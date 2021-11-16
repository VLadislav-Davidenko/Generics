package com.company;

import java.lang.reflect.Type;

public class StringData extends AbstractData {
    Typ type;
    String data;

    public <T extends AbstractData>StringData(long id, Typ type, T data) {
        super(id);
        this.type = type;
        this.data = data.toString();
    }

    @Override
    public String convertToString() {
        return null;
    }
}
