package io.dnsdb.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import io.dnsdb.api.DNSRecord;

/**
 * Created on 2018/1/25.
 *
 * @author dnsdb team
 */
public class SearchResponse extends APIResponse {
  private List<DNSRecord> records;
  private long total;
  @JsonProperty("remaining_requests")
  private int remainingRequests;

  public List<DNSRecord> getRecords() {
    return records;
  }

  public SearchResponse setRecords(List<DNSRecord> records) {
    this.records = records;
    return this;
  }

  public long getTotal() {
    return total;
  }

  public SearchResponse setTotal(long total) {
    this.total = total;
    return this;
  }

  public int getRemainingRequests() {
    return remainingRequests;
  }

  public SearchResponse setRemainingRequests(int remainingRequests) {
    this.remainingRequests = remainingRequests;
    return this;
  }
}
