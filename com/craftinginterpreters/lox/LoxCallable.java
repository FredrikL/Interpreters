package com.craftinginterpreters.lox;

import java.util.List;

interface LoxCallable {
  int arity();

  Object call(Interperter interperter, List<Object> arguments);
}
