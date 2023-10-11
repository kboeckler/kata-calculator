package de.mach.kata.calculator;

public class PowCommand implements Command {

  private final MultiplyCommand multiplyCommand;

  public PowCommand(MultiplyCommand multiplyCommand) {
    this.multiplyCommand = multiplyCommand;
  }

  @Override
  public int calculate(int a, int b) {
    if (b == 0) {
      return 1;
    }
    int result = a;
    for (int i = 2; i <= b; i++) {
      result = multiplyCommand.calculate(result, a);
    }
    return result;
  }
}
