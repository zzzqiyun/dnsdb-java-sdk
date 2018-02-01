package io.dnsdb.api.exceptions;

/**
 * <code>IteratorException</code>表示迭代异常。
 *
 * @author dnsdb team
 */
public class IteratorException extends RuntimeException {
  public IteratorException(String message) {
    super(message);
  }
}
