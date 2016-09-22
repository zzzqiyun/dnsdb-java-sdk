package io.dnsdb.sdk;

import java.util.Date;

/**
 * The class <code></code>
 *
 * @author DnsDB.io
 * @version 1.0
 */
public class AccessToken {
  private String token;
  private Date creationTime;
  private Date expirationTime;
  private int expireIn;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  public Date getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(Date expirationTime) {
    this.expirationTime = expirationTime;
  }

  public int getExpireIn() {
    return expireIn;
  }

  public void setExpireIn(int expireIn) {
    this.expireIn = expireIn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    AccessToken that = (AccessToken) o;

    return token.equals(that.token);

  }

  @Override
  public int hashCode() {
    return token.hashCode();
  }
}
