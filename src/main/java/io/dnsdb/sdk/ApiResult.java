package io.dnsdb.sdk;

/**
 * The class <code></code>
 *
 * @author DnsDB.io
 * @version 1.0
 * @date Aug 08,2016 16:21
 */
public class ApiResult {
  private String error;
  private String message;
  private boolean success;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

}
