package com.company;

import java.util.Objects;

public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Calculator setCalculator() {
        return this.builder.setCalculator();
    }

    public void constructCalculator(ConsoleReader reader, ConsoleWriter writer, String choice, NumberAdapter numberReader) {
        this.builder.setInput(reader, writer, choice, numberReader); // set
        this.builder.setOperator(reader, writer); // set

        if (Objects.equals(choice, "2") || Objects.equals(choice, "3")) {
            setCalculator().spiltStringSum();
        }
        setCalculator().runSum(writer);
    }
}

