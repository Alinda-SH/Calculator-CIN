package main;

import java.util.Objects;

/**
 * Calculator builder 2
 *
 * @author A. Klap (klap0015@hz.nl)
 */
public class CalculatorBuilder2 implements Builder {

    private final Calculator calculator;

    public CalculatorBuilder2() {
        this.calculator = new Calculator();
    }

    @Override
    public Calculator setCalculator() {
        return this.calculator;
    }

    @Override
    public void setInput(ConsoleReader reader, ConsoleWriter writer, String choice, NumberAdapter numberReader) {
        if (Objects.equals(choice, "2")) {
            writer.write("Voer de som met als format {getal}{operator}{getal}");
            writer.write("Voorbeeld 1+4 of 9-8");
            calculator.setStringSum(reader.readLine());
        } else if (Objects.equals(choice, "3")) {
            writer.write("Voer de som met als format {getal} {operator} {getal}");
            writer.write("Voorbeeld een plus vijf");

            calculator.setStringSum(numberReader.readNumber());

            // numberReader.readerNumer.
            // nieuwe adapter maken, stringnumbers -> intergers
            // met functie reader.readLine(), vernoemen naar readInt()
            // service wordt reader. 17.50
            // StringNumberAdapter.

        } else {
            writer.write("Je hebt geen geldige cijfers gekozen. Einde oefening");
        }
    }

    @Override
    public void setOperator(ConsoleReader reader, ConsoleWriter writer) {}

}
