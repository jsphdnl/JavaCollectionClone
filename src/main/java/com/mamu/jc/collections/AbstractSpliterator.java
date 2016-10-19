package com.mamu.jc.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by bharath on 10/19/16.
 */
public abstract class AbstractSpliterator<T> implements Spliterator<T>{

  @Override
  public boolean tryAdvance(Consumer<? super T> action) {
    List<T> testList = new ArrayList<>();
    return false;
  }
}
