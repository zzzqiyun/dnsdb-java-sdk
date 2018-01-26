package io.dnsdb.api;

/**
 * Created on 2018/1/25.
 *
 * @author dnsdb team
 */
public class APIManager {
  public static String API_BASE_URL = "https://api.dnsdb.io";
  public static String API_VERSION = "v1";

  public static void resetAPIBaseURL() {
    API_BASE_URL = "https://api.dnsdb.io";
  }
}
