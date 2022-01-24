package com.company;

import java.util.Objects;

public class CalculatorBuilder2 implements Builder {

    private final Calculator calculator;

    public CalculatorBuilder2() {
        this.calculator = new Calculator();
    }

    @Override
    public Calculator getCalculator() {
        return this.calculator;
    }

    @Override
    public void getInput(ConsoleReader reader, ConsoleWriter writer, String choice) {
        if (Objects.equals(choice, "2")) {
            writer.write("Voer de som met als format {getal}{operator}{getal}");
            writer.write("Voorbeeld 1+4 of 9-8");
            calculator.setStringSum(reader.readLine());
        } else if (Objects.equals(choice, "3")) {
            writer.write("Voer de som met als format {getal} {operator} {getal}");
            writer.write("Voorbeeld een plus vijf");
            calculator.setStringSumWords(reader.readLine());
        } else {
            writer.write("Je hebt geen geldige optie gekozen. Einde oefening");
        }
    }

    @Override
    public void getOperator(ConsoleReader reader, ConsoleWriter writer) {}

}
