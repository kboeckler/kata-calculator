package de.mach.kata.calculator;

public interface ChainHandler {

  boolean canHandle(Operation operation);

  int handle(int a, int b);
}
