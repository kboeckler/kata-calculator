package de.mach.kata.calculator;

public class MultiplyCommand implements Command {
  @Override
  public int calculate(int a, int b) {
    return a * b;
  }
}
