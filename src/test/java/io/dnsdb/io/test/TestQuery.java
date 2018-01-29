package io.dnsdb.io.test;

import org.junit.Test;

import io.dnsdb.api.Query;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created on 2018/1/29.
 *
 * @author dnsdb team
 */
public class TestQuery {

  @Test
  public void testIsEmpty() {
    assertTrue(new Query().isEmpty());
    assertFalse(new Query().setDomain("google.com").isEmpty());
    assertFalse(new Query().setHost("www.google.com").isEmpty());
    assertFalse(new Query().setType("a").isEmpty());
    assertFalse(new Query().setIp("1.1.1.1").isEmpty());
  }
}
