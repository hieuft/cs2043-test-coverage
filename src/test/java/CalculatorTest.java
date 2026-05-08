import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  private final Calculator calculator = new Calculator();

  @Test
  void testAdd() {
    assertEquals(5, calculator.add(2, 3), "2 + 3 = 5");
  }

  @Test
  void testDivide() {
    assertEquals(2, calculator.divide(6, 3), "6 / 3 = 2");
  }

  @Test
  void testDivideByZero() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      calculator.divide(5, 0);
    });
    assertEquals("Cannot be divided by 0", exception.getMessage());
  }
}
