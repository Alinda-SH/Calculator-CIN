package main.company;

/**
 * Substraction strategy
 *
 * @author A. Klap (klap0015@hz.nl)
 */
public class Subtraction  implements Strategy{

    @Override
    public int calculation(int a, int b) {
        return a-b;
    }

}
