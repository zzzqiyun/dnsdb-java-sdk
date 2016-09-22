package io.dnsdb.sdk;

import java.io.IOException;

/**
 * The class <code></code>
 *
 * @author DnsDB.io
 * @version 1.0
 * @date Sep 09,2016 23:27
 */
public interface APIClient {

  static String API_BASE_URL = "https://dnsdb.io/api/v1";

  ApiResult authorize(String username, String password) throws IOException;

  ApiResult searchDns(AccessToken accessToken, Query query) throws IOException;

  ApiResult searchDns(AccessToken accessToken, Query query, int from) throws IOException;

  ApiResult requestSearchId(AccessToken accessToken, Query query) throws IOException;

  ApiResult retrieveDns(AccessToken accessToken, String searchId) throws IOException;

  ApiResult getResources(AccessToken accessToken) throws IOException;
}
