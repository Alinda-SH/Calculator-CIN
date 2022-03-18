package com.company;

import java.util.Objects;

public interface Builder {
    Calculator setCalculator();

    void setInput(ConsoleReader reader, ConsoleWriter writer, String choice, NumberAdapter numberReader);

    void setOperator(ConsoleReader reader, ConsoleWriter writer);

}
