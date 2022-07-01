import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.lang.Class<?> wildcardClass9 = subscription8.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        java.lang.Class<?> wildcardClass22 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long5 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long12 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long15 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) (byte) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.lang.Class<?> wildcardClass19 = subscription18.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedulePeriodically(action0_20, (long) (short) 1, (long) 1, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) (byte) 100, 1L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        long long27 = testScheduler0.now();
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        java.util.concurrent.TimeUnit timeUnit31 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedulePeriodically(action0_24, (long) 10, (long) '#', timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, 10L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        rx.util.functions.Action0 action0_28 = null;
        java.util.concurrent.TimeUnit timeUnit31 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription32 = testScheduler0.schedulePeriodically(action0_28, 100L, 1L, timeUnit31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(subscription27);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        long long2 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) 100, (long) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) (-1), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        rx.util.functions.Action0 action0_26 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedulePeriodically(action0_26, (long) (short) 100, (long) (short) 1, timeUnit29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) '4', (long) (short) 0, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, 0L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, (long) '4', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) '4', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (byte) -1, (long) ' ', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) '4', (long) (short) -1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (byte) 10, (long) (short) 0, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        rx.util.functions.Action0 action0_26 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedule(action0_26, (long) (byte) 1, timeUnit28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        rx.util.functions.Action0 action0_30 = null;
        java.util.concurrent.TimeUnit timeUnit32 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription33 = testScheduler0.schedule(action0_30, (long) 'a', timeUnit32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, 0L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedule(action0_25, 0L, timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, (long) (byte) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long12 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long15 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedulePeriodically(action0_24, (long) 'a', (long) (byte) 1, timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        java.lang.Class<?> wildcardClass25 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.lang.Class<?> wildcardClass21 = subscription20.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) ' ', 0L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedulePeriodically(action0_26, 1L, (long) '#', timeUnit29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) 100, 0L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) ' ', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedulePeriodically(action0_20, (long) (short) 0, (-1L), timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(action0_22, (long) 0, 1L, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, (long) (byte) 10, (long) (short) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, 0L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        java.lang.Class<?> wildcardClass26 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) (short) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) 10, (long) 'a', timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) ' ', (long) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedule(action0_22, (long) (short) -1, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 'a', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, 0L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) (short) -1, 100L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, 100L, (long) ' ', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (short) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, 0L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) '4', (long) 'a', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.lang.Class<?> wildcardClass15 = subscription14.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        java.lang.Class<?> wildcardClass19 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        java.lang.Class<?> wildcardClass3 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.lang.Class<?> wildcardClass14 = subscription13.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        java.lang.Class<?> wildcardClass17 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.lang.Class<?> wildcardClass15 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, 10L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, 100L, (long) '4', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) '4', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (-1), (long) (byte) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        long long28 = testScheduler0.now();
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        java.lang.Class<?> wildcardClass31 = subscription30.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) (byte) 0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, 0L, 10L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) ' ', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) ' ', (long) '#', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (short) 100, (long) (short) 0, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(action0_22, (-1L), (long) (byte) 10, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        java.lang.Class<?> wildcardClass16 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (byte) 10, (long) 'a', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, 1L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        long long28 = testScheduler0.now();
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        rx.util.functions.Action0 action0_31 = null;
        java.util.concurrent.TimeUnit timeUnit33 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription34 = testScheduler0.schedule(action0_31, (long) 'a', timeUnit33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(subscription30);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        long long27 = testScheduler0.now();
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        long long30 = testScheduler0.now();
        rx.util.functions.Action0 action0_31 = null;
        java.util.concurrent.TimeUnit timeUnit34 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription35 = testScheduler0.schedulePeriodically(action0_31, 0L, (long) (byte) 1, timeUnit34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        java.lang.Class<?> wildcardClass20 = subscription19.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(action0_23, (long) (short) 100, (long) ' ', timeUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, 0L, (long) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedulePeriodically(action0_24, 0L, 100L, timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) (byte) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) 1, (long) (-1), timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        long long28 = testScheduler0.now();
        long long29 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit31 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        java.lang.Class<?> wildcardClass17 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (long) 1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedule(action0_24, (long) (byte) 10, timeUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) (byte) -1, 0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.lang.Class<?> wildcardClass16 = subscription15.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.lang.Class<?> wildcardClass14 = subscription13.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) (-1), timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedule(action0_22, (long) (short) 0, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) (byte) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, 10L, (long) (short) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, (long) (byte) 1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        long long2 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) (byte) 0, (long) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, (long) (short) -1, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (byte) 1, (long) '4', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 0, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.lang.Class<?> wildcardClass16 = subscription15.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        long long2 = testScheduler0.now();
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(action0_3, (-1L), timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) (byte) 1, 0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, 0L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (short) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.lang.Class<?> wildcardClass10 = subscription9.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        rx.util.functions.Action0 action0_27 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedule(action0_27, 100L, timeUnit29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) ' ', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, (long) (byte) 1, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        java.lang.Class<?> wildcardClass14 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (short) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedule(action0_22, (long) (byte) 100, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(action0_23, (long) (byte) 1, (long) (byte) 1, timeUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedule(action0_21, (long) '4', timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        long long2 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) -1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, 1L, (long) (byte) -1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 0, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.lang.Class<?> wildcardClass12 = subscription11.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) 'a', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.lang.Class<?> wildcardClass12 = subscription11.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(subscription27);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) ' ', (long) '4', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 'a', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) (short) 100, (long) (short) -1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        long long22 = testScheduler0.now();
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(action0_23, (long) (byte) 100, (long) 100, timeUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedule(action0_22, (long) '#', timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (short) 1, (long) 10, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        java.lang.Class<?> wildcardClass20 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) (byte) 0, (long) 1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(action0_4, (long) (short) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        java.lang.Class<?> wildcardClass18 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        java.lang.Class<?> wildcardClass22 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, 1L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, (long) ' ', timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 'a', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) 10, (long) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) -1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (long) 0, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (byte) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, 0L, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) (short) -1, (long) '#', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        java.lang.Class<?> wildcardClass30 = subscription29.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) '4', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) ' ', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(action0_17, (long) (-1), (long) (byte) -1, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) (short) 10, (long) (short) -1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, 10L, (long) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.lang.Class<?> wildcardClass18 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, 10L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) (byte) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) '#', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) 10, (-1L), timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.lang.Class<?> wildcardClass11 = subscription10.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, 1L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        long long27 = testScheduler0.now();
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        long long30 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit32 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, 10L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) (-1), (long) (-1), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedule(action0_23, (long) '#', timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) (short) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        long long28 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, (long) '#', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(action0_4, (long) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, 10L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (byte) 100, (long) (byte) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, (long) (short) -1, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(action0_19, (long) (short) 10, 100L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, 0L, (long) (short) 1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) 10, 0L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) (short) 1, (long) (short) 100, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) (short) -1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) 0, (long) (short) 10, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, 0L, (long) (-1), timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) 10, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) 'a', (long) (byte) 1, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (short) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (short) 10, (long) (byte) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        java.lang.Class<?> wildcardClass26 = subscription25.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) ' ', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) (short) 1, (long) (short) 100, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, (long) '#', timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) ' ', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) '4', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(100L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (short) -1, (long) (byte) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.lang.Class<?> wildcardClass11 = subscription10.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) (byte) 0, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, (long) (-1), timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, 10L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, 1L, 0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        java.lang.Class<?> wildcardClass19 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        long long28 = testScheduler0.now();
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        rx.util.functions.Action0 action0_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(action0_31);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) '4', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (short) 100, (long) (byte) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.lang.Class<?> wildcardClass14 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(action0_19, (long) (byte) 100, (long) 0, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) (byte) 1, (long) (short) 0, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) (byte) 100, (long) '#', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        long long27 = testScheduler0.now();
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.lang.Class<?> wildcardClass21 = subscription20.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) '#', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedule(action0_23, (-1L), timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(action0_19, (-1L), (long) (byte) -1, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.lang.Class<?> wildcardClass21 = subscription20.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, 10L, (long) (byte) 0, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (long) (short) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (byte) 0, (long) ' ', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedule(action0_24, 10L, timeUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long5 = testScheduler0.now();
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, 0L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(action0_22, (long) '#', 10L, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        long long28 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.lang.Class<?> wildcardClass19 = subscription18.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (-1L), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(action0_19, (long) '4', (long) (byte) 10, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) 100, (long) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        long long28 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) '4', (long) (byte) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.lang.Class<?> wildcardClass14 = subscription13.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.lang.Class<?> wildcardClass5 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (byte) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) 10, (long) '#', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, (long) 0, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) (byte) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (byte) 100, (long) '#', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        long long28 = testScheduler0.now();
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        rx.util.functions.Action0 action0_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(action0_31);
        java.util.concurrent.TimeUnit timeUnit34 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        java.lang.Class<?> wildcardClass15 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, 1L, (long) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) 'a', 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (-1), timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        long long22 = testScheduler0.now();
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(action0_23, 0L, (long) 1, timeUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) (byte) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, (long) (byte) 1, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(action0_22, (long) (byte) 10, (long) (byte) 0, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 0, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Action0 action0_25 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedulePeriodically(action0_25, (long) (byte) 0, (long) 'a', timeUnit28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, 0L, (long) (byte) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedule(action0_21, (long) (byte) 10, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (short) 0, 0L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }
}

