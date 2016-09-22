package io.dnsdb.sdk;

import io.dnsdb.sdk.exceptions.AuthenticationException;

import java.io.IOException;

/**
 * The class <code>DnsdbClient</code> represents an client
 *
 * @author DnsDB.io
 * @version 1.0
 */
public interface DnsdbClient {

  void login(String username, String password) throws AuthenticationException, IOException;

  SearchResult<DnsRecord> searchDns(Query query, String from) throws IOException;

  SearchResult<DnsRecord> retrieveDns(Query query) throws IOException;

  Resources getResources() throws IOException;
}
