package tdd;

import java.util.Random;

public class RandomCalculator {
    private Random random;
    private Calculator calculator;

    public RandomCalculator(Random random, Calculator calculator){
        this.calculator = calculator;
        this.random = random;
    }

    public int plus(int... targets){
        return this.calculator.plus(targets) + random.nextInt();
    }
}
