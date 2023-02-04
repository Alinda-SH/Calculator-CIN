package test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
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
  Builder calculatorBuilder1;
  CalculatorBuilder2 calculatorBuilder2;
  Director director;

  ConsoleReader reader;
  ConsoleWriter writer;
  NumberAdapter numberReader;

  @BeforeEach
  void setUp() {
    reader = new ConsoleReader();
    writer = new ConsoleWriter();
    numberReader = new WordToNumberAdapter(reader);

    calculatorBuilder1 = new CalculatorBuilder1();
    director = new Director(calculatorBuilder1);

//    director.constructCalculator(reader, writer, "1", numberReader);
  }

  @Test
  @DisplayName("Simple multiplication should work")
  void testCalculator1() {
//    director.constructCalculator(reader, writer, "1", numberReader);

    calculator = calculatorBuilder1.setCalculator();
    calculator.setValue1("5");
    calculator.setValue2("9");
    calculator.setOperator("-");
    calculator.runSum(writer);

    assertEquals("Aftreksom van 4 - 5 = -1", calculator.runSum(writer));

  }

}


//  @RepeatedTest(5)
//      @DisplayName("Ensure correct handling of zero")
//      void testMultiplyWithZero() {
//        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
//        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
//      }
//  }



