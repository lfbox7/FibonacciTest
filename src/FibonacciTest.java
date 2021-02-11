import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class FibonacciTest {

    @Parameterized.Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 },{ 6, 8 },
                { 7, 13 }, { 8, 21 }, { 9, 34}, { 10, 55 }
        });
    }

    private int fibInput;
    private int fibExpected;

    public FibonacciTest(int input, int expected) {
        fibInput = input;
        fibExpected = expected;
    }

    @Test
    public void test() {
        assertEquals(fibExpected, Fibonacci.fibonacci(fibInput));
    }
}