package com.mamu.jc.collections;

import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by bharath on 10/19/16.
 */
public abstract class AbstractSpliterator<T> implements Spliterator<T>{

  @Override
  public boolean tryAdvance(Consumer<? super T> action) {

    return false;
  }
}
