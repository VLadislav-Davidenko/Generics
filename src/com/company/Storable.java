package com.company;


public interface Storable <S> {
    S read();
    void write(S data);
    Typ getType();
}
