package de.mach.kata.calculator;

public class ApplicationTestFixture {

  public static void main(String[] args) {
    Result result;

    System.out.println("Some examples by the Calculator:\n===");
    Calculator calculator = new Calculator();
    result = calculator.calculate(2, 3, Operation.Add);
    System.out.printf("%d + %d = %d%n", 2, 3, result.getValue());
    result = calculator.calculate(8, 3, Operation.Subtract);
    System.out.printf("%d - %d = %d%n", 8, 3, result.getValue());

    System.out.println("Some examples by the Squared Calculator:\n===");
    Calculator squaredCalculator = new Calculator(); // TODO another Calculator
    result = squaredCalculator.calculate(2, 3, Operation.Add);
    System.out.printf("%d² + %d² = %d%n", 2, 3, result.getValue());
    result = squaredCalculator.calculate(8, 3, Operation.Subtract);
    System.out.printf("%d² - %d² = %d%n", 8, 3, result.getValue());
  }
}
