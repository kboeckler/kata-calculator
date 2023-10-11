package de.mach.kata.calculator;

public class Calculator {

  public Result calculate(int a, int b, Operation operation) {
    CommandFactory commandFactory = new CommandFactory();
    Command command = commandFactory.create(operation);
    int res = command.calculate(a, b);
    return new Result(res);
  }
}
