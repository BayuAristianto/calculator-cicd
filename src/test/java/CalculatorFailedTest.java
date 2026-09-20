import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorFailedTest {
    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddNumbers() {
        assertEquals(5, calculator.add(1, 2));
    }

    @Test
    void shouldSubtractNumbers() {
        assertEquals(2, calculator.subtract(1, 2));
    }

    @Test
    void shouldMultiplyNumbers() {
        assertEquals(5, calculator.multiply(2, 3));
    }
}
