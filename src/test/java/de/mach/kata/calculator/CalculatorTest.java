package de.mach.kata.calculator;

import static de.mach.kata.calculator.Operation.Add;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  private Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void add1_1_Eq2() {
    Result result = calculator.calculate(1, 1, Add);
    assertThat(result.getValue()).isEqualTo(2);
  }
}
