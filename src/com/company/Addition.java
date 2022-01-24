package com.company;

public class Addition implements Strategy{

    @Override
    public int calculation(int a, int b) {
        return a+b;
    }

}
