package de.mach.kata.calculator;

public class MultiplyHandler implements ChainHandler {
  @Override
  public boolean canHandle(Operation operation) {
    return operation == Operation.Multiply;
  }

  @Override
  public int handle(int a, int b) {
    return a * b;
  }
}
