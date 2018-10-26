package tdd;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        this.calculator = new Calculator();
    }

    /*
    @Test
    public void plus() {
        // when
        int result = calculator.plus(2, 5);

        // then
        assertEquals(7, result);
    }
    */

    @Test
    public void plus_multiple() throws Exception {
        // when
        int result = calculator.plus(2, 5, 7, 10);

        // then
        assertThat(result, is(24));
    }

    @Test
    public void plus(){
        // given
        RandomCalculator randomCalculator = new RandomCalculator(new Random(){
            @Override
            public int nextInt(){
                return 3;
            }
        }, new Calculator());

        // when
        int result = randomCalculator.plus(2, 5);

        // then
        assertThat(result, is(10));
    }


}