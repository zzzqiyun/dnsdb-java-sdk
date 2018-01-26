package io.dnsdb.api;

import java.io.IOException;

import io.dnsdb.api.exceptions.APIException;
import io.dnsdb.api.responses.ScanResponse;

import static io.dnsdb.api.APIManager.API_VERSION;
import static io.dnsdb.api.APIManager.API_BASE_URL;

/**
 * @author dnsdb team
 * @version 1.0
 */
public interface APIClient {

  SearchResult search(Query query, int page, int pageSize) throws APIException, IOException;

  ScanResponse createScan(Query query, int perSize) throws IOException;

  ScanResponse scanNext(String scanId) throws IOException;

  ScanResult scan(Query query, int perSize) throws APIException, IOException;

  APIUser getAPIUser() throws APIException, IOException;

  default String getUrl(String subPath) {
    return API_BASE_URL + '/' + API_VERSION + '/' + subPath;
  }

  default ScanResult scan(Query query) throws APIException, IOException {
    return scan(query, 50);
  }

  default SearchResult search(Query query, int page) throws APIException, IOException {
    return search(query, page, 50);
  }
}
