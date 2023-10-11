package de.mach.kata.calculator;

public class PowHandler implements ChainHandler {

  private final MultiplyHandler multiplyHandler;

  public PowHandler(MultiplyHandler multiplyHandler) {
    this.multiplyHandler = multiplyHandler;
  }

  @Override
  public boolean canHandle(Operation operation) {
    return operation == Operation.Pow;
  }

  @Override
  public int handle(int a, int b) {
    if (b == 0) {
      return 1;
    }
    int result = a;
    for (int i = 2; i <= b; i++) {
      result = multiplyHandler.handle(result, a);
    }
    return result;
  }
}
