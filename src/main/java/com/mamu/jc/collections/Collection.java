package com.mamu.jc.collections;

import java.util.Iterator;

/**
 * Created by bharath on 10/19/16.
 */
public interface Collection<T> extends Iterable<T> {

  /*
   * Java 7 collection specific methods
   *
   */
  int size();
  boolean isEmpty();
  void add(T element); //show check if collection is full else throw exception
  void remove(T element); //check if collection is not empty and throw error if collection is empty
  boolean contains(T element); // why object rather than Generic ?

  /*
   * Iterable specific methods ?? why override again
   */
  Iterator<T> iterator();

  //conversions between different types of collections (Add feature)


  //Aggregate operations Java 8 & greater

}
