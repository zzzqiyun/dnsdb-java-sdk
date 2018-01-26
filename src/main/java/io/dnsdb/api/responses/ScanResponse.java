package io.dnsdb.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import io.dnsdb.api.DNSRecord;

/**
 * Created on 2018/1/24.
 *
 * @author dnsdb team
 */
public class ScanResponse extends APIResponse {
  private List<DNSRecord> records;
  @JsonProperty("scan_id")
  private String scanId;
  @JsonProperty("remaining_requests")
  private int remainingRequests;
  private long total;

  public List<DNSRecord> getRecords() {
    return records;
  }

  public ScanResponse setRecords(List<DNSRecord> records) {
    this.records = records;
    return this;
  }

  public String getScanId() {
    return scanId;
  }

  public ScanResponse setScanId(String scanId) {
    this.scanId = scanId;
    return this;
  }

  public int getRemainingRequests() {
    return remainingRequests;
  }

  public ScanResponse setRemainingRequests(int remainingRequests) {
    this.remainingRequests = remainingRequests;
    return this;
  }

  public long getTotal() {
    return total;
  }

  public ScanResponse setTotal(long total) {
    this.total = total;
    return this;
  }
}
