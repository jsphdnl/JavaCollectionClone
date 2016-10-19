package com.mamu.jc.collections;

/**
 * Created by bharath on 10/19/16.
 */
public interface List<T> extends Collection<T>{

  // list specific actions

  /**
   * Add element at the specified index
   * @param index the index of element to be added.
   * @param element element to be added
   * @throws IndexOutOfBoundsException throws if the index is invalid
   */
  void add(int index, T element) throws IndexOutOfBoundsException;

  /**
   * Remove element at the specified index
   * @param index the
   * @param element
   * @throws IndexOutOfBoundsException thrown if the index is invalid
   */
  void remove(int index, T element) throws IndexOutOfBoundsException;

  /**
   * Fetch the first element in the list
   * @return returns the first element or null if the list is empty
   */
  T fistElement();

  /**
   * Fetch the last element in the list
   * @return returns the last element  or null if the list is empty
   */
  T lastElement();
}
