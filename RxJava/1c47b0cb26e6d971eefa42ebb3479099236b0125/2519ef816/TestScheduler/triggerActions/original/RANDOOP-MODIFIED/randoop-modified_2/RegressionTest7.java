import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit10);
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
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) 100, (long) (short) 0, timeUnit11);
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
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, 10L, (long) (short) 0, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, (long) (short) -1, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, (long) (short) 0, (long) ' ', timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
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
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit23);
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
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, 10L, (long) (short) -1, timeUnit14);
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
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
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
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, 100L, (long) (byte) -1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
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
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, 100L, timeUnit18);
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
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) 'a', (long) (byte) 10, timeUnit15);
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
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
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
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit13);
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
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
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
        long long17 = testScheduler0.now();
        java.lang.Class<?> wildcardClass18 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) 10, (long) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
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
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, (long) (byte) 1, timeUnit14);
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
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
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
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (byte) 100, (long) (byte) -1, timeUnit12);
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
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
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
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (-1L), timeUnit15);
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
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (-1), 100L, timeUnit14);
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
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, 1L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, 0L, (long) '4', timeUnit12);
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
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
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
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_18, 100L, timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.lang.Class<?> wildcardClass18 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.now();
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
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
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit18);
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
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_17, (-1L), timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) 10, timeUnit15);
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
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, 10L, 0L, timeUnit14);
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
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) 1, (long) 0, timeUnit12);
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
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) '#', timeUnit16);
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
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
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
        long long20 = testScheduler0.now();
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedule(action0_21, (long) (byte) 1, timeUnit23);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_18, 10L, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_6, 10L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
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
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit16);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) 100, timeUnit12);
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
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
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
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit15);
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
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) 'a', (long) (byte) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) (short) 1, (long) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        java.lang.Class<?> wildcardClass14 = subscription13.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, (long) ' ', (long) (short) 1, timeUnit16);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
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
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
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
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
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
        long long14 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit16);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
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
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(schedulerFunc1_11, (long) 0, 100L, timeUnit14);
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
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) (byte) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
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
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (short) -1, (long) 10, timeUnit16);
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
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) (short) 0, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
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
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
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
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) (byte) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
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
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (byte) 1, (long) 10, timeUnit19);
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
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        long long22 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit12);
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
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
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
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) '#', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(schedulerFunc1_11, (long) (short) -1, (long) (short) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.lang.Class<?> wildcardClass16 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
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
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
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
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, 1L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, (long) 1, timeUnit17);
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
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, 100L, (long) (byte) 0, timeUnit16);
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
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
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
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (-1), (long) (byte) 1, timeUnit13);
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
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
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
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) (byte) 100, timeUnit14);
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
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
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
            testScheduler0.advanceTimeTo((long) 10, timeUnit10);
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
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) 1, timeUnit12);
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
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
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
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit12);
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
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) (short) -1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
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
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) 1, timeUnit13);
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
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
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
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
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
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(schedulerFunc1_19, 1L, (long) 1, timeUnit22);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.lang.Class<?> wildcardClass14 = testScheduler0.getClass();
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
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_17, (long) (short) 0, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) -1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, (-1L), timeUnit14);
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
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
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
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_25);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedule(subscriptionFunc0_27, (long) (short) 1, timeUnit29);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
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
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (long) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, 0L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, (long) (short) 0, timeUnit14);
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
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit10);
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
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) 1, timeUnit16);
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
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, 100L, (long) (-1), timeUnit16);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
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
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, (long) (short) 1, timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (short) -1, (long) (short) -1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
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
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
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
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedule(action0_22, (long) 0, timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
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
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (short) 100, 1L, timeUnit13);
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
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
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
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
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
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
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
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) (short) 10, (long) 100, timeUnit18);
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
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) (byte) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (short) -1, 10L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
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
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) '4', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
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
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_17, (long) ' ', timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
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
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
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
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) (short) 0, timeUnit13);
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
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) (-1), timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
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
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, 10L, (long) (byte) 10, timeUnit14);
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
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
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
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        java.lang.Class<?> wildcardClass25 = subscription24.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
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
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (long) 100, timeUnit9);
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
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
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
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_18, (long) ' ', timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
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
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
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
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (short) -1, (long) (short) 100, timeUnit13);
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
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) ' ', (long) (byte) -1, timeUnit17);
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
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, 10L, (long) (byte) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.lang.Class<?> wildcardClass5 = subscription4.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
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
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, 0L, (long) '4', timeUnit12);
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
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
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
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(schedulerFunc1_14, (long) (-1), (long) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, 1L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) 'a', (long) (byte) 0, timeUnit15);
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
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        java.lang.Class<?> wildcardClass22 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
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
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (byte) 1, (long) 10, timeUnit13);
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
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
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
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.lang.Class<?> wildcardClass15 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit23);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(action0_17, (long) (byte) 1, (long) (-1), timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
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
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
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
            testScheduler0.advanceTimeBy((long) '4', timeUnit12);
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
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
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
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, (long) '4', (long) (byte) 10, timeUnit16);
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
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_6, 10L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit15);
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
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) (short) 1, (long) ' ', timeUnit11);
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
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) (short) 0, timeUnit15);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
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
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (byte) 1, 10L, timeUnit16);
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
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) (byte) 1, timeUnit18);
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
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (byte) -1, (long) (-1), timeUnit14);
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
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) ' ', 1L, timeUnit15);
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
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, 1L, timeUnit14);
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
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
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
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) 'a', timeUnit13);
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
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(subscriptionFunc0_18, (long) (byte) 1, 100L, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, (long) (short) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (-1L), (long) 1, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        java.lang.Class<?> wildcardClass22 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) (short) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 'a', timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
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
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
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
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit11);
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
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
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
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.lang.Class<?> wildcardClass13 = subscription12.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (-1), 0L, timeUnit16);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (-1L), (long) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit10);
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
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) 1, (long) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
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
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) 'a', (long) (short) 0, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) (short) 10, 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_22, 0L, timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) (short) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
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
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (short) -1, (long) (short) -1, timeUnit16);
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
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
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
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (short) 10, 0L, timeUnit12);
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
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
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
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(schedulerFunc1_16, (long) '4', (long) (byte) 10, timeUnit19);
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
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
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
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_24, (long) 10, timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
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
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) ' ', timeUnit15);
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
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
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
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(schedulerFunc1_16, (long) 0, 1L, timeUnit19);
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
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
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
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.lang.Class<?> wildcardClass15 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) (byte) 0, (long) (short) 1, timeUnit15);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, 0L, 1L, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
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
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit15);
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
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) (short) 10, (long) (short) 1, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_23, 0L, timeUnit25);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
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
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
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
            testScheduler0.advanceTimeTo((long) 1, timeUnit11);
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
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, 1L, (long) 'a', timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        java.lang.Class<?> wildcardClass17 = subscription16.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
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
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, (long) 'a', timeUnit15);
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
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
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
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) (byte) -1, timeUnit14);
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
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_17, 0L, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
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
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(subscriptionFunc0_22, (long) (short) 1, (long) '#', timeUnit25);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
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
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) ' ', (long) 1, timeUnit15);
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
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
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
        java.lang.Class<?> wildcardClass15 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        long long16 = testScheduler0.now();
        java.lang.Class<?> wildcardClass17 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
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
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, (long) (short) 100, (long) (byte) 1, timeUnit20);
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
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (long) ' ', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(subscriptionFunc0_14, (long) (short) 10, (long) (byte) 100, timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
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
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
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
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, 100L, timeUnit18);
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
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, (long) (short) 1, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(schedulerFunc1_18, 100L, (long) '4', timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, (long) (short) 10, (long) (byte) 100, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
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
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        java.lang.Class<?> wildcardClass12 = subscription11.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
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
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, 0L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit12);
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
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (long) (byte) 1, (long) (short) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) (short) 0, timeUnit16);
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
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
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
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        rx.util.functions.Action0 action0_25 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedulePeriodically(action0_25, (long) 100, (long) (short) 1, timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) (byte) 100, timeUnit16);
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
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) (byte) 10, (long) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit15);
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
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.lang.Class<?> wildcardClass8 = subscription7.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
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
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, (-1L), timeUnit21);
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
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
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
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(subscriptionFunc0_17, (long) 1, (long) 10, timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) (short) -1, timeUnit15);
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
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit15);
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
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
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
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) (byte) 0, timeUnit14);
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
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
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
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, 1L, timeUnit17);
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
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, 0L, (long) (-1), timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
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
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_19, (long) (byte) 1, timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, (-1L), timeUnit17);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) (short) 10, (long) (byte) -1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, (long) (short) 10, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit10);
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
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) (byte) 100, 10L, timeUnit18);
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
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, 0L, timeUnit18);
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
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
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
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
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
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (short) 0, (long) 10, timeUnit16);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) (short) 0, (long) (-1), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(subscriptionFunc0_14, (long) '4', (long) (-1), timeUnit17);
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
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
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
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) (short) 1, 1L, timeUnit12);
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
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit16);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        java.lang.Class<?> wildcardClass17 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
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
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_17, (long) 100, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) -1, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        java.lang.Class<?> wildcardClass11 = subscription10.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
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
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(subscriptionFunc0_27);
        java.lang.Class<?> wildcardClass29 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) 'a', (long) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
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
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.lang.Class<?> wildcardClass21 = subscription20.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) (short) 0, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(subscriptionFunc0_23, (long) 100, (long) (byte) 100, timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
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
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, (long) (byte) 0, timeUnit14);
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
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, (long) '4', (long) (-1), timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
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
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, 100L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
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
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) (byte) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) (short) 0, (long) (short) 100, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.lang.Class<?> wildcardClass13 = subscription12.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_2, (long) (byte) 100, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) (short) 100, timeUnit12);
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
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
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
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) (byte) 100, timeUnit13);
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
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
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
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(schedulerFunc1_11, (long) 'a', (long) (byte) -1, timeUnit14);
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
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, (long) 0, timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit13);
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
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
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
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit12);
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
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
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
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (long) (short) 10, timeUnit16);
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
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, (long) (byte) 100, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
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
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (long) '4', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
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
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (short) 0, (long) 0, timeUnit14);
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
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
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
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedule(action0_21, (long) (byte) 10, timeUnit23);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit9);
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
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
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
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (long) '4', timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (-1), (long) (byte) 100, timeUnit16);
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
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit10);
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
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(subscriptionFunc0_14, (long) (short) 100, (long) (short) 1, timeUnit17);
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
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
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
        long long16 = testScheduler0.now();
        java.lang.Class<?> wildcardClass17 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(subscriptionFunc0_17, 10L, (long) '#', timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
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
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(schedulerFunc1_11, (long) 10, (-1L), timeUnit14);
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
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (long) 10, (long) (short) 10, timeUnit13);
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
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
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
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
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
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_18, (long) (byte) 0, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) '4', 0L, timeUnit16);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
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
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_18, (long) (short) 0, timeUnit20);
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
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit12);
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
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(subscriptionFunc0_19, (long) (short) 0, 1L, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) '4', (long) (short) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
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
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) (short) 0, (long) (short) -1, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) (byte) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, (long) (byte) 0, (long) (short) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, (long) 100, timeUnit17);
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
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        long long15 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit17);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) (byte) 0, timeUnit11);
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
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
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
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_19, (long) (short) 10, timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
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
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (short) 10, 0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) (byte) 10, (long) (short) 100, timeUnit14);
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
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
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
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, 1L, timeUnit19);
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
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        java.lang.Class<?> wildcardClass21 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) 'a', 0L, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
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
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (-1L), timeUnit18);
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
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, (long) 0, timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        java.lang.Class<?> wildcardClass16 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        long long2 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, 0L, (long) (-1), timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (long) (short) 0, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (-1L), timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) (byte) 10, (long) ' ', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) '4', (long) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
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
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
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
        long long13 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, 10L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, 0L, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) 10, (long) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
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
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(schedulerFunc1_14, 0L, (long) (byte) 100, timeUnit17);
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
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
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
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) '#', (long) (short) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        java.lang.Class<?> wildcardClass18 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
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
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (-1L), timeUnit16);
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
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, 0L, timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(schedulerFunc1_14, (long) (byte) 1, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
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
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) '4', (long) (short) 100, timeUnit18);
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
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        java.lang.Class<?> wildcardClass12 = subscription11.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) (byte) 0, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) 0, timeUnit16);
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
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        java.lang.Class<?> wildcardClass16 = subscription15.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, (long) 0, timeUnit15);
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
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, 10L, timeUnit14);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit11);
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
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, (long) (byte) 0, (long) '#', timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
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
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, 0L, timeUnit14);
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
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
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
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) (short) 0, (long) '#', timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
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
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, (long) 10, timeUnit17);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) 1, (long) '#', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) 'a', (long) 100, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(subscriptionFunc0_4, (long) (byte) 0, (long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (-1L), (long) (short) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        long long22 = testScheduler0.now();
        long long23 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit25);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
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
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, 100L, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) 0, (long) (short) 100, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (-1L), (long) (-1), timeUnit13);
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
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
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
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) 10, (long) (short) -1, timeUnit11);
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
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
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
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) '4', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
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
        long long13 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.lang.Class<?> wildcardClass18 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit14);
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
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit13);
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
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) 'a', (long) (short) 1, timeUnit15);
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
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, 1L, timeUnit12);
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
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) (byte) 1, timeUnit11);
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
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
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
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 'a', timeUnit12);
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
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
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
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_16, 100L, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (byte) 10, 10L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
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
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedulePeriodically(subscriptionFunc0_20, 100L, 0L, timeUnit23);
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
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_16, 0L, timeUnit18);
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
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
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
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) 100, timeUnit12);
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
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) (-1), (long) 'a', timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
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
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(subscriptionFunc0_17, (-1L), 100L, timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit11);
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
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
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
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit12);
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
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) 10, (long) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
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
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(action0_17, 0L, (long) 10, timeUnit20);
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
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        java.lang.Class<?> wildcardClass14 = subscription13.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
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
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit13);
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
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
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
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) 100, (long) '4', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, 10L, 0L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
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
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit10);
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
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) (byte) 10, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, (long) (byte) 1, (long) 100, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) (byte) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(subscriptionFunc0_14, (-1L), 0L, timeUnit17);
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
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (long) (byte) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(100L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) 1, (long) ' ', timeUnit16);
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
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) 0, timeUnit16);
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
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit16);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
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
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(schedulerFunc1_23, (long) '#', (long) (short) 10, timeUnit26);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, (long) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
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
            testScheduler0.advanceTimeBy((long) 10, timeUnit9);
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
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
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
        long long20 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_21, 10L, timeUnit23);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
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
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, 100L, timeUnit15);
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
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) (byte) 1, timeUnit18);
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
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, 100L, (long) (-1), timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        long long18 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
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
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) (byte) 1, (long) ' ', timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_17, 0L, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        java.lang.Class<?> wildcardClass21 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
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
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, 0L, (long) 0, timeUnit17);
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
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(schedulerFunc1_16, (long) (short) 1, 0L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
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
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) 0, timeUnit12);
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
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
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
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, (long) (byte) 1, (long) '4', timeUnit16);
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
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
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
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (byte) -1, (long) (short) 100, timeUnit19);
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
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) '4', (long) 0, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(schedulerFunc1_16, 0L, (long) (byte) 100, timeUnit19);
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
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
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
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, (long) ' ', timeUnit19);
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
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (-1L), 10L, timeUnit15);
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
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) (byte) 10, timeUnit10);
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
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
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
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
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
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (short) 100, (long) (-1), timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, 10L, timeUnit16);
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
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
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
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
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
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, (long) (short) 0, timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_20, 100L, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
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
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (byte) 0, (long) (byte) 0, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (long) (byte) 0, 100L, timeUnit13);
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
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, 1L, (long) (short) 10, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (short) 100, (long) (byte) 10, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (long) 0, timeUnit9);
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
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (short) 10, (long) (-1), timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, (long) ' ', 10L, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, 0L, timeUnit13);
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
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
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
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(schedulerFunc1_19, (long) 1, (long) (byte) 0, timeUnit22);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
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
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, 100L, timeUnit14);
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
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
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
        long long17 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
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
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, (long) '4', timeUnit17);
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
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) (byte) -1, timeUnit12);
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
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_16, (long) (byte) -1, timeUnit18);
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
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (-1), 1L, timeUnit16);
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
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) 1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(subscriptionFunc0_18, (long) (byte) 1, (long) 100, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, 10L, timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_18, (-1L), timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
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
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit13);
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
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
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
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit14);
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
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(subscriptionFunc0_17, 0L, (long) (byte) 1, timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(schedulerFunc1_22, (long) (short) 0, (long) ' ', timeUnit25);
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
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(100L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) (short) 1, timeUnit13);
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
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_17, (long) (short) 1, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) '4', timeUnit12);
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
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        java.lang.Class<?> wildcardClass12 = subscription11.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 0, timeUnit25);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }
}

