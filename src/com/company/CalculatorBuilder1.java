package com.company;

/**
 * Calculator builder 1
 *
 * @author A. Klap (klap0015@hz.nl)
 */
public class CalculatorBuilder1 implements Builder {

    private final Calculator calculator;

    public CalculatorBuilder1() {
        this.calculator = new Calculator();
    }

    @Override
    public Calculator setCalculator() {
        return this.calculator;
    }

    @Override
    public void setInput(ConsoleReader reader, ConsoleWriter writer, String choice, NumberAdapter numberReader) {
        writer.write("Voer getal 1 in:");
        calculator.setValue1(reader.readLine());

        writer.write("Voer getal 2 in:");
        calculator.setValue2(reader.readLine());
    }

    @Override
    public void setOperator(ConsoleReader reader, ConsoleWriter writer) { // setOperator
        writer.write("Wil je optellen [+] of aftrekken [-]?");
        writer.write("Voer in [+] of [-]?");
        calculator.setOperator(reader.readLine());
    }

}
