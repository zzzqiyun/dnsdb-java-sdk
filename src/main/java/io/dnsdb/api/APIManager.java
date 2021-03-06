package io.dnsdb.api;

/**
 * <code>APIManager</code>类用于管理API全局设置。
 *
 * @author dnsdb team
 */
public class APIManager {
  /**
   * API服务器的地址
   */
  public static String API_BASE_URL = "https://api.dnsdb.io";
  /**
   * API接口版本号
   */
  public static String API_VERSION = "v1";

  /**
   * 重置API服务器地址
   */
  public static void resetAPIBaseURL() {
    API_BASE_URL = "https://api.dnsdb.io";
  }
}
