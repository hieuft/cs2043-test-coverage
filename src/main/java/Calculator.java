import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
  private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

  public int add(int a, int b) {
    int result = a + b;
    logger.info("Add: {} + {} = {}", a, b, result);
    return result;
  }

  public int divide(int a, int b) {
    if (b == 0) {
      logger.error("Divide: {} / 0", a);
      throw new IllegalArgumentException("Cannot be divided by 0");
    }
    int result = a / b;
    logger.info("Divide: {} / {} = {}", a, b, result);
    return result;
  }
}
