package io.dnsdb.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dnsdb.api.exceptions.APIException;

/**
 * Created on 2018/1/25.
 *
 * @author dnsdb team
 */
public class APIResponse {
  @JsonProperty("error_code")
  private Integer errorCode;
  @JsonProperty("error_msg")
  private String errorMsg;
  private String doc;


  public Integer getErrorCode() {
    return errorCode;
  }

  public APIResponse setErrorCode(Integer errorCode) {
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

  public String getDoc() {
    return doc;
  }

  public APIResponse setDoc(String doc) {
    this.doc = doc;
    return this;
  }

  public boolean hasError() {
    return errorCode != null;
  }

  public void checkError() throws APIException {
    if (errorCode != null) {
      throw new APIException(errorCode, errorMsg);
    }
  }
}
