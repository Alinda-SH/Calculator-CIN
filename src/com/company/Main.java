package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // select calculator version
        writer.write("Hallo, dit is een calculator met twee opties:");
        writer.write("Optie 1: voer twee getallen in en kies daarna of je wilt plus of min wilt doen.");
        writer.write("Optie 2: voer een plus- of minsom in.");
        writer.write("Optie 3: voer een plus- of minsom in als zin, met woorden.");
        writer.write("Type voor optie 1 [1], voor optie 2 [2] en voor optie 3 [3]");
        String choice = reader.readLine();

        if (Objects.equals(choice, "1")) {
            writer.write("choice : " + choice);
            Builder calculatorBuilder1 = new CalculatorBuilder1();
            Director director = new Director(calculatorBuilder1);

            director.constructCalculator(reader, writer, choice);

        } else if (Objects.equals(choice, "2") || Objects.equals(choice, "3")) {
            writer.write("choice : " + choice);
            Builder calculatorBuilder2 = new CalculatorBuilder2();
            Director director = new Director(calculatorBuilder2);

            director.constructCalculator(reader, writer, choice);
        }
    }
}
