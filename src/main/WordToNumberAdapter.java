package main.company;

import java.util.*;

/**
 * Word to number adapter
 *
 * @author A. Klap (klap0015@hz.nl)
 */
public class WordToNumberAdapter implements NumberAdapter{ // StringNumberAdapter
    private ConsoleReader reader;

    private boolean isValidInput = true;
    private String result = "";
    private String finalResult = "";
    private List<String> allowedStrings = Arrays.asList
            (
                    "nul", "een", "twee", "drie", "vier", "vijf", "zes", "zeven",
                    "acht", "negen", "tien", "plus", "min");

    public WordToNumberAdapter(ConsoleReader reader) {
        this.reader = reader;
    }

    private String stringtoNumber(String input) {
        if (input != null && input.length() > 0) {
            input = input.replaceAll("-", " ");
            input = input.toLowerCase().replaceAll(" and", " ");
            String[] splittedParts = input.trim().split("\\s+");

            for (String str : splittedParts) {
                if (!allowedStrings.contains(str)) {
                    isValidInput = false;
                    System.out.println("Foute invoer : " + str);
                    break;
                }
            }
            if (isValidInput) {
                checkStringParts(splittedParts);

                finalResult += result;
                result = "";
            }
        }
        return finalResult;
    }

    private void checkStringParts(String[] splittedParts) {
        for (String str : splittedParts) {
            if (str.equalsIgnoreCase("nul")) {
                result += "0";
            } else if (str.equalsIgnoreCase("een")) {
                result += "1";
            } else if (str.equalsIgnoreCase("twee")) {
                result += "2";
            } else if (str.equalsIgnoreCase("drie")) {
                result += "3";
            } else if (str.equalsIgnoreCase("vier")) {
                result += "4";
            } else if (str.equalsIgnoreCase("vijf")) {
                result += "5";
            } else if (str.equalsIgnoreCase("zes")) {
                result += "6";
            } else if (str.equalsIgnoreCase("zeven")) {
                result += "7";
            } else if (str.equalsIgnoreCase("acht")) {
                result += "8";
            } else if (str.equalsIgnoreCase("negen")) {
                result += "9";
            } else if (str.equalsIgnoreCase("tien")) {
                result += "10";
            } else if (str.equalsIgnoreCase("plus")) {
                result += "+";
            } else if (str.equalsIgnoreCase("min")) {
                result += "-";
            }
        }
    }

    @Override
    public String readNumber() {
        // die moet String zijn als return om dat in calculator we het omzetten naar Int
        // hierdoor kunnen manier 2 en 3 dezelfde functies gebruiken.
        String input = this.reader.readLine();

        return stringtoNumber(input);
    }
}
