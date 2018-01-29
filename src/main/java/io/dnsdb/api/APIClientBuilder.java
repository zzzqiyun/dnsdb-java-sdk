package io.dnsdb.api;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 * Created on 2018/1/29.
 *
 * @author dsndb team
 */
public class APIClientBuilder {
  private String apiId;
  private String apiKey;
  private CloseableHttpClient client;
  private RequestConfig requestConfig;

  public APIClientBuilder(String apiId, String apiKey) {
    this.apiId = apiId;
    this.apiKey = apiKey;
  }

  public APIClientBuilder setClient(CloseableHttpClient client) {
    this.client = client;
    return this;
  }

  public APIClientBuilder setRequestConfig(RequestConfig requestConfig) {
    this.requestConfig = requestConfig;
    return this;
  }

  public APIClient build() {
    DefaultAPIClient apiClient = new DefaultAPIClient(apiId, apiKey);
    if (client != null) {
      apiClient.setHttpClient(client);
    }
    if (requestConfig != null) {
      apiClient.setRequestConfig(requestConfig);
    }
    return apiClient;
  }
}
