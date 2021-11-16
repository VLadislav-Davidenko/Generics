package com.company;

public abstract class AbstractData {
    long id;

    public AbstractData(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract String convertToString();
}
