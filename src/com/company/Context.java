package com.company;

/**
 * Context class for strategy
 *
 * @author A. Klap (klap0015@hz.nl)
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.calculation(num1, num2);
    }
}