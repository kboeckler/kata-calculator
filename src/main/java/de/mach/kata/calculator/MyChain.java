package de.mach.kata.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyChain {

  private final List<ChainHandler> handlers = new ArrayList<>();

  public MyChain(ChainHandler... handlers) {
    Collections.addAll(this.handlers, handlers);
  }

  public int doChain(int a, int b, Operation operation) {
    for (ChainHandler handler : handlers) {
      if (handler.canHandle(operation)) {
        return handler.handle(a, b);
      }
    }
    return 0;
  }
}
