package com.company;

public class CalculatorBuilder1 implements Builder {

    private final Calculator calculator;

    public CalculatorBuilder1() {
        this.calculator = new Calculator();
    }

    @Override
    public Calculator getCalculator() {
        return this.calculator;
    }

    @Override
    public void getInput(ConsoleReader reader, ConsoleWriter writer, String choice) {
        writer.write("Voer getal 1 in:");
        calculator.setValue1(reader.readLine());

        writer.write("Voer getal 2 in:");
        calculator.setValue2(reader.readLine());
    }

    @Override
    public void getOperator(ConsoleReader reader, ConsoleWriter writer) {
        writer.write("Wil je optellen [+] of aftrekken [-]?");
        writer.write("Voer in [+] of [-]?");
        calculator.setOperator(reader.readLine());
    }

}
