package de.mach.kata.calculator;

public class CommandFactory {

  Command create(Operation op) {
    switch (op) {
      case Add:
        return new AddCommand();
      case Subtract:
        return new SubtractCommand();
      case Multiply:
        return new MultiplyCommand();
      case Pow:
        return new PowCommand(new MultiplyCommand());
      default:
        throw new IllegalArgumentException("Unknown operation: " + op);
    }
  }
}
