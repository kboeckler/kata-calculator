package de.mach.kata.calculator;

import static de.mach.kata.calculator.Operation.*;
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

  @Test
  void mutiply2_3_Eq6() {
    Result result = calculator.calculate(2, 3, Multiply);
    assertThat(result.getValue()).isEqualTo(6);
  }

  @Test
  void pow2_3_Eq8() {
    Result result = calculator.calculate(2, 3, Pow);
    assertThat(result.getValue()).isEqualTo(8);
  }
}
