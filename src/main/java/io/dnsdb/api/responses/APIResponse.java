package io.dnsdb.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dnsdb.api.exceptions.APIException;

/**
 * Created on 2018/1/25.
 *
 * @author dnsdb team
 */
public abstract class APIResponse {
  @JsonProperty("error_code")
  private int errorCode;
  @JsonProperty("error_msg")
  private String errorMsg;


  public int getErrorCode() {
    return errorCode;
  }

  public APIResponse setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public APIResponse setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  public boolean hasError() {
    return errorCode != 0;
  }

  public void checkError() throws APIException {
    if (errorCode != 0) {
      throw new APIException(errorCode, errorMsg);
    }
  }
}
