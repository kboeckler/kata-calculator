package de.mach.kata.calculator;

public class AddHandler implements ChainHandler {
  @Override
  public boolean canHandle(Operation operation) {
    return operation == Operation.Add;
  }

  @Override
  public int handle(int a, int b) {
    return a + b;
  }
}
