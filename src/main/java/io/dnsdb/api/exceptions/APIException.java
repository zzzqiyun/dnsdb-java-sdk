package io.dnsdb.api.exceptions;

/**
 * @author dnsdb team
 * @version 1.0
 */
public class APIException extends Exception {
  public APIException(int errorCode, String errorMsg) {
    super(String.format("error code: %s, message: %s", errorCode, errorMsg));
  }
}
