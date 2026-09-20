import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldSubtractNumbers() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void shouldMultiplyNumbers() {
        assertEquals(6, calculator.multiply(2, 3));
    }
}
