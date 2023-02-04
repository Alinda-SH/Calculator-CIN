package test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import main.Builder;
import main.Calculator;
import main.CalculatorBuilder1;
import main.CalculatorBuilder2;
import main.ConsoleReader;
import main.ConsoleWriter;
import main.Director;
import main.NumberAdapter;
import main.WordToNumberAdapter;

public class CalculatorTest {
  Calculator calculator;
  Builder calculatorBuilder1 = new CalculatorBuilder1();
  CalculatorBuilder2 calculatorBuilder2 = new CalculatorBuilder2();
  Director director;

  ConsoleReader reader = new ConsoleReader();
  ConsoleWriter writer = new ConsoleWriter();
  NumberAdapter numberReader  = new WordToNumberAdapter(reader);

  @BeforeEach
  void setUp() {
    director = new Director(calculatorBuilder1);

//    director.constructCalculator(reader, writer, "1", numberReader);
  }

  @Test
  void testCalculator1() {
//    director.constructCalculator(reader, writer, "1", numberReader);

    calculator = calculatorBuilder1.setCalculator();
    calculator.setValue1("5");
    calculator.setValue2("9");
    calculator.setOperator("-");
    calculator.runSum(writer);

    assertEquals("Aftreksom van 5 - 9 = -4", calculator.runSum(writer));

  }

}





