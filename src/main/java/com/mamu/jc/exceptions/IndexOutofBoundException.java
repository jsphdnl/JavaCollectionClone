package com.mamu.jc.exceptions;

/**
 * Created by bharath on 10/19/16.
 */
public class IndexOutofBoundException extends RuntimeException{

  private static final long serialVersionUID = 2312341234123423456L;

  /**
   * Constructs a new runtime exception with {@code null} as its
   * detail message.  The cause is not initialized, and may subsequently be
   * initialized by a call to {@link #initCause}.
   */
  public IndexOutofBoundException() {
  }

  /**
   * Constructs a new runtime exception with the specified detail message.
   * The cause is not initialized, and may subsequently be initialized by a
   * call to {@link #initCause}.
   *
   * @param message the detail message. The detail message is saved for
   *                later retrieval by the {@link #getMessage()} method.
   */
  public IndexOutofBoundException(String message) {
    super(message);
  }
}
