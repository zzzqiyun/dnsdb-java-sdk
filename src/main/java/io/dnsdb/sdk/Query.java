package io.dnsdb.sdk;

/**
 * The class <code></code>
 *
 * @author DnsDB.io
 * @version 1.0
 * @date Aug 08,2016 16:15
 */
public class Query {
  private String host;
  private String domain;
  private String type;
  private String ip;

  public Query setHost(String host) {
    this.host = host;
    return this;
  }

  public Query setDomain(String domain) {
    this.domain = domain;
    return this;
  }

  public Query setType(String type) {
    this.type = type;
    return this;
  }

  public Query setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getHost() {
    return host;
  }

  public String getDomain() {
    return domain;
  }

  public String getType() {
    return type;
  }

  public String getIp() {
    return ip;
  }
}
