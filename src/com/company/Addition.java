package com.company;

/**
 * User validation
 *
 * @author A. Klap (klap0015@hz.nl)
 */
public class Addition implements Strategy{

    @Override
    public int calculation(int a, int b) {
        return a+b;
    }

}
