package com.mamu.jc.collections;

/**
 * Created by bharath on 10/19/16.
 */
public interface Collection<T> extends Iterable<T> {
  //Java 7 methods & operations
  //Get the size of collection
  int size();

  boolean isEmpty();

  //show check if collection is full else throw exception
  void add(T element);

  //check if collection is not empty and throw error if collection is empty
  void remove(T element);

  //conversions between different types of collections (Add feature)


  //Aggregate operations Java 8 & greater

}
