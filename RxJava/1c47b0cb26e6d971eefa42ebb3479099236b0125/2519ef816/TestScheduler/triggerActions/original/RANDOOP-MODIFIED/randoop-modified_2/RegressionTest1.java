import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(schedulerFunc1_4, (long) (byte) 1, (long) (byte) -1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedulePeriodically(schedulerFunc1_20, (long) (short) 10, 0L, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) (byte) 0, (long) (byte) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) ' ', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, 10L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(subscriptionFunc0_3, (long) 1, 0L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) 0, (long) (short) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) '#', (long) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) (byte) 1, (long) (short) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (-1L), timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        java.lang.Class<?> wildcardClass20 = subscription19.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, (long) (short) 0, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, (long) '4', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
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
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) (short) 10, (long) (short) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.lang.Class<?> wildcardClass10 = subscription9.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) 10, (long) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) '#', (long) (short) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) 1, (long) 'a', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) 'a', (long) (short) 0, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) 1, 100L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) (byte) 1, (long) '4', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, 0L, 1L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
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
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) '4', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) 'a', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) ' ', (long) (short) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.lang.Class<?> wildcardClass16 = subscription15.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) 0, (long) (short) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, 0L, (long) (byte) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedulePeriodically(schedulerFunc1_1, (long) ' ', 1L, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (long) (short) 10, (-1L), timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) (short) 100, (long) (byte) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, 10L, (long) '4', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) 10, 0L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) 100, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) 'a', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_16, (long) (short) -1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, 1L, (long) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        java.lang.Class<?> wildcardClass4 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) (short) -1, (long) ' ', timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (-1L), (long) (byte) 0, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) (short) -1, (long) (short) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (long) (-1), timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) 100, (long) (short) 100, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (long) (short) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (byte) -1, (long) (short) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) (byte) 100, 10L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) '#', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) (short) -1, (long) (byte) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        java.lang.Class<?> wildcardClass14 = subscription13.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, (long) (short) 1, 0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, (long) (short) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, 10L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(schedulerFunc1_16, 0L, (long) ' ', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) (-1), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) (short) 10, (long) (short) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (long) (byte) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) 'a', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (long) (byte) 1, (long) (byte) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, (long) 1, (-1L), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) (byte) 100, (long) '4', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) (byte) 100, (long) (byte) 0, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, 0L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (short) 10, (long) (short) 0, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (long) 10, (long) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, (long) '4', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (long) (byte) 1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) (byte) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, 0L, (long) '4', timeUnit13);
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
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) '#', (-1L), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (long) 'a', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, (long) 0, (long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(schedulerFunc1_11, (long) (byte) 1, 10L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (long) '#', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) '#', (long) (byte) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.lang.Class<?> wildcardClass11 = subscription10.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) (byte) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, 0L, 0L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) '4', (long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) (byte) 0, (long) '4', timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(schedulerFunc1_16, (long) 100, (long) 10, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(schedulerFunc1_14, (long) (short) 100, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_16, (long) 'a', timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (long) 'a', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) (short) 1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
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
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, 10L, (long) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(schedulerFunc1_11, (long) ' ', (long) '4', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) '#', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) (short) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(schedulerFunc1_10, (long) (byte) 1, (long) (byte) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (-1), (long) (byte) 100, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (long) (byte) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) (short) 1, (long) (byte) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, (long) 'a', (long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
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
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (-1), timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, 100L, (-1L), timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) (byte) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_4, 0L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) 0, 10L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, 0L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) (byte) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_4, (long) (-1), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, 0L, (long) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) (byte) -1, (long) '#', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, 10L, (-1L), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) (byte) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) 10, (long) (byte) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) (short) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) (-1), timeUnit15);
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
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, (long) ' ', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_4, 0L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, (long) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, (long) (byte) 100, 0L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) (short) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, (long) (-1), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, (long) (short) 100, (long) (short) -1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(100L, timeUnit12);
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
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (short) 100, 100L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, 0L, (long) (byte) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) (byte) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, 10L, (long) '#', timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) (short) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, (long) (-1), (long) (byte) 0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(subscriptionFunc0_14, (long) (-1), (long) 100, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.lang.Class<?> wildcardClass10 = subscription9.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, 0L, (long) ' ', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
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
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) 1, (long) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) (-1), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) (short) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_18, (long) ' ', timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) 10, (long) (short) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) 0, 0L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(subscriptionFunc0_18, (long) 10, (long) (short) 10, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) (short) 1, (long) (short) -1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, 10L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.lang.Class<?> wildcardClass6 = subscription5.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, 0L, (long) (byte) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.lang.Class<?> wildcardClass6 = subscription5.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, (long) 'a', 1L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) '#', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) (byte) -1, 100L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_16, 0L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) (byte) -1, (long) (byte) 10, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) '4', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) '4', timeUnit13);
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
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
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
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        java.lang.Class<?> wildcardClass14 = subscription13.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) (short) -1, (long) (short) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) ' ', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, 1L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.lang.Class<?> wildcardClass10 = subscription9.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, 100L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (byte) 0, (long) (short) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) 'a', (long) ' ', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) 1, 10L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) 1, (long) 'a', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) (-1), (long) (short) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, (long) (byte) 10, (long) (byte) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) (byte) 100, (long) (byte) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(schedulerFunc1_14, (long) (short) -1, (long) (short) 1, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) (byte) 1, (long) (short) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) (byte) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) '4', (long) '4', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) '#', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.lang.Class<?> wildcardClass8 = subscription7.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (long) (short) 100, (long) (byte) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) ' ', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) (short) 1, (long) (-1), timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
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
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) 1, (long) (byte) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) (short) -1, 100L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) 'a', (long) (short) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, (long) 1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) (short) 0, (long) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, (long) (short) 10, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) 'a', (long) '4', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) (byte) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) 100, (long) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, (long) (-1), timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (short) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) (short) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (-1L), timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
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
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (short) 0, 0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
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
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (short) 1, (long) (short) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) '4', (long) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, 1L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.lang.Class<?> wildcardClass12 = subscription11.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_6, (long) (short) 0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
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
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, (long) 10, (long) (byte) 0, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) (short) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, (long) (byte) -1, (long) '4', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.lang.Class<?> wildcardClass12 = subscription11.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (byte) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) (short) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_6, (long) 'a', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, 100L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
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
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, 0L, (long) (-1), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (short) 0, (long) (short) -1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) 1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) (short) 100, (long) 'a', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) (short) 10, (long) (short) 10, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, 0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (-1L), timeUnit9);
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
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, 100L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) (byte) 10, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) 1, 100L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) (-1), timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(100L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (-1L), timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.lang.Class<?> wildcardClass17 = subscription16.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, (long) 1, (long) (-1), timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) '4', (long) '4', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (long) (short) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) (short) 10, (long) (-1), timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) (short) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) ' ', (long) (byte) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) (byte) 1, (long) (short) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) (short) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) 1, (-1L), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, 0L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.lang.Class<?> wildcardClass5 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, (long) (byte) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, (-1L), timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) (short) 10, 0L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(action0_4, (long) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) (byte) 0, (long) (short) 0, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) ' ', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, (long) (short) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.lang.Class<?> wildcardClass7 = subscription6.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) (short) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) 'a', (long) (byte) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, 1L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
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
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, (long) (short) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) (short) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) (-1), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (long) 1, 100L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, 0L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_18, (long) (byte) -1, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(subscriptionFunc0_3, 0L, (long) (short) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, 10L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) (short) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) (short) 0, (long) (short) -1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (long) '#', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, 0L, 1L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, 10L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedulePeriodically(subscriptionFunc0_2, (long) (byte) -1, (long) (-1), timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(action0_4, (long) (byte) 100, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (-1), 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
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
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, 0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) 'a', 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) (byte) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, 0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) 100, 0L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (short) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (byte) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) (short) 10, (long) ' ', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) -1, (long) ' ', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (long) '4', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, 0L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        long long10 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) ' ', 1L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) 'a', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.lang.Class<?> wildcardClass4 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        java.lang.Class<?> wildcardClass20 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) '4', (long) '#', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) (byte) 10, 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) 1, 10L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) ' ', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit12);
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
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) (byte) -1, 100L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) '#', (long) (short) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) (byte) 1, (long) '4', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) (-1), timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) (short) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) 'a', (long) '#', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, 1L, (long) (byte) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (-1L), (long) (-1), timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(action0_4, 100L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) 100, (long) (short) -1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) (byte) 100, (long) ' ', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) (byte) 0, (long) (byte) -1, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (byte) 100, timeUnit11);
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
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) 1, (long) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (long) (byte) 1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(100L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) 1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
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
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit8);
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
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) ' ', (-1L), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(schedulerFunc1_19, (long) (short) 0, (long) (short) -1, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) '4', (long) 1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
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
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) (byte) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) '4', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) 1, (long) '4', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) (byte) 1, 0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, 0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        java.lang.Class<?> wildcardClass14 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) (-1), timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) (byte) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(subscriptionFunc0_4, (long) (byte) 10, (long) (byte) -1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) (short) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedule(action0_2, (-1L), timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(schedulerFunc1_10, (long) (byte) 10, (long) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, 100L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(schedulerFunc1_10, 0L, (long) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) '4', (long) (short) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, 100L, (long) '#', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.lang.Class<?> wildcardClass16 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.lang.Class<?> wildcardClass8 = subscription7.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) '4', (long) (short) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) '4', (long) 1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) (byte) 100, 100L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) (short) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (byte) 1, (-1L), timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (byte) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) '#', (long) (short) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) (short) 0, (long) (byte) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, (long) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }
}

