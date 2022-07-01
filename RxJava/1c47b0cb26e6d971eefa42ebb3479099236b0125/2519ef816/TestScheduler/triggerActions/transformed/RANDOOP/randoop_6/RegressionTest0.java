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
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, 1L, (long) (byte) -1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, (long) (short) 10, (long) (byte) -1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedule(action0_2, (long) 'a', timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(subscriptionFunc0_4, (-1L), (long) (byte) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_4, (long) ' ', timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_3, (long) (short) 1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedulePeriodically(action0_2, 10L, (long) 10, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) (short) 0, (long) (short) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_3, (-1L), timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, (long) (byte) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, 1L, 0L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) (byte) 1, 0L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, (long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, (long) (byte) 1, (long) (-1), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.lang.String str7 = strTimedAction4.getstate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_2, (long) (short) 0, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        rx.util.functions.Action0 action0_2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedulePeriodically(action0_2, (long) (byte) -1, (long) 1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime2.thenComparing(wildcardTimedActionComparator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, 0L, (long) (short) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) '#', (long) '4', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedulePeriodically(schedulerFunc1_2, 0L, (long) (byte) 1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_4, (long) (byte) 100, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, (long) (short) 10, (long) (byte) 100, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(action0_3, (long) (byte) 0, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (short) 100, (long) (short) -1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, (long) (byte) 1, 10L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_2, (long) (short) -1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) (byte) 0, (long) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) 1, (long) '4', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, 10L, (long) (short) 0, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.lang.Class<?> wildcardClass8 = subscription7.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_2, (long) (short) 1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) (short) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, (long) (byte) 100, (long) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) ' ', (long) 'a', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, (long) '#', (long) (byte) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean5 = strTimedAction4.isCancelled;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.getisCancelled();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.getaction();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(atomicBoolean5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNotNull(atomicBoolean7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_4, (long) (short) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.lang.String str7 = strTimedAction4.getstate();
        strTimedAction4.cancel();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        java.lang.Class<?> wildcardClass12 = strTimedAction10.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_4, (long) ' ', timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, 0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (-1L), timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, 1L, (long) (-1), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) (short) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_6, 1L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(schedulerFunc1_4, (long) 'a', 10L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        java.lang.String str8 = strTimedAction4.state;
        java.lang.String str9 = strTimedAction4.getstate();
        java.lang.Class<?> wildcardClass10 = strTimedAction4.getClass();
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        java.lang.String str6 = strTimedAction5.state;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction5.getscheduler();
        java.lang.String str8 = strTimedAction5.getstate();
        strTimedAction5.cancel();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction5.isCancelled;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = compareActionsByTime0.compare(strTimedAction5, strTimedAction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(atomicBoolean10);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) (byte) -1, (long) (byte) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean5 = strTimedAction4.isCancelled;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = testScheduler6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(atomicBoolean5);
        org.junit.Assert.assertNull(testScheduler6);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler13.schedulePeriodically(schedulerFunc1_14, 0L, (long) 1, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (byte) 10, 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
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
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        java.lang.String str8 = strTimedAction4.state;
        java.lang.String str9 = strTimedAction4.getstate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction11.getscheduler();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler12.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(testScheduler12);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler6 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler6, (long) (byte) -1, schedulerFunc2_8, "");
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction10.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction10.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction10.getaction();
        java.lang.String str14 = strTimedAction10.state;
        java.lang.String str15 = strTimedAction10.getstate();
        rx.concurrency.TestScheduler testScheduler16 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (long) (byte) -1, schedulerFunc2_18, "");
        java.lang.String str21 = strTimedAction20.state;
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction20.getscheduler();
        java.lang.String str23 = strTimedAction20.getstate();
        long long24 = strTimedAction20.time;
        int int25 = compareActionsByTime5.compare(strTimedAction10, strTimedAction20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.lang.Class<?> wildcardClass27 = wildcardTimedActionComparator3.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNull(testScheduler11);
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(testScheduler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_1, (long) (byte) 1, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler6 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler6, (long) (byte) -1, schedulerFunc2_8, "");
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction10.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction10.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction10.getaction();
        java.lang.String str14 = strTimedAction10.state;
        java.lang.String str15 = strTimedAction10.getstate();
        rx.concurrency.TestScheduler testScheduler16 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (long) (byte) -1, schedulerFunc2_18, "");
        java.lang.String str21 = strTimedAction20.state;
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction20.getscheduler();
        java.lang.String str23 = strTimedAction20.getstate();
        long long24 = strTimedAction20.time;
        int int25 = compareActionsByTime5.compare(strTimedAction10, strTimedAction20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator26.thenComparing(wildcardTimedActionComparator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNull(testScheduler11);
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(testScheduler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        java.lang.String str27 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        long long33 = strTimedAction32.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction32.getaction();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        rx.concurrency.TestScheduler testScheduler42 = strTimedAction41.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_43 = strTimedAction41.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = strTimedAction41.getaction();
        java.lang.String str45 = strTimedAction41.state;
        java.lang.String str46 = strTimedAction41.getstate();
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        java.lang.String str52 = strTimedAction51.state;
        rx.concurrency.TestScheduler testScheduler53 = strTimedAction51.getscheduler();
        java.lang.String str54 = strTimedAction51.getstate();
        long long55 = strTimedAction51.time;
        int int56 = compareActionsByTime36.compare(strTimedAction41, strTimedAction51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        java.lang.Class<?> wildcardClass58 = wildcardTimedActionComparator57.getClass();
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(testScheduler42);
        org.junit.Assert.assertNull(schedulerFunc2_43);
        org.junit.Assert.assertNull(schedulerFunc2_44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(testScheduler53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, (long) '4', (long) (-1), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        long long5 = strTimedAction4.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean6 = strTimedAction4.getisCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean6);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) (short) -1, 1L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, (long) (-1), schedulerFunc2_4, (java.lang.CharSequence) "hi!");
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        java.lang.Class<?> wildcardClass9 = subscription8.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.time = (short) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, 0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.lang.String str7 = strTimedAction4.getstate();
        long long8 = strTimedAction4.time;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.settime((long) (short) 100);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) 0, (long) 'a', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (-1L), (long) (byte) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (short) 1, (long) (byte) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(schedulerFunc1_10, (long) 'a', (long) (short) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions((long) (short) 10);
        java.lang.Class<?> wildcardClass4 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, 10L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        strTimedAction4.cancel();
        java.lang.Class<?> wildcardClass8 = strTimedAction4.getClass();
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, 0L, (long) '4', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, 100L, (long) (byte) 1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (byte) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, (long) (byte) 10, (long) (short) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 10, schedulerFunc2_2, "");
        java.lang.Class<?> wildcardClass5 = strTimedAction4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = strTimedAction10.getaction();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strTimedAction10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
        org.junit.Assert.assertNull(schedulerFunc2_14);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (byte) 10, (long) (byte) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(10L);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.time;
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, 32L, (long) (short) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, (long) 'a', 35L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_4, (long) 100, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler13.schedulePeriodically(action0_14, (long) 0, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(subscriptionFunc0_4, (long) (short) 1, 0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.settime(100L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) '#', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) (byte) 100, 35L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_10 = null;
        rx.concurrency.TestScheduler testScheduler11 = new rx.concurrency.TestScheduler();
        testScheduler11.triggerActions((long) 'a');
        testScheduler11.triggerActions();
        testScheduler11.settime((long) '#');
        testScheduler11.triggerActions(100L);
        long long19 = testScheduler11.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler11.schedule(subscriptionFunc0_20);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction22 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) '#', schedulerFunc2_10, subscription21);
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedule(action0_23, (long) (byte) 100, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.time;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, 0L, (long) '#', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) (short) 1, 0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, 32L, (long) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(schedulerFunc1_10, 10L, (long) ' ', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        java.lang.Class<?> wildcardClass4 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        java.lang.String str27 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        long long33 = strTimedAction32.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction32.getaction();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        rx.concurrency.TestScheduler testScheduler42 = strTimedAction41.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_43 = strTimedAction41.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = strTimedAction41.getaction();
        java.lang.String str45 = strTimedAction41.state;
        java.lang.String str46 = strTimedAction41.getstate();
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        java.lang.String str52 = strTimedAction51.state;
        rx.concurrency.TestScheduler testScheduler53 = strTimedAction51.getscheduler();
        java.lang.String str54 = strTimedAction51.getstate();
        long long55 = strTimedAction51.time;
        int int56 = compareActionsByTime36.compare(strTimedAction41, strTimedAction51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime58.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        rx.concurrency.TestScheduler testScheduler63 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_65 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction67 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler63, (long) (byte) -1, schedulerFunc2_65, "");
        strTimedAction67.cancel();
        rx.concurrency.TestScheduler testScheduler69 = strTimedAction67.getscheduler();
        strTimedAction67.cancel();
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction71 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int72 = compareActionsByTime60.compare(strTimedAction67, strTimedAction71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(testScheduler42);
        org.junit.Assert.assertNull(schedulerFunc2_43);
        org.junit.Assert.assertNull(schedulerFunc2_44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(testScheduler53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNull(testScheduler69);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (byte) 0, (long) (byte) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, (long) (byte) -1, (long) (byte) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        java.lang.String str27 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        long long33 = strTimedAction32.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction32.getaction();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        rx.concurrency.TestScheduler testScheduler36 = strTimedAction32.scheduler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = strTimedAction32.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(testScheduler36);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) (short) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, 1L, 10L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        long long6 = strTimedAction4.gettime();
        long long7 = strTimedAction4.time;
        long long8 = strTimedAction4.gettime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = 100L;
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler testScheduler9 = new rx.concurrency.TestScheduler();
        long long10 = testScheduler9.time;
        long long11 = testScheduler9.gettime();
        testScheduler9.triggerActions();
        testScheduler9.settime(100L);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler9.schedule(action0_15);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler9, (long) (byte) 0, schedulerFunc2_18, "hi!");
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler> testSchedulerTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler>(testScheduler0, 0L, schedulerFunc2_8, testScheduler9);
        long long22 = testScheduler9.now();
        long long23 = testScheduler9.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler9.schedulePeriodically(subscriptionFunc0_24, (long) '#', (long) 1, timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler13.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 100L, schedulerFunc2_14, "");
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(32L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 'a');
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) (short) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(schedulerFunc2_6);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, (long) (-1), schedulerFunc2_4, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceTimedAction6.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (byte) 10;
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(action0_3, (long) (short) -1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime7);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator11.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.reversed();
        rx.concurrency.TestScheduler testScheduler15 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler15, (long) (byte) -1, schedulerFunc2_17, "");
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction19.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_21 = strTimedAction19.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = strTimedAction19.getaction();
        java.lang.String str23 = strTimedAction19.state;
        java.lang.String str24 = strTimedAction19.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean25 = strTimedAction19.isCancelled;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime26 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler27 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction31 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler27, (long) (byte) -1, schedulerFunc2_29, "");
        rx.concurrency.TestScheduler testScheduler32 = strTimedAction31.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_33 = strTimedAction31.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction31.getaction();
        java.lang.String str35 = strTimedAction31.state;
        java.lang.String str36 = strTimedAction31.getstate();
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        java.lang.String str42 = strTimedAction41.state;
        rx.concurrency.TestScheduler testScheduler43 = strTimedAction41.getscheduler();
        java.lang.String str44 = strTimedAction41.getstate();
        long long45 = strTimedAction41.time;
        int int46 = compareActionsByTime26.compare(strTimedAction31, strTimedAction41);
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        java.lang.String str52 = strTimedAction51.state;
        java.lang.String str53 = strTimedAction51.state;
        rx.concurrency.TestScheduler testScheduler54 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_56 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction58 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler54, (long) (byte) -1, schedulerFunc2_56, "");
        long long59 = strTimedAction58.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_60 = strTimedAction58.getaction();
        int int61 = compareActionsByTime26.compare(strTimedAction51, strTimedAction58);
        strTimedAction51.cancel();
        int int63 = compareActionsByTime12.compare(strTimedAction19, strTimedAction51);
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction64 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int65 = compareActionsByTime7.compare(strTimedAction51, strTimedAction64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNull(testScheduler20);
        org.junit.Assert.assertNull(schedulerFunc2_21);
        org.junit.Assert.assertNull(schedulerFunc2_22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(atomicBoolean25);
        org.junit.Assert.assertNull(testScheduler32);
        org.junit.Assert.assertNull(schedulerFunc2_33);
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(testScheduler43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.getisCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNotNull(atomicBoolean7);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) 10, (long) (byte) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.gettime();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, (long) (-1), schedulerFunc2_4, (java.lang.CharSequence) "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, (-1L), 32L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(schedulerFunc1_8, (long) (byte) -1, 35L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, 100L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = 100L;
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler testScheduler9 = new rx.concurrency.TestScheduler();
        long long10 = testScheduler9.time;
        long long11 = testScheduler9.gettime();
        testScheduler9.triggerActions();
        testScheduler9.settime(100L);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler9.schedule(action0_15);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler9, (long) (byte) 0, schedulerFunc2_18, "hi!");
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler> testSchedulerTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler>(testScheduler0, 0L, schedulerFunc2_8, testScheduler9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler9.schedulePeriodically(schedulerFunc1_22, (long) (byte) 0, (long) (short) 0, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_10 = null;
        rx.concurrency.TestScheduler testScheduler11 = new rx.concurrency.TestScheduler();
        testScheduler11.triggerActions((long) 'a');
        testScheduler11.triggerActions();
        testScheduler11.settime((long) '#');
        testScheduler11.triggerActions(100L);
        long long19 = testScheduler11.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler11.schedule(subscriptionFunc0_20);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction22 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) '#', schedulerFunc2_10, subscription21);
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(action0_23, (long) 100, 10L, timeUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
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
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.now();
        testScheduler0.triggerActions(35L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) (byte) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) '#', (long) ' ', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) ' ', (long) (byte) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(subscriptionFunc0_4, (long) '#', (long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) 100, (long) (short) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(action0_4, (long) 100, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler5, (-1L), schedulerFunc2_13, "hi!");
        rx.concurrency.TestScheduler testScheduler16 = new rx.concurrency.TestScheduler();
        testScheduler16.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler16.schedule(schedulerFunc1_18);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue20 = testScheduler16.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler16.schedule(schedulerFunc1_21);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction26 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (-1L), schedulerFunc2_24, "hi!");
        long long27 = strTimedAction26.gettime();
        strTimedAction26.cancel();
        rx.concurrency.TestScheduler testScheduler29 = strTimedAction26.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = strTimedAction26.getaction();
        rx.concurrency.TestScheduler testScheduler31 = strTimedAction26.scheduler;
        int int32 = compareActionsByTime2.compare(strTimedAction15, strTimedAction26);
        long long33 = strTimedAction15.time;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = strTimedAction15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler29);
        org.junit.Assert.assertNull(schedulerFunc2_30);
        org.junit.Assert.assertNotNull(testScheduler31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, 32L, (long) 1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = 100L;
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler testScheduler9 = new rx.concurrency.TestScheduler();
        long long10 = testScheduler9.time;
        long long11 = testScheduler9.gettime();
        testScheduler9.triggerActions();
        testScheduler9.settime(100L);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler9.schedule(action0_15);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler9, (long) (byte) 0, schedulerFunc2_18, "hi!");
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler> testSchedulerTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler>(testScheduler0, 0L, schedulerFunc2_8, testScheduler9);
        long long22 = testScheduler9.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler9.schedule(schedulerFunc1_23, (long) 1, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        long long8 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(35L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        long long16 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.time;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, (long) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_10 = null;
        rx.concurrency.TestScheduler testScheduler11 = new rx.concurrency.TestScheduler();
        testScheduler11.triggerActions((long) 'a');
        testScheduler11.triggerActions();
        testScheduler11.settime((long) '#');
        testScheduler11.triggerActions(100L);
        long long19 = testScheduler11.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler11.schedule(subscriptionFunc0_20);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction22 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) '#', schedulerFunc2_10, subscription21);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_23, (long) '#', timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.settime((long) (short) 100);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, 100L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) 100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(schedulerFunc1_10, (long) (short) 0, (long) (-1), timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((-1L), timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        long long5 = strTimedAction4.time;
        java.lang.String str6 = strTimedAction4.state;
        java.lang.Class<?> wildcardClass7 = strTimedAction4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 100L, schedulerFunc2_14, "");
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(action0_19, (long) 10, 0L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, 1L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, 1L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(action0_3, (long) (short) 10, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler6 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler6, (long) (byte) -1, schedulerFunc2_8, "");
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction10.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction10.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction10.getaction();
        java.lang.String str14 = strTimedAction10.state;
        java.lang.String str15 = strTimedAction10.getstate();
        rx.concurrency.TestScheduler testScheduler16 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (long) (byte) -1, schedulerFunc2_18, "");
        java.lang.String str21 = strTimedAction20.state;
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction20.getscheduler();
        java.lang.String str23 = strTimedAction20.getstate();
        long long24 = strTimedAction20.time;
        int int25 = compareActionsByTime5.compare(strTimedAction10, strTimedAction20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        rx.concurrency.TestScheduler testScheduler27 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction31 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler27, (long) (byte) -1, schedulerFunc2_29, "");
        rx.concurrency.TestScheduler testScheduler32 = strTimedAction31.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_33 = strTimedAction31.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction31.getaction();
        rx.concurrency.TestScheduler testScheduler35 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction39 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler35, (long) (byte) -1, schedulerFunc2_37, "");
        java.lang.String str40 = strTimedAction39.getstate();
        java.lang.String str41 = strTimedAction39.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean42 = strTimedAction39.isCancelled;
        int int43 = compareActionsByTime5.compare(strTimedAction31, strTimedAction39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = strTimedAction39.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNull(testScheduler11);
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(testScheduler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNull(testScheduler32);
        org.junit.Assert.assertNull(schedulerFunc2_33);
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(atomicBoolean42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        long long16 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.queue;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(subscriptionFunc0_3, 0L, (long) (short) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) (byte) 0, (long) (short) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) (short) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, 10L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, (long) 1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, (long) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (byte) 10;
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, (long) (short) 10, (long) '4', timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler8.getqueue();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler8.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, (long) (byte) -1, (long) (byte) 1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) '4', schedulerFunc2_13, "hi!");
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, 32L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.time = (short) -1;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        long long6 = strTimedAction4.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.getisCancelled();
        long long8 = strTimedAction4.gettime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler13.schedule(subscriptionFunc0_14, 100L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, 32L, (long) (byte) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        java.lang.String str27 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        long long33 = strTimedAction32.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction32.getaction();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        long long36 = strTimedAction32.gettime();
        java.lang.String str37 = strTimedAction32.getstate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = strTimedAction32.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_17, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_21 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction23 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) ' ', schedulerFunc2_21, "hi!");
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedulePeriodically(action0_24, (long) 'a', 10L, timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        testScheduler0.settime(100L);
        long long11 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 'a', schedulerFunc2_13, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strTimedAction15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, (long) (-1), timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        testScheduler0.time = (byte) 10;
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
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_10, "");
        testScheduler0.time = (-1L);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, 35L, (long) (short) 100, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_6, (long) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, (-1L), (long) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(schedulerFunc1_4, 10L, (long) ' ', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 100L, schedulerFunc2_14, "");
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, (long) (short) 0, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, 32L, (long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_4, (long) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(schedulerFunc1_12, (-1L), (long) (short) 10, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_4, (long) (short) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_17, "hi!");
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_22, (-1L), timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, 10L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler6 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler6, (long) (byte) -1, schedulerFunc2_8, "");
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction10.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction10.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction10.getaction();
        java.lang.String str14 = strTimedAction10.state;
        java.lang.String str15 = strTimedAction10.getstate();
        rx.concurrency.TestScheduler testScheduler16 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (long) (byte) -1, schedulerFunc2_18, "");
        java.lang.String str21 = strTimedAction20.state;
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction20.getscheduler();
        java.lang.String str23 = strTimedAction20.getstate();
        long long24 = strTimedAction20.time;
        int int25 = compareActionsByTime5.compare(strTimedAction10, strTimedAction20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime27.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator28.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime5.thenComparing(wildcardTimedActionComparator30);
        rx.concurrency.TestScheduler testScheduler33 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_35 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction37 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler33, (long) (byte) -1, schedulerFunc2_35, "");
        rx.concurrency.TestScheduler testScheduler38 = strTimedAction37.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction37.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_40 = strTimedAction37.getaction();
        java.lang.String str41 = strTimedAction37.getstate();
        long long42 = strTimedAction37.time;
        rx.concurrency.TestScheduler testScheduler43 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_45 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction47 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler43, (long) (byte) -1, schedulerFunc2_45, "");
        java.lang.String str48 = strTimedAction47.getstate();
        long long49 = strTimedAction47.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean50 = strTimedAction47.isCancelled;
        java.lang.String str51 = strTimedAction47.getstate();
        int int52 = compareActionsByTime5.compare(strTimedAction37, strTimedAction47);
        rx.concurrency.TestScheduler testScheduler53 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_55 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction57 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler53, (long) (byte) -1, schedulerFunc2_55, "");
        java.lang.String str58 = strTimedAction57.state;
        java.lang.String str59 = strTimedAction57.getstate();
        rx.concurrency.TestScheduler testScheduler60 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_62 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction64 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler60, (long) (byte) -1, schedulerFunc2_62, "");
        rx.concurrency.TestScheduler testScheduler65 = strTimedAction64.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_66 = strTimedAction64.action;
        long long67 = strTimedAction64.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_68 = strTimedAction64.action;
        int int69 = compareActionsByTime5.compare(strTimedAction57, strTimedAction64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = strTimedAction64.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNull(testScheduler11);
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(testScheduler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNull(testScheduler38);
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertNull(schedulerFunc2_40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(testScheduler65);
        org.junit.Assert.assertNull(schedulerFunc2_66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, (long) (byte) 100, (long) (short) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, (long) (short) 0, (-1L), timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(35L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (short) 10, (long) (short) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.lang.String str7 = strTimedAction4.getstate();
        strTimedAction4.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = strTimedAction4.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.isCancelled;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(schedulerFunc2_9);
        org.junit.Assert.assertNotNull(atomicBoolean10);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 'a');
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) (byte) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, (long) (byte) -1, 0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) 'a', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler testScheduler5 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler5, (long) (byte) -1, schedulerFunc2_7, "");
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean15 = strTimedAction14.isCancelled;
        rx.concurrency.TestScheduler testScheduler16 = strTimedAction14.getscheduler();
        int int17 = compareActionsByTime2.compare(strTimedAction9, strTimedAction14);
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction14.scheduler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = testScheduler18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(testScheduler18);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) 1, 0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, 0L, (long) (short) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (long) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        long long16 = testScheduler0.now();
        java.lang.Class<?> wildcardClass17 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(schedulerFunc1_15, (long) (short) 10, (long) 10, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler testScheduler5 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler5, (long) (byte) -1, schedulerFunc2_7, "");
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean15 = strTimedAction14.isCancelled;
        rx.concurrency.TestScheduler testScheduler16 = strTimedAction14.getscheduler();
        int int17 = compareActionsByTime2.compare(strTimedAction9, strTimedAction14);
        java.lang.String str18 = strTimedAction9.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = strTimedAction9.getaction();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(schedulerFunc2_19);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long4 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(action0_5, (-1L), timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.getisCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNotNull(atomicBoolean7);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        long long4 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 1);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, 0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) 'a', (long) (-1), timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 'a');
        long long4 = testScheduler0.now();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) '4', (long) '4', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        testScheduler0.settime((long) 0);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler testScheduler5 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler5, (long) (byte) -1, schedulerFunc2_7, "");
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean15 = strTimedAction14.isCancelled;
        rx.concurrency.TestScheduler testScheduler16 = strTimedAction14.getscheduler();
        int int17 = compareActionsByTime2.compare(strTimedAction9, strTimedAction14);
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction14.getscheduler();
        long long19 = strTimedAction14.time;
        long long20 = strTimedAction14.time;
        long long21 = strTimedAction14.time;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = strTimedAction14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(testScheduler18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.time = (short) 10;
        long long5 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, 32L, (long) 'a', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(action0_17, 1L, (long) (short) 100, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_17, (long) ' ', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        testScheduler0.settime((long) '4');
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, 100L, (long) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions((-1L));
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) (short) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription5 = testScheduler0.schedulePeriodically(schedulerFunc1_1, (-1L), 0L, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(schedulerFunc1_6, (long) (byte) 10, (long) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler6 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler6, (long) (byte) -1, schedulerFunc2_8, "");
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction10.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction10.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction10.getaction();
        java.lang.String str14 = strTimedAction10.state;
        java.lang.String str15 = strTimedAction10.getstate();
        rx.concurrency.TestScheduler testScheduler16 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (long) (byte) -1, schedulerFunc2_18, "");
        java.lang.String str21 = strTimedAction20.state;
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction20.getscheduler();
        java.lang.String str23 = strTimedAction20.getstate();
        long long24 = strTimedAction20.time;
        int int25 = compareActionsByTime5.compare(strTimedAction10, strTimedAction20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        rx.concurrency.TestScheduler testScheduler27 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction31 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler27, (long) (byte) -1, schedulerFunc2_29, "");
        rx.concurrency.TestScheduler testScheduler32 = strTimedAction31.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_33 = strTimedAction31.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction31.getaction();
        rx.concurrency.TestScheduler testScheduler35 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction39 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler35, (long) (byte) -1, schedulerFunc2_37, "");
        java.lang.String str40 = strTimedAction39.getstate();
        java.lang.String str41 = strTimedAction39.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean42 = strTimedAction39.isCancelled;
        int int43 = compareActionsByTime5.compare(strTimedAction31, strTimedAction39);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler45 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_47 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction49 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler45, (long) (byte) -1, schedulerFunc2_47, "");
        rx.concurrency.TestScheduler testScheduler50 = strTimedAction49.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_51 = strTimedAction49.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_52 = strTimedAction49.getaction();
        java.lang.String str53 = strTimedAction49.state;
        java.lang.String str54 = strTimedAction49.getstate();
        rx.concurrency.TestScheduler testScheduler55 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_57 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction59 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler55, (long) (byte) -1, schedulerFunc2_57, "");
        java.lang.String str60 = strTimedAction59.state;
        rx.concurrency.TestScheduler testScheduler61 = strTimedAction59.getscheduler();
        java.lang.String str62 = strTimedAction59.getstate();
        long long63 = strTimedAction59.time;
        int int64 = compareActionsByTime44.compare(strTimedAction49, strTimedAction59);
        rx.concurrency.TestScheduler testScheduler65 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_67 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction69 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler65, (long) (byte) -1, schedulerFunc2_67, "");
        java.lang.String str70 = strTimedAction69.state;
        java.lang.String str71 = strTimedAction69.state;
        rx.concurrency.TestScheduler testScheduler72 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_74 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction76 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler72, (long) (byte) -1, schedulerFunc2_74, "");
        long long77 = strTimedAction76.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_78 = strTimedAction76.getaction();
        int int79 = compareActionsByTime44.compare(strTimedAction69, strTimedAction76);
        rx.concurrency.TestScheduler testScheduler80 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_82 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction84 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler80, (long) (byte) -1, schedulerFunc2_82, "");
        rx.concurrency.TestScheduler testScheduler85 = strTimedAction84.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_86 = strTimedAction84.action;
        long long87 = strTimedAction84.gettime();
        int int88 = compareActionsByTime5.compare(strTimedAction76, strTimedAction84);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = strTimedAction76.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNull(testScheduler11);
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(testScheduler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNull(testScheduler32);
        org.junit.Assert.assertNull(schedulerFunc2_33);
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(atomicBoolean42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(testScheduler50);
        org.junit.Assert.assertNull(schedulerFunc2_51);
        org.junit.Assert.assertNull(schedulerFunc2_52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(testScheduler61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNull(testScheduler85);
        org.junit.Assert.assertNull(schedulerFunc2_86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        long long5 = strTimedAction4.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean6 = strTimedAction4.getisCancelled();
        java.lang.String str7 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.action;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(schedulerFunc2_8);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.time = (short) -1;
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(100L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime(35L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_4, 0L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.gettime();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) '4', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_16, 35L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler8.schedule(subscriptionFunc0_16, (long) '#', timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
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
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, 10L, (long) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(schedulerFunc1_5, (long) (byte) 100, (long) (byte) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_6, (long) (-1), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (long) (byte) -1, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, (long) (short) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction11.getscheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler12.queue;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler12.advanceTimeTo((long) (short) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(testScheduler12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) (-1), (long) (short) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 0, schedulerFunc2_12, "");
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, 35L, (long) (short) 0, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) '4', schedulerFunc2_13, "hi!");
        testScheduler0.triggerActions((long) '#');
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, 0L, (long) '#', timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime7);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator8.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        rx.concurrency.TestScheduler testScheduler16 = strTimedAction15.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction15.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = strTimedAction15.getaction();
        java.lang.String str19 = strTimedAction15.state;
        java.lang.String str20 = strTimedAction15.getstate();
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler27 = strTimedAction25.getscheduler();
        java.lang.String str28 = strTimedAction25.getstate();
        long long29 = strTimedAction25.time;
        int int30 = compareActionsByTime10.compare(strTimedAction15, strTimedAction25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator8.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator4.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertNull(schedulerFunc2_18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(testScheduler27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.time;
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription6 = testScheduler0.schedule(action0_3, (long) (byte) -1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler testScheduler7 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler7, (long) (byte) -1, schedulerFunc2_9, "");
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction11.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction11.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = strTimedAction11.getaction();
        java.lang.String str15 = strTimedAction11.state;
        java.lang.String str16 = strTimedAction11.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean17 = strTimedAction11.isCancelled;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler19 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_21 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction23 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler19, (long) (byte) -1, schedulerFunc2_21, "");
        rx.concurrency.TestScheduler testScheduler24 = strTimedAction23.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_25 = strTimedAction23.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_26 = strTimedAction23.getaction();
        java.lang.String str27 = strTimedAction23.state;
        java.lang.String str28 = strTimedAction23.getstate();
        rx.concurrency.TestScheduler testScheduler29 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_31 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction33 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler29, (long) (byte) -1, schedulerFunc2_31, "");
        java.lang.String str34 = strTimedAction33.state;
        rx.concurrency.TestScheduler testScheduler35 = strTimedAction33.getscheduler();
        java.lang.String str36 = strTimedAction33.getstate();
        long long37 = strTimedAction33.time;
        int int38 = compareActionsByTime18.compare(strTimedAction23, strTimedAction33);
        rx.concurrency.TestScheduler testScheduler39 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_41 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction43 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler39, (long) (byte) -1, schedulerFunc2_41, "");
        java.lang.String str44 = strTimedAction43.state;
        java.lang.String str45 = strTimedAction43.state;
        rx.concurrency.TestScheduler testScheduler46 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_48 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction50 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler46, (long) (byte) -1, schedulerFunc2_48, "");
        long long51 = strTimedAction50.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_52 = strTimedAction50.getaction();
        int int53 = compareActionsByTime18.compare(strTimedAction43, strTimedAction50);
        strTimedAction43.cancel();
        int int55 = compareActionsByTime4.compare(strTimedAction11, strTimedAction43);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean56 = strTimedAction11.isCancelled;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_57 = strTimedAction11.action;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler59 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_61 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction63 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler59, (long) (byte) -1, schedulerFunc2_61, "");
        rx.concurrency.TestScheduler testScheduler64 = strTimedAction63.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_65 = strTimedAction63.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_66 = strTimedAction63.getaction();
        java.lang.String str67 = strTimedAction63.state;
        java.lang.String str68 = strTimedAction63.getstate();
        rx.concurrency.TestScheduler testScheduler69 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_71 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction73 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler69, (long) (byte) -1, schedulerFunc2_71, "");
        java.lang.String str74 = strTimedAction73.state;
        rx.concurrency.TestScheduler testScheduler75 = strTimedAction73.getscheduler();
        java.lang.String str76 = strTimedAction73.getstate();
        long long77 = strTimedAction73.time;
        int int78 = compareActionsByTime58.compare(strTimedAction63, strTimedAction73);
        rx.concurrency.TestScheduler testScheduler79 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_81 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction83 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler79, (long) (byte) -1, schedulerFunc2_81, "");
        java.lang.String str84 = strTimedAction83.state;
        java.lang.String str85 = strTimedAction83.state;
        rx.concurrency.TestScheduler testScheduler86 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_88 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction90 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler86, (long) (byte) -1, schedulerFunc2_88, "");
        long long91 = strTimedAction90.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_92 = strTimedAction90.getaction();
        int int93 = compareActionsByTime58.compare(strTimedAction83, strTimedAction90);
        rx.concurrency.TestScheduler testScheduler94 = strTimedAction90.scheduler;
        java.lang.String str95 = strTimedAction90.getstate();
        java.lang.String str96 = strTimedAction90.state;
        long long97 = strTimedAction90.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_98 = strTimedAction90.action;
        int int99 = compareActionsByTime0.compare(strTimedAction11, strTimedAction90);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNull(testScheduler12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertNull(schedulerFunc2_14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(atomicBoolean17);
        org.junit.Assert.assertNull(testScheduler24);
        org.junit.Assert.assertNull(schedulerFunc2_25);
        org.junit.Assert.assertNull(schedulerFunc2_26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(testScheduler35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean56);
        org.junit.Assert.assertNull(schedulerFunc2_57);
        org.junit.Assert.assertNull(testScheduler64);
        org.junit.Assert.assertNull(schedulerFunc2_65);
        org.junit.Assert.assertNull(schedulerFunc2_66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNull(testScheduler75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-1L) + "'", long91 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNull(testScheduler94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + (-1L) + "'", long97 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, 100L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, (long) (short) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (byte) 10;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.lang.Class<?> wildcardClass7 = wildcardTimedActionQueue6.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) -1, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(35L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (-1L), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(schedulerFunc1_9, 1L, (long) (byte) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.lang.Class<?> wildcardClass5 = subscription4.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler testScheduler4 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction8 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler4, (long) (byte) -1, schedulerFunc2_6, "");
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction8.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction8.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = strTimedAction8.getaction();
        java.lang.String str12 = strTimedAction8.getstate();
        rx.concurrency.TestScheduler testScheduler13 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_15 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction17 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler13, (long) (byte) -1, schedulerFunc2_15, "");
        long long18 = strTimedAction17.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = strTimedAction17.getaction();
        int int20 = compareActionsByTime2.compare(strTimedAction8, strTimedAction17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime2.thenComparing(wildcardTimedActionComparator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertNull(schedulerFunc2_11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 100L, schedulerFunc2_14, "");
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(action0_19, (long) (byte) -1, (long) '#', timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(schedulerFunc1_16, 100L, (long) 10, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.time = 100L;
        testScheduler0.time = 0L;
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, 35L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = 100L;
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler testScheduler9 = new rx.concurrency.TestScheduler();
        long long10 = testScheduler9.time;
        long long11 = testScheduler9.gettime();
        testScheduler9.triggerActions();
        testScheduler9.settime(100L);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler9.schedule(action0_15);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler9, (long) (byte) 0, schedulerFunc2_18, "hi!");
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler> testSchedulerTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler>(testScheduler0, 0L, schedulerFunc2_8, testScheduler9);
        long long22 = testScheduler9.now();
        long long23 = testScheduler9.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler9.schedule(schedulerFunc1_24);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler9.schedule(schedulerFunc1_26, (long) '#', timeUnit28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        java.lang.String str27 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        long long33 = strTimedAction32.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction32.getaction();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        rx.concurrency.TestScheduler testScheduler42 = strTimedAction41.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_43 = strTimedAction41.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = strTimedAction41.getaction();
        java.lang.String str45 = strTimedAction41.state;
        java.lang.String str46 = strTimedAction41.getstate();
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        java.lang.String str52 = strTimedAction51.state;
        rx.concurrency.TestScheduler testScheduler53 = strTimedAction51.getscheduler();
        java.lang.String str54 = strTimedAction51.getstate();
        long long55 = strTimedAction51.time;
        int int56 = compareActionsByTime36.compare(strTimedAction41, strTimedAction51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime58.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        rx.concurrency.TestScheduler testScheduler63 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_65 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction67 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler63, (long) (byte) -1, schedulerFunc2_65, "");
        rx.concurrency.TestScheduler testScheduler68 = strTimedAction67.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_69 = strTimedAction67.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_70 = strTimedAction67.action;
        rx.concurrency.TestScheduler testScheduler71 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_73 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction75 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler71, (long) (byte) -1, schedulerFunc2_73, "");
        rx.concurrency.TestScheduler testScheduler76 = strTimedAction75.getscheduler();
        long long77 = strTimedAction75.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean78 = strTimedAction75.getisCancelled();
        long long79 = strTimedAction75.gettime();
        int int80 = compareActionsByTime0.compare(strTimedAction67, strTimedAction75);
        java.lang.String str81 = strTimedAction67.getstate();
        rx.concurrency.TestScheduler testScheduler82 = strTimedAction67.scheduler;
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(testScheduler42);
        org.junit.Assert.assertNull(schedulerFunc2_43);
        org.junit.Assert.assertNull(schedulerFunc2_44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(testScheduler53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNull(testScheduler68);
        org.junit.Assert.assertNull(schedulerFunc2_69);
        org.junit.Assert.assertNull(schedulerFunc2_70);
        org.junit.Assert.assertNull(testScheduler76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNull(testScheduler82);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        long long16 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.queue;
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) (short) 100, (long) (byte) -1, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(schedulerFunc1_3, 1L, (long) (byte) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        java.lang.Class<?> wildcardClass17 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, 1L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) 0);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (-1), timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, (long) (short) 1, 35L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription3);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (-1L), timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, 100L, (long) '4', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) 1, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        testScheduler0.settime(100L);
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, 32L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        java.lang.String str21 = strTimedAction15.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = strTimedAction15.action;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strTimedAction15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(schedulerFunc2_22);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_1, (long) (short) 0, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        long long8 = strTimedAction4.gettime();
        strTimedAction4.cancel();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.getisCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean10);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        testScheduler0.settime(100L);
        testScheduler0.settime((long) 0);
        testScheduler0.settime(0L);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) (short) 1, (long) ' ', timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = (short) 0;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_7, 1L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(action0_4, (long) (byte) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.getisCancelled();
        java.lang.String str8 = strTimedAction4.state;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNotNull(atomicBoolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_4, (long) (short) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (byte) 10;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedulePeriodically(action0_4, 0L, (long) '#', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, 0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = 100L;
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler testScheduler9 = new rx.concurrency.TestScheduler();
        long long10 = testScheduler9.time;
        long long11 = testScheduler9.gettime();
        testScheduler9.triggerActions();
        testScheduler9.settime(100L);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler9.schedule(action0_15);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler9, (long) (byte) 0, schedulerFunc2_18, "hi!");
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler> testSchedulerTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler>(testScheduler0, 0L, schedulerFunc2_8, testScheduler9);
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler9.schedulePeriodically(action0_22, (long) (short) 1, (long) (byte) 10, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler testScheduler5 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler5, (long) (byte) -1, schedulerFunc2_7, "");
        rx.concurrency.TestScheduler testScheduler10 = strTimedAction9.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = strTimedAction9.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction9.getaction();
        java.lang.String str13 = strTimedAction9.state;
        java.lang.String str14 = strTimedAction9.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean15 = strTimedAction9.isCancelled;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler17 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler17, (long) (byte) -1, schedulerFunc2_19, "");
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction21.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = strTimedAction21.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = strTimedAction21.getaction();
        java.lang.String str25 = strTimedAction21.state;
        java.lang.String str26 = strTimedAction21.getstate();
        rx.concurrency.TestScheduler testScheduler27 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction31 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler27, (long) (byte) -1, schedulerFunc2_29, "");
        java.lang.String str32 = strTimedAction31.state;
        rx.concurrency.TestScheduler testScheduler33 = strTimedAction31.getscheduler();
        java.lang.String str34 = strTimedAction31.getstate();
        long long35 = strTimedAction31.time;
        int int36 = compareActionsByTime16.compare(strTimedAction21, strTimedAction31);
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        java.lang.String str42 = strTimedAction41.state;
        java.lang.String str43 = strTimedAction41.state;
        rx.concurrency.TestScheduler testScheduler44 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_46 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction48 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler44, (long) (byte) -1, schedulerFunc2_46, "");
        long long49 = strTimedAction48.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = strTimedAction48.getaction();
        int int51 = compareActionsByTime16.compare(strTimedAction41, strTimedAction48);
        strTimedAction41.cancel();
        int int53 = compareActionsByTime2.compare(strTimedAction9, strTimedAction41);
        long long54 = strTimedAction9.time;
        long long55 = strTimedAction9.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean56 = strTimedAction9.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean57 = strTimedAction9.getisCancelled();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNull(testScheduler10);
        org.junit.Assert.assertNull(schedulerFunc2_11);
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler22);
        org.junit.Assert.assertNull(schedulerFunc2_23);
        org.junit.Assert.assertNull(schedulerFunc2_24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(testScheduler33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean56);
        org.junit.Assert.assertNotNull(atomicBoolean57);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, (long) 1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = (short) 0;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (-1), 35L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) ' ', schedulerFunc2_4, "");
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction6.getscheduler();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler7.advanceTimeBy(0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(testScheduler7);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler testScheduler5 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler5, (long) (byte) -1, schedulerFunc2_7, "");
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean15 = strTimedAction14.isCancelled;
        rx.concurrency.TestScheduler testScheduler16 = strTimedAction14.getscheduler();
        int int17 = compareActionsByTime2.compare(strTimedAction9, strTimedAction14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strTimedAction9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, 35L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, 1L, (long) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.time = (short) -1;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_12, (long) '4', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.time;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
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
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.time = 100L;
        testScheduler0.time = 0L;
        long long9 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) 'a', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.time = 100L;
        testScheduler0.time = 0L;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.triggerActions((long) (-1));
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.gettime();
        java.lang.Class<?> wildcardClass11 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        testScheduler0.time = '#';
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler testScheduler5 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler5, (long) (byte) -1, schedulerFunc2_7, "");
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean15 = strTimedAction14.isCancelled;
        rx.concurrency.TestScheduler testScheduler16 = strTimedAction14.getscheduler();
        int int17 = compareActionsByTime2.compare(strTimedAction9, strTimedAction14);
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction14.getscheduler();
        long long19 = strTimedAction14.time;
        long long20 = strTimedAction14.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean21 = strTimedAction14.isCancelled;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = strTimedAction14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(testScheduler18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean21);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(action0_17, (long) (short) 0, (long) ' ', timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (byte) 10;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime7);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator8.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        rx.concurrency.TestScheduler testScheduler16 = strTimedAction15.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction15.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = strTimedAction15.getaction();
        java.lang.String str19 = strTimedAction15.state;
        java.lang.String str20 = strTimedAction15.getstate();
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler27 = strTimedAction25.getscheduler();
        java.lang.String str28 = strTimedAction25.getstate();
        long long29 = strTimedAction25.time;
        int int30 = compareActionsByTime10.compare(strTimedAction15, strTimedAction25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator8.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        rx.concurrency.TestScheduler testScheduler32 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction36 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler32, (long) (byte) -1, schedulerFunc2_34, "");
        rx.concurrency.TestScheduler testScheduler37 = strTimedAction36.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction36.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction36.getaction();
        rx.concurrency.TestScheduler testScheduler40 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_42 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction44 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler40, (long) (byte) -1, schedulerFunc2_42, "");
        java.lang.String str45 = strTimedAction44.getstate();
        java.lang.String str46 = strTimedAction44.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean47 = strTimedAction44.isCancelled;
        int int48 = compareActionsByTime10.compare(strTimedAction36, strTimedAction44);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        rx.concurrency.TestScheduler testScheduler50 = new rx.concurrency.TestScheduler();
        long long51 = testScheduler50.time;
        long long52 = testScheduler50.gettime();
        testScheduler50.triggerActions();
        testScheduler50.settime(100L);
        rx.util.functions.Action0 action0_56 = null;
        rx.Subscription subscription57 = testScheduler50.schedule(action0_56);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_59 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction61 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler50, (long) (byte) 0, schedulerFunc2_59, "hi!");
        rx.concurrency.TestScheduler testScheduler62 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_64 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction66 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler62, (long) (byte) -1, schedulerFunc2_64, "");
        long long67 = strTimedAction66.time;
        int int68 = compareActionsByTime10.compare(strTimedAction61, strTimedAction66);
        rx.concurrency.TestScheduler testScheduler69 = strTimedAction61.scheduler;
        rx.util.functions.Action0 action0_70 = null;
        java.util.concurrent.TimeUnit timeUnit73 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription74 = testScheduler69.schedulePeriodically(action0_70, (-1L), (long) (byte) -1, timeUnit73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertNull(schedulerFunc2_18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(testScheduler27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNull(testScheduler37);
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(atomicBoolean47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(subscription57);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(testScheduler69);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        long long4 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) ' ', 0L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, (long) (short) -1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) 100, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, (long) (byte) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_10, "");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        long long14 = testScheduler0.gettime();
        java.lang.Class<?> wildcardClass15 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        testScheduler0.time = 1L;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) (short) 0, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler6 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler6, (long) (byte) -1, schedulerFunc2_8, "");
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction10.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction10.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction10.getaction();
        java.lang.String str14 = strTimedAction10.state;
        java.lang.String str15 = strTimedAction10.getstate();
        rx.concurrency.TestScheduler testScheduler16 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (long) (byte) -1, schedulerFunc2_18, "");
        java.lang.String str21 = strTimedAction20.state;
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction20.getscheduler();
        java.lang.String str23 = strTimedAction20.getstate();
        long long24 = strTimedAction20.time;
        int int25 = compareActionsByTime5.compare(strTimedAction10, strTimedAction20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        rx.concurrency.TestScheduler testScheduler27 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction31 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler27, (long) (byte) -1, schedulerFunc2_29, "");
        rx.concurrency.TestScheduler testScheduler32 = strTimedAction31.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_33 = strTimedAction31.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction31.getaction();
        rx.concurrency.TestScheduler testScheduler35 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction39 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler35, (long) (byte) -1, schedulerFunc2_37, "");
        java.lang.String str40 = strTimedAction39.getstate();
        java.lang.String str41 = strTimedAction39.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean42 = strTimedAction39.isCancelled;
        int int43 = compareActionsByTime5.compare(strTimedAction31, strTimedAction39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = strTimedAction31.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNull(testScheduler11);
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(testScheduler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNull(testScheduler32);
        org.junit.Assert.assertNull(schedulerFunc2_33);
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(atomicBoolean42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = strTimedAction10.getaction();
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction10.scheduler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strTimedAction10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
        org.junit.Assert.assertNull(schedulerFunc2_14);
        org.junit.Assert.assertNotNull(testScheduler15);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, (long) (-1), timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler13.advanceTimeTo(1L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction25.getscheduler();
        strTimedAction25.cancel();
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean33 = strTimedAction32.isCancelled;
        rx.concurrency.TestScheduler testScheduler34 = strTimedAction32.getscheduler();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        rx.concurrency.TestScheduler testScheduler42 = strTimedAction41.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_43 = strTimedAction41.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = strTimedAction41.getaction();
        java.lang.String str45 = strTimedAction41.state;
        java.lang.String str46 = strTimedAction41.getstate();
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        java.lang.String str52 = strTimedAction51.state;
        rx.concurrency.TestScheduler testScheduler53 = strTimedAction51.getscheduler();
        java.lang.String str54 = strTimedAction51.getstate();
        long long55 = strTimedAction51.time;
        int int56 = compareActionsByTime36.compare(strTimedAction41, strTimedAction51);
        rx.concurrency.TestScheduler testScheduler57 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_59 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction61 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler57, (long) (byte) -1, schedulerFunc2_59, "");
        java.lang.String str62 = strTimedAction61.state;
        java.lang.String str63 = strTimedAction61.state;
        rx.concurrency.TestScheduler testScheduler64 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_66 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction68 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler64, (long) (byte) -1, schedulerFunc2_66, "");
        long long69 = strTimedAction68.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_70 = strTimedAction68.getaction();
        int int71 = compareActionsByTime36.compare(strTimedAction61, strTimedAction68);
        rx.concurrency.TestScheduler testScheduler72 = strTimedAction61.getscheduler();
        long long73 = strTimedAction61.time;
        rx.concurrency.TestScheduler testScheduler74 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_76 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction78 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler74, (long) (byte) -1, schedulerFunc2_76, "");
        java.lang.String str79 = strTimedAction78.state;
        rx.concurrency.TestScheduler testScheduler80 = strTimedAction78.getscheduler();
        java.lang.String str81 = strTimedAction78.getstate();
        strTimedAction78.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_83 = strTimedAction78.getaction();
        int int84 = compareActionsByTime0.compare(strTimedAction61, strTimedAction78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = strTimedAction61.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertNotNull(atomicBoolean33);
        org.junit.Assert.assertNull(testScheduler34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(testScheduler42);
        org.junit.Assert.assertNull(schedulerFunc2_43);
        org.junit.Assert.assertNull(schedulerFunc2_44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(testScheduler53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(testScheduler72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(testScheduler80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNull(schedulerFunc2_83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, (long) (-1), schedulerFunc2_4, (java.lang.CharSequence) "hi!");
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) (byte) 100, (long) (short) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) (short) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        java.lang.String str8 = strTimedAction4.state;
        java.lang.String str9 = strTimedAction4.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.getisCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(atomicBoolean10);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) -1, (long) (byte) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.time = 100L;
        testScheduler0.time = 0L;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, (-1L), timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = 100L;
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler testScheduler9 = new rx.concurrency.TestScheduler();
        long long10 = testScheduler9.time;
        long long11 = testScheduler9.gettime();
        testScheduler9.triggerActions();
        testScheduler9.settime(100L);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler9.schedule(action0_15);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler9, (long) (byte) 0, schedulerFunc2_18, "hi!");
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler> testSchedulerTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler>(testScheduler0, 0L, schedulerFunc2_8, testScheduler9);
        java.lang.Class<?> wildcardClass22 = testSchedulerTimedAction21.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler5, (-1L), schedulerFunc2_13, "hi!");
        rx.concurrency.TestScheduler testScheduler16 = new rx.concurrency.TestScheduler();
        testScheduler16.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler16.schedule(schedulerFunc1_18);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue20 = testScheduler16.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler16.schedule(schedulerFunc1_21);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction26 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (-1L), schedulerFunc2_24, "hi!");
        long long27 = strTimedAction26.gettime();
        strTimedAction26.cancel();
        rx.concurrency.TestScheduler testScheduler29 = strTimedAction26.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = strTimedAction26.getaction();
        rx.concurrency.TestScheduler testScheduler31 = strTimedAction26.scheduler;
        int int32 = compareActionsByTime2.compare(strTimedAction15, strTimedAction26);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime33.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator34.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime35);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator36.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime38 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler39 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_41 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction43 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler39, (long) (byte) -1, schedulerFunc2_41, "");
        rx.concurrency.TestScheduler testScheduler44 = strTimedAction43.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_45 = strTimedAction43.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_46 = strTimedAction43.getaction();
        java.lang.String str47 = strTimedAction43.state;
        java.lang.String str48 = strTimedAction43.getstate();
        rx.concurrency.TestScheduler testScheduler49 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_51 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction53 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler49, (long) (byte) -1, schedulerFunc2_51, "");
        java.lang.String str54 = strTimedAction53.state;
        rx.concurrency.TestScheduler testScheduler55 = strTimedAction53.getscheduler();
        java.lang.String str56 = strTimedAction53.getstate();
        long long57 = strTimedAction53.time;
        int int58 = compareActionsByTime38.compare(strTimedAction43, strTimedAction53);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = wildcardTimedActionComparator36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime38);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = compareActionsByTime60.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime62 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator61.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime62);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator63.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime38.thenComparing(wildcardTimedActionComparator63);
        rx.concurrency.TestScheduler testScheduler66 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_68 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction70 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler66, (long) (byte) -1, schedulerFunc2_68, "");
        rx.concurrency.TestScheduler testScheduler71 = strTimedAction70.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_72 = strTimedAction70.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_73 = strTimedAction70.getaction();
        java.lang.String str74 = strTimedAction70.getstate();
        long long75 = strTimedAction70.time;
        rx.concurrency.TestScheduler testScheduler76 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_78 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction80 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler76, (long) (byte) -1, schedulerFunc2_78, "");
        java.lang.String str81 = strTimedAction80.getstate();
        long long82 = strTimedAction80.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean83 = strTimedAction80.isCancelled;
        java.lang.String str84 = strTimedAction80.getstate();
        int int85 = compareActionsByTime38.compare(strTimedAction70, strTimedAction80);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_86 = strTimedAction70.getaction();
        rx.concurrency.TestScheduler testScheduler87 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_89 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction91 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler87, (long) (byte) -1, schedulerFunc2_89, "");
        java.lang.String str92 = strTimedAction91.state;
        java.lang.String str93 = strTimedAction91.getstate();
        rx.concurrency.TestScheduler testScheduler94 = strTimedAction91.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_95 = strTimedAction91.action;
        strTimedAction91.cancel();
        int int97 = compareActionsByTime2.compare(strTimedAction70, strTimedAction91);
        long long98 = strTimedAction70.time;
        long long99 = strTimedAction70.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler29);
        org.junit.Assert.assertNull(schedulerFunc2_30);
        org.junit.Assert.assertNotNull(testScheduler31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNull(testScheduler44);
        org.junit.Assert.assertNull(schedulerFunc2_45);
        org.junit.Assert.assertNull(schedulerFunc2_46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(testScheduler55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNull(testScheduler71);
        org.junit.Assert.assertNull(schedulerFunc2_72);
        org.junit.Assert.assertNull(schedulerFunc2_73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-1L) + "'", long82 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(schedulerFunc2_86);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNull(testScheduler94);
        org.junit.Assert.assertNull(schedulerFunc2_95);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + (-1L) + "'", long98 == (-1L));
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + (-1L) + "'", long99 == (-1L));
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(schedulerFunc1_7, (long) '#', (long) (short) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        long long6 = strTimedAction4.gettime();
        long long7 = strTimedAction4.time;
        java.lang.String str8 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction4.getscheduler();
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(testScheduler9);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        testScheduler0.time = (short) 0;
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (byte) 1, 100L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (byte) 100, 0L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        testScheduler0.settime((long) ' ');
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) (byte) 10, (long) (short) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) '#', (long) (short) -1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = strTimedAction10.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_15 = strTimedAction10.getaction();
        rx.concurrency.TestScheduler testScheduler16 = strTimedAction10.getscheduler();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler16.schedule(action0_17);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler16.triggerActions(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
        org.junit.Assert.assertNull(schedulerFunc2_14);
        org.junit.Assert.assertNull(schedulerFunc2_15);
        org.junit.Assert.assertNotNull(testScheduler16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.now();
        java.lang.Class<?> wildcardClass6 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        long long5 = strTimedAction4.time;
        long long6 = strTimedAction4.gettime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler22 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction26 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler22, (long) (byte) -1, schedulerFunc2_24, "");
        rx.concurrency.TestScheduler testScheduler27 = strTimedAction26.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_28 = strTimedAction26.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = strTimedAction26.getaction();
        java.lang.String str30 = strTimedAction26.state;
        java.lang.String str31 = strTimedAction26.getstate();
        rx.concurrency.TestScheduler testScheduler32 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction36 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler32, (long) (byte) -1, schedulerFunc2_34, "");
        java.lang.String str37 = strTimedAction36.state;
        rx.concurrency.TestScheduler testScheduler38 = strTimedAction36.getscheduler();
        java.lang.String str39 = strTimedAction36.getstate();
        long long40 = strTimedAction36.time;
        int int41 = compareActionsByTime21.compare(strTimedAction26, strTimedAction36);
        rx.concurrency.TestScheduler testScheduler42 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction46 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (long) (byte) -1, schedulerFunc2_44, "");
        rx.concurrency.TestScheduler testScheduler47 = strTimedAction46.getscheduler();
        strTimedAction46.cancel();
        rx.concurrency.TestScheduler testScheduler49 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_51 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction53 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler49, (long) (byte) -1, schedulerFunc2_51, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean54 = strTimedAction53.isCancelled;
        rx.concurrency.TestScheduler testScheduler55 = strTimedAction53.getscheduler();
        int int56 = compareActionsByTime21.compare(strTimedAction46, strTimedAction53);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean57 = strTimedAction46.getisCancelled();
        rx.concurrency.TestScheduler testScheduler58 = new rx.concurrency.TestScheduler();
        testScheduler58.triggerActions();
        long long60 = testScheduler58.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_62 = null;
        rx.concurrency.TestScheduler testScheduler63 = new rx.concurrency.TestScheduler();
        testScheduler63.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_65 = null;
        rx.Subscription subscription66 = testScheduler63.schedule(schedulerFunc1_65);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue67 = testScheduler63.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_68 = null;
        rx.Subscription subscription69 = testScheduler63.schedule(schedulerFunc1_68);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction70 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler58, (long) (byte) 0, schedulerFunc2_62, subscription69);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue71 = testScheduler58.queue;
        testScheduler58.settime((long) 0);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_75 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction77 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler58, (-1L), schedulerFunc2_75, "hi!");
        int int78 = compareActionsByTime0.compare(strTimedAction46, strTimedAction77);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_79 = strTimedAction77.action;
        rx.concurrency.TestScheduler testScheduler80 = strTimedAction77.scheduler;
        rx.util.functions.Action0 action0_81 = null;
        java.util.concurrent.TimeUnit timeUnit84 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription85 = testScheduler80.schedulePeriodically(action0_81, (long) (byte) 0, (long) (short) 10, timeUnit84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(testScheduler27);
        org.junit.Assert.assertNull(schedulerFunc2_28);
        org.junit.Assert.assertNull(schedulerFunc2_29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(testScheduler38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(testScheduler47);
        org.junit.Assert.assertNotNull(atomicBoolean54);
        org.junit.Assert.assertNull(testScheduler55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(subscription66);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue67);
        org.junit.Assert.assertNotNull(subscription69);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue71);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNull(schedulerFunc2_79);
        org.junit.Assert.assertNotNull(testScheduler80);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, (long) (byte) -1, (long) (byte) 100, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, 10L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_7, "hi!");
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        testScheduler0.settime(100L);
        long long11 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 'a', schedulerFunc2_13, "hi!");
        java.lang.String str16 = strTimedAction15.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean17 = strTimedAction15.getisCancelled();
        java.lang.String str18 = strTimedAction15.state;
        long long19 = strTimedAction15.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(atomicBoolean17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, (long) (-1), schedulerFunc2_4, (java.lang.CharSequence) "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime((long) 1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(subscriptionFunc0_10, 97L, 10L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.triggerActions((long) (-1));
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.now();
        testScheduler0.triggerActions(35L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(subscriptionFunc0_7, (long) (short) 0, 10L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.time = (short) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_5, 100L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        testScheduler0.time = 1L;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.time = (short) 10;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_5, (long) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        long long13 = testScheduler0.now();
        testScheduler0.triggerActions(0L);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (byte) 1, (long) (byte) 100, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_7, "hi!");
        long long10 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.triggerActions((long) (-1));
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, (long) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.triggerActions(10L);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 0, schedulerFunc2_12, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strTimedAction14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.lang.String str7 = strTimedAction4.getstate();
        strTimedAction4.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler10 = strTimedAction4.scheduler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(schedulerFunc2_9);
        org.junit.Assert.assertNull(testScheduler10);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        strTimedAction4.cancel();
        java.lang.Class<?> wildcardClass6 = strTimedAction4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_6, (long) '#', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator8.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler13 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_15 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction17 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler13, (long) (byte) -1, schedulerFunc2_15, "");
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction17.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = strTimedAction17.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = strTimedAction17.getaction();
        java.lang.String str21 = strTimedAction17.state;
        java.lang.String str22 = strTimedAction17.getstate();
        rx.concurrency.TestScheduler testScheduler23 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_25 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction27 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler23, (long) (byte) -1, schedulerFunc2_25, "");
        java.lang.String str28 = strTimedAction27.state;
        rx.concurrency.TestScheduler testScheduler29 = strTimedAction27.getscheduler();
        java.lang.String str30 = strTimedAction27.getstate();
        long long31 = strTimedAction27.time;
        int int32 = compareActionsByTime12.compare(strTimedAction17, strTimedAction27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator10.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime0.thenComparing(wildcardTimedActionComparator34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        strTimedAction41.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_43 = strTimedAction41.getaction();
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = compareActionsByTime0.compare(strTimedAction41, strTimedAction44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNull(testScheduler18);
        org.junit.Assert.assertNull(schedulerFunc2_19);
        org.junit.Assert.assertNull(schedulerFunc2_20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(testScheduler29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNull(schedulerFunc2_43);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        testScheduler0.settime((long) (byte) 1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (long) (short) 100, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, 100L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.time = '4';
        testScheduler0.triggerActions(35L);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_10, (long) '4', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.now();
        testScheduler0.settime((long) 1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction25.getscheduler();
        strTimedAction25.cancel();
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean33 = strTimedAction32.isCancelled;
        rx.concurrency.TestScheduler testScheduler34 = strTimedAction32.getscheduler();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        rx.concurrency.TestScheduler testScheduler36 = strTimedAction32.scheduler;
        long long37 = strTimedAction32.gettime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = strTimedAction32.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertNotNull(atomicBoolean33);
        org.junit.Assert.assertNull(testScheduler34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(testScheduler36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction25.getscheduler();
        strTimedAction25.cancel();
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean33 = strTimedAction32.isCancelled;
        rx.concurrency.TestScheduler testScheduler34 = strTimedAction32.getscheduler();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        long long36 = strTimedAction25.time;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = strTimedAction25.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertNotNull(atomicBoolean33);
        org.junit.Assert.assertNull(testScheduler34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions(35L);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        testScheduler0.settime(100L);
        testScheduler0.triggerActions((long) (byte) 10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, (long) (-1), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = 100L;
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler testScheduler9 = new rx.concurrency.TestScheduler();
        long long10 = testScheduler9.time;
        long long11 = testScheduler9.gettime();
        testScheduler9.triggerActions();
        testScheduler9.settime(100L);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler9.schedule(action0_15);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler9, (long) (byte) 0, schedulerFunc2_18, "hi!");
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler> testSchedulerTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler>(testScheduler0, 0L, schedulerFunc2_8, testScheduler9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler9.schedule(schedulerFunc1_22, (long) '4', timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 'a');
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_17, "hi!");
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, 32L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_7, "hi!");
        long long10 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) '4', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(action0_4, (-1L), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        testScheduler0.settime((long) '4');
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, (long) (short) 0, 0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        long long16 = testScheduler8.time;
        long long17 = testScheduler8.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler8.schedule(subscriptionFunc0_18, (long) (byte) 0, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, 32L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        java.lang.String str27 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        long long33 = strTimedAction32.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction32.getaction();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        rx.concurrency.TestScheduler testScheduler42 = strTimedAction41.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_43 = strTimedAction41.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = strTimedAction41.getaction();
        java.lang.String str45 = strTimedAction41.state;
        java.lang.String str46 = strTimedAction41.getstate();
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        java.lang.String str52 = strTimedAction51.state;
        rx.concurrency.TestScheduler testScheduler53 = strTimedAction51.getscheduler();
        java.lang.String str54 = strTimedAction51.getstate();
        long long55 = strTimedAction51.time;
        int int56 = compareActionsByTime36.compare(strTimedAction41, strTimedAction51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime58.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        rx.concurrency.TestScheduler testScheduler63 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_65 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction67 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler63, (long) (byte) -1, schedulerFunc2_65, "");
        rx.concurrency.TestScheduler testScheduler68 = strTimedAction67.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_69 = strTimedAction67.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_70 = strTimedAction67.action;
        rx.concurrency.TestScheduler testScheduler71 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_73 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction75 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler71, (long) (byte) -1, schedulerFunc2_73, "");
        rx.concurrency.TestScheduler testScheduler76 = strTimedAction75.getscheduler();
        long long77 = strTimedAction75.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean78 = strTimedAction75.getisCancelled();
        long long79 = strTimedAction75.gettime();
        int int80 = compareActionsByTime0.compare(strTimedAction67, strTimedAction75);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean81 = strTimedAction67.getisCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str82 = strTimedAction67.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(testScheduler42);
        org.junit.Assert.assertNull(schedulerFunc2_43);
        org.junit.Assert.assertNull(schedulerFunc2_44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(testScheduler53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNull(testScheduler68);
        org.junit.Assert.assertNull(schedulerFunc2_69);
        org.junit.Assert.assertNull(schedulerFunc2_70);
        org.junit.Assert.assertNull(testScheduler76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean81);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.time = (short) 100;
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, (-1L), timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_8, 35L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler8.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler8.schedulePeriodically(schedulerFunc1_17, (long) (byte) 10, (long) (byte) 10, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        java.lang.String str6 = strTimedAction4.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.isCancelled;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(atomicBoolean7);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
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
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, 0L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.lang.Class<?> wildcardClass8 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) (short) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) ' ', schedulerFunc2_4, "");
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction6.getscheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler7.schedule(subscriptionFunc0_8, (long) (short) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(testScheduler7);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(action0_4, 35L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = (short) 0;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, 0L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_4, 32L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (byte) 10;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 32L, schedulerFunc2_8, "hi!");
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(action0_11, (long) 'a', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        long long16 = testScheduler0.now();
        testScheduler0.settime((long) (byte) 100);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        long long8 = strTimedAction4.gettime();
        strTimedAction4.cancel();
        strTimedAction4.cancel();
        java.lang.Class<?> wildcardClass11 = strTimedAction4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.settime((long) (short) 100);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(32L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        long long8 = strTimedAction4.gettime();
        strTimedAction4.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction4.getaction();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_10);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) (byte) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) (short) -1, (long) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler testScheduler8 = new rx.concurrency.TestScheduler();
        testScheduler8.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler8.schedule(schedulerFunc1_10);
        testScheduler8.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler8.queue;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, 10L, schedulerFunc2_7, (rx.Scheduler) testScheduler8);
        long long16 = testScheduler8.time;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler8.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription7 = testScheduler0.schedulePeriodically(action0_3, (long) (byte) 10, (long) 'a', timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler testScheduler4 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction8 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler4, (long) (byte) -1, schedulerFunc2_6, "");
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction8.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction8.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = strTimedAction8.getaction();
        java.lang.String str12 = strTimedAction8.getstate();
        rx.concurrency.TestScheduler testScheduler13 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_15 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction17 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler13, (long) (byte) -1, schedulerFunc2_15, "");
        long long18 = strTimedAction17.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = strTimedAction17.getaction();
        int int20 = compareActionsByTime2.compare(strTimedAction8, strTimedAction17);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler27 = strTimedAction25.getscheduler();
        java.lang.String str28 = strTimedAction25.getstate();
        strTimedAction25.cancel();
        long long30 = strTimedAction25.gettime();
        rx.concurrency.TestScheduler testScheduler31 = new rx.concurrency.TestScheduler();
        testScheduler31.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_33 = null;
        rx.Subscription subscription34 = testScheduler31.schedule(schedulerFunc1_33);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue35 = testScheduler31.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_36 = null;
        rx.Subscription subscription37 = testScheduler31.schedule(schedulerFunc1_36);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler31, (-1L), schedulerFunc2_39, "hi!");
        long long42 = strTimedAction41.gettime();
        strTimedAction41.cancel();
        rx.concurrency.TestScheduler testScheduler44 = strTimedAction41.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_45 = strTimedAction41.getaction();
        int int46 = compareActionsByTime2.compare(strTimedAction25, strTimedAction41);
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        long long52 = strTimedAction51.time;
        rx.concurrency.TestScheduler testScheduler53 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_55 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction57 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler53, (long) (byte) -1, schedulerFunc2_55, "");
        rx.concurrency.TestScheduler testScheduler58 = strTimedAction57.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_59 = strTimedAction57.action;
        rx.concurrency.TestScheduler testScheduler60 = strTimedAction57.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_61 = strTimedAction57.action;
        int int62 = compareActionsByTime2.compare(strTimedAction51, strTimedAction57);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime63 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime63.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator64.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime65);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime67.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = wildcardTimedActionComparator68.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime69);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator70.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = wildcardTimedActionComparator66.thenComparing(wildcardTimedActionComparator70);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime73.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime75 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = wildcardTimedActionComparator74.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = compareActionsByTime75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator66.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = compareActionsByTime2.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction80 = null;
        rx.concurrency.TestScheduler testScheduler81 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_83 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction85 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler81, (long) (byte) -1, schedulerFunc2_83, "");
        rx.concurrency.TestScheduler testScheduler86 = strTimedAction85.getscheduler();
        rx.concurrency.TestScheduler testScheduler87 = strTimedAction85.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean88 = strTimedAction85.getisCancelled();
        long long89 = strTimedAction85.gettime();
        // The following exception was thrown during execution in test generation
        try {
            int int90 = compareActionsByTime2.compare(strTimedAction80, strTimedAction85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertNull(schedulerFunc2_11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(testScheduler27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(subscription34);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue35);
        org.junit.Assert.assertNotNull(subscription37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler44);
        org.junit.Assert.assertNull(schedulerFunc2_45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNull(testScheduler58);
        org.junit.Assert.assertNull(schedulerFunc2_59);
        org.junit.Assert.assertNull(testScheduler60);
        org.junit.Assert.assertNull(schedulerFunc2_61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNull(testScheduler86);
        org.junit.Assert.assertNull(testScheduler87);
        org.junit.Assert.assertNotNull(atomicBoolean88);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + (-1L) + "'", long89 == (-1L));
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        testScheduler0.settime((long) (short) -1);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        long long13 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(schedulerFunc1_14, 97L, (long) (short) 10, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler testScheduler4 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction8 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler4, (long) (byte) -1, schedulerFunc2_6, "");
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction8.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction8.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = strTimedAction8.getaction();
        java.lang.String str12 = strTimedAction8.getstate();
        rx.concurrency.TestScheduler testScheduler13 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_15 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction17 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler13, (long) (byte) -1, schedulerFunc2_15, "");
        long long18 = strTimedAction17.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = strTimedAction17.getaction();
        int int20 = compareActionsByTime2.compare(strTimedAction8, strTimedAction17);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler27 = strTimedAction25.getscheduler();
        java.lang.String str28 = strTimedAction25.getstate();
        strTimedAction25.cancel();
        long long30 = strTimedAction25.gettime();
        rx.concurrency.TestScheduler testScheduler31 = new rx.concurrency.TestScheduler();
        testScheduler31.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_33 = null;
        rx.Subscription subscription34 = testScheduler31.schedule(schedulerFunc1_33);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue35 = testScheduler31.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_36 = null;
        rx.Subscription subscription37 = testScheduler31.schedule(schedulerFunc1_36);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler31, (-1L), schedulerFunc2_39, "hi!");
        long long42 = strTimedAction41.gettime();
        strTimedAction41.cancel();
        rx.concurrency.TestScheduler testScheduler44 = strTimedAction41.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_45 = strTimedAction41.getaction();
        int int46 = compareActionsByTime2.compare(strTimedAction25, strTimedAction41);
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        long long52 = strTimedAction51.time;
        rx.concurrency.TestScheduler testScheduler53 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_55 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction57 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler53, (long) (byte) -1, schedulerFunc2_55, "");
        rx.concurrency.TestScheduler testScheduler58 = strTimedAction57.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_59 = strTimedAction57.action;
        rx.concurrency.TestScheduler testScheduler60 = strTimedAction57.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_61 = strTimedAction57.action;
        int int62 = compareActionsByTime2.compare(strTimedAction51, strTimedAction57);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime63 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime63.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator64.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime65);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime67.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = wildcardTimedActionComparator68.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime69);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator70.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = wildcardTimedActionComparator66.thenComparing(wildcardTimedActionComparator70);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime73.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime75 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = wildcardTimedActionComparator74.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = compareActionsByTime75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator66.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = compareActionsByTime2.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        rx.concurrency.TestScheduler testScheduler80 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_82 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction84 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler80, (long) (byte) -1, schedulerFunc2_82, "");
        java.lang.String str85 = strTimedAction84.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_86 = strTimedAction84.getaction();
        strTimedAction84.cancel();
        java.lang.String str88 = strTimedAction84.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean89 = strTimedAction84.getisCancelled();
        rx.concurrency.TestScheduler testScheduler90 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_92 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction94 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler90, (long) (byte) -1, schedulerFunc2_92, "");
        long long95 = strTimedAction94.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_96 = strTimedAction94.action;
        strTimedAction94.cancel();
        rx.concurrency.TestScheduler testScheduler98 = strTimedAction94.getscheduler();
        int int99 = compareActionsByTime2.compare(strTimedAction84, strTimedAction94);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertNull(schedulerFunc2_11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(testScheduler27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(subscription34);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue35);
        org.junit.Assert.assertNotNull(subscription37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler44);
        org.junit.Assert.assertNull(schedulerFunc2_45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNull(testScheduler58);
        org.junit.Assert.assertNull(schedulerFunc2_59);
        org.junit.Assert.assertNull(testScheduler60);
        org.junit.Assert.assertNull(schedulerFunc2_61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNull(schedulerFunc2_86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(atomicBoolean89);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + (-1L) + "'", long95 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_96);
        org.junit.Assert.assertNull(testScheduler98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) '4', schedulerFunc2_13, "hi!");
        testScheduler0.triggerActions(0L);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_18, 0L, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean5 = strTimedAction4.isCancelled;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean8 = strTimedAction4.isCancelled;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(atomicBoolean5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNotNull(atomicBoolean7);
        org.junit.Assert.assertNotNull(atomicBoolean8);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 'a');
        long long4 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, 0L, 1L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime(35L);
        testScheduler0.triggerActions((long) (byte) 0);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (byte) 10;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        testScheduler0.settime(0L);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (byte) 10;
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 32L, schedulerFunc2_8, "hi!");
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        testScheduler0.time = '#';
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        long long11 = testScheduler0.time;
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) '#', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        testScheduler0.time = (byte) -1;
        testScheduler0.settime(97L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, 32L, (long) 1, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(subscriptionFunc0_6, 32L, (long) 0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        java.lang.String str8 = strTimedAction4.state;
        java.lang.String str9 = strTimedAction4.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.getisCancelled();
        long long11 = strTimedAction4.time;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) (byte) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean5 = strTimedAction4.isCancelled;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.getisCancelled();
        strTimedAction4.cancel();
        long long9 = strTimedAction4.time;
        java.lang.String str10 = strTimedAction4.getstate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(atomicBoolean5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNotNull(atomicBoolean7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = strTimedAction10.getaction();
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction10.scheduler;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler15.schedule(subscriptionFunc0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler15.schedulePeriodically(subscriptionFunc0_18, 97L, (long) (short) 1, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
        org.junit.Assert.assertNull(schedulerFunc2_14);
        org.junit.Assert.assertNotNull(testScheduler15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.lang.Class<?> wildcardClass8 = subscription7.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, (long) (-1), schedulerFunc2_4, (java.lang.CharSequence) "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime((long) 1);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) (byte) 100, 100L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.time = (short) -1;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 10, schedulerFunc2_13, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strTimedAction15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        long long5 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_7 = null;
        rx.Subscription subscription8 = null;
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, 100L, schedulerFunc2_7, subscription8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.triggerActions((long) (-1));
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.time;
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) '4', 32L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.getscheduler();
        java.lang.String str8 = strTimedAction4.state;
        java.lang.String str9 = strTimedAction4.getstate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = strTimedAction10.gettime();
        strTimedAction10.cancel();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction10.scheduler;
        testScheduler13.time = (byte) 1;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler13.schedulePeriodically(schedulerFunc1_16, (long) (byte) 1, (long) (short) 100, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = strTimedAction15.scheduler;
        long long22 = strTimedAction15.time;
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(testScheduler21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) (short) 100, (long) 10, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription7);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction25.getscheduler();
        strTimedAction25.cancel();
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean33 = strTimedAction32.isCancelled;
        rx.concurrency.TestScheduler testScheduler34 = strTimedAction32.getscheduler();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        rx.concurrency.TestScheduler testScheduler42 = strTimedAction41.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_43 = strTimedAction41.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = strTimedAction41.getaction();
        java.lang.String str45 = strTimedAction41.state;
        java.lang.String str46 = strTimedAction41.getstate();
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        java.lang.String str52 = strTimedAction51.state;
        rx.concurrency.TestScheduler testScheduler53 = strTimedAction51.getscheduler();
        java.lang.String str54 = strTimedAction51.getstate();
        long long55 = strTimedAction51.time;
        int int56 = compareActionsByTime36.compare(strTimedAction41, strTimedAction51);
        rx.concurrency.TestScheduler testScheduler57 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_59 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction61 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler57, (long) (byte) -1, schedulerFunc2_59, "");
        java.lang.String str62 = strTimedAction61.state;
        java.lang.String str63 = strTimedAction61.state;
        rx.concurrency.TestScheduler testScheduler64 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_66 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction68 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler64, (long) (byte) -1, schedulerFunc2_66, "");
        long long69 = strTimedAction68.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_70 = strTimedAction68.getaction();
        int int71 = compareActionsByTime36.compare(strTimedAction61, strTimedAction68);
        rx.concurrency.TestScheduler testScheduler72 = strTimedAction61.getscheduler();
        long long73 = strTimedAction61.time;
        rx.concurrency.TestScheduler testScheduler74 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_76 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction78 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler74, (long) (byte) -1, schedulerFunc2_76, "");
        java.lang.String str79 = strTimedAction78.state;
        rx.concurrency.TestScheduler testScheduler80 = strTimedAction78.getscheduler();
        java.lang.String str81 = strTimedAction78.getstate();
        strTimedAction78.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_83 = strTimedAction78.getaction();
        int int84 = compareActionsByTime0.compare(strTimedAction61, strTimedAction78);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime85 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator86 = compareActionsByTime85.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime87 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator88 = wildcardTimedActionComparator86.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime87);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator89 = wildcardTimedActionComparator88.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime90 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator91 = compareActionsByTime90.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime92 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator93 = wildcardTimedActionComparator91.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime92);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator94 = wildcardTimedActionComparator93.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator95 = wildcardTimedActionComparator88.thenComparing(wildcardTimedActionComparator94);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator96 = wildcardTimedActionComparator88.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator97 = wildcardTimedActionComparator96.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator98 = compareActionsByTime0.thenComparing(wildcardTimedActionComparator96);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertNotNull(atomicBoolean33);
        org.junit.Assert.assertNull(testScheduler34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(testScheduler42);
        org.junit.Assert.assertNull(schedulerFunc2_43);
        org.junit.Assert.assertNull(schedulerFunc2_44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(testScheduler53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(testScheduler72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(testScheduler80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNull(schedulerFunc2_83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator88);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator89);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator91);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator93);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator94);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator95);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator96);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator97);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator98);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 'a', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_5 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction7 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 'a', schedulerFunc2_5, "");
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_8, (long) ' ', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        testScheduler0.settime((long) '4');
        testScheduler0.time = 1;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (short) 1);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) ' ', 1L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) 'a', 10L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.settime((long) (short) 100);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(1L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.time;
        long long13 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (-1L), timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 0);
        long long16 = testScheduler0.now();
        testScheduler0.settime((-1L));
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_19, (long) ' ', timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        java.lang.String str27 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler28 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (long) (byte) -1, schedulerFunc2_30, "");
        long long33 = strTimedAction32.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = strTimedAction32.getaction();
        int int35 = compareActionsByTime0.compare(strTimedAction25, strTimedAction32);
        rx.concurrency.TestScheduler testScheduler36 = new rx.concurrency.TestScheduler();
        testScheduler36.triggerActions();
        long long38 = testScheduler36.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_40 = null;
        rx.concurrency.TestScheduler testScheduler41 = new rx.concurrency.TestScheduler();
        testScheduler41.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_43 = null;
        rx.Subscription subscription44 = testScheduler41.schedule(schedulerFunc1_43);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue45 = testScheduler41.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_46 = null;
        rx.Subscription subscription47 = testScheduler41.schedule(schedulerFunc1_46);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction48 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler36, (long) (byte) 0, schedulerFunc2_40, subscription47);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue49 = testScheduler36.queue;
        testScheduler36.settime((long) 0);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_53 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction55 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler36, (-1L), schedulerFunc2_53, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_57 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction59 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler36, (long) ' ', schedulerFunc2_57, "hi!");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean60 = strTimedAction59.getisCancelled();
        rx.concurrency.TestScheduler testScheduler61 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_63 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction65 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler61, (long) (byte) -1, schedulerFunc2_63, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean66 = strTimedAction65.isCancelled;
        rx.concurrency.TestScheduler testScheduler67 = strTimedAction65.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean68 = strTimedAction65.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean69 = strTimedAction65.isCancelled;
        java.lang.String str70 = strTimedAction65.state;
        int int71 = compareActionsByTime0.compare(strTimedAction59, strTimedAction65);
        java.lang.Class<?> wildcardClass72 = strTimedAction65.getClass();
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(subscription44);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue45);
        org.junit.Assert.assertNotNull(subscription47);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue49);
        org.junit.Assert.assertNotNull(atomicBoolean60);
        org.junit.Assert.assertNotNull(atomicBoolean66);
        org.junit.Assert.assertNull(testScheduler67);
        org.junit.Assert.assertNotNull(atomicBoolean68);
        org.junit.Assert.assertNotNull(atomicBoolean69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction5.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction5.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.getaction();
        java.lang.String str9 = strTimedAction5.state;
        java.lang.String str10 = strTimedAction5.getstate();
        rx.concurrency.TestScheduler testScheduler11 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler11, (long) (byte) -1, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        java.lang.String str18 = strTimedAction15.getstate();
        long long19 = strTimedAction15.time;
        int int20 = compareActionsByTime0.compare(strTimedAction5, strTimedAction15);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime21.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime25.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator26.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator28.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler31 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_33 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction35 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler31, (long) (byte) -1, schedulerFunc2_33, "");
        rx.concurrency.TestScheduler testScheduler36 = strTimedAction35.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = strTimedAction35.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction35.getaction();
        java.lang.String str39 = strTimedAction35.state;
        java.lang.String str40 = strTimedAction35.getstate();
        rx.concurrency.TestScheduler testScheduler41 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_43 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction45 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler41, (long) (byte) -1, schedulerFunc2_43, "");
        java.lang.String str46 = strTimedAction45.state;
        rx.concurrency.TestScheduler testScheduler47 = strTimedAction45.getscheduler();
        java.lang.String str48 = strTimedAction45.getstate();
        long long49 = strTimedAction45.time;
        int int50 = compareActionsByTime30.compare(strTimedAction35, strTimedAction45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator28.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        rx.concurrency.TestScheduler testScheduler53 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_55 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction57 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler53, (long) (byte) -1, schedulerFunc2_55, "");
        rx.concurrency.TestScheduler testScheduler58 = strTimedAction57.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_59 = strTimedAction57.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_60 = strTimedAction57.getaction();
        java.lang.String str61 = strTimedAction57.state;
        java.lang.String str62 = strTimedAction57.getstate();
        rx.concurrency.TestScheduler testScheduler63 = new rx.concurrency.TestScheduler();
        testScheduler63.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_65 = null;
        rx.Subscription subscription66 = testScheduler63.schedule(schedulerFunc1_65);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue67 = testScheduler63.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_68 = null;
        rx.Subscription subscription69 = testScheduler63.schedule(schedulerFunc1_68);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_71 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction73 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler63, (-1L), schedulerFunc2_71, "hi!");
        long long74 = strTimedAction73.gettime();
        int int75 = compareActionsByTime30.compare(strTimedAction57, strTimedAction73);
        rx.concurrency.TestScheduler testScheduler76 = strTimedAction73.scheduler;
        rx.concurrency.TestScheduler testScheduler77 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_79 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction81 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler77, (long) (byte) -1, schedulerFunc2_79, "");
        rx.concurrency.TestScheduler testScheduler82 = strTimedAction81.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_83 = strTimedAction81.action;
        long long84 = strTimedAction81.gettime();
        int int85 = compareActionsByTime0.compare(strTimedAction73, strTimedAction81);
        java.lang.Class<?> wildcardClass86 = compareActionsByTime0.getClass();
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(testScheduler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNull(testScheduler36);
        org.junit.Assert.assertNull(schedulerFunc2_37);
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(testScheduler47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNull(testScheduler58);
        org.junit.Assert.assertNull(schedulerFunc2_59);
        org.junit.Assert.assertNull(schedulerFunc2_60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(subscription66);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue67);
        org.junit.Assert.assertNotNull(subscription69);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(testScheduler76);
        org.junit.Assert.assertNull(testScheduler82);
        org.junit.Assert.assertNull(schedulerFunc2_83);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.getscheduler();
        java.lang.String str8 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = strTimedAction4.action;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.getisCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(schedulerFunc2_9);
        org.junit.Assert.assertNotNull(atomicBoolean10);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.settime((long) 10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(subscriptionFunc0_5, (long) (byte) 10, (long) (-1), timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 32L, schedulerFunc2_7, "");
        java.lang.String str10 = strTimedAction9.state;
        strTimedAction9.cancel();
        java.lang.String str12 = strTimedAction9.getstate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strTimedAction9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) (byte) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler testScheduler5 = new rx.concurrency.TestScheduler();
        testScheduler5.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler5.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler5.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler5.schedule(schedulerFunc1_10);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction12 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) (byte) 0, schedulerFunc2_4, subscription11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) 'a', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        long long5 = strTimedAction4.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.getisCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strTimedAction4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNotNull(atomicBoolean7);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        long long8 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        testScheduler0.time = (byte) -1;
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_16, (long) (-1), timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_7, (long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        long long11 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_13, (long) (byte) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(subscriptionFunc0_9, (long) ' ', (long) 'a', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription8);
    }
}

