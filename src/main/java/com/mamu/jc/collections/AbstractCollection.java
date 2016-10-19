package com.mamu.jc.collections;

import java.util.Iterator;

/**
 * Created by bharath on 10/19/16.
 */
public abstract class AbstractCollection<T> implements Collection<T> {

  //Default implementations

  /**
   * Check if the current collection is empty
   * @return return if the current collection is empty
   */
  @Override
  public boolean isEmpty(){
    return size() == 0 ? true : false;
  }

  /**
   * Iterate over the  current collection and check if the element is
   * present
   * @param element the element to be found
   * @return returns true if the element is found
   */
  @Override
  public boolean contains(T element) {
    Iterator<T> it = iterator();
    boolean found = false;
    while (it.hasNext()){
      found = it.next().equals(element);
    }
    return  found;
  }

}
