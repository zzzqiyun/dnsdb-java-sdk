package io.dnsdb.sdk;

import com.sun.prism.impl.Disposer;

import java.util.Iterator;
import java.util.List;

/**
 * The class <code></code>
 *
 * @author DnsDB.io
 * @version 1.0
 * @date Sep 09,2016 23:45
 */
public class DnsRecordIterator implements Iterator<DnsRecord>{

  private APIClient client;
  private List<DnsRecord> currentDnsRecords;

  public DnsRecordIterator(APIClient client){
    this.client = client;
  }

  public boolean hasNext() {
    if(currentDnsRecords.size() > 0){
      return true;
    }
    return false;
  }

  public DnsRecord next() {
    return null;
  }

  public void remove() {

  }
}
