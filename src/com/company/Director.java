package com.company;

import java.util.Objects;

public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Calculator getCalculator() {
        return this.builder.getCalculator();
    }

    public void constructCalculator(ConsoleReader reader, ConsoleWriter writer, String choice) {
        this.builder.getInput(reader, writer, choice);
        this.builder.getOperator(reader, writer);

        if (Objects.equals(choice, "2") || Objects.equals(choice, "3")) {
            getCalculator().spiltStringSum();
        }
        getCalculator().runSum(writer);
    }
}
