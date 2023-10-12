package de.mach.kata.calculator;

import static de.mach.kata.calculator.Operation.Add;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void add1_1_Eq2() {
    Calculator calculator = new Calculator();
    int result = calculator.calculate(1, 1, Add);
    assertThat(result).isEqualTo(2);
  }
}
