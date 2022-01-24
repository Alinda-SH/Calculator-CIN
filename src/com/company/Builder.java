package com.company;

import java.util.Objects;

public interface Builder {
    public Calculator getCalculator();

    public void getInput(ConsoleReader reader, ConsoleWriter writer, String choice);

    public void getOperator(ConsoleReader reader, ConsoleWriter writer);


}
