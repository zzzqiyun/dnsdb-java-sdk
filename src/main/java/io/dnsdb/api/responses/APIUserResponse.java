package io.dnsdb.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created on 2018/1/25.
 *
 * @author dnsdb team
 */
public class APIUserResponse extends APIResponse {
  @JsonProperty("api_id")
  private String apiId;
  private String user;
  @JsonProperty("remaining_requests")
  private int remainingRequests;
  @JsonProperty("creation_time")
  private Date creationTime;
  @JsonProperty("expiration_time")
  private Date expirationTime;

  public String getApiId() {
    return apiId;
  }

  public APIUserResponse setApiId(String apiId) {
    this.apiId = apiId;
    return this;
  }

  public String getUser() {
    return user;
  }

  public APIUserResponse setUser(String user) {
    this.user = user;
    return this;
  }

  public int getRemainingRequests() {
    return remainingRequests;
  }

  public APIUserResponse setRemainingRequests(int remainingRequests) {
    this.remainingRequests = remainingRequests;
    return this;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public APIUserResponse setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Date getExpirationTime() {
    return expirationTime;
  }

  public APIUserResponse setExpirationTime(Date expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

}
