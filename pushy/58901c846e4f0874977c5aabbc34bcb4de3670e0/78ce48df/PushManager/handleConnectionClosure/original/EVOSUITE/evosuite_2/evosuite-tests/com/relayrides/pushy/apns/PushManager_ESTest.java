/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 07 06:20:21 GMT 2021
 */

package com.relayrides.pushy.apns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.relayrides.pushy.apns.ApnsConnection;
import com.relayrides.pushy.apns.ApnsEnvironment;
import com.relayrides.pushy.apns.KnownBadPushNotification;
import com.relayrides.pushy.apns.PushManager;
import com.relayrides.pushy.apns.RejectedNotificationReason;
import io.netty.channel.nio.NioEventLoopGroup;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PushManager_ESTest extends PushManager_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      int int0 = (-44);
      SSLContext sSLContext0 = SSLContext.getDefault();
      assertNotNull(sSLContext0);
      
      BlockingQueue<KnownBadPushNotification> blockingQueue0 = null;
      NioEventLoopGroup nioEventLoopGroup0 = null;
      ApnsEnvironment apnsEnvironment0 = ApnsEnvironment.getProductionEnvironment();
      assertEquals(2195, apnsEnvironment0.getApnsGatewayPort());
      assertEquals("feedback.push.apple.com", apnsEnvironment0.getFeedbackHost());
      assertEquals(2196, apnsEnvironment0.getFeedbackPort());
      assertEquals("gateway.push.apple.com", apnsEnvironment0.getApnsGatewayHost());
      assertNotNull(apnsEnvironment0);
      
      PushManager<KnownBadPushNotification> pushManager0 = null;
      try {
        pushManager0 = new PushManager<KnownBadPushNotification>(apnsEnvironment0, sSLContext0, int0, nioEventLoopGroup0, blockingQueue0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.netty.util.concurrent.DefaultPromise
         //
         verifyException("io.netty.util.concurrent.MultithreadEventExecutorGroup", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      ApnsEnvironment apnsEnvironment0 = null;
      SSLContext sSLContext0 = null;
      NioEventLoopGroup nioEventLoopGroup0 = null;
      int int0 = 25;
      LinkedBlockingQueue<KnownBadPushNotification> linkedBlockingQueue0 = new LinkedBlockingQueue<KnownBadPushNotification>();
      assertNotNull(linkedBlockingQueue0);
      
      PushManager<KnownBadPushNotification> pushManager0 = null;
      try {
        pushManager0 = new PushManager<KnownBadPushNotification>(apnsEnvironment0, sSLContext0, int0, nioEventLoopGroup0, linkedBlockingQueue0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.netty.util.concurrent.DefaultPromise
         //
         verifyException("io.netty.util.concurrent.MultithreadEventExecutorGroup", e);
      }
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      ApnsEnvironment apnsEnvironment0 = ApnsEnvironment.getProductionEnvironment();
      assertEquals("gateway.push.apple.com", apnsEnvironment0.getApnsGatewayHost());
      assertEquals(2196, apnsEnvironment0.getFeedbackPort());
      assertEquals(2195, apnsEnvironment0.getApnsGatewayPort());
      assertEquals("feedback.push.apple.com", apnsEnvironment0.getFeedbackHost());
      assertNotNull(apnsEnvironment0);
      
      SSLContext sSLContext0 = SSLContext.getDefault();
      assertNotNull(sSLContext0);
      
      int int0 = 2316;
      NioEventLoopGroup nioEventLoopGroup0 = null;
      BlockingQueue<KnownBadPushNotification> blockingQueue0 = null;
      PushManager<KnownBadPushNotification> pushManager0 = null;
      try {
        pushManager0 = new PushManager<KnownBadPushNotification>(apnsEnvironment0, sSLContext0, int0, nioEventLoopGroup0, blockingQueue0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.netty.util.concurrent.DefaultPromise
         //
         verifyException("io.netty.util.concurrent.MultithreadEventExecutorGroup", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      String string0 = null;
      int int0 = 0;
      ApnsEnvironment apnsEnvironment0 = new ApnsEnvironment(string0, int0, string0, int0);
      assertEquals(0, apnsEnvironment0.getApnsGatewayPort());
      assertNull(apnsEnvironment0.getApnsGatewayHost());
      assertNull(apnsEnvironment0.getFeedbackHost());
      assertEquals(0, apnsEnvironment0.getFeedbackPort());
      assertNotNull(apnsEnvironment0);
      
      SSLContext sSLContext0 = null;
      NioEventLoopGroup nioEventLoopGroup0 = null;
      BlockingQueue<KnownBadPushNotification> blockingQueue0 = null;
      PushManager<KnownBadPushNotification> pushManager0 = null;
      try {
        pushManager0 = new PushManager<KnownBadPushNotification>(apnsEnvironment0, sSLContext0, int0, nioEventLoopGroup0, blockingQueue0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.netty.util.concurrent.DefaultPromise
         //
         verifyException("io.netty.util.concurrent.MultithreadEventExecutorGroup", e);
      }
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      ApnsEnvironment apnsEnvironment0 = null;
      SSLContext sSLContext0 = null;
      int int0 = (-1612);
      NioEventLoopGroup nioEventLoopGroup0 = null;
      PriorityBlockingQueue<KnownBadPushNotification> priorityBlockingQueue0 = new PriorityBlockingQueue<KnownBadPushNotification>();
      assertNotNull(priorityBlockingQueue0);
      
      PushManager<KnownBadPushNotification> pushManager0 = null;
      try {
        pushManager0 = new PushManager<KnownBadPushNotification>(apnsEnvironment0, sSLContext0, int0, nioEventLoopGroup0, priorityBlockingQueue0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.netty.util.concurrent.DefaultPromise
         //
         verifyException("io.netty.util.concurrent.MultithreadEventExecutorGroup", e);
      }
  }

  @Test(timeout = 11000)
  public void test5()  throws Throwable  {
      int int0 = 0;
      SSLContext sSLContext0 = SSLContext.getDefault();
      assertNotNull(sSLContext0);
      
      BlockingQueue<KnownBadPushNotification> blockingQueue0 = null;
      NioEventLoopGroup nioEventLoopGroup0 = null;
      int int1 = 15;
      ApnsEnvironment apnsEnvironment0 = null;
      PushManager<KnownBadPushNotification> pushManager0 = null;
      try {
        pushManager0 = new PushManager<KnownBadPushNotification>(apnsEnvironment0, sSLContext0, int1, nioEventLoopGroup0, blockingQueue0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.netty.util.concurrent.DefaultPromise
         //
         verifyException("io.netty.util.concurrent.MultithreadEventExecutorGroup", e);
      }
  }
}
