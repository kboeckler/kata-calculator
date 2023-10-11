package de.mach.kata.calculator;

public class ChainFactory {

  MyChain create() {
    return new MyChain(
        new AddHandler(), new MultiplyHandler(), new PowHandler(new MultiplyHandler()));
  }
}
