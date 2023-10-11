package de.mach.kata.calculator;

public class SubtractCommand implements Command {
  @Override
  public int calculate(int a, int b) {
    return a - b;
  }
}
