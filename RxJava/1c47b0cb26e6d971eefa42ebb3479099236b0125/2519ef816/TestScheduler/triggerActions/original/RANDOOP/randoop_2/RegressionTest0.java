import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.lang.Class<?> wildcardClass1 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedulePeriodically(schedulerFunc1_1, (long) 0, (-1L), timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_1, (long) 100, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_3, 0L, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedulePeriodically(action0_1, 1L, (long) (short) -1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (long) (short) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, (long) (short) 1, (long) (short) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 0, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_3, (-1L), timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, 100L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, 0L, (long) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
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
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_3, 10L, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedulePeriodically(schedulerFunc1_1, (long) (short) 0, (long) (short) -1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) (short) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) (byte) 1, (long) (-1), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedulePeriodically(subscriptionFunc0_1, 100L, (long) (short) 100, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.lang.Class<?> wildcardClass7 = subscription6.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        java.lang.Class<?> wildcardClass9 = subscription8.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) 'a', (long) 100, timeUnit12);
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
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, 100L, 0L, timeUnit12);
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (long) '4', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, 10L, (long) 1, timeUnit12);
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
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
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
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, (long) 100, (long) (byte) 1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
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
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) ' ', timeUnit12);
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
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) 10, timeUnit11);
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
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, (long) (-1), (long) (short) -1, timeUnit16);
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
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) 100, timeUnit15);
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
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(action0_3, (long) '#', timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, 0L, (long) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) (byte) -1, (long) 'a', timeUnit12);
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
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) 10, (long) ' ', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
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
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) 'a', (long) (byte) 1, timeUnit12);
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
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit10);
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
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        java.lang.Class<?> wildcardClass7 = subscription6.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (byte) 100, timeUnit13);
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
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit14);
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
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (long) (byte) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, 0L, timeUnit11);
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
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, (long) '#', timeUnit14);
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
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (long) 1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, (long) (short) 1, timeUnit15);
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
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(schedulerFunc1_11, (long) 10, (long) (byte) 100, timeUnit14);
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
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) '4', (long) (short) -1, timeUnit12);
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
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit11);
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
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) 0, (long) (byte) 10, timeUnit12);
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
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) (short) -1, (long) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) '#', (long) 100, timeUnit12);
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
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, 0L, timeUnit14);
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
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) (byte) 0, (long) '4', timeUnit12);
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
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) (short) 10, (long) (short) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (short) -1, timeUnit13);
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
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit10);
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
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, 100L, (long) (short) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) '4', (long) (byte) -1, timeUnit12);
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
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
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
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, 0L, (long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit10);
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
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (byte) 10, (long) (short) 100, timeUnit16);
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
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
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
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (byte) 0, (long) (short) -1, timeUnit14);
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
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_6, (long) (byte) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (long) (short) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (-1L), 10L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) 'a', timeUnit12);
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
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) '#', (long) (byte) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) 'a', timeUnit12);
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
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, 0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) (byte) 0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) (short) 10, (long) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
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
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
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
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) (-1), 100L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, (long) (short) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, (long) (byte) 1, timeUnit14);
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
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (short) 0, (long) (short) 1, timeUnit12);
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
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) (short) 100, timeUnit10);
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
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) '4', timeUnit11);
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
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (short) 0, timeUnit11);
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
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
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
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) '4', timeUnit15);
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
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, (long) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit10);
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
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) ' ', (long) (byte) 1, timeUnit15);
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
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
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
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit10);
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
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, (-1L), (long) (short) 1, timeUnit16);
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
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.lang.Class<?> wildcardClass5 = subscription4.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (byte) 10, timeUnit11);
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
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedulePeriodically(schedulerFunc1_2, (long) ' ', (long) 0, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, 0L, (long) 'a', timeUnit16);
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
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) 10, timeUnit10);
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
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit12);
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
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedulePeriodically(action0_1, (-1L), (long) (byte) -1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(schedulerFunc1_10, (long) (short) -1, (long) (byte) 0, timeUnit13);
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
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
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
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
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
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit14);
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
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) (short) -1, (long) (-1), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        java.lang.Class<?> wildcardClass7 = subscription6.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        java.lang.Class<?> wildcardClass3 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit15);
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
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
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
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (byte) 100, 10L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) ' ', timeUnit12);
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
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
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
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) (short) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, 0L, (long) (byte) 10, timeUnit14);
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
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedule(action0_2, (long) (byte) 1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, 1L, 100L, timeUnit11);
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
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) (byte) 10, (long) 'a', timeUnit17);
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
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, 0L, timeUnit16);
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
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, 0L, (long) (byte) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) (byte) 10, (long) (short) 1, timeUnit11);
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
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) 0, (long) (byte) -1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(action0_3, 10L, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, (long) 10, (long) 'a', timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (short) -1, (long) (short) 10, timeUnit16);
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
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedulePeriodically(schedulerFunc1_1, (long) 1, (long) (short) 0, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (byte) 0, (long) (short) -1, timeUnit16);
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
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) (byte) -1, timeUnit11);
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
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) 'a', timeUnit16);
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
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 'a', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit10);
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
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) 0, 10L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) ' ', (long) (byte) -1, timeUnit12);
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
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) 0, timeUnit10);
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
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
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
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (byte) 100, 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, 0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, (long) (short) 100, 0L, timeUnit18);
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
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit14);
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
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, (long) (short) 100, 0L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
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
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.lang.Class<?> wildcardClass9 = subscription8.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit10);
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
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
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
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) '4', timeUnit11);
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
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) (byte) 10, timeUnit13);
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
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, (long) (byte) 10, (long) (short) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
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
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) (short) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (long) (short) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, (-1L), timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) '#', timeUnit11);
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
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedulePeriodically(subscriptionFunc0_2, (long) 100, (long) '#', timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) (short) -1, timeUnit12);
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
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) 0, timeUnit11);
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
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) 10, (long) '4', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit13);
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
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
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
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
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
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) (-1), timeUnit11);
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
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (long) '4', timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        java.lang.Class<?> wildcardClass15 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
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
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, 0L, (long) (short) 1, timeUnit18);
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
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        java.lang.Class<?> wildcardClass5 = subscription4.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_3, (-1L), timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, 0L, timeUnit15);
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
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) 0, timeUnit14);
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
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (short) 100, (long) (short) -1, timeUnit16);
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
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit12);
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
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) 100, (long) (byte) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, 10L, (long) 1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedulePeriodically(action0_2, (long) (byte) 100, (long) (byte) 10, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) (byte) -1, (long) (byte) 100, timeUnit18);
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
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(schedulerFunc1_19, (long) (byte) 10, (long) 1, timeUnit22);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, 0L, timeUnit17);
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
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        java.lang.Class<?> wildcardClass10 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) 'a', timeUnit12);
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
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
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
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedulePeriodically(action0_2, (long) (short) 1, (long) (byte) 1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
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
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) 'a', 100L, timeUnit15);
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
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) 1, timeUnit13);
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
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) 1, timeUnit12);
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
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) ' ', (long) 0, timeUnit12);
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
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_18, (long) (short) 100, timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) '#', 0L, timeUnit12);
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
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) '4', (long) ' ', timeUnit12);
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
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
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
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) (short) -1, timeUnit16);
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
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, (-1L), timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
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
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(action0_3, (long) (byte) 0, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) (short) 0, (-1L), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) 0, (long) (short) 100, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
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
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        java.lang.Class<?> wildcardClass17 = subscription16.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, (long) (byte) 10, (-1L), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
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
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, 10L, timeUnit11);
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
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, 100L, (long) (short) -1, timeUnit11);
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
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) (short) 0, (-1L), timeUnit21);
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
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.lang.Class<?> wildcardClass5 = subscription4.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit10);
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
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) (byte) -1, (long) (byte) 10, timeUnit19);
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
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (-1L), 0L, timeUnit12);
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
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, 100L, (long) (byte) 0, timeUnit14);
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
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit9);
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
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) ' ', timeUnit14);
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
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_3, (long) (short) 0, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) (byte) 0, (long) 1, timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
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
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, (long) (byte) -1, timeUnit15);
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
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) (byte) 0, timeUnit15);
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
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit12);
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
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) 0, (long) (short) -1, timeUnit11);
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
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_18, (long) '#', timeUnit20);
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
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        rx.util.functions.Action0 action0_2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedule(action0_2, 0L, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(subscriptionFunc0_3, (long) '#', 0L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, 100L, (long) (byte) 1, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
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
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, 1L, (long) 100, timeUnit13);
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
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) -1, timeUnit15);
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
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, 0L, timeUnit14);
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
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 100, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedulePeriodically(action0_2, (long) (short) 0, (long) 1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) 10, (long) 'a', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) (short) 100, (long) 1, timeUnit18);
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
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (short) 10, (long) (byte) 10, timeUnit14);
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
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) 0, (long) (byte) 100, timeUnit14);
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
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit13);
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
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, (long) 1, timeUnit20);
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
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) 0, 100L, timeUnit14);
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
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (byte) 1, (long) (short) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_17, 100L, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.lang.Class<?> wildcardClass11 = subscription10.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (byte) 0, (long) 1, timeUnit12);
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
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, 100L, timeUnit15);
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
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) ' ', timeUnit14);
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
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, (long) (short) 1, (long) (short) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) 0, (long) (short) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
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
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) 'a', timeUnit11);
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
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, 1L, timeUnit17);
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
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, (long) (short) 0, (long) (short) 0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit12);
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
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, (long) 100, timeUnit14);
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
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(action0_17, (long) '4', (long) 'a', timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
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
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) (byte) 100, (long) (short) 10, timeUnit15);
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
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, (long) (short) 0, timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        java.lang.Class<?> wildcardClass18 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, 1L, (long) (byte) 100, timeUnit15);
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
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, (long) 100, (-1L), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, 100L, 10L, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedulePeriodically(subscriptionFunc0_21, (long) 0, (long) (short) 1, timeUnit24);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (-1), (long) '#', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) (byte) -1, (long) (short) 100, timeUnit14);
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
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit13);
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
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit9);
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
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, 0L, (long) 1, timeUnit18);
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
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) '4', (long) ' ', timeUnit14);
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
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) (short) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) 10, (long) (byte) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) 0, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) (short) -1, timeUnit13);
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
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) (short) 10, (long) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (short) -1, timeUnit13);
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
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
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
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, (long) 10, timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.lang.Class<?> wildcardClass15 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_17, (long) (byte) 10, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(schedulerFunc1_18, (long) (byte) 0, (long) (byte) -1, timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) 'a', timeUnit13);
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
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, 0L, timeUnit10);
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
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) 'a', timeUnit12);
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
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
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
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_17, (long) (byte) -1, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit10);
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
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) ' ', timeUnit15);
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
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) 100, (long) 1, timeUnit19);
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
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(schedulerFunc1_16, (long) (byte) -1, (long) (byte) 10, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (-1L), (long) '4', timeUnit15);
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
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
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
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_21, (long) (short) 0, timeUnit23);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, 10L, (long) 0, timeUnit16);
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
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit12);
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
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit10);
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
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, (long) 10, timeUnit22);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (long) (short) 1, timeUnit16);
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
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_19, (long) '4', timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) 'a', timeUnit12);
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
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.lang.Class<?> wildcardClass7 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(schedulerFunc1_10, (long) (byte) 1, (long) (short) 100, timeUnit13);
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
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) (-1), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
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
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit13);
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
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_19, (long) 0, timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
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
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) '#', (long) (short) 10, timeUnit14);
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
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, (long) '4', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) ' ', (long) '#', timeUnit15);
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
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) '#', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit16);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) (byte) 0, timeUnit12);
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
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        java.lang.Class<?> wildcardClass9 = subscription8.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit9);
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
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (short) -1, 10L, timeUnit16);
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
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) (short) -1, (long) (short) 1, timeUnit18);
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
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        java.lang.Class<?> wildcardClass3 = subscription2.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.lang.Class<?> wildcardClass12 = subscription11.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        java.lang.Class<?> wildcardClass3 = subscription2.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit12);
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
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit10);
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
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, (long) (short) 10, (long) (byte) 10, timeUnit16);
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
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) '4', (long) (short) 1, timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) 'a', (long) (byte) 100, timeUnit12);
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
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit12);
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
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(subscriptionFunc0_19, (long) (byte) 100, (long) ' ', timeUnit22);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_18, (long) '#', timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_21, (long) (byte) 10, timeUnit23);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
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
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
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
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) 100, 1L, timeUnit14);
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
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
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
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, (long) '4', timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
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
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
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
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) ' ', (long) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) '#', timeUnit12);
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
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit11);
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
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, (long) 0, 100L, timeUnit20);
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
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, 0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, (long) (byte) 1, (long) (short) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 0, timeUnit12);
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
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) (short) 10, timeUnit11);
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
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) '#', (long) '4', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) '4', timeUnit15);
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
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, 0L, (long) (short) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (byte) 10, (long) (byte) -1, timeUnit13);
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
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) (short) 100, (long) (-1), timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) ' ', (long) 100, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) (short) 1, timeUnit13);
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
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(schedulerFunc1_11, (long) 1, 0L, timeUnit14);
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
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, (long) '4', (long) (byte) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit16);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, 0L, timeUnit13);
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
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(action0_3, 0L, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) (byte) 100, (long) (-1), timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.lang.Class<?> wildcardClass9 = subscription8.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) 10, timeUnit11);
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
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (-1), (long) (short) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(subscriptionFunc0_16, (long) (short) 10, (long) (byte) 100, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit13);
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
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit13);
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
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
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
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) (byte) 0, timeUnit16);
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
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) (-1), timeUnit13);
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
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(subscriptionFunc0_23, (long) 1, (long) (short) 100, timeUnit26);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, 0L, timeUnit12);
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
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, (long) (short) 0, (long) 100, timeUnit16);
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
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (byte) 1, (long) (short) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit16);
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
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.lang.Class<?> wildcardClass15 = subscription14.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(action0_17, (long) 1, 10L, timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) 'a', timeUnit12);
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
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
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
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) (byte) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (short) 1, (-1L), timeUnit14);
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
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        java.lang.Class<?> wildcardClass19 = subscription18.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
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
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, 100L, timeUnit13);
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
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, 10L, timeUnit18);
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
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(schedulerFunc1_19, (long) (byte) 1, 1L, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, (long) '4', 1L, timeUnit12);
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
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_17, (long) 100, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (short) -1, (-1L), timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, (long) '4', timeUnit17);
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
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, (long) '4', timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) (-1), timeUnit11);
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
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) 10, timeUnit13);
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
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_17, (long) (short) 10, timeUnit19);
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
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, (long) 100, (long) 0, timeUnit18);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) (byte) 0, (long) (short) -1, timeUnit12);
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
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
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
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) ' ', timeUnit13);
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
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) (short) 100, (long) (byte) 1, timeUnit12);
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
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit14);
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
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, (long) (-1), timeUnit17);
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
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
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
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (short) 100, (long) (-1), timeUnit14);
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
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (long) (short) 0, timeUnit16);
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
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_17, (long) ' ', timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(action0_23, (long) 100, 0L, timeUnit26);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedule(subscriptionFunc0_23, 1L, timeUnit25);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedulePeriodically(action0_21, 10L, (long) (short) 1, timeUnit24);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(schedulerFunc1_11, (long) '#', (long) (short) 1, timeUnit14);
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
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) '#', timeUnit12);
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
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (long) (short) 10, timeUnit11);
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
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedulePeriodically(schedulerFunc1_21, (long) (byte) 10, (long) '#', timeUnit24);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(action0_19, 10L, (long) '#', timeUnit22);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedule(action0_23, 1L, timeUnit25);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        java.lang.Class<?> wildcardClass14 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, 0L, timeUnit13);
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
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (long) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        java.lang.Class<?> wildcardClass13 = subscription12.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (long) (byte) -1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit17);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (long) (byte) 1, (long) (byte) -1, timeUnit15);
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
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedulePeriodically(schedulerFunc1_21, (long) (short) 10, 0L, timeUnit24);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, (long) (byte) 0, (long) (byte) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, (long) ' ', timeUnit17);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, 10L, timeUnit14);
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
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        java.lang.Class<?> wildcardClass15 = subscription14.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedulePeriodically(subscriptionFunc0_21, (long) 1, 0L, timeUnit24);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) (short) 0, (long) (short) 0, timeUnit18);
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
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(schedulerFunc1_14, (long) '#', (long) 1, timeUnit17);
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
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) (byte) 1, (long) (short) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }
}

