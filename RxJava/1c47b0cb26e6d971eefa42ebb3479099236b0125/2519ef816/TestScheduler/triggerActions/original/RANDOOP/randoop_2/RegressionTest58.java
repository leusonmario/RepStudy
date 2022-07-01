import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest58 {

    public static boolean debug = false;

    @Test
    public void test29001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29001");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(action0_22, (long) '4', 100L, timeUnit25);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test29002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29002");
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
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        org.junit.Assert.assertNotNull(subscription2);
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
    public void test29003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29003");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedulePeriodically(action0_24, (long) (short) 1, (long) (short) 1, timeUnit27);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29004");
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
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        long long22 = testScheduler0.now();
        long long23 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test29005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29005");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29006");
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
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(schedulerFunc1_18, 0L, (-1L), timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test29007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29007");
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
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        long long21 = testScheduler0.now();
        long long22 = testScheduler0.now();
        long long23 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedule(schedulerFunc1_24, (long) (-1), timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test29008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29008");
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
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
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
    public void test29009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29009");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        java.lang.Class<?> wildcardClass25 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test29010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29010");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test29011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29011");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        java.lang.Class<?> wildcardClass26 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test29012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29012");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
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
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test29013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29013");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29014");
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
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedulePeriodically(schedulerFunc1_26, (long) 10, 100L, timeUnit29);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29015");
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
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) ' ', timeUnit16);
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
    public void test29016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29016");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        org.junit.Assert.assertNotNull(subscription2);
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
    public void test29017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29017");
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
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 1, timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29018");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) (byte) 0, 100L, timeUnit19);
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
    public void test29019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29019");
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
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_26);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(subscriptionFunc0_28);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_30 = null;
        rx.Subscription subscription31 = testScheduler0.schedule(schedulerFunc1_30);
        rx.util.functions.Action0 action0_32 = null;
        java.util.concurrent.TimeUnit timeUnit34 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription35 = testScheduler0.schedule(action0_32, 10L, timeUnit34);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(subscription31);
    }

    @Test
    public void test29020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29020");
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
            rx.Subscription subscription10 = testScheduler0.schedulePeriodically(action0_6, (long) (byte) -1, 0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test29021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29021");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(subscriptionFunc0_14, (long) (byte) 1, (long) (byte) 100, timeUnit17);
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
    public void test29022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29022");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(schedulerFunc1_28);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
    }

    @Test
    public void test29023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29023");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29024");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test29025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29025");
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
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) '#', (long) (byte) 1, timeUnit18);
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
    public void test29026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29026");
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
        long long15 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        long long24 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test29027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29027");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29028");
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
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29029");
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
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 1, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test29030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29030");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test29031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29031");
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
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
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
    public void test29032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29032");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(subscriptionFunc0_19, (long) 1, (long) 10, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test29033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29033");
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
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
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
    public void test29034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29034");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(schedulerFunc1_26);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(schedulerFunc1_28);
        java.lang.Class<?> wildcardClass30 = subscription29.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test29035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29035");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_26);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(schedulerFunc1_28);
        long long30 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit32 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) -1, timeUnit32);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test29036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29036");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(subscriptionFunc0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test29037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29037");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(schedulerFunc1_26);
        long long28 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(schedulerFunc1_29);
        rx.util.functions.Action0 action0_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(action0_31);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
    }

    @Test
    public void test29038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29038");
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test29039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29039");
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
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test29040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29040");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(schedulerFunc1_27);
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
    }

    @Test
    public void test29041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29041");
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
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_25 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedulePeriodically(subscriptionFunc0_25, (long) 100, (-1L), timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29042");
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
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedulePeriodically(subscriptionFunc0_24, (-1L), (long) (byte) 100, timeUnit27);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29043");
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
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_20, (long) (short) 0, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test29044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29044");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_19, 0L, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test29045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29045");
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
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, (long) (byte) 1, (long) '#', timeUnit20);
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
    public void test29046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29046");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_25);
        rx.util.functions.Action0 action0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(action0_27);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(schedulerFunc1_29);
        java.util.concurrent.TimeUnit timeUnit32 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit32);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
    }

    @Test
    public void test29047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29047");
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
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29048");
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
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29049");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test29050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29050");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
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
    public void test29051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29051");
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
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        java.lang.Class<?> wildcardClass23 = testScheduler0.getClass();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test29052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29052");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit23);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test29053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29053");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        long long17 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test29054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29054");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        org.junit.Assert.assertNotNull(subscription2);
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

    @Test
    public void test29055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29055");
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
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedulePeriodically(schedulerFunc1_25, (long) (-1), (long) (byte) -1, timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test29056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29056");
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
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, 0L, timeUnit17);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test29057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29057");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(action0_23, (long) (byte) 100, 100L, timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29058");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
    }

    @Test
    public void test29059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29059");
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
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
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
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test29060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29060");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test29061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29061");
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
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        java.lang.Class<?> wildcardClass15 = subscription14.getClass();
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
    public void test29062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29062");
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
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) 100, (long) (short) 100, timeUnit18);
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
    public void test29063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29063");
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
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) ' ', timeUnit23);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test29064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29064");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test29065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29065");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_20, 1L, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test29066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29066");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(schedulerFunc1_27);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
    }

    @Test
    public void test29067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29067");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(subscriptionFunc0_17, (long) (short) 10, (long) (byte) 100, timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test29068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29068");
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
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        long long27 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(schedulerFunc1_28);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_30 = null;
        rx.Subscription subscription31 = testScheduler0.schedule(subscriptionFunc0_30);
        rx.util.functions.Action0 action0_32 = null;
        rx.Subscription subscription33 = testScheduler0.schedule(action0_32);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_34 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription37 = testScheduler0.schedule(subscriptionFunc0_34, (long) (-1), timeUnit36);
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
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(subscription31);
        org.junit.Assert.assertNotNull(subscription33);
    }

    @Test
    public void test29069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29069");
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
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test29070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29070");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        long long26 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test29071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29071");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_22, (long) (short) 100, timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test29072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29072");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
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
    public void test29073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29073");
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
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 'a', timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29074");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        long long26 = testScheduler0.now();
        long long27 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(schedulerFunc1_28);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
    }

    @Test
    public void test29075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29075");
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
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(subscriptionFunc0_27);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(schedulerFunc1_29);
        rx.util.functions.Action0 action0_31 = null;
        java.util.concurrent.TimeUnit timeUnit33 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription34 = testScheduler0.schedule(action0_31, (long) (-1), timeUnit33);
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
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
    }

    @Test
    public void test29076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29076");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        java.lang.Class<?> wildcardClass24 = subscription23.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test29077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29077");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, (long) '#', (long) 0, timeUnit14);
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
    public void test29078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29078");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(action0_23, (long) (short) -1, (long) (-1), timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29079");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.lang.Class<?> wildcardClass19 = subscription18.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test29080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29080");
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
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedulePeriodically(schedulerFunc1_26, (long) 100, 100L, timeUnit29);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29081");
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
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test29082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29082");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_18, (long) 'a', timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test29083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29083");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.now();
        long long23 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_26);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_28 = null;
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription31 = testScheduler0.schedule(subscriptionFunc0_28, (long) '4', timeUnit30);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
    }

    @Test
    public void test29084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29084");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_20, (long) 0, timeUnit22);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test29085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29085");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedule(subscriptionFunc0_23, (long) 100, timeUnit25);
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
    public void test29086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29086");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
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
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test29087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29087");
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
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit27);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29088");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29089");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (-1L), timeUnit18);
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
    public void test29090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29090");
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
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test29091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29091");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        rx.util.functions.Action0 action0_26 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedule(action0_26, (long) (byte) 0, timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29092");
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
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(subscriptionFunc0_25);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(subscriptionFunc0_27);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(subscriptionFunc0_29);
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
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
    }

    @Test
    public void test29093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29093");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        long long26 = testScheduler0.now();
        rx.util.functions.Action0 action0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(action0_27);
        long long29 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_30 = null;
        rx.Subscription subscription31 = testScheduler0.schedule(subscriptionFunc0_30);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_32 = null;
        rx.Subscription subscription33 = testScheduler0.schedule(schedulerFunc1_32);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(subscription31);
        org.junit.Assert.assertNotNull(subscription33);
    }

    @Test
    public void test29094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29094");
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
    public void test29095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29095");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_22, 0L, timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test29096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29096");
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
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        long long27 = testScheduler0.now();
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        rx.util.functions.Action0 action0_30 = null;
        rx.Subscription subscription31 = testScheduler0.schedule(action0_30);
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
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(subscription31);
    }

    @Test
    public void test29097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29097");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) 'a', (long) (byte) 0, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test29098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29098");
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test29099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29099");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        long long25 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedulePeriodically(subscriptionFunc0_26, 1L, (long) '#', timeUnit29);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test29100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29100");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test29101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29101");
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
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedulePeriodically(action0_21, (long) 10, (long) '#', timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test29102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29102");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        java.lang.Class<?> wildcardClass19 = subscription18.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test29103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29103");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29104");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_12, (long) (short) 100, timeUnit14);
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
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test29105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29105");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test29106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29106");
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
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        long long26 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedule(subscriptionFunc0_27, 0L, timeUnit29);
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
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test29107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29107");
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
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(schedulerFunc1_26);
        long long28 = testScheduler0.now();
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(schedulerFunc1_31);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_33 = null;
        java.util.concurrent.TimeUnit timeUnit35 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription36 = testScheduler0.schedule(schedulerFunc1_33, (long) (short) -1, timeUnit35);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
    }

    @Test
    public void test29108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29108");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        long long23 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29109");
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
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedulePeriodically(schedulerFunc1_24, (long) (short) 100, 10L, timeUnit27);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29110");
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
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29111");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(subscriptionFunc0_18, (long) (byte) -1, (long) (byte) 0, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test29112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29112");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        java.lang.Class<?> wildcardClass18 = subscription17.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test29113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29113");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(schedulerFunc1_26);
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit29);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
    }

    @Test
    public void test29114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29114");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
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
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29115");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_21, (-1L), timeUnit23);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test29116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29116");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_26);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(schedulerFunc1_28);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_30 = null;
        java.util.concurrent.TimeUnit timeUnit32 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription33 = testScheduler0.schedule(schedulerFunc1_30, (long) ' ', timeUnit32);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
    }

    @Test
    public void test29117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29117");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit14);
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
    }

    @Test
    public void test29118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29118");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_25);
        long long27 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(schedulerFunc1_28);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
    }

    @Test
    public void test29119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29119");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test29120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29120");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(subscriptionFunc0_28);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_30 = null;
        rx.Subscription subscription31 = testScheduler0.schedule(schedulerFunc1_30);
        java.util.concurrent.TimeUnit timeUnit33 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 0, timeUnit33);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(subscription31);
    }

    @Test
    public void test29121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29121");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test29122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29122");
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
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        java.lang.Class<?> wildcardClass26 = subscription25.getClass();
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
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test29123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29123");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedulePeriodically(action0_24, (long) 1, (long) (short) -1, timeUnit27);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29124");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.lang.Class<?> wildcardClass19 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test29125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29125");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 1, timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test29126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29126");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test29127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29127");
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
            testScheduler0.advanceTimeBy((long) 'a', timeUnit9);
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
    public void test29128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29128");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29129");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit17);
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
    public void test29130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29130");
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
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29131");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test29132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29132");
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
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29133");
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
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedule(subscriptionFunc0_26, (long) 100, timeUnit28);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29134");
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
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_24, (long) (short) 100, timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29135");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription28 = testScheduler0.schedulePeriodically(action0_24, (long) (byte) 100, (long) (short) 10, timeUnit27);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29136");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        long long26 = testScheduler0.now();
        rx.util.functions.Action0 action0_27 = null;
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription31 = testScheduler0.schedulePeriodically(action0_27, (long) '4', 100L, timeUnit30);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test29137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29137");
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
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(action0_17, (long) 1, 0L, timeUnit20);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test29138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29138");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_26);
        long long28 = testScheduler0.now();
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        long long31 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test29139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29139");
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
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(action0_22, (long) ' ', 100L, timeUnit25);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test29140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29140");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, (long) 0, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test29141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29141");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test29142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29142");
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
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit27);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29143");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit19);
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
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test29144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29144");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(action0_19, (long) (short) 0, (long) (short) 100, timeUnit22);
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
    public void test29145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29145");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test29146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29146");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29147");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_26);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(subscriptionFunc0_28);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_30 = null;
        rx.Subscription subscription31 = testScheduler0.schedule(schedulerFunc1_30);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(subscription31);
    }

    @Test
    public void test29148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29148");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29149");
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
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(subscriptionFunc0_22, (long) (byte) -1, (long) '#', timeUnit25);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test29150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29150");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(subscriptionFunc0_22, 0L, 0L, timeUnit25);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test29151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29151");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Action0 action0_26 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedulePeriodically(action0_26, (long) 0, (long) (short) -1, timeUnit29);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29152");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit23);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test29153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29153");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        long long23 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit27);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29154");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29155");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit16);
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
    public void test29156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29156");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
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
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test29157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29157");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        long long26 = testScheduler0.now();
        long long27 = testScheduler0.now();
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        rx.util.functions.Action0 action0_30 = null;
        rx.Subscription subscription31 = testScheduler0.schedule(action0_30);
        long long32 = testScheduler0.now();
        long long33 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_34 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription37 = testScheduler0.schedule(subscriptionFunc0_34, (long) (-1), timeUnit36);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(subscription31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test29158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29158");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test29159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29159");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_25);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(schedulerFunc1_27);
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        long long31 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_32 = null;
        rx.Subscription subscription33 = testScheduler0.schedule(subscriptionFunc0_32);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_34 = null;
        rx.Subscription subscription35 = testScheduler0.schedule(subscriptionFunc0_34);
        java.lang.Class<?> wildcardClass36 = testScheduler0.getClass();
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
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(subscription33);
        org.junit.Assert.assertNotNull(subscription35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test29160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29160");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_25);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(schedulerFunc1_27);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(subscriptionFunc0_29);
        rx.util.functions.Action0 action0_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(action0_31);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_33 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription37 = testScheduler0.schedulePeriodically(subscriptionFunc0_33, (long) 0, (long) 10, timeUnit36);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
    }

    @Test
    public void test29161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29161");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test29162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29162");
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
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29163");
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
        long long23 = testScheduler0.now();
        long long24 = testScheduler0.now();
        rx.util.functions.Action0 action0_25 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedulePeriodically(action0_25, (long) (byte) 0, (long) (byte) -1, timeUnit28);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test29164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29164");
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
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(subscriptionFunc0_18, (long) 1, 0L, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test29165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29165");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) (byte) 100, (long) (byte) 1, timeUnit15);
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
    public void test29166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29166");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        long long25 = testScheduler0.now();
        long long26 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_27 = null;
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription31 = testScheduler0.schedulePeriodically(schedulerFunc1_27, 1L, (long) ' ', timeUnit30);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test29167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29167");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        long long13 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, (long) 'a', timeUnit16);
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
    public void test29168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29168");
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
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedulePeriodically(action0_21, (long) (byte) 10, (long) (short) 100, timeUnit24);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test29169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29169");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        rx.util.functions.Action0 action0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(action0_27);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(subscriptionFunc0_29);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(schedulerFunc1_31);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_33 = null;
        rx.Subscription subscription34 = testScheduler0.schedule(subscriptionFunc0_33);
        java.util.concurrent.TimeUnit timeUnit36 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit36);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
        org.junit.Assert.assertNotNull(subscription34);
    }

    @Test
    public void test29170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29170");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test29171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29171");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        long long26 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(subscriptionFunc0_27);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(subscriptionFunc0_29);
        java.lang.Class<?> wildcardClass31 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test29172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29172");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_14, (long) (byte) 10, timeUnit16);
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
    public void test29173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29173");
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
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, (long) 'a', (long) 1, timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test29174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29174");
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
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(subscriptionFunc0_15, (long) 100, (long) (-1), timeUnit18);
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
    public void test29175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29175");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, 0L, timeUnit20);
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
    }

    @Test
    public void test29176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29176");
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
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Action0 action0_23 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedule(action0_23, (long) (byte) 100, timeUnit25);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test29177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29177");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, 100L, timeUnit15);
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
    }

    @Test
    public void test29178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29178");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29179");
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
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Action0 action0_24 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedule(action0_24, (long) '4', timeUnit26);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29180");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test29181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29181");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test29182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29182");
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
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test29183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29183");
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
        long long16 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        long long19 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_25);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedule(subscriptionFunc0_27, (long) 'a', timeUnit29);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test29184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29184");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        long long25 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_26);
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
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(subscription27);
    }

    @Test
    public void test29185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29185");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedulePeriodically(action0_20, (long) (byte) 100, (long) (-1), timeUnit23);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test29186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29186");
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
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(schedulerFunc1_27);
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(schedulerFunc1_31);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_33 = null;
        rx.Subscription subscription34 = testScheduler0.schedule(subscriptionFunc0_33);
        long long35 = testScheduler0.now();
        rx.util.functions.Action0 action0_36 = null;
        java.util.concurrent.TimeUnit timeUnit38 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription39 = testScheduler0.schedule(action0_36, (long) 'a', timeUnit38);
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
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
        org.junit.Assert.assertNotNull(subscription34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test29187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29187");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
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
    public void test29188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29188");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_25);
        rx.util.functions.Action0 action0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(action0_27);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(schedulerFunc1_29);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(subscriptionFunc0_31);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_33 = null;
        rx.Subscription subscription34 = testScheduler0.schedule(schedulerFunc1_33);
        rx.util.functions.Action0 action0_35 = null;
        rx.Subscription subscription36 = testScheduler0.schedule(action0_35);
        rx.util.functions.Action0 action0_37 = null;
        rx.Subscription subscription38 = testScheduler0.schedule(action0_37);
        java.util.concurrent.TimeUnit timeUnit40 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit40);
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
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
        org.junit.Assert.assertNotNull(subscription34);
        org.junit.Assert.assertNotNull(subscription36);
        org.junit.Assert.assertNotNull(subscription38);
    }

    @Test
    public void test29189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29189");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test29190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29190");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test29191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29191");
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
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(subscriptionFunc0_25);
        rx.util.functions.Action0 action0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(action0_27);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(subscriptionFunc0_29);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(schedulerFunc1_31);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_33 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription37 = testScheduler0.schedulePeriodically(subscriptionFunc0_33, (long) (byte) 0, (long) '#', timeUnit36);
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
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
    }

    @Test
    public void test29192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29192");
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
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        long long24 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_25);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(subscriptionFunc0_27);
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
    }

    @Test
    public void test29193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29193");
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
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_24, (long) (byte) 10, timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29194");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_28 = null;
        java.util.concurrent.TimeUnit timeUnit31 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription32 = testScheduler0.schedulePeriodically(subscriptionFunc0_28, (long) 'a', (long) 'a', timeUnit31);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
    }

    @Test
    public void test29195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29195");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        long long21 = testScheduler0.now();
        long long22 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedulePeriodically(schedulerFunc1_23, (-1L), (long) (short) 10, timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test29196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29196");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
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
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test29197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29197");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        long long21 = testScheduler0.now();
        long long22 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29198");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(schedulerFunc1_1);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedulePeriodically(schedulerFunc1_25, (long) (-1), 0L, timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29199");
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
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.now();
        long long19 = testScheduler0.now();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test29200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29200");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(schedulerFunc1_18, (long) (byte) 0, (long) (short) 100, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test29201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29201");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit18);
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
    public void test29202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29202");
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
        long long21 = testScheduler0.now();
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Action0 action0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(action0_26);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(subscriptionFunc0_28);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_30 = null;
        rx.Subscription subscription31 = testScheduler0.schedule(schedulerFunc1_30);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(subscription31);
    }

    @Test
    public void test29203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29203");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        long long26 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test29204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29204");
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
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        long long25 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedulePeriodically(subscriptionFunc0_26, 0L, 10L, timeUnit29);
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
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test29205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29205");
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
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        long long23 = testScheduler0.now();
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(schedulerFunc1_26);
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        long long30 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit32 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit32);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test29206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29206");
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
        long long21 = testScheduler0.now();
        long long22 = testScheduler0.now();
        long long23 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedule(subscriptionFunc0_26, (long) '#', timeUnit28);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29207");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        long long22 = testScheduler0.now();
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(subscriptionFunc0_25);
        org.junit.Assert.assertNotNull(subscription2);
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
    public void test29208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29208");
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
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(1L, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test29209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29209");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedulePeriodically(schedulerFunc1_20, 10L, (long) (short) 1, timeUnit23);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test29210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29210");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        long long24 = testScheduler0.now();
        long long25 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(schedulerFunc1_26);
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_30 = null;
        rx.Subscription subscription31 = testScheduler0.schedule(subscriptionFunc0_30);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_32 = null;
        rx.Subscription subscription33 = testScheduler0.schedule(subscriptionFunc0_32);
        long long34 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_35 = null;
        rx.Subscription subscription36 = testScheduler0.schedule(subscriptionFunc0_35);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(subscription27);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(subscription31);
        org.junit.Assert.assertNotNull(subscription33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(subscription36);
    }

    @Test
    public void test29211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29211");
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
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(schedulerFunc1_19, (long) '#', (long) (short) 0, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test29212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29212");
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
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_24, (long) (short) 1, timeUnit26);
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
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test29213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29213");
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
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
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
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29214");
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
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_11);
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_15, 0L, timeUnit17);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test29215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29215");
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
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (long) (byte) 1, timeUnit18);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test29216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29216");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.now();
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) 100, (long) 10, timeUnit19);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test29217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29217");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_13, 0L, timeUnit15);
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
    public void test29218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29218");
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
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test29219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29219");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, (long) (byte) 100, timeUnit20);
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
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test29220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29220");
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
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
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
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29221");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        long long20 = testScheduler0.now();
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        long long23 = testScheduler0.now();
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29222");
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
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(schedulerFunc1_25);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_27 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription30 = testScheduler0.schedule(schedulerFunc1_27, (long) 0, timeUnit29);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test29223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29223");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedule(schedulerFunc1_26, (long) (byte) 10, timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test29224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29224");
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
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        long long20 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 100, timeUnit22);
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
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test29225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29225");
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
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        long long25 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_26 = null;
        rx.Subscription subscription27 = testScheduler0.schedule(subscriptionFunc0_26);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_28 = null;
        java.util.concurrent.TimeUnit timeUnit31 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription32 = testScheduler0.schedulePeriodically(schedulerFunc1_28, (long) (byte) 1, (long) 0, timeUnit31);
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
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(subscription27);
    }

    @Test
    public void test29226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29226");
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
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(schedulerFunc1_13, (long) '4', (long) (short) 1, timeUnit16);
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
    public void test29227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29227");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        long long26 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(subscriptionFunc0_27);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(schedulerFunc1_29);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
    }

    @Test
    public void test29228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29228");
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
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        long long19 = testScheduler0.now();
        long long20 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_25 = null;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription29 = testScheduler0.schedulePeriodically(schedulerFunc1_25, (long) 10, (long) (short) 100, timeUnit28);
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
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test29229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29229");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(subscriptionFunc0_22, 100L, (long) (short) 100, timeUnit25);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test29230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29230");
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
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
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
    public void test29231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29231");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(subscriptionFunc0_1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test29232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29232");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(schedulerFunc1_18);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        long long26 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        rx.Subscription subscription28 = testScheduler0.schedule(subscriptionFunc0_27);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(schedulerFunc1_29);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_31 = null;
        rx.Subscription subscription32 = testScheduler0.schedule(schedulerFunc1_31);
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
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(subscription30);
        org.junit.Assert.assertNotNull(subscription32);
    }

    @Test
    public void test29233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29233");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
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
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test29234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29234");
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
        long long19 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        long long26 = testScheduler0.now();
        long long27 = testScheduler0.now();
        long long28 = testScheduler0.now();
        rx.util.functions.Action0 action0_29 = null;
        rx.Subscription subscription30 = testScheduler0.schedule(action0_29);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_31 = null;
        java.util.concurrent.TimeUnit timeUnit34 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription35 = testScheduler0.schedulePeriodically(schedulerFunc1_31, (long) (byte) 0, (-1L), timeUnit34);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(subscription30);
    }

    @Test
    public void test29235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29235");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
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
    public void test29236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29236");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_21);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(subscriptionFunc0_23);
        long long25 = testScheduler0.now();
        long long26 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription31 = testScheduler0.schedulePeriodically(subscriptionFunc0_27, 100L, (long) (byte) -1, timeUnit30);
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test29237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29237");
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
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(schedulerFunc1_18, 0L, (long) 1, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription17);
    }
}

