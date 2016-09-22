package io.dnsdb.sdk;

/**
 * The class <code></code>
 *
 * @author DnsDB.io
 * @version 1.0
 */
public class DnsRecord {
  private String host;
  private String type;
  private String value;

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
