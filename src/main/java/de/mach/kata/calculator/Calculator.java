package de.mach.kata.calculator;

public class Calculator {

  public Result calculate(int a, int b, Operation operation) {
    MyChain chain = new ChainFactory().create();
    int res = chain.doChain(a, b, operation);
    return new Result(res);
  }
}
