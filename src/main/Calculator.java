package main;

import java.util.Objects;

/**
 * Calculator
 *
 * @author A. Klap (klap0015@hz.nl)
 */
public class Calculator {
    private String value1;
    private String value2;
    private String operator;

    private String stringSum;
    private String stringSumWords;

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setStringSum(String stringSum) {
        this.stringSum = stringSum;
    }



    public void spiltStringSum() {
        this.value1 = Character.toString(this.stringSum.charAt(0));
        this.operator = Character.toString(this.stringSum.charAt(1));
        this.value2 = Character.toString(this.stringSum.charAt(2));
    }

    public void runSum(ConsoleWriter writer) {
        if (Objects.equals(this.operator, "+")) {
            Context context = new Context(new Addition());
            System.out.println("Optelsom van " +
                    value1 + " + " + value2 + " = " +
                    context.executeStrategy(Integer.parseInt(this.value1), Integer.parseInt(this.value2)));
        } else if (Objects.equals(this.operator, "-")) {
            Context context = new Context(new Subtraction());
            System.out.println("Aftreksom van " +
                    value1 + " - " + value2 + " = " +
                    context.executeStrategy(Integer.parseInt(this.value1), Integer.parseInt(this.value2)));
        } else {
            writer.write("Je hebt geen geldige optie gekozen. Einde oefening");
        }
    }

    public static boolean isNullEmpty(String str) {
        // check if string is null
        if (str == null) {
            return true;
        }
        // check if string is empty
        else if (str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
