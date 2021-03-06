/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 30 21:43:00 GMT 2021
 */

package com.squareup.okhttp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.squareup.okhttp.Address;
import com.squareup.okhttp.OkAuthenticator;
import java.net.Proxy;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OkHttpClient_ESTest extends OkHttpClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SSLSocketFactory sSLSocketFactory0 = HttpsURLConnection.getDefaultSSLSocketFactory();
      HostnameVerifier hostnameVerifier0 = HttpsURLConnection.getDefaultHostnameVerifier();
      OkAuthenticator okAuthenticator0 = mock(OkAuthenticator.class, new ViolatedAssumptionAnswer());
      Proxy proxy0 = Proxy.NO_PROXY;
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : transports == null
      // Modified Version:
      //     java.lang.IllegalArgumentException : The constructor public com.squareup.okhttp.Address(java.lang.String,int,javax.net.ssl.SSLSocketFactory,javax.net.ssl.HostnameVerifier,com.squareup.okhttp.OkAuthenticator,java.net.Proxy,java.util.List) throws java.net.UnknownHostException is not a member of type class com.squareup.okhttp.Address
      Address address0 = null;
      try {
        address0 = new Address("hrTgL\"3;@", 824, sSLSocketFactory0, hostnameVerifier0, okAuthenticator0, proxy0, (List<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // transports == null
         //
         verifyException("com.squareup.okhttp.Address", e);
         assertTrue(e.getMessage().equals("transports == null"));   
      }
  }
}
