package de.mach.kata.calculator;

public class AddCommand implements Command {

  @Override
  public int calculate(int a, int b) {
    return a + b;
  }
}
