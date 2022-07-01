import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        long long19 = testScheduler0.time;
        long long20 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(schedulerFunc1_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(subscriptionFunc0_8, (long) (byte) 1, (long) (byte) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_70 = strTimedAction64.action;
        strTimedAction64.cancel();
        long long72 = strTimedAction64.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean73 = strTimedAction64.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean74 = strTimedAction64.isCancelled;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = strTimedAction64.toString();
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
        org.junit.Assert.assertNull(schedulerFunc2_70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean73);
        org.junit.Assert.assertNotNull(atomicBoolean74);
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler testScheduler2 = new rx.concurrency.TestScheduler();
        long long3 = testScheduler2.time;
        testScheduler2.settime((long) (short) 10);
        testScheduler2.time = 100;
        testScheduler2.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler2.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler2.schedule(subscriptionFunc0_12);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler2.schedule(schedulerFunc1_14);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler2, (long) 100, schedulerFunc2_17, "hi!");
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction19.getscheduler();
        rx.concurrency.TestScheduler testScheduler21 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler21, (long) (byte) -1, schedulerFunc2_23, "");
        java.lang.String str26 = strTimedAction25.state;
        rx.concurrency.TestScheduler testScheduler27 = strTimedAction25.getscheduler();
        java.lang.String str28 = strTimedAction25.getstate();
        strTimedAction25.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = strTimedAction25.getaction();
        rx.concurrency.TestScheduler testScheduler31 = strTimedAction25.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_32 = strTimedAction25.action;
        int int33 = compareActionsByTime0.compare(strTimedAction19, strTimedAction25);
        rx.concurrency.TestScheduler testScheduler34 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_36 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction38 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler34, (long) (byte) -1, schedulerFunc2_36, "");
        rx.concurrency.TestScheduler testScheduler39 = strTimedAction38.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_40 = strTimedAction38.action;
        java.lang.String str41 = strTimedAction38.getstate();
        long long42 = strTimedAction38.gettime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime43 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler44 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_46 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction48 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler44, (long) (byte) -1, schedulerFunc2_46, "");
        rx.concurrency.TestScheduler testScheduler49 = strTimedAction48.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = strTimedAction48.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_51 = strTimedAction48.getaction();
        java.lang.String str52 = strTimedAction48.state;
        java.lang.String str53 = strTimedAction48.getstate();
        rx.concurrency.TestScheduler testScheduler54 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_56 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction58 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler54, (long) (byte) -1, schedulerFunc2_56, "");
        java.lang.String str59 = strTimedAction58.state;
        rx.concurrency.TestScheduler testScheduler60 = strTimedAction58.getscheduler();
        java.lang.String str61 = strTimedAction58.getstate();
        long long62 = strTimedAction58.time;
        int int63 = compareActionsByTime43.compare(strTimedAction48, strTimedAction58);
        rx.concurrency.TestScheduler testScheduler64 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_66 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction68 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler64, (long) (byte) -1, schedulerFunc2_66, "");
        java.lang.String str69 = strTimedAction68.state;
        java.lang.String str70 = strTimedAction68.state;
        rx.concurrency.TestScheduler testScheduler71 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_73 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction75 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler71, (long) (byte) -1, schedulerFunc2_73, "");
        long long76 = strTimedAction75.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_77 = strTimedAction75.getaction();
        int int78 = compareActionsByTime43.compare(strTimedAction68, strTimedAction75);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean79 = strTimedAction68.isCancelled;
        long long80 = strTimedAction68.time;
        long long81 = strTimedAction68.gettime();
        int int82 = compareActionsByTime0.compare(strTimedAction38, strTimedAction68);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean83 = strTimedAction38.isCancelled;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(testScheduler20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(testScheduler27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(schedulerFunc2_30);
        org.junit.Assert.assertNull(testScheduler31);
        org.junit.Assert.assertNull(schedulerFunc2_32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(testScheduler39);
        org.junit.Assert.assertNull(schedulerFunc2_40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNull(testScheduler49);
        org.junit.Assert.assertNull(schedulerFunc2_50);
        org.junit.Assert.assertNull(schedulerFunc2_51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(testScheduler60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean79);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-1L) + "'", long80 == (-1L));
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean83);
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
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
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction16.getscheduler();
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction16.scheduler;
        rx.concurrency.TestScheduler testScheduler19 = strTimedAction16.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = strTimedAction16.action;
        rx.concurrency.TestScheduler testScheduler21 = strTimedAction16.getscheduler();
        long long22 = testScheduler21.now();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(testScheduler17);
        org.junit.Assert.assertNotNull(testScheduler18);
        org.junit.Assert.assertNotNull(testScheduler19);
        org.junit.Assert.assertNull(schedulerFunc2_20);
        org.junit.Assert.assertNotNull(testScheduler21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) -1);
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(52L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction8 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 100, schedulerFunc2_6, "hi!");
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = ' ';
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (byte) 10, 100L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_5 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction7 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 'a', schedulerFunc2_5, "");
        rx.concurrency.TestScheduler testScheduler8 = strTimedAction7.getscheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler8.queue;
        testScheduler8.triggerActions();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler8.schedule(action0_11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler8.getqueue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(testScheduler8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.time;
        long long15 = testScheduler0.time;
        testScheduler0.settime(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.queue;
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(action0_19, (long) (byte) 1, (-1L), timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_21 = strTimedAction5.action;
        long long22 = strTimedAction5.time;
        rx.concurrency.TestScheduler testScheduler23 = strTimedAction5.scheduler;
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
        org.junit.Assert.assertNull(schedulerFunc2_21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(testScheduler23);
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_5 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction7 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (-1), schedulerFunc2_5, "hi!");
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler testScheduler2 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler2, (long) (byte) -1, schedulerFunc2_4, "");
        java.lang.String str7 = strTimedAction6.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction6.getaction();
        strTimedAction6.cancel();
        java.lang.String str10 = strTimedAction6.state;
        long long11 = strTimedAction6.gettime();
        strTimedAction6.cancel();
        rx.concurrency.TestScheduler testScheduler13 = new rx.concurrency.TestScheduler();
        testScheduler13.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler13.schedule(action0_16);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler13, (long) 10, schedulerFunc2_19, "hi!");
        strTimedAction21.cancel();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean23 = strTimedAction21.getisCancelled();
        int int24 = compareActionsByTime0.compare(strTimedAction6, strTimedAction21);
        rx.concurrency.TestScheduler testScheduler25 = strTimedAction6.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_26 = strTimedAction6.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_27 = strTimedAction6.action;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(atomicBoolean23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(testScheduler25);
        org.junit.Assert.assertNull(schedulerFunc2_26);
        org.junit.Assert.assertNull(schedulerFunc2_27);
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 32L, schedulerFunc2_7, "");
        long long10 = strTimedAction9.time;
        java.lang.String str11 = strTimedAction9.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction9.getaction();
        java.lang.Class<?> wildcardClass13 = strTimedAction9.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.time;
        testScheduler0.settime((long) (byte) 1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
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
        long long18 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue20 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long22 = testScheduler0.now();
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
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
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction14.getscheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler15.schedulePeriodically(subscriptionFunc0_16, (long) (-1), 35L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(testScheduler15);
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction14.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction14.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction14.getaction();
        java.lang.String str18 = strTimedAction14.state;
        java.lang.String str19 = strTimedAction14.getstate();
        rx.concurrency.TestScheduler testScheduler20 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler20, (long) (byte) -1, schedulerFunc2_22, "");
        java.lang.String str25 = strTimedAction24.state;
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction24.getscheduler();
        java.lang.String str27 = strTimedAction24.getstate();
        long long28 = strTimedAction24.time;
        int int29 = compareActionsByTime9.compare(strTimedAction14, strTimedAction24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        rx.concurrency.TestScheduler testScheduler32 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction36 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler32, (long) (byte) -1, schedulerFunc2_34, "");
        rx.concurrency.TestScheduler testScheduler37 = strTimedAction36.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction36.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction36.getaction();
        java.lang.String str40 = strTimedAction36.state;
        java.lang.String str41 = strTimedAction36.getstate();
        rx.concurrency.TestScheduler testScheduler42 = new rx.concurrency.TestScheduler();
        testScheduler42.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_44 = null;
        rx.Subscription subscription45 = testScheduler42.schedule(schedulerFunc1_44);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue46 = testScheduler42.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_47 = null;
        rx.Subscription subscription48 = testScheduler42.schedule(schedulerFunc1_47);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction52 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (-1L), schedulerFunc2_50, "hi!");
        long long53 = strTimedAction52.gettime();
        int int54 = compareActionsByTime9.compare(strTimedAction36, strTimedAction52);
        long long55 = strTimedAction36.time;
        java.lang.String str56 = strTimedAction36.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean57 = strTimedAction36.isCancelled;
        java.lang.String str58 = strTimedAction36.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_59 = strTimedAction36.getaction();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNull(testScheduler15);
        org.junit.Assert.assertNull(schedulerFunc2_16);
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNull(testScheduler37);
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(subscription45);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue46);
        org.junit.Assert.assertNotNull(subscription48);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(atomicBoolean57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(schedulerFunc2_59);
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_8, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
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
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
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
        java.lang.String str37 = strTimedAction32.getstate();
        java.lang.String str38 = strTimedAction32.state;
        rx.concurrency.TestScheduler testScheduler39 = strTimedAction32.getscheduler();
        rx.concurrency.TestScheduler testScheduler40 = strTimedAction32.scheduler;
        long long41 = strTimedAction32.time;
        java.lang.String str42 = strTimedAction32.state;
        long long43 = strTimedAction32.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = strTimedAction32.action;
        rx.concurrency.TestScheduler testScheduler45 = strTimedAction32.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean46 = strTimedAction32.isCancelled;
        java.lang.String str47 = strTimedAction32.state;
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(testScheduler39);
        org.junit.Assert.assertNull(testScheduler40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_44);
        org.junit.Assert.assertNull(testScheduler45);
        org.junit.Assert.assertNotNull(atomicBoolean46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
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
        testScheduler0.settime(0L);
        long long17 = testScheduler0.time;
        long long18 = testScheduler0.now();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.gettime();
        testScheduler0.settime(32L);
        long long24 = testScheduler0.time;
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions(0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        testScheduler0.triggerActions((-1L));
        testScheduler0.time = 100;
        long long14 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction18 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 1L, schedulerFunc2_16, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction22 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_20, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction26 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 35L, schedulerFunc2_24, "");
        rx.concurrency.TestScheduler testScheduler27 = strTimedAction26.getscheduler();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(testScheduler27);
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
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
        testScheduler0.settime(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
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
        java.lang.String str37 = strTimedAction32.getstate();
        java.lang.String str38 = strTimedAction32.state;
        rx.concurrency.TestScheduler testScheduler39 = strTimedAction32.getscheduler();
        rx.concurrency.TestScheduler testScheduler40 = strTimedAction32.scheduler;
        long long41 = strTimedAction32.time;
        java.lang.String str42 = strTimedAction32.getstate();
        rx.concurrency.TestScheduler testScheduler43 = strTimedAction32.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean44 = strTimedAction32.getisCancelled();
        long long45 = strTimedAction32.gettime();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(testScheduler39);
        org.junit.Assert.assertNull(testScheduler40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(testScheduler43);
        org.junit.Assert.assertNotNull(atomicBoolean44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
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
        testScheduler0.settime((long) (short) 100);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        testScheduler0.time = (-1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.settime(0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_10, (long) (byte) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.time;
        long long8 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.settime((long) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.settime((long) (byte) 1);
        long long8 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
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
        java.lang.String str69 = strTimedAction67.getstate();
        rx.concurrency.TestScheduler testScheduler70 = strTimedAction67.getscheduler();
        rx.concurrency.TestScheduler testScheduler71 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_73 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction75 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler71, (long) (byte) -1, schedulerFunc2_73, "");
        java.lang.String str76 = strTimedAction75.state;
        java.lang.String str77 = strTimedAction75.state;
        int int78 = compareActionsByTime0.compare(strTimedAction67, strTimedAction75);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_79 = strTimedAction67.getaction();
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(testScheduler70);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNull(schedulerFunc2_79);
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        strTimedAction4.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.getaction();
        java.lang.String str9 = strTimedAction4.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.isCancelled;
        java.lang.String str11 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction4.scheduler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = testScheduler12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(testScheduler12);
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
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
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator32.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime34.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator35.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime39.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator42.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime44.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime48 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime48.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator49.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime50);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator47.thenComparing(wildcardTimedActionComparator51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator43.thenComparing(wildcardTimedActionComparator53);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = wildcardTimedActionComparator43.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator32.thenComparing(wildcardTimedActionComparator55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator4.thenComparing(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
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
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.time = 100L;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.time = 32L;
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        strTimedAction4.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.getaction();
        java.lang.String str9 = strTimedAction4.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.getisCancelled();
        long long11 = strTimedAction4.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean12 = strTimedAction4.isCancelled;
        long long13 = strTimedAction4.time;
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((-1L));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
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
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler testScheduler38 = new rx.concurrency.TestScheduler();
        testScheduler38.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_40 = null;
        rx.Subscription subscription41 = testScheduler38.schedule(schedulerFunc1_40);
        long long42 = testScheduler38.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue43 = testScheduler38.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_45 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction47 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler38, (long) (short) 10, schedulerFunc2_45, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean48 = strTimedAction47.getisCancelled();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime49 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = compareActionsByTime49.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator50.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime51.reversed();
        rx.concurrency.TestScheduler testScheduler54 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_56 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction58 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler54, (long) (byte) -1, schedulerFunc2_56, "");
        rx.concurrency.TestScheduler testScheduler59 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_61 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction63 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler59, (long) (byte) -1, schedulerFunc2_61, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean64 = strTimedAction63.isCancelled;
        rx.concurrency.TestScheduler testScheduler65 = strTimedAction63.getscheduler();
        int int66 = compareActionsByTime51.compare(strTimedAction58, strTimedAction63);
        rx.concurrency.TestScheduler testScheduler67 = strTimedAction63.getscheduler();
        long long68 = strTimedAction63.time;
        long long69 = strTimedAction63.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean70 = strTimedAction63.isCancelled;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean71 = strTimedAction63.isCancelled;
        int int72 = compareActionsByTime0.compare(strTimedAction47, strTimedAction63);
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
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(subscription41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue43);
        org.junit.Assert.assertNotNull(atomicBoolean48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(atomicBoolean64);
        org.junit.Assert.assertNull(testScheduler65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(testScheduler67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean70);
        org.junit.Assert.assertNotNull(atomicBoolean71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        testScheduler0.settime((long) (-1));
        long long17 = testScheduler0.now();
        long long18 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue19 = testScheduler0.queue;
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, 32L, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue19);
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_5 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction7 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 35L, schedulerFunc2_5, "");
        java.lang.String str8 = strTimedAction7.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = strTimedAction7.getaction();
        long long10 = strTimedAction7.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(schedulerFunc2_9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
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
        java.lang.String str69 = strTimedAction61.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_70 = strTimedAction61.getaction();
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNull(schedulerFunc2_70);
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) ' ', schedulerFunc2_7, "hi!");
        rx.concurrency.TestScheduler testScheduler10 = strTimedAction9.scheduler;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler10.schedulePeriodically(schedulerFunc1_11, (long) 100, (long) (short) -1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(testScheduler10);
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions((long) '4');
        long long8 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, 35L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        java.lang.String str6 = strTimedAction4.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.isCancelled;
        rx.concurrency.TestScheduler testScheduler8 = strTimedAction4.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean9 = strTimedAction4.isCancelled;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(atomicBoolean7);
        org.junit.Assert.assertNull(testScheduler8);
        org.junit.Assert.assertNotNull(atomicBoolean9);
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
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
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(subscriptionFunc0_13, (long) (byte) 100, (long) (short) -1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
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
        long long17 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 52L, schedulerFunc2_19, "hi!");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean22 = strTimedAction21.getisCancelled();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicBoolean22);
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
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
        testScheduler0.time = (short) -1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.queue;
        long long18 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(schedulerFunc1_19);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((-1L));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, 1L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        java.lang.Class<?> wildcardClass5 = wildcardTimedActionQueue4.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        long long5 = strTimedAction4.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.action;
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler8 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction4.action;
        long long11 = strTimedAction4.time;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(testScheduler8);
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.time = (short) 10;
        testScheduler0.triggerActions(100L);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        testScheduler0.settime(0L);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, 10L, 52L, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(schedulerFunc1_9);
        testScheduler0.time = '#';
        testScheduler0.settime((long) 100);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = strTimedAction14.getaction();
        strTimedAction14.cancel();
        long long20 = strTimedAction14.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean21 = strTimedAction14.getisCancelled();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(schedulerFunc2_18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean21);
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
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
        java.lang.String str38 = strTimedAction32.getstate();
        rx.concurrency.TestScheduler testScheduler39 = strTimedAction32.scheduler;
        long long40 = strTimedAction32.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_41 = strTimedAction32.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_42 = strTimedAction32.getaction();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(testScheduler39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_41);
        org.junit.Assert.assertNull(schedulerFunc2_42);
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
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
        long long85 = strTimedAction78.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_86 = strTimedAction78.action;
        rx.concurrency.TestScheduler testScheduler87 = strTimedAction78.scheduler;
        strTimedAction78.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_89 = strTimedAction78.action;
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
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_86);
        org.junit.Assert.assertNull(testScheduler87);
        org.junit.Assert.assertNull(schedulerFunc2_89);
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.time = (short) 10;
        testScheduler0.triggerActions(100L);
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(52L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
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
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime50.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime52 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator51.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime52);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = compareActionsByTime52.reversed();
        rx.concurrency.TestScheduler testScheduler55 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_57 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction59 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler55, (long) (byte) -1, schedulerFunc2_57, "");
        rx.concurrency.TestScheduler testScheduler60 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_62 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction64 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler60, (long) (byte) -1, schedulerFunc2_62, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean65 = strTimedAction64.isCancelled;
        rx.concurrency.TestScheduler testScheduler66 = strTimedAction64.getscheduler();
        int int67 = compareActionsByTime52.compare(strTimedAction59, strTimedAction64);
        rx.concurrency.TestScheduler testScheduler68 = strTimedAction64.getscheduler();
        long long69 = strTimedAction64.gettime();
        java.lang.String str70 = strTimedAction64.state;
        long long71 = strTimedAction64.gettime();
        java.lang.String str72 = strTimedAction64.state;
        long long73 = strTimedAction64.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean74 = strTimedAction64.getisCancelled();
        rx.concurrency.TestScheduler testScheduler75 = strTimedAction64.scheduler;
        rx.concurrency.TestScheduler testScheduler76 = strTimedAction64.scheduler;
        java.lang.String str77 = strTimedAction64.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_78 = strTimedAction64.getaction();
        rx.concurrency.TestScheduler testScheduler79 = new rx.concurrency.TestScheduler();
        testScheduler79.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_81 = null;
        rx.Subscription subscription82 = testScheduler79.schedule(schedulerFunc1_81);
        testScheduler79.settime(0L);
        rx.util.functions.Action0 action0_85 = null;
        rx.Subscription subscription86 = testScheduler79.schedule(action0_85);
        long long87 = testScheduler79.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_89 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction91 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler79, (long) (-1), schedulerFunc2_89, "hi!");
        long long92 = strTimedAction91.time;
        int int93 = compareActionsByTime10.compare(strTimedAction64, strTimedAction91);
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
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(atomicBoolean65);
        org.junit.Assert.assertNull(testScheduler66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(testScheduler68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean74);
        org.junit.Assert.assertNull(testScheduler75);
        org.junit.Assert.assertNull(testScheduler76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNull(schedulerFunc2_78);
        org.junit.Assert.assertNotNull(subscription82);
        org.junit.Assert.assertNotNull(subscription86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-1L) + "'", long92 == (-1L));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
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
        long long19 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        long long22 = testScheduler0.now();
        long long23 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler8 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction4.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.isCancelled;
        long long11 = strTimedAction4.gettime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertNull(testScheduler8);
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
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
        long long85 = strTimedAction61.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean86 = strTimedAction61.getisCancelled();
        long long87 = strTimedAction61.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean88 = strTimedAction61.isCancelled;
        java.lang.String str89 = strTimedAction61.getstate();
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
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
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
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean15 = strTimedAction14.isCancelled;
        long long16 = strTimedAction14.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction14.getaction();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime18.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime20.reversed();
        rx.concurrency.TestScheduler testScheduler23 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_25 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction27 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler23, (long) (byte) -1, schedulerFunc2_25, "");
        rx.concurrency.TestScheduler testScheduler28 = strTimedAction27.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = strTimedAction27.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = strTimedAction27.getaction();
        java.lang.String str31 = strTimedAction27.state;
        java.lang.String str32 = strTimedAction27.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean33 = strTimedAction27.isCancelled;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler35 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction39 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler35, (long) (byte) -1, schedulerFunc2_37, "");
        rx.concurrency.TestScheduler testScheduler40 = strTimedAction39.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_41 = strTimedAction39.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_42 = strTimedAction39.getaction();
        java.lang.String str43 = strTimedAction39.state;
        java.lang.String str44 = strTimedAction39.getstate();
        rx.concurrency.TestScheduler testScheduler45 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_47 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction49 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler45, (long) (byte) -1, schedulerFunc2_47, "");
        java.lang.String str50 = strTimedAction49.state;
        rx.concurrency.TestScheduler testScheduler51 = strTimedAction49.getscheduler();
        java.lang.String str52 = strTimedAction49.getstate();
        long long53 = strTimedAction49.time;
        int int54 = compareActionsByTime34.compare(strTimedAction39, strTimedAction49);
        rx.concurrency.TestScheduler testScheduler55 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_57 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction59 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler55, (long) (byte) -1, schedulerFunc2_57, "");
        java.lang.String str60 = strTimedAction59.state;
        java.lang.String str61 = strTimedAction59.state;
        rx.concurrency.TestScheduler testScheduler62 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_64 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction66 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler62, (long) (byte) -1, schedulerFunc2_64, "");
        long long67 = strTimedAction66.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_68 = strTimedAction66.getaction();
        int int69 = compareActionsByTime34.compare(strTimedAction59, strTimedAction66);
        strTimedAction59.cancel();
        int int71 = compareActionsByTime20.compare(strTimedAction27, strTimedAction59);
        int int72 = compareActionsByTime7.compare(strTimedAction14, strTimedAction27);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean73 = strTimedAction14.isCancelled;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_74 = strTimedAction14.getaction();
        rx.concurrency.TestScheduler testScheduler75 = strTimedAction14.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_76 = strTimedAction14.action;
        long long77 = strTimedAction14.gettime();
        long long78 = strTimedAction14.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_79 = strTimedAction14.action;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNull(testScheduler28);
        org.junit.Assert.assertNull(schedulerFunc2_29);
        org.junit.Assert.assertNull(schedulerFunc2_30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(atomicBoolean33);
        org.junit.Assert.assertNull(testScheduler40);
        org.junit.Assert.assertNull(schedulerFunc2_41);
        org.junit.Assert.assertNull(schedulerFunc2_42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(testScheduler51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean73);
        org.junit.Assert.assertNull(schedulerFunc2_74);
        org.junit.Assert.assertNull(testScheduler75);
        org.junit.Assert.assertNull(schedulerFunc2_76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_79);
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        long long5 = strTimedAction4.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.action;
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler8 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction4.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.isCancelled;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean11 = strTimedAction4.getisCancelled();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(testScheduler8);
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertNotNull(atomicBoolean11);
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        long long15 = testScheduler0.time;
        long long16 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        testScheduler0.time = 10;
        long long20 = testScheduler0.gettime();
        long long21 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(schedulerFunc1_22);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        long long4 = testScheduler0.now();
        testScheduler0.settime((long) (byte) 100);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction14.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction14.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction14.getaction();
        java.lang.String str18 = strTimedAction14.state;
        java.lang.String str19 = strTimedAction14.getstate();
        rx.concurrency.TestScheduler testScheduler20 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler20, (long) (byte) -1, schedulerFunc2_22, "");
        java.lang.String str25 = strTimedAction24.state;
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction24.getscheduler();
        java.lang.String str27 = strTimedAction24.getstate();
        long long28 = strTimedAction24.time;
        int int29 = compareActionsByTime9.compare(strTimedAction14, strTimedAction24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        rx.concurrency.TestScheduler testScheduler32 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction36 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler32, (long) (byte) -1, schedulerFunc2_34, "");
        rx.concurrency.TestScheduler testScheduler37 = strTimedAction36.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction36.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction36.getaction();
        java.lang.String str40 = strTimedAction36.state;
        java.lang.String str41 = strTimedAction36.getstate();
        rx.concurrency.TestScheduler testScheduler42 = new rx.concurrency.TestScheduler();
        testScheduler42.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_44 = null;
        rx.Subscription subscription45 = testScheduler42.schedule(schedulerFunc1_44);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue46 = testScheduler42.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_47 = null;
        rx.Subscription subscription48 = testScheduler42.schedule(schedulerFunc1_47);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction52 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (-1L), schedulerFunc2_50, "hi!");
        long long53 = strTimedAction52.gettime();
        int int54 = compareActionsByTime9.compare(strTimedAction36, strTimedAction52);
        long long55 = strTimedAction36.time;
        java.lang.String str56 = strTimedAction36.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean57 = strTimedAction36.isCancelled;
        long long58 = strTimedAction36.time;
        long long59 = strTimedAction36.gettime();
        java.lang.String str60 = strTimedAction36.getstate();
        java.lang.String str61 = strTimedAction36.state;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNull(testScheduler15);
        org.junit.Assert.assertNull(schedulerFunc2_16);
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNull(testScheduler37);
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(subscription45);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue46);
        org.junit.Assert.assertNotNull(subscription48);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(atomicBoolean57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator7);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
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
        strTimedAction32.cancel();
        strTimedAction32.cancel();
        strTimedAction32.cancel();
        rx.concurrency.TestScheduler testScheduler39 = strTimedAction32.scheduler;
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
        org.junit.Assert.assertNull(testScheduler39);
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
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
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean36 = strTimedAction25.getisCancelled();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = strTimedAction25.getaction();
        long long38 = strTimedAction25.time;
        java.lang.String str39 = strTimedAction25.getstate();
        long long40 = strTimedAction25.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_41 = strTimedAction25.getaction();
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
        org.junit.Assert.assertNotNull(atomicBoolean36);
        org.junit.Assert.assertNull(schedulerFunc2_37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_41);
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.time = 10;
        testScheduler0.time = 35L;
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        testScheduler0.settime((long) (-1));
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_14, 35L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        testScheduler0.time = 35L;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        java.lang.String str8 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction4.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.getisCancelled();
        long long11 = strTimedAction4.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean12 = strTimedAction4.isCancelled;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler14 = strTimedAction4.getscheduler();
        java.lang.String str15 = strTimedAction4.getstate();
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertNull(testScheduler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
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
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 0, schedulerFunc2_13, "");
        long long16 = strTimedAction15.gettime();
        strTimedAction15.cancel();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean18 = strTimedAction15.isCancelled;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = strTimedAction15.getaction();
        long long20 = strTimedAction15.gettime();
        rx.concurrency.TestScheduler testScheduler21 = strTimedAction15.getscheduler();
        testScheduler21.time = (byte) -1;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(atomicBoolean18);
        org.junit.Assert.assertNull(schedulerFunc2_19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(testScheduler21);
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 100L, schedulerFunc2_13, "");
        java.lang.String str16 = strTimedAction15.state;
        long long17 = strTimedAction15.time;
        strTimedAction15.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = strTimedAction15.getaction();
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction15.getscheduler();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler20.triggerActions((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNull(schedulerFunc2_19);
        org.junit.Assert.assertNotNull(testScheduler20);
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        java.lang.String str8 = strTimedAction4.getstate();
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler10 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = strTimedAction4.getaction();
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(testScheduler10);
        org.junit.Assert.assertNull(schedulerFunc2_11);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions(52L);
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
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime7);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator9);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime11 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime11.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime13.thenComparing(wildcardTimedActionComparator17);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator20.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator22.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime25.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator26.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator28.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime30.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime32);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator28.thenComparing(wildcardTimedActionComparator34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator22.thenComparing(wildcardTimedActionComparator34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime13.thenComparing(wildcardTimedActionComparator34);
        rx.concurrency.TestScheduler testScheduler38 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_40 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction42 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler38, (long) (byte) -1, schedulerFunc2_40, "");
        java.lang.String str43 = strTimedAction42.state;
        java.lang.String str44 = strTimedAction42.getstate();
        rx.concurrency.TestScheduler testScheduler45 = strTimedAction42.getscheduler();
        rx.concurrency.TestScheduler testScheduler46 = strTimedAction42.scheduler;
        strTimedAction42.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_48 = strTimedAction42.action;
        java.lang.String str49 = strTimedAction42.state;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime50.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime52 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator51.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime52);
        rx.concurrency.TestScheduler testScheduler54 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_56 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction58 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler54, (long) (byte) -1, schedulerFunc2_56, "");
        rx.concurrency.TestScheduler testScheduler59 = strTimedAction58.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_60 = strTimedAction58.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_61 = strTimedAction58.getaction();
        java.lang.String str62 = strTimedAction58.getstate();
        rx.concurrency.TestScheduler testScheduler63 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_65 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction67 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler63, (long) (byte) -1, schedulerFunc2_65, "");
        long long68 = strTimedAction67.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_69 = strTimedAction67.getaction();
        int int70 = compareActionsByTime52.compare(strTimedAction58, strTimedAction67);
        rx.concurrency.TestScheduler testScheduler71 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_73 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction75 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler71, (long) (byte) -1, schedulerFunc2_73, "");
        java.lang.String str76 = strTimedAction75.state;
        rx.concurrency.TestScheduler testScheduler77 = strTimedAction75.getscheduler();
        java.lang.String str78 = strTimedAction75.getstate();
        strTimedAction75.cancel();
        long long80 = strTimedAction75.gettime();
        rx.concurrency.TestScheduler testScheduler81 = new rx.concurrency.TestScheduler();
        testScheduler81.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_83 = null;
        rx.Subscription subscription84 = testScheduler81.schedule(schedulerFunc1_83);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue85 = testScheduler81.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_86 = null;
        rx.Subscription subscription87 = testScheduler81.schedule(schedulerFunc1_86);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_89 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction91 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler81, (-1L), schedulerFunc2_89, "hi!");
        long long92 = strTimedAction91.gettime();
        strTimedAction91.cancel();
        rx.concurrency.TestScheduler testScheduler94 = strTimedAction91.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_95 = strTimedAction91.getaction();
        int int96 = compareActionsByTime52.compare(strTimedAction75, strTimedAction91);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_97 = strTimedAction91.getaction();
        int int98 = compareActionsByTime13.compare(strTimedAction42, strTimedAction91);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator99 = compareActionsByTime13.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(testScheduler45);
        org.junit.Assert.assertNull(testScheduler46);
        org.junit.Assert.assertNull(schedulerFunc2_48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNull(testScheduler59);
        org.junit.Assert.assertNull(schedulerFunc2_60);
        org.junit.Assert.assertNull(schedulerFunc2_61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(testScheduler77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-1L) + "'", long80 == (-1L));
        org.junit.Assert.assertNotNull(subscription84);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue85);
        org.junit.Assert.assertNotNull(subscription87);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-1L) + "'", long92 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler94);
        org.junit.Assert.assertNull(schedulerFunc2_95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(schedulerFunc2_97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator99);
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (short) 1;
        testScheduler0.settime((-1L));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        long long15 = testScheduler0.time;
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue22 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue22);
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
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
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction16.getscheduler();
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction16.scheduler;
        long long19 = strTimedAction16.gettime();
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction16.scheduler;
        testScheduler20.settime((long) 'a');
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler20.schedule(subscriptionFunc0_23);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(testScheduler17);
        org.junit.Assert.assertNotNull(testScheduler18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(testScheduler20);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        testScheduler0.settime((long) (byte) -1);
        long long14 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) '4', schedulerFunc2_18, "");
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction14.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction14.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction14.getaction();
        java.lang.String str18 = strTimedAction14.state;
        java.lang.String str19 = strTimedAction14.getstate();
        rx.concurrency.TestScheduler testScheduler20 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler20, (long) (byte) -1, schedulerFunc2_22, "");
        java.lang.String str25 = strTimedAction24.state;
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction24.getscheduler();
        java.lang.String str27 = strTimedAction24.getstate();
        long long28 = strTimedAction24.time;
        int int29 = compareActionsByTime9.compare(strTimedAction14, strTimedAction24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        rx.concurrency.TestScheduler testScheduler32 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction36 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler32, (long) (byte) -1, schedulerFunc2_34, "");
        rx.concurrency.TestScheduler testScheduler37 = strTimedAction36.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction36.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction36.getaction();
        java.lang.String str40 = strTimedAction36.state;
        java.lang.String str41 = strTimedAction36.getstate();
        rx.concurrency.TestScheduler testScheduler42 = new rx.concurrency.TestScheduler();
        testScheduler42.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_44 = null;
        rx.Subscription subscription45 = testScheduler42.schedule(schedulerFunc1_44);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue46 = testScheduler42.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_47 = null;
        rx.Subscription subscription48 = testScheduler42.schedule(schedulerFunc1_47);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction52 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (-1L), schedulerFunc2_50, "hi!");
        long long53 = strTimedAction52.gettime();
        int int54 = compareActionsByTime9.compare(strTimedAction36, strTimedAction52);
        rx.concurrency.TestScheduler testScheduler55 = strTimedAction52.scheduler;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_56 = null;
        rx.Subscription subscription57 = testScheduler55.schedule(subscriptionFunc0_56);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_58 = null;
        rx.Subscription subscription59 = testScheduler55.schedule(subscriptionFunc0_58);
        long long60 = testScheduler55.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_62 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction64 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler55, (long) (short) 1, schedulerFunc2_62, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean65 = strTimedAction64.isCancelled;
        long long66 = strTimedAction64.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_67 = strTimedAction64.getaction();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNull(testScheduler15);
        org.junit.Assert.assertNull(schedulerFunc2_16);
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNull(testScheduler37);
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(subscription45);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue46);
        org.junit.Assert.assertNotNull(subscription48);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(testScheduler55);
        org.junit.Assert.assertNotNull(subscription57);
        org.junit.Assert.assertNotNull(subscription59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(atomicBoolean65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertNull(schedulerFunc2_67);
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler8 = strTimedAction4.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean9 = strTimedAction4.getisCancelled();
        rx.concurrency.TestScheduler testScheduler10 = strTimedAction4.scheduler;
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler8);
        org.junit.Assert.assertNotNull(atomicBoolean9);
        org.junit.Assert.assertNull(testScheduler10);
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_7, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((-1L));
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long3 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        testScheduler0.settime(0L);
        testScheduler0.settime((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_13, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.getqueue();
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
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_15, 10L, timeUnit17);
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
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler.TimedAction<java.lang.String>, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.reversed();
        rx.concurrency.TestScheduler testScheduler17 = new rx.concurrency.TestScheduler();
        testScheduler17.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler17.schedule(schedulerFunc1_19);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue21 = testScheduler17.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        rx.Subscription subscription23 = testScheduler17.schedule(schedulerFunc1_22);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_25 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction27 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler17, (-1L), schedulerFunc2_25, "hi!");
        rx.concurrency.TestScheduler testScheduler28 = new rx.concurrency.TestScheduler();
        testScheduler28.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_30 = null;
        rx.Subscription subscription31 = testScheduler28.schedule(schedulerFunc1_30);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue32 = testScheduler28.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_33 = null;
        rx.Subscription subscription34 = testScheduler28.schedule(schedulerFunc1_33);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_36 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction38 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler28, (-1L), schedulerFunc2_36, "hi!");
        long long39 = strTimedAction38.gettime();
        strTimedAction38.cancel();
        rx.concurrency.TestScheduler testScheduler41 = strTimedAction38.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_42 = strTimedAction38.getaction();
        rx.concurrency.TestScheduler testScheduler43 = strTimedAction38.scheduler;
        int int44 = compareActionsByTime14.compare(strTimedAction27, strTimedAction38);
        long long45 = strTimedAction27.time;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler47 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler47, (long) (byte) -1, schedulerFunc2_49, "");
        rx.concurrency.TestScheduler testScheduler52 = strTimedAction51.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_53 = strTimedAction51.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_54 = strTimedAction51.getaction();
        java.lang.String str55 = strTimedAction51.state;
        java.lang.String str56 = strTimedAction51.getstate();
        rx.concurrency.TestScheduler testScheduler57 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_59 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction61 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler57, (long) (byte) -1, schedulerFunc2_59, "");
        java.lang.String str62 = strTimedAction61.state;
        rx.concurrency.TestScheduler testScheduler63 = strTimedAction61.getscheduler();
        java.lang.String str64 = strTimedAction61.getstate();
        long long65 = strTimedAction61.time;
        int int66 = compareActionsByTime46.compare(strTimedAction51, strTimedAction61);
        rx.concurrency.TestScheduler testScheduler67 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_69 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction71 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler67, (long) (byte) -1, schedulerFunc2_69, "");
        java.lang.String str72 = strTimedAction71.state;
        java.lang.String str73 = strTimedAction71.state;
        rx.concurrency.TestScheduler testScheduler74 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_76 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction78 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler74, (long) (byte) -1, schedulerFunc2_76, "");
        long long79 = strTimedAction78.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_80 = strTimedAction78.getaction();
        int int81 = compareActionsByTime46.compare(strTimedAction71, strTimedAction78);
        rx.concurrency.TestScheduler testScheduler82 = strTimedAction78.scheduler;
        java.lang.String str83 = strTimedAction78.getstate();
        java.lang.String str84 = strTimedAction78.state;
        java.lang.String str85 = strTimedAction78.state;
        int int86 = compareActionsByTime10.compare(strTimedAction27, strTimedAction78);
        long long87 = strTimedAction27.gettime();
        strTimedAction27.cancel();
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler.TimedAction<java.lang.String>> strTimedActionTimedAction89 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler.TimedAction<java.lang.String>>(testScheduler0, (long) (short) 0, schedulerFunc2_9, strTimedAction27);
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription31);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue32);
        org.junit.Assert.assertNotNull(subscription34);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler41);
        org.junit.Assert.assertNull(schedulerFunc2_42);
        org.junit.Assert.assertNotNull(testScheduler43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNull(testScheduler52);
        org.junit.Assert.assertNull(schedulerFunc2_53);
        org.junit.Assert.assertNull(schedulerFunc2_54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNull(testScheduler63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(testScheduler82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
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
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction22 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (-1L), schedulerFunc2_20, "hi!");
        long long23 = strTimedAction22.gettime();
        java.lang.String str24 = strTimedAction22.state;
        rx.concurrency.TestScheduler testScheduler25 = strTimedAction22.getscheduler();
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction22.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_28 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction30 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler26, (long) (byte) 100, schedulerFunc2_28, "");
        long long31 = testScheduler26.gettime();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(testScheduler25);
        org.junit.Assert.assertNotNull(testScheduler26);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
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
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean15 = strTimedAction14.isCancelled;
        long long16 = strTimedAction14.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction14.getaction();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime18.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime20.reversed();
        rx.concurrency.TestScheduler testScheduler23 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_25 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction27 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler23, (long) (byte) -1, schedulerFunc2_25, "");
        rx.concurrency.TestScheduler testScheduler28 = strTimedAction27.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = strTimedAction27.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_30 = strTimedAction27.getaction();
        java.lang.String str31 = strTimedAction27.state;
        java.lang.String str32 = strTimedAction27.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean33 = strTimedAction27.isCancelled;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler35 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction39 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler35, (long) (byte) -1, schedulerFunc2_37, "");
        rx.concurrency.TestScheduler testScheduler40 = strTimedAction39.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_41 = strTimedAction39.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_42 = strTimedAction39.getaction();
        java.lang.String str43 = strTimedAction39.state;
        java.lang.String str44 = strTimedAction39.getstate();
        rx.concurrency.TestScheduler testScheduler45 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_47 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction49 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler45, (long) (byte) -1, schedulerFunc2_47, "");
        java.lang.String str50 = strTimedAction49.state;
        rx.concurrency.TestScheduler testScheduler51 = strTimedAction49.getscheduler();
        java.lang.String str52 = strTimedAction49.getstate();
        long long53 = strTimedAction49.time;
        int int54 = compareActionsByTime34.compare(strTimedAction39, strTimedAction49);
        rx.concurrency.TestScheduler testScheduler55 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_57 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction59 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler55, (long) (byte) -1, schedulerFunc2_57, "");
        java.lang.String str60 = strTimedAction59.state;
        java.lang.String str61 = strTimedAction59.state;
        rx.concurrency.TestScheduler testScheduler62 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_64 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction66 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler62, (long) (byte) -1, schedulerFunc2_64, "");
        long long67 = strTimedAction66.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_68 = strTimedAction66.getaction();
        int int69 = compareActionsByTime34.compare(strTimedAction59, strTimedAction66);
        strTimedAction59.cancel();
        int int71 = compareActionsByTime20.compare(strTimedAction27, strTimedAction59);
        int int72 = compareActionsByTime7.compare(strTimedAction14, strTimedAction27);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean73 = strTimedAction14.isCancelled;
        long long74 = strTimedAction14.time;
        strTimedAction14.cancel();
        strTimedAction14.cancel();
        java.lang.String str77 = strTimedAction14.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean78 = strTimedAction14.isCancelled;
        strTimedAction14.cancel();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNull(testScheduler28);
        org.junit.Assert.assertNull(schedulerFunc2_29);
        org.junit.Assert.assertNull(schedulerFunc2_30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(atomicBoolean33);
        org.junit.Assert.assertNull(testScheduler40);
        org.junit.Assert.assertNull(schedulerFunc2_41);
        org.junit.Assert.assertNull(schedulerFunc2_42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(testScheduler51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(atomicBoolean78);
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 0, schedulerFunc2_12, "hi!");
        java.lang.String str15 = strTimedAction14.getstate();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.time = '4';
        testScheduler0.triggerActions(35L);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
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
        java.lang.String str16 = strTimedAction15.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction15.action;
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction15.getscheduler();
        long long19 = testScheduler18.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler18.schedule(schedulerFunc1_20, (long) '4', timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertNotNull(testScheduler18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.time;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_19 = null;
        rx.concurrency.TestScheduler testScheduler20 = new rx.concurrency.TestScheduler();
        testScheduler20.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler20.schedule(schedulerFunc1_23);
        long long25 = testScheduler20.gettime();
        long long26 = testScheduler20.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue27 = testScheduler20.queue;
        testScheduler20.triggerActions((long) (-1));
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_30 = null;
        rx.Subscription subscription31 = testScheduler20.schedule(subscriptionFunc0_30);
        rx.util.functions.Action0 action0_32 = null;
        rx.Subscription subscription33 = testScheduler20.schedule(action0_32);
        testScheduler20.time = (short) 10;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction36 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, (long) (short) 0, schedulerFunc2_19, (rx.Scheduler) testScheduler20);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue27);
        org.junit.Assert.assertNotNull(subscription31);
        org.junit.Assert.assertNotNull(subscription33);
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.getscheduler();
        java.lang.String str8 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = strTimedAction4.action;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.getisCancelled();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = strTimedAction4.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean12 = strTimedAction4.getisCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strTimedAction4.toString();
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
        org.junit.Assert.assertNull(schedulerFunc2_11);
        org.junit.Assert.assertNotNull(atomicBoolean12);
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        testScheduler0.time = (short) -1;
        long long12 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler1 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_3 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction5 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler1, (long) (byte) -1, schedulerFunc2_3, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean6 = strTimedAction5.isCancelled;
        long long7 = strTimedAction5.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction5.action;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction14.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction14.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction14.getaction();
        java.lang.String str18 = strTimedAction14.state;
        java.lang.String str19 = strTimedAction14.getstate();
        rx.concurrency.TestScheduler testScheduler20 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler20, (long) (byte) -1, schedulerFunc2_22, "");
        java.lang.String str25 = strTimedAction24.state;
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction24.getscheduler();
        java.lang.String str27 = strTimedAction24.getstate();
        long long28 = strTimedAction24.time;
        int int29 = compareActionsByTime9.compare(strTimedAction14, strTimedAction24);
        rx.concurrency.TestScheduler testScheduler30 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_32 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction34 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler30, (long) (byte) -1, schedulerFunc2_32, "");
        java.lang.String str35 = strTimedAction34.state;
        java.lang.String str36 = strTimedAction34.state;
        rx.concurrency.TestScheduler testScheduler37 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction41 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) (byte) -1, schedulerFunc2_39, "");
        long long42 = strTimedAction41.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_43 = strTimedAction41.getaction();
        int int44 = compareActionsByTime9.compare(strTimedAction34, strTimedAction41);
        rx.concurrency.TestScheduler testScheduler45 = strTimedAction41.scheduler;
        java.lang.String str46 = strTimedAction41.getstate();
        java.lang.String str47 = strTimedAction41.state;
        int int48 = compareActionsByTime0.compare(strTimedAction5, strTimedAction41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = strTimedAction5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(atomicBoolean6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertNull(testScheduler15);
        org.junit.Assert.assertNull(schedulerFunc2_16);
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(testScheduler45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator11.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime12.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime18.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        rx.concurrency.TestScheduler testScheduler22 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction26 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler22, (long) (byte) -1, schedulerFunc2_24, "");
        rx.concurrency.TestScheduler testScheduler27 = strTimedAction26.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_28 = strTimedAction26.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = strTimedAction26.getaction();
        java.lang.String str30 = strTimedAction26.getstate();
        rx.concurrency.TestScheduler testScheduler31 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_33 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction35 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler31, (long) (byte) -1, schedulerFunc2_33, "");
        long long36 = strTimedAction35.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = strTimedAction35.getaction();
        int int38 = compareActionsByTime20.compare(strTimedAction26, strTimedAction35);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime12.thenComparing(wildcardTimedActionComparator40);
        rx.concurrency.TestScheduler testScheduler42 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction46 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (long) (byte) -1, schedulerFunc2_44, "");
        rx.concurrency.TestScheduler testScheduler47 = strTimedAction46.getscheduler();
        java.lang.String str48 = strTimedAction46.getstate();
        rx.concurrency.TestScheduler testScheduler49 = strTimedAction46.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean50 = strTimedAction46.isCancelled;
        rx.concurrency.TestScheduler testScheduler51 = strTimedAction46.scheduler;
        java.lang.String str52 = strTimedAction46.getstate();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = compareActionsByTime53.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.reversed();
        rx.concurrency.TestScheduler testScheduler58 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_60 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction62 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler58, (long) (byte) -1, schedulerFunc2_60, "");
        rx.concurrency.TestScheduler testScheduler63 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_65 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction67 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler63, (long) (byte) -1, schedulerFunc2_65, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean68 = strTimedAction67.isCancelled;
        rx.concurrency.TestScheduler testScheduler69 = strTimedAction67.getscheduler();
        int int70 = compareActionsByTime55.compare(strTimedAction62, strTimedAction67);
        java.lang.String str71 = strTimedAction62.getstate();
        int int72 = compareActionsByTime12.compare(strTimedAction46, strTimedAction62);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_73 = strTimedAction62.action;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNull(testScheduler27);
        org.junit.Assert.assertNull(schedulerFunc2_28);
        org.junit.Assert.assertNull(schedulerFunc2_29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNull(testScheduler47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(testScheduler49);
        org.junit.Assert.assertNotNull(atomicBoolean50);
        org.junit.Assert.assertNull(testScheduler51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(atomicBoolean68);
        org.junit.Assert.assertNull(testScheduler69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(schedulerFunc2_73);
    }

    @Test
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.Object, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.Object> objTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Object>(testScheduler0, (long) 10, schedulerFunc2_4, (java.lang.Object) (byte) 10);
        long long7 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) 100);
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.time;
        testScheduler0.settime((long) (byte) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_86 = strTimedAction73.getaction();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_87 = strTimedAction73.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean88 = strTimedAction73.getisCancelled();
        java.lang.String str89 = strTimedAction73.getstate();
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
        org.junit.Assert.assertNull(schedulerFunc2_86);
        org.junit.Assert.assertNull(schedulerFunc2_87);
        org.junit.Assert.assertNotNull(atomicBoolean88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.triggerActions((long) (-1));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.time = (-1L);
        long long11 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        long long8 = strTimedAction4.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = strTimedAction4.action;
        rx.concurrency.TestScheduler testScheduler10 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction4.scheduler;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_9);
        org.junit.Assert.assertNull(testScheduler10);
        org.junit.Assert.assertNull(testScheduler11);
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction14.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction14.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction14.getaction();
        java.lang.String str18 = strTimedAction14.state;
        java.lang.String str19 = strTimedAction14.getstate();
        rx.concurrency.TestScheduler testScheduler20 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler20, (long) (byte) -1, schedulerFunc2_22, "");
        java.lang.String str25 = strTimedAction24.state;
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction24.getscheduler();
        java.lang.String str27 = strTimedAction24.getstate();
        long long28 = strTimedAction24.time;
        int int29 = compareActionsByTime9.compare(strTimedAction14, strTimedAction24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        rx.concurrency.TestScheduler testScheduler32 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction36 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler32, (long) (byte) -1, schedulerFunc2_34, "");
        rx.concurrency.TestScheduler testScheduler37 = strTimedAction36.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction36.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction36.getaction();
        java.lang.String str40 = strTimedAction36.state;
        java.lang.String str41 = strTimedAction36.getstate();
        rx.concurrency.TestScheduler testScheduler42 = new rx.concurrency.TestScheduler();
        testScheduler42.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_44 = null;
        rx.Subscription subscription45 = testScheduler42.schedule(schedulerFunc1_44);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue46 = testScheduler42.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_47 = null;
        rx.Subscription subscription48 = testScheduler42.schedule(schedulerFunc1_47);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction52 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (-1L), schedulerFunc2_50, "hi!");
        long long53 = strTimedAction52.gettime();
        int int54 = compareActionsByTime9.compare(strTimedAction36, strTimedAction52);
        long long55 = strTimedAction36.time;
        java.lang.String str56 = strTimedAction36.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_57 = strTimedAction36.action;
        long long58 = strTimedAction36.gettime();
        strTimedAction36.cancel();
        long long60 = strTimedAction36.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_61 = strTimedAction36.getaction();
        rx.concurrency.TestScheduler testScheduler62 = strTimedAction36.scheduler;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNull(testScheduler15);
        org.junit.Assert.assertNull(schedulerFunc2_16);
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNull(testScheduler37);
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(subscription45);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue46);
        org.junit.Assert.assertNotNull(subscription48);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(schedulerFunc2_57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_61);
        org.junit.Assert.assertNull(testScheduler62);
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        testScheduler0.time = (-1L);
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_19, 1L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        long long3 = testScheduler0.now();
        testScheduler0.settime((long) (short) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        long long8 = strTimedAction4.gettime();
        java.lang.String str9 = strTimedAction4.state;
        long long10 = strTimedAction4.gettime();
        long long11 = strTimedAction4.time;
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction4.getscheduler();
        long long13 = strTimedAction4.time;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(testScheduler12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
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
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction9.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = strTimedAction9.action;
        java.lang.String str20 = strTimedAction9.getstate();
        java.lang.String str21 = strTimedAction9.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean22 = strTimedAction9.getisCancelled();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(testScheduler18);
        org.junit.Assert.assertNull(schedulerFunc2_19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(atomicBoolean22);
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
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
        java.lang.String str37 = strTimedAction32.getstate();
        java.lang.String str38 = strTimedAction32.state;
        java.lang.String str39 = strTimedAction32.state;
        java.lang.String str40 = strTimedAction32.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_41 = strTimedAction32.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean42 = strTimedAction32.isCancelled;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean43 = strTimedAction32.isCancelled;
        long long44 = strTimedAction32.gettime();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(schedulerFunc2_41);
        org.junit.Assert.assertNotNull(atomicBoolean42);
        org.junit.Assert.assertNotNull(atomicBoolean43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        long long11 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        long long13 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_7, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction9.action;
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction9.scheduler;
        strTimedAction9.cancel();
        long long13 = strTimedAction9.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = strTimedAction9.action;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertNotNull(testScheduler11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNull(schedulerFunc2_14);
    }

    @Test
    public void test18615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18615");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.now();
        testScheduler0.time = 100;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 0L, schedulerFunc2_8, "");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test18616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18616");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction8 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 0L, schedulerFunc2_6, "");
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction8.getscheduler();
        testScheduler9.settime((long) (short) 0);
        long long12 = testScheduler9.now();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(testScheduler9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test18617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18617");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        long long6 = strTimedAction4.gettime();
        long long7 = strTimedAction4.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.getaction();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = strTimedAction4.getaction();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction4.action;
        java.lang.String str11 = strTimedAction4.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean12 = strTimedAction4.isCancelled;
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction4.getscheduler();
        java.lang.String str14 = strTimedAction4.state;
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertNull(schedulerFunc2_9);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(atomicBoolean12);
        org.junit.Assert.assertNull(testScheduler13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18618");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean5 = strTimedAction4.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean6 = strTimedAction4.isCancelled;
        long long7 = strTimedAction4.gettime();
        long long8 = strTimedAction4.time;
        org.junit.Assert.assertNotNull(atomicBoolean5);
        org.junit.Assert.assertNotNull(atomicBoolean6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test18619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18619");
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
        java.lang.String str16 = strTimedAction15.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction15.action;
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction15.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.Comparable<java.lang.String>, rx.Subscription> schedulerFunc2_20 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.Comparable<java.lang.String>> strComparableTimedAction22 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Comparable<java.lang.String>>(testScheduler18, 97L, schedulerFunc2_20, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue23 = testScheduler18.queue;
        long long24 = testScheduler18.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue25 = testScheduler18.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_26 = null;
        rx.Subscription subscription27 = testScheduler18.schedule(schedulerFunc1_26);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction31 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler18, 0L, schedulerFunc2_29, "");
        testScheduler18.time = 100L;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertNotNull(testScheduler18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue25);
        org.junit.Assert.assertNotNull(subscription27);
    }

    @Test
    public void test18620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18620");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_21 = strTimedAction15.getaction();
        java.lang.String str22 = strTimedAction15.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean23 = strTimedAction15.isCancelled;
        long long24 = strTimedAction15.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean25 = strTimedAction15.isCancelled;
        long long26 = strTimedAction15.time;
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
        org.junit.Assert.assertNull(schedulerFunc2_21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(atomicBoolean23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test18621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18621");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, (long) (-1), schedulerFunc2_4, (java.lang.CharSequence) "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime((long) 1);
        long long10 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test18622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18622");
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
        long long17 = testScheduler0.time;
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test18623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18623");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        testScheduler0.time = ' ';
        long long9 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test18624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18624");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.time = 10;
        testScheduler0.time = 35L;
        testScheduler0.time = (short) 0;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test18625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18625");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator11.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime12.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime18.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        rx.concurrency.TestScheduler testScheduler22 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction26 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler22, (long) (byte) -1, schedulerFunc2_24, "");
        rx.concurrency.TestScheduler testScheduler27 = strTimedAction26.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_28 = strTimedAction26.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = strTimedAction26.getaction();
        java.lang.String str30 = strTimedAction26.getstate();
        rx.concurrency.TestScheduler testScheduler31 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_33 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction35 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler31, (long) (byte) -1, schedulerFunc2_33, "");
        long long36 = strTimedAction35.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = strTimedAction35.getaction();
        int int38 = compareActionsByTime20.compare(strTimedAction26, strTimedAction35);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime12.thenComparing(wildcardTimedActionComparator40);
        rx.concurrency.TestScheduler testScheduler42 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction46 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (long) (byte) -1, schedulerFunc2_44, "");
        rx.concurrency.TestScheduler testScheduler47 = strTimedAction46.getscheduler();
        java.lang.String str48 = strTimedAction46.getstate();
        rx.concurrency.TestScheduler testScheduler49 = strTimedAction46.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean50 = strTimedAction46.isCancelled;
        rx.concurrency.TestScheduler testScheduler51 = strTimedAction46.scheduler;
        java.lang.String str52 = strTimedAction46.getstate();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = compareActionsByTime53.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.reversed();
        rx.concurrency.TestScheduler testScheduler58 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_60 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction62 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler58, (long) (byte) -1, schedulerFunc2_60, "");
        rx.concurrency.TestScheduler testScheduler63 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_65 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction67 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler63, (long) (byte) -1, schedulerFunc2_65, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean68 = strTimedAction67.isCancelled;
        rx.concurrency.TestScheduler testScheduler69 = strTimedAction67.getscheduler();
        int int70 = compareActionsByTime55.compare(strTimedAction62, strTimedAction67);
        java.lang.String str71 = strTimedAction62.getstate();
        int int72 = compareActionsByTime12.compare(strTimedAction46, strTimedAction62);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean73 = strTimedAction62.getisCancelled();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNull(testScheduler27);
        org.junit.Assert.assertNull(schedulerFunc2_28);
        org.junit.Assert.assertNull(schedulerFunc2_29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNull(testScheduler47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(testScheduler49);
        org.junit.Assert.assertNotNull(atomicBoolean50);
        org.junit.Assert.assertNull(testScheduler51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(atomicBoolean68);
        org.junit.Assert.assertNull(testScheduler69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean73);
    }

    @Test
    public void test18626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18626");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.lang.String str7 = strTimedAction4.getstate();
        strTimedAction4.cancel();
        long long9 = strTimedAction4.gettime();
        strTimedAction4.cancel();
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction4.action;
        rx.concurrency.TestScheduler testScheduler14 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction4.getscheduler();
        strTimedAction4.cancel();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(testScheduler12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertNull(testScheduler14);
        org.junit.Assert.assertNull(testScheduler15);
    }

    @Test
    public void test18627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18627");
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
        long long24 = strTimedAction23.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_25 = strTimedAction23.action;
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction23.getscheduler();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNull(schedulerFunc2_25);
        org.junit.Assert.assertNotNull(testScheduler26);
    }

    @Test
    public void test18628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18628");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.time = '4';
        testScheduler0.triggerActions(35L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (short) 10);
        testScheduler0.settime((long) (short) 1);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction18 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 0L, schedulerFunc2_16, "");
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedulePeriodically(schedulerFunc1_19, (long) '4', (long) (short) 100, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test18629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18629");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(schedulerFunc1_5);
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(subscriptionFunc0_9, (long) (byte) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test18630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18630");
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
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        testScheduler0.settime((-1L));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue19 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit21);
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
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue19);
    }

    @Test
    public void test18631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18631");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator11.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime12.reversed();
        rx.concurrency.TestScheduler testScheduler17 = new rx.concurrency.TestScheduler();
        testScheduler17.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler17.schedule(action0_20);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler17, (long) 10, schedulerFunc2_23, "hi!");
        strTimedAction25.cancel();
        java.lang.String str27 = strTimedAction25.state;
        java.lang.String str28 = strTimedAction25.state;
        long long29 = strTimedAction25.time;
        rx.concurrency.TestScheduler testScheduler30 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_32 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction34 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler30, (long) (byte) -1, schedulerFunc2_32, "");
        strTimedAction34.cancel();
        rx.concurrency.TestScheduler testScheduler36 = strTimedAction34.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_37 = strTimedAction34.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction34.getaction();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction34.action;
        rx.concurrency.TestScheduler testScheduler40 = strTimedAction34.getscheduler();
        int int41 = compareActionsByTime12.compare(strTimedAction25, strTimedAction34);
        rx.concurrency.TestScheduler testScheduler42 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction46 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (long) (byte) -1, schedulerFunc2_44, "");
        java.lang.String str47 = strTimedAction46.state;
        java.lang.String str48 = strTimedAction46.getstate();
        rx.concurrency.TestScheduler testScheduler49 = strTimedAction46.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = strTimedAction46.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_51 = strTimedAction46.action;
        rx.concurrency.TestScheduler testScheduler52 = strTimedAction46.getscheduler();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = compareActionsByTime53.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.reversed();
        rx.concurrency.TestScheduler testScheduler58 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_60 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction62 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler58, (long) (byte) -1, schedulerFunc2_60, "");
        rx.concurrency.TestScheduler testScheduler63 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_65 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction67 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler63, (long) (byte) -1, schedulerFunc2_65, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean68 = strTimedAction67.isCancelled;
        rx.concurrency.TestScheduler testScheduler69 = strTimedAction67.getscheduler();
        int int70 = compareActionsByTime55.compare(strTimedAction62, strTimedAction67);
        rx.concurrency.TestScheduler testScheduler71 = strTimedAction67.getscheduler();
        long long72 = strTimedAction67.time;
        rx.concurrency.TestScheduler testScheduler73 = strTimedAction67.scheduler;
        java.lang.String str74 = strTimedAction67.getstate();
        java.lang.String str75 = strTimedAction67.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean76 = strTimedAction67.isCancelled;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_77 = strTimedAction67.getaction();
        long long78 = strTimedAction67.gettime();
        java.lang.String str79 = strTimedAction67.state;
        int int80 = compareActionsByTime12.compare(strTimedAction46, strTimedAction67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNull(testScheduler36);
        org.junit.Assert.assertNull(schedulerFunc2_37);
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertNull(testScheduler40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(testScheduler49);
        org.junit.Assert.assertNull(schedulerFunc2_50);
        org.junit.Assert.assertNull(schedulerFunc2_51);
        org.junit.Assert.assertNull(testScheduler52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(atomicBoolean68);
        org.junit.Assert.assertNull(testScheduler69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(testScheduler71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertNull(testScheduler73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(atomicBoolean76);
        org.junit.Assert.assertNull(schedulerFunc2_77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78 == (-1L));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test18632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18632");
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
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction16.getscheduler();
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction16.scheduler;
        java.lang.String str19 = strTimedAction16.getstate();
        strTimedAction16.cancel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(testScheduler17);
        org.junit.Assert.assertNotNull(testScheduler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18633");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.time = 10;
        testScheduler0.time = 35L;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test18634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18634");
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
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 0, schedulerFunc2_13, "");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction15.action;
        strTimedAction15.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = strTimedAction15.getaction();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNull(schedulerFunc2_16);
        org.junit.Assert.assertNull(schedulerFunc2_18);
    }

    @Test
    public void test18635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18635");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean5 = strTimedAction4.isCancelled;
        long long6 = strTimedAction4.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.action;
        long long9 = strTimedAction4.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.isCancelled;
        java.lang.String str11 = strTimedAction4.state;
        org.junit.Assert.assertNotNull(atomicBoolean5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18636");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.now();
        testScheduler0.time = 32L;
        long long13 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler, rx.Subscription> schedulerFunc2_15 = null;
        rx.concurrency.TestScheduler testScheduler16 = new rx.concurrency.TestScheduler();
        long long17 = testScheduler16.time;
        testScheduler16.settime((long) (short) 10);
        testScheduler16.time = 100;
        long long22 = testScheduler16.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler16.schedule(schedulerFunc1_23);
        testScheduler16.settime(100L);
        long long27 = testScheduler16.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction31 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (long) 'a', schedulerFunc2_29, "hi!");
        rx.concurrency.TestScheduler testScheduler32 = strTimedAction31.getscheduler();
        testScheduler32.time = 1;
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler> testSchedulerTimedAction35 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler>(testScheduler0, 10L, schedulerFunc2_15, testScheduler32);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_36 = null;
        rx.Subscription subscription37 = testScheduler0.schedule(schedulerFunc1_36);
        long long38 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_39 = null;
        rx.Subscription subscription40 = testScheduler0.schedule(action0_39);
        long long41 = testScheduler0.time;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(testScheduler32);
        org.junit.Assert.assertNotNull(subscription37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(subscription40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
    }

    @Test
    public void test18637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18637");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test18638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18638");
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
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator3.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator27.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime29.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator27.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime34.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator35.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator37.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime39.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime43 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime43.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime45 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator44.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator46.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator42.thenComparing(wildcardTimedActionComparator46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator38.thenComparing(wildcardTimedActionComparator48);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator38.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator27.thenComparing(wildcardTimedActionComparator50);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime52 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime52.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator53.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = wildcardTimedActionComparator53.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator50.thenComparing(wildcardTimedActionComparator55);
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
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
    }

    @Test
    public void test18639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18639");
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
        java.lang.String str37 = strTimedAction25.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction25.getaction();
        java.lang.String str39 = strTimedAction25.state;
        long long40 = strTimedAction25.gettime();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
    }

    @Test
    public void test18640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18640");
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
        testScheduler0.time = 10;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        testScheduler0.time = 10;
        testScheduler0.settime((long) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(schedulerFunc1_20);
        long long22 = testScheduler0.gettime();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test18641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18641");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.now();
        testScheduler0.time = 100;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        testScheduler0.time = 32L;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, 0L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test18642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18642");
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
        testScheduler0.time = (short) 0;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue19 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_21 = null;
        rx.concurrency.TestScheduler testScheduler22 = new rx.concurrency.TestScheduler();
        testScheduler22.triggerActions();
        testScheduler22.time = ' ';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue26 = testScheduler22.getqueue();
        long long27 = testScheduler22.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_28 = null;
        rx.Subscription subscription29 = testScheduler22.schedule(subscriptionFunc0_28);
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction30 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, (long) '#', schedulerFunc2_21, (rx.Scheduler) testScheduler22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_31 = null;
        java.util.concurrent.TimeUnit timeUnit34 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription35 = testScheduler22.schedulePeriodically(schedulerFunc1_31, (long) 10, (long) (byte) 0, timeUnit34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue19);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNotNull(subscription29);
    }

    @Test
    public void test18643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18643");
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
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean69 = strTimedAction61.isCancelled;
        strTimedAction61.cancel();
        strTimedAction61.cancel();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean72 = strTimedAction61.isCancelled;
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
        org.junit.Assert.assertNotNull(atomicBoolean69);
        org.junit.Assert.assertNotNull(atomicBoolean72);
    }

    @Test
    public void test18644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18644");
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
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction16.getscheduler();
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction16.scheduler;
        java.lang.String str19 = strTimedAction16.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = strTimedAction16.action;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(testScheduler17);
        org.junit.Assert.assertNotNull(testScheduler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(schedulerFunc2_20);
    }

    @Test
    public void test18645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18645");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.time = 100L;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 10, schedulerFunc2_9, "");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 10, schedulerFunc2_13, "hi!");
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test18646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18646");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        long long4 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 0L, schedulerFunc2_9, "");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 'a', schedulerFunc2_13, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test18647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18647");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.lang.String str7 = strTimedAction4.getstate();
        strTimedAction4.cancel();
        long long9 = strTimedAction4.gettime();
        strTimedAction4.cancel();
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction4.action;
        rx.concurrency.TestScheduler testScheduler14 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction4.scheduler;
        java.lang.String str16 = strTimedAction4.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean17 = strTimedAction4.isCancelled;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = strTimedAction4.action;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(testScheduler12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertNull(testScheduler14);
        org.junit.Assert.assertNull(testScheduler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(atomicBoolean17);
        org.junit.Assert.assertNull(schedulerFunc2_18);
    }

    @Test
    public void test18648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18648");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) -1);
        long long9 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_11 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction13 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, 100L, schedulerFunc2_11, (java.lang.CharSequence) "hi!");
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(subscriptionFunc0_14);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test18649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18649");
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
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 10, schedulerFunc2_17, "");
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction19.scheduler;
        rx.concurrency.TestScheduler testScheduler21 = strTimedAction19.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = strTimedAction19.action;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler20);
        org.junit.Assert.assertNotNull(testScheduler21);
        org.junit.Assert.assertNull(schedulerFunc2_22);
    }

    @Test
    public void test18650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18650");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 1;
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler.TimedAction<java.lang.String>, rx.Subscription> schedulerFunc2_4 = null;
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
        rx.concurrency.TestScheduler testScheduler26 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_28 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction30 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler26, (long) (byte) -1, schedulerFunc2_28, "");
        java.lang.String str31 = strTimedAction30.state;
        java.lang.String str32 = strTimedAction30.state;
        rx.concurrency.TestScheduler testScheduler33 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_35 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction37 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler33, (long) (byte) -1, schedulerFunc2_35, "");
        long long38 = strTimedAction37.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction37.getaction();
        int int40 = compareActionsByTime5.compare(strTimedAction30, strTimedAction37);
        rx.concurrency.TestScheduler testScheduler41 = strTimedAction37.scheduler;
        java.lang.String str42 = strTimedAction37.getstate();
        java.lang.String str43 = strTimedAction37.state;
        rx.concurrency.TestScheduler testScheduler44 = strTimedAction37.getscheduler();
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler.TimedAction<java.lang.String>> strTimedActionTimedAction45 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler.TimedAction<java.lang.String>>(testScheduler0, (long) 0, schedulerFunc2_4, strTimedAction37);
        strTimedAction37.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_47 = strTimedAction37.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean48 = strTimedAction37.getisCancelled();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(testScheduler41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(testScheduler44);
        org.junit.Assert.assertNull(schedulerFunc2_47);
        org.junit.Assert.assertNotNull(atomicBoolean48);
    }

    @Test
    public void test18651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18651");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions(0L);
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test18652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18652");
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
        rx.concurrency.TestScheduler testScheduler63 = strTimedAction51.getscheduler();
        java.lang.String str64 = strTimedAction51.getstate();
        strTimedAction51.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_66 = strTimedAction51.getaction();
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
        org.junit.Assert.assertNull(testScheduler63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(schedulerFunc2_66);
    }

    @Test
    public void test18653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18653");
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
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean47 = strTimedAction41.getisCancelled();
        rx.concurrency.TestScheduler testScheduler48 = strTimedAction41.scheduler;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler48.triggerActions((long) 1);
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
        org.junit.Assert.assertNotNull(atomicBoolean47);
        org.junit.Assert.assertNotNull(testScheduler48);
    }

    @Test
    public void test18654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18654");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        testScheduler0.settime((long) 1);
        testScheduler0.settime(10L);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 32L, schedulerFunc2_14, "");
        testScheduler0.settime(10L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test18655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18655");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        testScheduler0.settime((long) 1);
        long long11 = testScheduler0.gettime();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(schedulerFunc1_17, (long) (short) 10, (long) 100, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test18656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18656");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 0, schedulerFunc2_14, "");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction16.action;
        strTimedAction16.cancel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNull(schedulerFunc2_17);
    }

    @Test
    public void test18657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18657");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.action;
        strTimedAction4.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction4.action;
        long long11 = strTimedAction4.time;
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test18658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18658");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.time = (short) -1;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction18 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) '4', schedulerFunc2_16, "hi!");
        java.lang.Class<?> wildcardClass19 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test18659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18659");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.getscheduler();
        java.lang.String str8 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = strTimedAction4.action;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.getisCancelled();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = strTimedAction4.getaction();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strTimedAction4.toString();
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
        org.junit.Assert.assertNull(schedulerFunc2_11);
    }

    @Test
    public void test18660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18660");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction14.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction14.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction14.getaction();
        java.lang.String str18 = strTimedAction14.state;
        java.lang.String str19 = strTimedAction14.getstate();
        rx.concurrency.TestScheduler testScheduler20 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler20, (long) (byte) -1, schedulerFunc2_22, "");
        java.lang.String str25 = strTimedAction24.state;
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction24.getscheduler();
        java.lang.String str27 = strTimedAction24.getstate();
        long long28 = strTimedAction24.time;
        int int29 = compareActionsByTime9.compare(strTimedAction14, strTimedAction24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime9.reversed();
        rx.concurrency.TestScheduler testScheduler33 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_35 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction37 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler33, (long) (byte) -1, schedulerFunc2_35, "");
        java.lang.String str38 = strTimedAction37.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction37.getaction();
        rx.concurrency.TestScheduler testScheduler40 = strTimedAction37.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_41 = strTimedAction37.action;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler43 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_45 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction47 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler43, (long) (byte) -1, schedulerFunc2_45, "");
        rx.concurrency.TestScheduler testScheduler48 = strTimedAction47.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = strTimedAction47.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = strTimedAction47.getaction();
        java.lang.String str51 = strTimedAction47.state;
        java.lang.String str52 = strTimedAction47.getstate();
        rx.concurrency.TestScheduler testScheduler53 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_55 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction57 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler53, (long) (byte) -1, schedulerFunc2_55, "");
        java.lang.String str58 = strTimedAction57.state;
        rx.concurrency.TestScheduler testScheduler59 = strTimedAction57.getscheduler();
        java.lang.String str60 = strTimedAction57.getstate();
        long long61 = strTimedAction57.time;
        int int62 = compareActionsByTime42.compare(strTimedAction47, strTimedAction57);
        rx.concurrency.TestScheduler testScheduler63 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_65 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction67 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler63, (long) (byte) -1, schedulerFunc2_65, "");
        java.lang.String str68 = strTimedAction67.state;
        java.lang.String str69 = strTimedAction67.state;
        rx.concurrency.TestScheduler testScheduler70 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_72 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction74 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler70, (long) (byte) -1, schedulerFunc2_72, "");
        long long75 = strTimedAction74.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_76 = strTimedAction74.getaction();
        int int77 = compareActionsByTime42.compare(strTimedAction67, strTimedAction74);
        rx.concurrency.TestScheduler testScheduler78 = strTimedAction74.scheduler;
        java.lang.String str79 = strTimedAction74.getstate();
        java.lang.String str80 = strTimedAction74.state;
        rx.concurrency.TestScheduler testScheduler81 = strTimedAction74.getscheduler();
        rx.concurrency.TestScheduler testScheduler82 = strTimedAction74.scheduler;
        rx.concurrency.TestScheduler testScheduler83 = strTimedAction74.getscheduler();
        rx.concurrency.TestScheduler testScheduler84 = strTimedAction74.getscheduler();
        int int85 = compareActionsByTime9.compare(strTimedAction37, strTimedAction74);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_86 = strTimedAction37.getaction();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNull(testScheduler15);
        org.junit.Assert.assertNull(schedulerFunc2_16);
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertNull(testScheduler40);
        org.junit.Assert.assertNull(schedulerFunc2_41);
        org.junit.Assert.assertNull(testScheduler48);
        org.junit.Assert.assertNull(schedulerFunc2_49);
        org.junit.Assert.assertNull(schedulerFunc2_50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(testScheduler59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(testScheduler78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNull(testScheduler81);
        org.junit.Assert.assertNull(testScheduler82);
        org.junit.Assert.assertNull(testScheduler83);
        org.junit.Assert.assertNull(testScheduler84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(schedulerFunc2_86);
    }

    @Test
    public void test18661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18661");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        strTimedAction4.cancel();
        java.lang.String str8 = strTimedAction4.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean9 = strTimedAction4.getisCancelled();
        java.lang.String str10 = strTimedAction4.getstate();
        long long11 = strTimedAction4.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction4.getaction();
        long long13 = strTimedAction4.gettime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(atomicBoolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test18662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18662");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.Object, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler testScheduler14 = new rx.concurrency.TestScheduler();
        testScheduler14.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler14.schedule(schedulerFunc1_16);
        testScheduler14.settime(0L);
        long long20 = testScheduler14.time;
        rx.concurrency.TestScheduler.TimedAction<java.lang.Object> objTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Object>(testScheduler0, (long) (byte) 1, schedulerFunc2_13, (java.lang.Object) testScheduler14);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue22 = testScheduler14.getqueue();
        testScheduler14.settime(0L);
        testScheduler14.settime(52L);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_27 = null;
        rx.Subscription subscription28 = testScheduler14.schedule(subscriptionFunc0_27);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_29 = null;
        java.util.concurrent.TimeUnit timeUnit31 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription32 = testScheduler14.schedule(subscriptionFunc0_29, (long) (-1), timeUnit31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue22);
        org.junit.Assert.assertNotNull(subscription28);
    }

    @Test
    public void test18663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18663");
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
        long long14 = testScheduler12.now();
        testScheduler12.settime(32L);
        long long17 = testScheduler12.gettime();
        long long18 = testScheduler12.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(testScheduler12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test18664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18664");
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
        java.lang.String str15 = strTimedAction10.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction10.action;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction10.scheduler;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(testScheduler13);
        org.junit.Assert.assertNull(schedulerFunc2_14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(schedulerFunc2_16);
        org.junit.Assert.assertNotNull(testScheduler17);
    }

    @Test
    public void test18665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18665");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        long long5 = strTimedAction4.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean6 = strTimedAction4.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.isCancelled;
        long long8 = strTimedAction4.gettime();
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction4.scheduler;
        java.lang.String str10 = strTimedAction4.state;
        java.lang.String str11 = strTimedAction4.state;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean6);
        org.junit.Assert.assertNotNull(atomicBoolean7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18666");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_7, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction9.action;
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction9.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean12 = strTimedAction9.getisCancelled();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction9.getscheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler13.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler13.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler13.queue;
        long long17 = testScheduler13.time;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertNotNull(testScheduler11);
        org.junit.Assert.assertNotNull(atomicBoolean12);
        org.junit.Assert.assertNotNull(testScheduler13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test18667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18667");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler10 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler10, (long) (byte) -1, schedulerFunc2_12, "");
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction14.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction14.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = strTimedAction14.getaction();
        java.lang.String str18 = strTimedAction14.state;
        java.lang.String str19 = strTimedAction14.getstate();
        rx.concurrency.TestScheduler testScheduler20 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler20, (long) (byte) -1, schedulerFunc2_22, "");
        java.lang.String str25 = strTimedAction24.state;
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction24.getscheduler();
        java.lang.String str27 = strTimedAction24.getstate();
        long long28 = strTimedAction24.time;
        int int29 = compareActionsByTime9.compare(strTimedAction14, strTimedAction24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        rx.concurrency.TestScheduler testScheduler32 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction36 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler32, (long) (byte) -1, schedulerFunc2_34, "");
        rx.concurrency.TestScheduler testScheduler37 = strTimedAction36.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction36.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction36.getaction();
        java.lang.String str40 = strTimedAction36.state;
        java.lang.String str41 = strTimedAction36.getstate();
        rx.concurrency.TestScheduler testScheduler42 = new rx.concurrency.TestScheduler();
        testScheduler42.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_44 = null;
        rx.Subscription subscription45 = testScheduler42.schedule(schedulerFunc1_44);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue46 = testScheduler42.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_47 = null;
        rx.Subscription subscription48 = testScheduler42.schedule(schedulerFunc1_47);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction52 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (-1L), schedulerFunc2_50, "hi!");
        long long53 = strTimedAction52.gettime();
        int int54 = compareActionsByTime9.compare(strTimedAction36, strTimedAction52);
        rx.concurrency.TestScheduler testScheduler55 = new rx.concurrency.TestScheduler();
        testScheduler55.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_58 = null;
        rx.Subscription subscription59 = testScheduler55.schedule(action0_58);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_61 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction63 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler55, (long) 10, schedulerFunc2_61, "hi!");
        strTimedAction63.cancel();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean65 = strTimedAction63.getisCancelled();
        rx.concurrency.TestScheduler testScheduler66 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_68 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction70 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler66, (long) (byte) -1, schedulerFunc2_68, "");
        java.lang.String str71 = strTimedAction70.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_72 = strTimedAction70.getaction();
        strTimedAction70.cancel();
        java.lang.String str74 = strTimedAction70.state;
        long long75 = strTimedAction70.gettime();
        strTimedAction70.cancel();
        java.lang.String str77 = strTimedAction70.state;
        int int78 = compareActionsByTime9.compare(strTimedAction63, strTimedAction70);
        java.lang.String str79 = strTimedAction63.state;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNull(testScheduler15);
        org.junit.Assert.assertNull(schedulerFunc2_16);
        org.junit.Assert.assertNull(schedulerFunc2_17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(testScheduler26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNull(testScheduler37);
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(subscription45);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue46);
        org.junit.Assert.assertNotNull(subscription48);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(subscription59);
        org.junit.Assert.assertNotNull(atomicBoolean65);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(schedulerFunc2_72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test18668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18668");
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
        long long13 = strTimedAction11.time;
        long long14 = strTimedAction11.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_15 = strTimedAction11.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean16 = strTimedAction11.getisCancelled();
        java.lang.String str17 = strTimedAction11.getstate();
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction11.scheduler;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(testScheduler12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(schedulerFunc2_15);
        org.junit.Assert.assertNotNull(atomicBoolean16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(testScheduler18);
    }

    @Test
    public void test18669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18669");
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
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction16.getscheduler();
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction16.scheduler;
        rx.concurrency.TestScheduler testScheduler19 = strTimedAction16.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = strTimedAction16.action;
        rx.concurrency.TestScheduler testScheduler21 = strTimedAction16.scheduler;
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction16.getscheduler();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(testScheduler17);
        org.junit.Assert.assertNotNull(testScheduler18);
        org.junit.Assert.assertNotNull(testScheduler19);
        org.junit.Assert.assertNull(schedulerFunc2_20);
        org.junit.Assert.assertNotNull(testScheduler21);
        org.junit.Assert.assertNotNull(testScheduler22);
    }

    @Test
    public void test18670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18670");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime3.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler7 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler7, (long) (byte) -1, schedulerFunc2_9, "");
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction11.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction11.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = strTimedAction11.getaction();
        java.lang.String str15 = strTimedAction11.state;
        java.lang.String str16 = strTimedAction11.getstate();
        rx.concurrency.TestScheduler testScheduler17 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler17, (long) (byte) -1, schedulerFunc2_19, "");
        java.lang.String str22 = strTimedAction21.state;
        rx.concurrency.TestScheduler testScheduler23 = strTimedAction21.getscheduler();
        java.lang.String str24 = strTimedAction21.getstate();
        long long25 = strTimedAction21.time;
        int int26 = compareActionsByTime6.compare(strTimedAction11, strTimedAction21);
        rx.concurrency.TestScheduler testScheduler27 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction31 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler27, (long) (byte) -1, schedulerFunc2_29, "");
        java.lang.String str32 = strTimedAction31.state;
        java.lang.String str33 = strTimedAction31.state;
        rx.concurrency.TestScheduler testScheduler34 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_36 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction38 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler34, (long) (byte) -1, schedulerFunc2_36, "");
        long long39 = strTimedAction38.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_40 = strTimedAction38.getaction();
        int int41 = compareActionsByTime6.compare(strTimedAction31, strTimedAction38);
        rx.concurrency.TestScheduler testScheduler42 = new rx.concurrency.TestScheduler();
        testScheduler42.triggerActions();
        long long44 = testScheduler42.time;
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_46 = null;
        rx.concurrency.TestScheduler testScheduler47 = new rx.concurrency.TestScheduler();
        testScheduler47.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_49 = null;
        rx.Subscription subscription50 = testScheduler47.schedule(schedulerFunc1_49);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue51 = testScheduler47.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_52 = null;
        rx.Subscription subscription53 = testScheduler47.schedule(schedulerFunc1_52);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction54 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler42, (long) (byte) 0, schedulerFunc2_46, subscription53);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue55 = testScheduler42.queue;
        testScheduler42.settime((long) 0);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_59 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction61 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (-1L), schedulerFunc2_59, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_63 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction65 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (long) ' ', schedulerFunc2_63, "hi!");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean66 = strTimedAction65.getisCancelled();
        rx.concurrency.TestScheduler testScheduler67 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_69 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction71 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler67, (long) (byte) -1, schedulerFunc2_69, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean72 = strTimedAction71.isCancelled;
        rx.concurrency.TestScheduler testScheduler73 = strTimedAction71.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean74 = strTimedAction71.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean75 = strTimedAction71.isCancelled;
        java.lang.String str76 = strTimedAction71.state;
        int int77 = compareActionsByTime6.compare(strTimedAction65, strTimedAction71);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = compareActionsByTime6.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator1.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNull(testScheduler12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertNull(schedulerFunc2_14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(testScheduler23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(subscription50);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue51);
        org.junit.Assert.assertNotNull(subscription53);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue55);
        org.junit.Assert.assertNotNull(atomicBoolean66);
        org.junit.Assert.assertNotNull(atomicBoolean72);
        org.junit.Assert.assertNull(testScheduler73);
        org.junit.Assert.assertNotNull(atomicBoolean74);
        org.junit.Assert.assertNotNull(atomicBoolean75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
    }

    @Test
    public void test18671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18671");
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
        long long11 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(52L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test18672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18672");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.time;
        testScheduler0.time = 100;
        long long12 = testScheduler0.time;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test18673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18673");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        java.lang.String str6 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean9 = strTimedAction4.getisCancelled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertNotNull(atomicBoolean9);
    }

    @Test
    public void test18674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18674");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        long long5 = strTimedAction4.time;
        java.lang.String str6 = strTimedAction4.state;
        java.lang.String str7 = strTimedAction4.getstate();
        java.lang.String str8 = strTimedAction4.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean9 = strTimedAction4.getisCancelled();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(atomicBoolean9);
    }

    @Test
    public void test18675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18675");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 0, schedulerFunc2_14, "");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_18, (long) 'a', timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test18676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18676");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler5 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler5, (long) (byte) -1, schedulerFunc2_7, "");
        rx.concurrency.TestScheduler testScheduler10 = strTimedAction9.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = strTimedAction9.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = strTimedAction9.getaction();
        java.lang.String str13 = strTimedAction9.state;
        java.lang.String str14 = strTimedAction9.getstate();
        rx.concurrency.TestScheduler testScheduler15 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler15, (long) (byte) -1, schedulerFunc2_17, "");
        java.lang.String str20 = strTimedAction19.state;
        rx.concurrency.TestScheduler testScheduler21 = strTimedAction19.getscheduler();
        java.lang.String str22 = strTimedAction19.getstate();
        long long23 = strTimedAction19.time;
        int int24 = compareActionsByTime4.compare(strTimedAction9, strTimedAction19);
        rx.concurrency.TestScheduler testScheduler25 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_27 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction29 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler25, (long) (byte) -1, schedulerFunc2_27, "");
        java.lang.String str30 = strTimedAction29.state;
        java.lang.String str31 = strTimedAction29.state;
        rx.concurrency.TestScheduler testScheduler32 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_34 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction36 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler32, (long) (byte) -1, schedulerFunc2_34, "");
        long long37 = strTimedAction36.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction36.getaction();
        int int39 = compareActionsByTime4.compare(strTimedAction29, strTimedAction36);
        rx.concurrency.TestScheduler testScheduler40 = strTimedAction36.scheduler;
        java.lang.String str41 = strTimedAction36.getstate();
        java.lang.String str42 = strTimedAction36.state;
        rx.concurrency.TestScheduler testScheduler43 = strTimedAction36.getscheduler();
        rx.concurrency.TestScheduler testScheduler44 = strTimedAction36.scheduler;
        long long45 = strTimedAction36.time;
        java.lang.String str46 = strTimedAction36.state;
        java.lang.String str47 = strTimedAction36.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_48 = strTimedAction36.getaction();
        rx.concurrency.TestScheduler testScheduler49 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_51 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction53 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler49, (long) (byte) -1, schedulerFunc2_51, "");
        java.lang.String str54 = strTimedAction53.getstate();
        rx.concurrency.TestScheduler testScheduler55 = strTimedAction53.scheduler;
        rx.concurrency.TestScheduler testScheduler56 = strTimedAction53.scheduler;
        long long57 = strTimedAction53.gettime();
        java.lang.String str58 = strTimedAction53.getstate();
        rx.concurrency.TestScheduler testScheduler59 = strTimedAction53.getscheduler();
        rx.concurrency.TestScheduler testScheduler60 = strTimedAction53.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean61 = strTimedAction53.isCancelled;
        int int62 = compareActionsByTime0.compare(strTimedAction36, strTimedAction53);
        rx.concurrency.TestScheduler testScheduler63 = strTimedAction36.getscheduler();
        strTimedAction36.cancel();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = strTimedAction36.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNull(testScheduler10);
        org.junit.Assert.assertNull(schedulerFunc2_11);
        org.junit.Assert.assertNull(schedulerFunc2_12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(testScheduler21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(testScheduler40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(testScheduler43);
        org.junit.Assert.assertNull(testScheduler44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(schedulerFunc2_48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(testScheduler55);
        org.junit.Assert.assertNull(testScheduler56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(testScheduler59);
        org.junit.Assert.assertNull(testScheduler60);
        org.junit.Assert.assertNotNull(atomicBoolean61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(testScheduler63);
    }

    @Test
    public void test18677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18677");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = (short) 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        long long9 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_11, (long) 'a', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test18678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18678");
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
        java.lang.String str37 = strTimedAction32.getstate();
        java.lang.String str38 = strTimedAction32.state;
        rx.concurrency.TestScheduler testScheduler39 = strTimedAction32.getscheduler();
        rx.concurrency.TestScheduler testScheduler40 = strTimedAction32.scheduler;
        long long41 = strTimedAction32.time;
        long long42 = strTimedAction32.gettime();
        long long43 = strTimedAction32.gettime();
        long long44 = strTimedAction32.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_45 = strTimedAction32.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_46 = strTimedAction32.action;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = strTimedAction32.toString();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(testScheduler39);
        org.junit.Assert.assertNull(testScheduler40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_45);
        org.junit.Assert.assertNull(schedulerFunc2_46);
    }

    @Test
    public void test18679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18679");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions(35L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
    }

    @Test
    public void test18680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18680");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((-1L));
        long long7 = testScheduler0.now();
        testScheduler0.time = 52L;
        testScheduler0.time = 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test18681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18681");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        long long18 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(subscriptionFunc0_19);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(schedulerFunc1_21);
        long long23 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_25 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction27 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 10L, schedulerFunc2_25, "");
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
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test18682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18682");
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
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test18683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18683");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, (long) (-1), schedulerFunc2_4, (java.lang.CharSequence) "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime((long) 1);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 10, schedulerFunc2_14, "");
        testScheduler0.triggerActions((long) (short) -1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test18684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18684");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 0, schedulerFunc2_14, "");
        java.lang.String str17 = strTimedAction16.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean18 = strTimedAction16.getisCancelled();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(atomicBoolean18);
    }

    @Test
    public void test18685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18685");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_14, "hi!");
        java.lang.String str17 = strTimedAction16.getstate();
        rx.concurrency.TestScheduler testScheduler18 = strTimedAction16.scheduler;
        long long19 = testScheduler18.now();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler18.advanceTimeBy((long) (short) 0, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(testScheduler18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test18686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18686");
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
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean21 = strTimedAction8.getisCancelled();
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction8.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = strTimedAction8.action;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = strTimedAction8.toString();
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
        org.junit.Assert.assertNotNull(atomicBoolean21);
        org.junit.Assert.assertNull(testScheduler22);
        org.junit.Assert.assertNull(schedulerFunc2_23);
    }

    @Test
    public void test18687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18687");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler8 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction4.scheduler;
        strTimedAction4.cancel();
        strTimedAction4.cancel();
        java.lang.String str12 = strTimedAction4.getstate();
        java.lang.String str13 = strTimedAction4.getstate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertNull(testScheduler8);
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18688");
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
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator79.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator80.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = wildcardTimedActionComparator80.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = wildcardTimedActionComparator82.reversed();
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
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator83);
    }

    @Test
    public void test18689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18689");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((-1L));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test18690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18690");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.time = (short) 0;
        long long8 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        long long10 = testScheduler0.time;
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, 10L, (long) 'a', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test18691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18691");
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
        java.lang.String str17 = strTimedAction16.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = strTimedAction16.getaction();
        java.lang.String str19 = strTimedAction16.state;
        long long20 = strTimedAction16.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_21 = strTimedAction16.getaction();
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction16.scheduler;
        long long23 = testScheduler22.time;
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler22.schedule(action0_24);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(schedulerFunc2_18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNull(schedulerFunc2_21);
        org.junit.Assert.assertNotNull(testScheduler22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test18692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18692");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        testScheduler0.triggerActions((long) 0);
        long long16 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        testScheduler0.settime((long) '4');
        testScheduler0.time = ' ';
        testScheduler0.time = 100;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test18693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18693");
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
        rx.concurrency.TestScheduler testScheduler24 = strTimedAction23.scheduler;
        rx.concurrency.TestScheduler testScheduler25 = strTimedAction23.getscheduler();
        testScheduler25.triggerActions(10L);
        long long28 = testScheduler25.gettime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(testScheduler24);
        org.junit.Assert.assertNotNull(testScheduler25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test18694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18694");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = strTimedAction19.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean21 = strTimedAction19.getisCancelled();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNull(schedulerFunc2_20);
        org.junit.Assert.assertNotNull(atomicBoolean21);
    }

    @Test
    public void test18695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18695");
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
        testScheduler0.settime(0L);
        long long17 = testScheduler0.time;
        long long18 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.Comparable<java.lang.String>, rx.Subscription> schedulerFunc2_20 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.Comparable<java.lang.String>> strComparableTimedAction22 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Comparable<java.lang.String>>(testScheduler0, (long) ' ', schedulerFunc2_20, (java.lang.Comparable<java.lang.String>) "");
        long long23 = testScheduler0.time;
        testScheduler0.settime((long) (byte) 10);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test18696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18696");
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
        strTimedAction14.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = strTimedAction14.getaction();
        java.lang.String str21 = strTimedAction14.state;
        long long22 = strTimedAction14.gettime();
        java.lang.String str23 = strTimedAction14.getstate();
        strTimedAction14.cancel();
        rx.concurrency.TestScheduler testScheduler25 = strTimedAction14.scheduler;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(testScheduler18);
        org.junit.Assert.assertNull(schedulerFunc2_20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(testScheduler25);
    }

    @Test
    public void test18697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18697");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (byte) -1);
        long long7 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(52L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test18698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18698");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.getscheduler();
        long long8 = strTimedAction4.gettime();
        java.lang.String str9 = strTimedAction4.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.isCancelled;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean11 = strTimedAction4.isCancelled;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean12 = strTimedAction4.isCancelled;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction4.getaction();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertNotNull(atomicBoolean11);
        org.junit.Assert.assertNotNull(atomicBoolean12);
        org.junit.Assert.assertNull(schedulerFunc2_13);
    }

    @Test
    public void test18699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18699");
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
        long long16 = strTimedAction15.time;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction15.getscheduler();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler17.schedule(action0_18);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler17.schedule(action0_20);
        long long22 = testScheduler17.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertNotNull(testScheduler17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test18700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18700");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        testScheduler0.time = 10L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.queue;
        long long18 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(35L, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test18701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18701");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test18702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18702");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.action;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = strTimedAction4.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean11 = strTimedAction4.getisCancelled();
        long long12 = strTimedAction4.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = strTimedAction4.action;
        rx.concurrency.TestScheduler testScheduler14 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_15 = strTimedAction4.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_16 = strTimedAction4.getaction();
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertNull(schedulerFunc2_9);
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertNotNull(atomicBoolean11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_13);
        org.junit.Assert.assertNull(testScheduler14);
        org.junit.Assert.assertNull(schedulerFunc2_15);
        org.junit.Assert.assertNull(schedulerFunc2_16);
    }

    @Test
    public void test18703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18703");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.CharSequence, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence> charSequenceTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.CharSequence>(testScheduler0, (long) (-1), schedulerFunc2_4, (java.lang.CharSequence) "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime((long) 1);
        testScheduler0.settime(0L);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 'a', schedulerFunc2_13, "");
        long long16 = strTimedAction15.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean17 = strTimedAction15.getisCancelled();
        strTimedAction15.cancel();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNotNull(atomicBoolean17);
    }

    @Test
    public void test18704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18704");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean6 = strTimedAction4.isCancelled;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(atomicBoolean6);
    }

    @Test
    public void test18705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18705");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 10, schedulerFunc2_7, "hi!");
        testScheduler0.triggerActions((long) (short) -1);
        testScheduler0.time = 0L;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(schedulerFunc1_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(subscriptionFunc0_16);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(schedulerFunc1_18, (long) (short) 10, 97L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test18706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18706");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test18707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18707");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 32L, schedulerFunc2_7, "");
        long long10 = strTimedAction9.time;
        java.lang.String str11 = strTimedAction9.getstate();
        long long12 = strTimedAction9.time;
        long long13 = strTimedAction9.time;
        rx.concurrency.TestScheduler testScheduler14 = strTimedAction9.getscheduler();
        rx.concurrency.TestScheduler testScheduler15 = strTimedAction9.scheduler;
        strTimedAction9.cancel();
        long long17 = strTimedAction9.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(testScheduler14);
        org.junit.Assert.assertNotNull(testScheduler15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test18708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18708");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator7);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator17.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime18);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator19.reversed();
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
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime44.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator43.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator49.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime51.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator52.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime53);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = wildcardTimedActionComparator54.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator54.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator50.thenComparing(wildcardTimedActionComparator54);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator11.thenComparing(wildcardTimedActionComparator54);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = wildcardTimedActionComparator11.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
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
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
    }

    @Test
    public void test18709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18709");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        java.lang.String str7 = strTimedAction4.getstate();
        strTimedAction4.cancel();
        java.lang.String str9 = strTimedAction4.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction4.isCancelled;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean11 = strTimedAction4.getisCancelled();
        long long12 = strTimedAction4.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean13 = strTimedAction4.getisCancelled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(atomicBoolean10);
        org.junit.Assert.assertNotNull(atomicBoolean11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean13);
    }

    @Test
    public void test18710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18710");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 10, schedulerFunc2_7, "");
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        testScheduler0.settime((long) (-1));
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test18711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18711");
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
        long long17 = testScheduler0.gettime();
        long long18 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(subscriptionFunc0_19, (long) 100, timeUnit21);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test18712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18712");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime(35L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(subscriptionFunc0_11, 0L, 32L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test18713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18713");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.time = (short) 10;
        testScheduler0.triggerActions(100L);
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) 100);
        rx.util.functions.Func2<rx.Scheduler, rx.Subscription, rx.Subscription> schedulerFunc2_11 = null;
        rx.concurrency.TestScheduler testScheduler12 = new rx.concurrency.TestScheduler();
        long long13 = testScheduler12.time;
        testScheduler12.settime((long) (short) 10);
        testScheduler12.time = 100;
        long long18 = testScheduler12.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_19 = null;
        rx.Subscription subscription20 = testScheduler12.schedule(schedulerFunc1_19);
        testScheduler12.settime(100L);
        long long23 = testScheduler12.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue24 = testScheduler12.queue;
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler12.schedule(action0_25);
        rx.concurrency.TestScheduler.TimedAction<rx.Subscription> subscriptionTimedAction27 = new rx.concurrency.TestScheduler.TimedAction<rx.Subscription>(testScheduler0, (long) 1, schedulerFunc2_11, subscription26);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(subscriptionFunc0_28);
        testScheduler0.settime((-1L));
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_32 = null;
        rx.Subscription subscription33 = testScheduler0.schedule(subscriptionFunc0_32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertNotNull(subscription33);
    }

    @Test
    public void test18714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18714");
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
        long long12 = strTimedAction10.time;
        java.lang.String str13 = strTimedAction10.getstate();
        rx.concurrency.TestScheduler testScheduler14 = strTimedAction10.getscheduler();
        long long15 = strTimedAction10.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean16 = strTimedAction10.isCancelled;
        rx.concurrency.TestScheduler testScheduler17 = strTimedAction10.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = strTimedAction10.action;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(testScheduler14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean16);
        org.junit.Assert.assertNotNull(testScheduler17);
        org.junit.Assert.assertNull(schedulerFunc2_18);
    }

    @Test
    public void test18715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18715");
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
        testScheduler0.triggerActions();
        long long19 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test18716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18716");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.settime((long) (byte) 1);
        testScheduler0.settime((-1L));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler testScheduler18 = new rx.concurrency.TestScheduler();
        testScheduler18.triggerActions((long) 'a');
        testScheduler18.triggerActions();
        testScheduler18.triggerActions();
        long long23 = testScheduler18.now();
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, (long) 100, schedulerFunc2_17, (rx.Scheduler) testScheduler18);
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test18717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18717");
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
        testScheduler0.triggerActions((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue20 = testScheduler0.queue;
        testScheduler0.settime(97L);
        long long23 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(subscriptionFunc0_24);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test18718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18718");
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
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_15 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction17 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 1, schedulerFunc2_15, "hi!");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = strTimedAction17.action;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNull(schedulerFunc2_18);
    }

    @Test
    public void test18719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18719");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.time = (short) 10;
        testScheduler0.triggerActions(100L);
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) 100);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func2<rx.Scheduler, java.lang.Object, rx.Subscription> schedulerFunc2_15 = null;
        rx.concurrency.TestScheduler testScheduler16 = new rx.concurrency.TestScheduler();
        testScheduler16.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler16.schedule(schedulerFunc1_18);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue20 = testScheduler16.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler16.schedule(schedulerFunc1_21);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction26 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (-1L), schedulerFunc2_24, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue27 = testScheduler16.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.Object, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler testScheduler30 = new rx.concurrency.TestScheduler();
        testScheduler30.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_32 = null;
        rx.Subscription subscription33 = testScheduler30.schedule(schedulerFunc1_32);
        testScheduler30.settime(0L);
        long long36 = testScheduler30.time;
        rx.concurrency.TestScheduler.TimedAction<java.lang.Object> objTimedAction37 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Object>(testScheduler16, (long) (byte) 1, schedulerFunc2_29, (java.lang.Object) testScheduler30);
        rx.concurrency.TestScheduler.TimedAction<java.lang.Object> objTimedAction38 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Object>(testScheduler0, (long) (short) 0, schedulerFunc2_15, (java.lang.Object) testScheduler30);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue39 = testScheduler0.queue;
        rx.util.functions.Action0 action0_40 = null;
        java.util.concurrent.TimeUnit timeUnit43 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription44 = testScheduler0.schedulePeriodically(action0_40, (long) 'a', (long) (short) 10, timeUnit43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue27);
        org.junit.Assert.assertNotNull(subscription33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue39);
    }

    @Test
    public void test18720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18720");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.getscheduler();
        strTimedAction4.cancel();
        java.lang.Class<?> wildcardClass9 = strTimedAction4.getClass();
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test18721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18721");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.time = (short) 100;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 1, schedulerFunc2_8, "");
        testScheduler0.time = (short) 0;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) (-1), (long) ' ', timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test18722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18722");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime(35L);
        testScheduler0.settime(32L);
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(10L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        testScheduler0.settime(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test18723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18723");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator8.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator11.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime15 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler16 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (long) (byte) -1, schedulerFunc2_18, "");
        rx.concurrency.TestScheduler testScheduler21 = strTimedAction20.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = strTimedAction20.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = strTimedAction20.getaction();
        java.lang.String str24 = strTimedAction20.state;
        java.lang.String str25 = strTimedAction20.getstate();
        rx.concurrency.TestScheduler testScheduler26 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_28 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction30 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler26, (long) (byte) -1, schedulerFunc2_28, "");
        java.lang.String str31 = strTimedAction30.state;
        rx.concurrency.TestScheduler testScheduler32 = strTimedAction30.getscheduler();
        java.lang.String str33 = strTimedAction30.getstate();
        long long34 = strTimedAction30.time;
        int int35 = compareActionsByTime15.compare(strTimedAction20, strTimedAction30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime15);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime37.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator38.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime15.thenComparing(wildcardTimedActionComparator39);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime41.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime43 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator42.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime43);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator44.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime46.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime48 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator47.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime48);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator44.thenComparing(wildcardTimedActionComparator50);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime52 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime52.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = wildcardTimedActionComparator53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime54);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime56.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = wildcardTimedActionComparator57.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime58);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = wildcardTimedActionComparator59.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler62 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_64 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction66 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler62, (long) (byte) -1, schedulerFunc2_64, "");
        rx.concurrency.TestScheduler testScheduler67 = strTimedAction66.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_68 = strTimedAction66.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_69 = strTimedAction66.getaction();
        java.lang.String str70 = strTimedAction66.state;
        java.lang.String str71 = strTimedAction66.getstate();
        rx.concurrency.TestScheduler testScheduler72 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_74 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction76 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler72, (long) (byte) -1, schedulerFunc2_74, "");
        java.lang.String str77 = strTimedAction76.state;
        rx.concurrency.TestScheduler testScheduler78 = strTimedAction76.getscheduler();
        java.lang.String str79 = strTimedAction76.getstate();
        long long80 = strTimedAction76.time;
        int int81 = compareActionsByTime61.compare(strTimedAction66, strTimedAction76);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = wildcardTimedActionComparator53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime84 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = compareActionsByTime84.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime86 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator87 = wildcardTimedActionComparator85.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime86);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator88 = compareActionsByTime86.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator89 = wildcardTimedActionComparator83.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime86);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator90 = wildcardTimedActionComparator89.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator91 = wildcardTimedActionComparator50.thenComparing(wildcardTimedActionComparator89);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator92 = wildcardTimedActionComparator40.thenComparing(wildcardTimedActionComparator91);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator93 = wildcardTimedActionComparator8.thenComparing(wildcardTimedActionComparator92);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNull(testScheduler21);
        org.junit.Assert.assertNull(schedulerFunc2_22);
        org.junit.Assert.assertNull(schedulerFunc2_23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(testScheduler32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNull(testScheduler67);
        org.junit.Assert.assertNull(schedulerFunc2_68);
        org.junit.Assert.assertNull(schedulerFunc2_69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNull(testScheduler78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-1L) + "'", long80 == (-1L));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator83);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator87);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator88);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator89);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator90);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator91);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator92);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator93);
    }

    @Test
    public void test18724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18724");
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
        long long13 = strTimedAction11.time;
        long long14 = strTimedAction11.time;
        long long15 = strTimedAction11.time;
        rx.concurrency.TestScheduler testScheduler16 = strTimedAction11.scheduler;
        long long17 = strTimedAction11.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean18 = strTimedAction11.isCancelled;
        java.lang.String str19 = strTimedAction11.state;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(testScheduler12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(atomicBoolean18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18725");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        long long12 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, rx.concurrency.TestScheduler, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler testScheduler15 = new rx.concurrency.TestScheduler();
        long long16 = testScheduler15.time;
        testScheduler15.settime((long) (short) 10);
        testScheduler15.time = 100;
        testScheduler15.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_23 = null;
        rx.Subscription subscription24 = testScheduler15.schedule(subscriptionFunc0_23);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler15.schedule(action0_25);
        rx.util.functions.Action0 action0_27 = null;
        rx.Subscription subscription28 = testScheduler15.schedule(action0_27);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue29 = testScheduler15.getqueue();
        testScheduler15.settime((long) (-1));
        rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler> testSchedulerTimedAction32 = new rx.concurrency.TestScheduler.TimedAction<rx.concurrency.TestScheduler>(testScheduler0, 0L, schedulerFunc2_14, testScheduler15);
        long long33 = testScheduler15.now();
        long long34 = testScheduler15.time;
        testScheduler15.triggerActions();
        long long36 = testScheduler15.time;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertNotNull(subscription26);
        org.junit.Assert.assertNotNull(subscription28);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
    }

    @Test
    public void test18726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18726");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.time;
        long long11 = testScheduler0.gettime();
        testScheduler0.settime((long) 0);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test18727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18727");
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
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction19.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_21 = strTimedAction19.action;
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction19.scheduler;
        testScheduler22.triggerActions();
        long long24 = testScheduler22.gettime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(testScheduler20);
        org.junit.Assert.assertNull(schedulerFunc2_21);
        org.junit.Assert.assertNotNull(testScheduler22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test18728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18728");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        long long15 = testScheduler0.time;
        testScheduler0.settime((long) 10);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test18729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18729");
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
        rx.concurrency.TestScheduler testScheduler79 = strTimedAction46.getscheduler();
        java.lang.String str80 = strTimedAction46.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean81 = strTimedAction46.getisCancelled();
        long long82 = strTimedAction46.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_83 = strTimedAction46.action;
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
        org.junit.Assert.assertNull(testScheduler79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(atomicBoolean81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-1L) + "'", long82 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_83);
    }

    @Test
    public void test18730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18730");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        testScheduler0.settime((long) '4');
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test18731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18731");
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
        rx.Subscription subscription71 = testScheduler69.schedule(action0_70);
        testScheduler69.time = '4';
        java.util.concurrent.TimeUnit timeUnit75 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler69.advanceTimeBy(35L, timeUnit75);
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
        org.junit.Assert.assertNotNull(subscription71);
    }

    @Test
    public void test18732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18732");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue19 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue19);
    }

    @Test
    public void test18733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18733");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.now();
        testScheduler0.settime(35L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test18734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18734");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 32L, schedulerFunc2_7, "");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction9.getaction();
        long long11 = strTimedAction9.time;
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction9.scheduler;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler12.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_14 = null;
        rx.Subscription subscription15 = testScheduler12.schedule(subscriptionFunc0_14);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        rx.Subscription subscription17 = testScheduler12.schedule(subscriptionFunc0_16);
        long long18 = testScheduler12.time;
        testScheduler12.time = '#';
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler12.schedulePeriodically(schedulerFunc1_21, (long) (byte) 1, (long) '#', timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(testScheduler12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test18735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18735");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 32L, schedulerFunc2_7, "");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_12 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction14 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 97L, schedulerFunc2_12, "");
        testScheduler0.time = '#';
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test18736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18736");
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
        java.lang.String str19 = strTimedAction14.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = strTimedAction14.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_21 = strTimedAction14.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean22 = strTimedAction14.getisCancelled();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(testScheduler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(schedulerFunc2_20);
        org.junit.Assert.assertNull(schedulerFunc2_21);
        org.junit.Assert.assertNotNull(atomicBoolean22);
    }

    @Test
    public void test18737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18737");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 1;
        testScheduler0.triggerActions((long) (byte) 0);
        long long5 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction13 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 1, schedulerFunc2_11, "");
        rx.concurrency.TestScheduler testScheduler14 = strTimedAction13.getscheduler();
        testScheduler14.time = (byte) 10;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(testScheduler14);
    }

    @Test
    public void test18738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18738");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime2.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator8.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        rx.concurrency.TestScheduler testScheduler12 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler12, (long) (byte) -1, schedulerFunc2_14, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean17 = strTimedAction16.isCancelled;
        long long18 = strTimedAction16.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = strTimedAction16.getaction();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime22);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.reversed();
        rx.concurrency.TestScheduler testScheduler25 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_27 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction29 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler25, (long) (byte) -1, schedulerFunc2_27, "");
        rx.concurrency.TestScheduler testScheduler30 = strTimedAction29.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_31 = strTimedAction29.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_32 = strTimedAction29.getaction();
        java.lang.String str33 = strTimedAction29.state;
        java.lang.String str34 = strTimedAction29.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean35 = strTimedAction29.isCancelled;
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
        strTimedAction61.cancel();
        int int73 = compareActionsByTime22.compare(strTimedAction29, strTimedAction61);
        int int74 = compareActionsByTime9.compare(strTimedAction16, strTimedAction29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime9);
        rx.concurrency.TestScheduler testScheduler76 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_78 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction80 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler76, (long) (byte) -1, schedulerFunc2_78, "");
        java.lang.String str81 = strTimedAction80.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_82 = strTimedAction80.getaction();
        rx.concurrency.TestScheduler testScheduler83 = strTimedAction80.getscheduler();
        long long84 = strTimedAction80.gettime();
        java.lang.String str85 = strTimedAction80.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean86 = strTimedAction80.isCancelled;
        rx.concurrency.TestScheduler testScheduler87 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_89 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction91 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler87, (long) (byte) -1, schedulerFunc2_89, "");
        strTimedAction91.cancel();
        rx.concurrency.TestScheduler testScheduler93 = strTimedAction91.scheduler;
        int int94 = compareActionsByTime9.compare(strTimedAction80, strTimedAction91);
        strTimedAction91.cancel();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_96 = strTimedAction91.action;
        java.lang.Class<?> wildcardClass97 = strTimedAction91.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(atomicBoolean17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNull(testScheduler30);
        org.junit.Assert.assertNull(schedulerFunc2_31);
        org.junit.Assert.assertNull(schedulerFunc2_32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(atomicBoolean35);
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
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNull(schedulerFunc2_82);
        org.junit.Assert.assertNull(testScheduler83);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(atomicBoolean86);
        org.junit.Assert.assertNull(testScheduler93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNull(schedulerFunc2_96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test18739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18739");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.getscheduler();
        long long8 = strTimedAction4.gettime();
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction4.scheduler;
        long long10 = strTimedAction4.time;
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test18740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18740");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions((long) (short) 10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.time = 10L;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test18741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18741");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_17, "hi!");
        java.lang.String str20 = strTimedAction19.state;
        rx.concurrency.TestScheduler testScheduler21 = strTimedAction19.getscheduler();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler21.schedule(subscriptionFunc0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription27 = testScheduler21.schedule(schedulerFunc1_24, 0L, timeUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(testScheduler21);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test18742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18742");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        strTimedAction4.cancel();
        java.lang.String str8 = strTimedAction4.state;
        long long9 = strTimedAction4.gettime();
        long long10 = strTimedAction4.time;
        strTimedAction4.cancel();
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction4.getscheduler();
        long long13 = strTimedAction4.time;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean14 = strTimedAction4.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean15 = strTimedAction4.getisCancelled();
        java.lang.String str16 = strTimedAction4.getstate();
        java.lang.String str17 = strTimedAction4.getstate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(testScheduler12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean14);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18743");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction8 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 100, schedulerFunc2_6, "hi!");
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = ' ';
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        long long15 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test18744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18744");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.gettime();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction15 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 0L, schedulerFunc2_13, "hi!");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean16 = strTimedAction15.getisCancelled();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean17 = strTimedAction15.getisCancelled();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(atomicBoolean16);
        org.junit.Assert.assertNotNull(atomicBoolean17);
    }

    @Test
    public void test18745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18745");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) 0;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 100, schedulerFunc2_8, "hi!");
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test18746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18746");
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
        rx.concurrency.TestScheduler testScheduler26 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_28 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction30 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler26, (long) (byte) -1, schedulerFunc2_28, "");
        java.lang.String str31 = strTimedAction30.state;
        java.lang.String str32 = strTimedAction30.state;
        rx.concurrency.TestScheduler testScheduler33 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_35 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction37 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler33, (long) (byte) -1, schedulerFunc2_35, "");
        long long38 = strTimedAction37.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_39 = strTimedAction37.getaction();
        int int40 = compareActionsByTime5.compare(strTimedAction30, strTimedAction37);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler testScheduler42 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_44 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction46 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, (long) (byte) -1, schedulerFunc2_44, "");
        rx.concurrency.TestScheduler testScheduler47 = strTimedAction46.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_48 = strTimedAction46.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = strTimedAction46.getaction();
        java.lang.String str50 = strTimedAction46.state;
        java.lang.String str51 = strTimedAction46.getstate();
        rx.concurrency.TestScheduler testScheduler52 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_54 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction56 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler52, (long) (byte) -1, schedulerFunc2_54, "");
        java.lang.String str57 = strTimedAction56.state;
        rx.concurrency.TestScheduler testScheduler58 = strTimedAction56.getscheduler();
        java.lang.String str59 = strTimedAction56.getstate();
        long long60 = strTimedAction56.time;
        int int61 = compareActionsByTime41.compare(strTimedAction46, strTimedAction56);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime41.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime64 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime64.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime66 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = wildcardTimedActionComparator65.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = wildcardTimedActionComparator67.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime69.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime71 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = wildcardTimedActionComparator70.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime71);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = wildcardTimedActionComparator72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = wildcardTimedActionComparator67.thenComparing(wildcardTimedActionComparator73);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime75 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime75.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime77 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator76.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime77);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator67.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime77);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator63.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime77);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator80);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = wildcardTimedActionComparator3.reversed();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(testScheduler47);
        org.junit.Assert.assertNull(schedulerFunc2_48);
        org.junit.Assert.assertNull(schedulerFunc2_49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(testScheduler58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
    }

    @Test
    public void test18747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18747");
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
        long long15 = testScheduler0.time;
        long long16 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test18748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18748");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test18749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18749");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(subscriptionFunc0_12, 0L, 52L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test18750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18750");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        testScheduler0.settime(0L);
        long long6 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.lang.Class<?> wildcardClass9 = subscription8.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test18751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18751");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.time = 100L;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(schedulerFunc1_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test18752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18752");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.time = 100L;
        testScheduler0.time = 0L;
        long long9 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test18753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18753");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_15 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction17 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_15, "");
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_18);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(subscriptionFunc0_20);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(subscriptionFunc0_22);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(schedulerFunc1_24);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(subscription23);
        org.junit.Assert.assertNotNull(subscription25);
    }

    @Test
    public void test18754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18754");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 0;
        testScheduler0.time = (short) 10;
        testScheduler0.triggerActions(100L);
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) 100);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(schedulerFunc1_12);
        rx.util.functions.Func2<rx.Scheduler, java.lang.Object, rx.Subscription> schedulerFunc2_15 = null;
        rx.concurrency.TestScheduler testScheduler16 = new rx.concurrency.TestScheduler();
        testScheduler16.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_18 = null;
        rx.Subscription subscription19 = testScheduler16.schedule(schedulerFunc1_18);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue20 = testScheduler16.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_21 = null;
        rx.Subscription subscription22 = testScheduler16.schedule(schedulerFunc1_21);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction26 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, (-1L), schedulerFunc2_24, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue27 = testScheduler16.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.Object, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler testScheduler30 = new rx.concurrency.TestScheduler();
        testScheduler30.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_32 = null;
        rx.Subscription subscription33 = testScheduler30.schedule(schedulerFunc1_32);
        testScheduler30.settime(0L);
        long long36 = testScheduler30.time;
        rx.concurrency.TestScheduler.TimedAction<java.lang.Object> objTimedAction37 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Object>(testScheduler16, (long) (byte) 1, schedulerFunc2_29, (java.lang.Object) testScheduler30);
        rx.concurrency.TestScheduler.TimedAction<java.lang.Object> objTimedAction38 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Object>(testScheduler0, (long) (short) 0, schedulerFunc2_15, (java.lang.Object) testScheduler30);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue39 = testScheduler0.queue;
        java.util.concurrent.TimeUnit timeUnit41 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 10, timeUnit41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue20);
        org.junit.Assert.assertNotNull(subscription22);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue27);
        org.junit.Assert.assertNotNull(subscription33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue39);
    }

    @Test
    public void test18755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18755");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions((-1L));
        long long11 = testScheduler0.gettime();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test18756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18756");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 'a', schedulerFunc2_8, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test18757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18757");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime2.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = wildcardTimedActionComparator4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator4.reversed();
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
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator4.thenComparing(wildcardTimedActionComparator10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator4.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
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
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
    }

    @Test
    public void test18758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18758");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Func2<rx.Scheduler, java.lang.Object, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.Object> objTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Object>(testScheduler0, (long) 10, schedulerFunc2_4, (java.lang.Object) (byte) 10);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (short) 1, (long) (byte) 1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
    }

    @Test
    public void test18759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18759");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        java.lang.String str6 = strTimedAction4.state;
        long long7 = strTimedAction4.gettime();
        java.lang.String str8 = strTimedAction4.state;
        java.lang.String str9 = strTimedAction4.state;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test18760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18760");
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
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction14.scheduler;
        java.lang.String str21 = strTimedAction14.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean22 = strTimedAction14.isCancelled;
        rx.concurrency.TestScheduler testScheduler23 = strTimedAction14.getscheduler();
        strTimedAction14.cancel();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean25 = strTimedAction14.isCancelled;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(testScheduler18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNull(testScheduler20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(atomicBoolean22);
        org.junit.Assert.assertNull(testScheduler23);
        org.junit.Assert.assertNotNull(atomicBoolean25);
    }

    @Test
    public void test18761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18761");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        long long6 = strTimedAction4.gettime();
        long long7 = strTimedAction4.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean9 = strTimedAction4.isCancelled;
        rx.concurrency.TestScheduler testScheduler10 = strTimedAction4.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_11 = strTimedAction4.action;
        java.lang.String str12 = strTimedAction4.state;
        java.lang.String str13 = strTimedAction4.getstate();
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertNotNull(atomicBoolean9);
        org.junit.Assert.assertNull(testScheduler10);
        org.junit.Assert.assertNull(schedulerFunc2_11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18762");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = strTimedAction32.action;
        strTimedAction32.cancel();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean40 = strTimedAction32.getisCancelled();
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
        org.junit.Assert.assertNull(schedulerFunc2_38);
        org.junit.Assert.assertNotNull(atomicBoolean40);
    }

    @Test
    public void test18763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18763");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        long long6 = strTimedAction4.gettime();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean7 = strTimedAction4.getisCancelled();
        rx.concurrency.TestScheduler testScheduler8 = strTimedAction4.scheduler;
        strTimedAction4.cancel();
        long long10 = strTimedAction4.gettime();
        java.lang.String str11 = strTimedAction4.state;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean12 = strTimedAction4.getisCancelled();
        rx.concurrency.TestScheduler testScheduler13 = strTimedAction4.getscheduler();
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(atomicBoolean7);
        org.junit.Assert.assertNull(testScheduler8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(atomicBoolean12);
        org.junit.Assert.assertNull(testScheduler13);
    }

    @Test
    public void test18764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18764");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (short) 0);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(schedulerFunc1_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 100, schedulerFunc2_9, "");
        java.lang.String str12 = strTimedAction11.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean13 = strTimedAction11.getisCancelled();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(atomicBoolean13);
    }

    @Test
    public void test18765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18765");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        long long15 = testScheduler0.time;
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        testScheduler0.settime(0L);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test18766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18766");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) '4', schedulerFunc2_14, "hi!");
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        long long19 = testScheduler0.time;
        testScheduler0.triggerActions(35L);
        long long22 = testScheduler0.time;
        testScheduler0.time = 35L;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
    }

    @Test
    public void test18767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18767");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean8 = strTimedAction4.isCancelled;
        java.lang.String str9 = strTimedAction4.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction4.action;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertNotNull(atomicBoolean8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(schedulerFunc2_10);
    }

    @Test
    public void test18768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18768");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean5 = strTimedAction4.isCancelled;
        long long6 = strTimedAction4.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        long long8 = strTimedAction4.gettime();
        long long9 = strTimedAction4.gettime();
        java.lang.String str10 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler11 = strTimedAction4.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean12 = strTimedAction4.isCancelled;
        org.junit.Assert.assertNotNull(atomicBoolean5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(testScheduler11);
        org.junit.Assert.assertNotNull(atomicBoolean12);
    }

    @Test
    public void test18769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18769");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(schedulerFunc1_10);
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        long long15 = testScheduler0.time;
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue19 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue19);
    }

    @Test
    public void test18770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18770");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction10 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (-1), schedulerFunc2_8, "");
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(schedulerFunc1_15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test18771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18771");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_17 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_17, "hi!");
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction19.getscheduler();
        rx.concurrency.TestScheduler testScheduler21 = strTimedAction19.scheduler;
        long long22 = strTimedAction19.gettime();
        rx.concurrency.TestScheduler testScheduler23 = strTimedAction19.getscheduler();
        testScheduler23.time = (-1);
        long long26 = testScheduler23.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(testScheduler20);
        org.junit.Assert.assertNotNull(testScheduler21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(testScheduler23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test18772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18772");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(subscriptionFunc0_3);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        testScheduler0.settime((long) (byte) -1);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(subscriptionFunc0_9);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        testScheduler0.time = (short) 10;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test18773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18773");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) '4', schedulerFunc2_14, "hi!");
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(subscriptionFunc0_17);
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue21 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription26 = testScheduler0.schedulePeriodically(schedulerFunc1_22, 10L, (long) '#', timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue21);
    }

    @Test
    public void test18774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18774");
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
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction19.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_21 = strTimedAction19.action;
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction19.scheduler;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue23 = testScheduler22.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue24 = testScheduler22.queue;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(testScheduler20);
        org.junit.Assert.assertNull(schedulerFunc2_21);
        org.junit.Assert.assertNotNull(testScheduler22);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue23);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue24);
    }

    @Test
    public void test18775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18775");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) -1);
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_11);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(schedulerFunc1_13);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(subscriptionFunc0_16, (-1L), timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test18776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18776");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        testScheduler0.time = 100;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(schedulerFunc1_7);
        testScheduler0.settime(100L);
        testScheduler0.settime((long) 0);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_13);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(subscriptionFunc0_15);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(schedulerFunc1_17);
        long long19 = testScheduler0.time;
        long long20 = testScheduler0.now();
        long long21 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue22 = testScheduler0.queue;
        long long23 = testScheduler0.time;
        rx.util.functions.Action0 action0_24 = null;
        rx.Subscription subscription25 = testScheduler0.schedule(action0_24);
        testScheduler0.time = (byte) -1;
        long long28 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue29 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(subscription25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue29);
    }

    @Test
    public void test18777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18777");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = strTimedAction4.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        java.lang.String str8 = strTimedAction4.getstate();
        long long9 = strTimedAction4.time;
        rx.concurrency.TestScheduler testScheduler10 = strTimedAction4.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean11 = strTimedAction4.getisCancelled();
        rx.concurrency.TestScheduler testScheduler12 = strTimedAction4.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean13 = strTimedAction4.isCancelled;
        java.lang.String str14 = strTimedAction4.getstate();
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(schedulerFunc2_6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(testScheduler10);
        org.junit.Assert.assertNotNull(atomicBoolean11);
        org.junit.Assert.assertNull(testScheduler12);
        org.junit.Assert.assertNotNull(atomicBoolean13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18778");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.gettime();
        long long7 = testScheduler0.gettime();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(subscriptionFunc0_8);
        long long10 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedule(subscriptionFunc0_11, (long) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test18779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18779");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler testScheduler2 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_4 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction6 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler2, (long) (byte) -1, schedulerFunc2_4, "");
        java.lang.String str7 = strTimedAction6.state;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction6.getaction();
        strTimedAction6.cancel();
        java.lang.String str10 = strTimedAction6.state;
        long long11 = strTimedAction6.gettime();
        strTimedAction6.cancel();
        rx.concurrency.TestScheduler testScheduler13 = new rx.concurrency.TestScheduler();
        testScheduler13.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler13.schedule(action0_16);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_19 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction21 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler13, (long) 10, schedulerFunc2_19, "hi!");
        strTimedAction21.cancel();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean23 = strTimedAction21.getisCancelled();
        int int24 = compareActionsByTime0.compare(strTimedAction6, strTimedAction21);
        rx.concurrency.TestScheduler testScheduler25 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_27 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction29 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler25, (long) (byte) -1, schedulerFunc2_27, "");
        rx.concurrency.TestScheduler testScheduler30 = strTimedAction29.getscheduler();
        rx.concurrency.TestScheduler testScheduler31 = strTimedAction29.getscheduler();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean32 = strTimedAction29.getisCancelled();
        rx.concurrency.TestScheduler testScheduler33 = strTimedAction29.getscheduler();
        java.lang.String str34 = strTimedAction29.state;
        long long35 = strTimedAction29.gettime();
        long long36 = strTimedAction29.gettime();
        rx.concurrency.TestScheduler testScheduler37 = new rx.concurrency.TestScheduler();
        long long38 = testScheduler37.time;
        testScheduler37.settime((long) (short) 10);
        testScheduler37.time = 100;
        long long43 = testScheduler37.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_44 = null;
        rx.Subscription subscription45 = testScheduler37.schedule(schedulerFunc1_44);
        testScheduler37.settime(100L);
        long long48 = testScheduler37.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_50 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction52 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler37, (long) 'a', schedulerFunc2_50, "hi!");
        java.lang.String str53 = strTimedAction52.getstate();
        rx.concurrency.TestScheduler testScheduler54 = strTimedAction52.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_55 = strTimedAction52.getaction();
        int int56 = compareActionsByTime0.compare(strTimedAction29, strTimedAction52);
        rx.concurrency.TestScheduler testScheduler57 = strTimedAction52.scheduler;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(atomicBoolean23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(testScheduler30);
        org.junit.Assert.assertNull(testScheduler31);
        org.junit.Assert.assertNotNull(atomicBoolean32);
        org.junit.Assert.assertNull(testScheduler33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(subscription45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(testScheduler54);
        org.junit.Assert.assertNull(schedulerFunc2_55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(testScheduler57);
    }

    @Test
    public void test18780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18780");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        rx.util.functions.Func2<rx.Scheduler, java.lang.reflect.AnnotatedElement, rx.Subscription> schedulerFunc2_5 = null;
        rx.concurrency.TestScheduler testScheduler6 = new rx.concurrency.TestScheduler();
        testScheduler6.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_8 = null;
        rx.Subscription subscription9 = testScheduler6.schedule(schedulerFunc1_8);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler6.getqueue();
        long long11 = testScheduler6.gettime();
        testScheduler6.triggerActions((long) (byte) -1);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler6.schedule(action0_14);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler6.getqueue();
        long long17 = testScheduler6.time;
        java.lang.Class<?> wildcardClass18 = testScheduler6.getClass();
        rx.concurrency.TestScheduler.TimedAction<java.lang.reflect.AnnotatedElement> annotatedElementTimedAction19 = new rx.concurrency.TestScheduler.TimedAction<java.lang.reflect.AnnotatedElement>(testScheduler0, (long) (byte) 1, schedulerFunc2_5, (java.lang.reflect.AnnotatedElement) wildcardClass18);
        testScheduler0.settime((long) (short) 10);
        testScheduler0.triggerActions();
        long long23 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test18781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18781");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(35L, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test18782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18782");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions((long) ' ');
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 100, schedulerFunc2_7, "");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean10 = strTimedAction9.isCancelled;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(atomicBoolean10);
    }

    @Test
    public void test18783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18783");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        rx.concurrency.TestScheduler testScheduler5 = strTimedAction4.getscheduler();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = strTimedAction4.getaction();
        long long8 = strTimedAction4.time;
        java.lang.String str9 = strTimedAction4.getstate();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_10 = strTimedAction4.getaction();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean11 = strTimedAction4.isCancelled;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean12 = strTimedAction4.isCancelled;
        org.junit.Assert.assertNull(testScheduler5);
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(schedulerFunc2_7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertNotNull(atomicBoolean11);
        org.junit.Assert.assertNotNull(atomicBoolean12);
    }

    @Test
    public void test18784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18784");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        rx.util.functions.Action0 action0_6 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedule(action0_6, 100L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
    }

    @Test
    public void test18785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18785");
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
        java.lang.String str86 = strTimedAction81.getstate();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean87 = strTimedAction81.isCancelled;
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
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(atomicBoolean87);
    }

    @Test
    public void test18786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18786");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) 'a');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_6 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction8 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) 10, schedulerFunc2_6, "hi!");
        long long9 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(subscriptionFunc0_10);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(subscriptionFunc0_12);
        long long14 = testScheduler0.time;
        long long15 = testScheduler0.now();
        testScheduler0.settime((long) (byte) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
    }

    @Test
    public void test18787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18787");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime2 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime2);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime7);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator3.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator15.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
    }

    @Test
    public void test18788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18788");
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
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean21 = strTimedAction8.getisCancelled();
        rx.concurrency.TestScheduler testScheduler22 = strTimedAction8.getscheduler();
        rx.concurrency.TestScheduler testScheduler23 = strTimedAction8.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean24 = strTimedAction8.getisCancelled();
        rx.concurrency.TestScheduler testScheduler25 = strTimedAction8.scheduler;
        rx.concurrency.TestScheduler testScheduler26 = strTimedAction8.scheduler;
        strTimedAction8.cancel();
        strTimedAction8.cancel();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertNull(schedulerFunc2_10);
        org.junit.Assert.assertNull(schedulerFunc2_11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean21);
        org.junit.Assert.assertNull(testScheduler22);
        org.junit.Assert.assertNull(testScheduler23);
        org.junit.Assert.assertNotNull(atomicBoolean24);
        org.junit.Assert.assertNull(testScheduler25);
        org.junit.Assert.assertNull(testScheduler26);
    }

    @Test
    public void test18789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18789");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(schedulerFunc1_3);
        testScheduler0.time = (short) 0;
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test18790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18790");
        rx.concurrency.TestScheduler testScheduler0 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) -1, schedulerFunc2_2, "");
        java.lang.String str5 = strTimedAction4.getstate();
        rx.concurrency.TestScheduler testScheduler6 = strTimedAction4.scheduler;
        rx.concurrency.TestScheduler testScheduler7 = strTimedAction4.scheduler;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_8 = strTimedAction4.getaction();
        rx.concurrency.TestScheduler testScheduler9 = strTimedAction4.scheduler;
        java.lang.String str10 = strTimedAction4.getstate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(testScheduler6);
        org.junit.Assert.assertNull(testScheduler7);
        org.junit.Assert.assertNull(schedulerFunc2_8);
        org.junit.Assert.assertNull(testScheduler9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18791");
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
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean24 = strTimedAction23.getisCancelled();
        rx.concurrency.TestScheduler testScheduler25 = strTimedAction23.scheduler;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue26 = testScheduler25.getqueue();
        testScheduler25.settime(1L);
        long long29 = testScheduler25.time;
        long long30 = testScheduler25.now();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(atomicBoolean24);
        org.junit.Assert.assertNotNull(testScheduler25);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test18792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18792");
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
        java.lang.String str13 = strTimedAction10.getstate();
        rx.concurrency.TestScheduler testScheduler14 = strTimedAction10.scheduler;
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_15 = null;
        rx.Subscription subscription16 = testScheduler14.schedule(schedulerFunc1_15);
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_17 = null;
        rx.Subscription subscription18 = testScheduler14.schedule(subscriptionFunc0_17);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(testScheduler14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test18793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18793");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        long long7 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, 32L, (long) '#', timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test18794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18794");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(schedulerFunc1_2);
        testScheduler0.settime(0L);
        long long6 = testScheduler0.time;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(subscriptionFunc0_7);
        testScheduler0.settime((long) 1);
        long long11 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.Object, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler testScheduler14 = new rx.concurrency.TestScheduler();
        testScheduler14.time = (byte) 10;
        long long17 = testScheduler14.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler14.schedule(action0_18);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue20 = testScheduler14.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue21 = testScheduler14.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue22 = testScheduler14.getqueue();
        long long23 = testScheduler14.time;
        rx.concurrency.TestScheduler.TimedAction<java.lang.Object> objTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<java.lang.Object>(testScheduler0, 97L, schedulerFunc2_13, (java.lang.Object) testScheduler14);
        long long25 = testScheduler0.time;
        long long26 = testScheduler0.now();
        rx.util.functions.Action0 action0_27 = null;
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription31 = testScheduler0.schedulePeriodically(action0_27, (long) 0, (long) (short) 10, timeUnit30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue20);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue21);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test18795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18795");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) 0);
        long long6 = testScheduler0.gettime();
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test18796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18796");
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
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_18 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction20 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, 0L, schedulerFunc2_18, "hi!");
        testScheduler0.settime((long) (byte) 1);
        testScheduler0.settime((long) (short) 0);
        long long25 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue26 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue26);
    }

    @Test
    public void test18797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18797");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        long long4 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 1);
        testScheduler0.settime(97L);
        long long9 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test18798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18798");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.now();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_7 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction9 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 100, schedulerFunc2_7, "");
        testScheduler0.time = (-1L);
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler testScheduler14 = new rx.concurrency.TestScheduler();
        testScheduler14.triggerActions((long) 'a');
        testScheduler14.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler14.getqueue();
        testScheduler14.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler14.schedule(schedulerFunc1_20);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue22 = testScheduler14.queue;
        long long23 = testScheduler14.gettime();
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction24 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, (long) (byte) 100, schedulerFunc2_13, (rx.Scheduler) testScheduler14);
        rx.util.functions.Action0 action0_25 = null;
        rx.Subscription subscription26 = testScheduler0.schedule(action0_25);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_27 = null;
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription31 = testScheduler0.schedulePeriodically(schedulerFunc1_27, (long) (-1), (long) 10, timeUnit30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(subscription26);
    }

    @Test
    public void test18799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18799");
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
        rx.util.functions.Func2<rx.Scheduler, rx.Scheduler, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler testScheduler15 = new rx.concurrency.TestScheduler();
        testScheduler15.triggerActions();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_17 = null;
        rx.Subscription subscription18 = testScheduler15.schedule(schedulerFunc1_17);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue19 = testScheduler15.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_20 = null;
        rx.Subscription subscription21 = testScheduler15.schedule(schedulerFunc1_20);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction25 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler15, (-1L), schedulerFunc2_23, "hi!");
        long long26 = testScheduler15.time;
        rx.concurrency.TestScheduler.TimedAction<rx.Scheduler> schedulerTimedAction27 = new rx.concurrency.TestScheduler.TimedAction<rx.Scheduler>(testScheduler0, (long) '4', schedulerFunc2_14, (rx.Scheduler) testScheduler15);
        rx.util.functions.Action0 action0_28 = null;
        rx.Subscription subscription29 = testScheduler0.schedule(action0_28);
        long long30 = testScheduler0.now();
        testScheduler0.time = 32L;
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_33 = null;
        rx.Subscription subscription34 = testScheduler0.schedule(subscriptionFunc0_33);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue19);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(subscription29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(subscription34);
    }

    @Test
    public void test18800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18800");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(subscriptionFunc0_2);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(schedulerFunc1_4);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Func2<rx.Scheduler, java.lang.reflect.GenericDeclaration, rx.Subscription> schedulerFunc2_13 = null;
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime14.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator15.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime16);
        rx.concurrency.TestScheduler testScheduler18 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_20 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction22 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler18, (long) (byte) -1, schedulerFunc2_20, "");
        rx.concurrency.TestScheduler testScheduler23 = strTimedAction22.getscheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_24 = strTimedAction22.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_25 = strTimedAction22.getaction();
        java.lang.String str26 = strTimedAction22.getstate();
        rx.concurrency.TestScheduler testScheduler27 = null;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_29 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction31 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler27, (long) (byte) -1, schedulerFunc2_29, "");
        long long32 = strTimedAction31.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_33 = strTimedAction31.getaction();
        int int34 = compareActionsByTime16.compare(strTimedAction22, strTimedAction31);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean35 = strTimedAction22.getisCancelled();
        rx.concurrency.TestScheduler testScheduler36 = strTimedAction22.getscheduler();
        rx.concurrency.TestScheduler testScheduler37 = strTimedAction22.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean38 = strTimedAction22.getisCancelled();
        rx.concurrency.TestScheduler testScheduler39 = strTimedAction22.scheduler;
        rx.concurrency.TestScheduler testScheduler40 = strTimedAction22.scheduler;
        strTimedAction22.cancel();
        java.lang.Class<?> wildcardClass42 = strTimedAction22.getClass();
        rx.concurrency.TestScheduler.TimedAction<java.lang.reflect.GenericDeclaration> genericDeclarationTimedAction43 = new rx.concurrency.TestScheduler.TimedAction<java.lang.reflect.GenericDeclaration>(testScheduler0, (long) (byte) 100, schedulerFunc2_13, (java.lang.reflect.GenericDeclaration) wildcardClass42);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNull(testScheduler23);
        org.junit.Assert.assertNull(schedulerFunc2_24);
        org.junit.Assert.assertNull(schedulerFunc2_25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNull(schedulerFunc2_33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(atomicBoolean35);
        org.junit.Assert.assertNull(testScheduler36);
        org.junit.Assert.assertNull(testScheduler37);
        org.junit.Assert.assertNotNull(atomicBoolean38);
        org.junit.Assert.assertNull(testScheduler39);
        org.junit.Assert.assertNull(testScheduler40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test18801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18801");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Action0 action0_1 = null;
        rx.Subscription subscription2 = testScheduler0.schedule(action0_1);
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.now();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(subscriptionFunc0_5);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(schedulerFunc1_9, 10L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test18802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18802");
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
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(schedulerFunc1_16);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(32L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test18803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18803");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        testScheduler0.triggerActions();
        rx.util.functions.Func0<rx.Subscription> subscriptionFunc0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(subscriptionFunc0_4);
        testScheduler0.time = 10;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
    }

    @Test
    public void test18804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18804");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_2 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction4 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (short) 10, schedulerFunc2_2, "");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test18805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18805");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.time;
        long long2 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_9 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction11 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) (byte) 0, schedulerFunc2_9, "hi!");
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_14 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction16 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler0, (long) '4', schedulerFunc2_14, "hi!");
        long long17 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        long long19 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test18806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18806");
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
        long long16 = testScheduler8.now();
        long long17 = testScheduler8.time;
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler8.schedule(action0_18, (long) (byte) -1, timeUnit20);
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
    public void test18807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18807");
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
        rx.concurrency.TestScheduler testScheduler19 = strTimedAction14.scheduler;
        rx.concurrency.TestScheduler testScheduler20 = strTimedAction14.scheduler;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean21 = strTimedAction14.getisCancelled();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_22 = strTimedAction14.action;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_23 = strTimedAction14.action;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(atomicBoolean15);
        org.junit.Assert.assertNull(testScheduler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(testScheduler18);
        org.junit.Assert.assertNull(testScheduler19);
        org.junit.Assert.assertNull(testScheduler20);
        org.junit.Assert.assertNotNull(atomicBoolean21);
        org.junit.Assert.assertNull(schedulerFunc2_22);
        org.junit.Assert.assertNull(schedulerFunc2_23);
    }

    @Test
    public void test18808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18808");
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
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime7.thenComparing(wildcardTimedActionComparator13);
        rx.concurrency.TestScheduler testScheduler16 = new rx.concurrency.TestScheduler();
        long long17 = testScheduler16.time;
        testScheduler16.settime((long) (short) 10);
        testScheduler16.time = 100;
        long long22 = testScheduler16.gettime();
        rx.util.functions.Func1<rx.Scheduler, rx.Subscription> schedulerFunc1_23 = null;
        rx.Subscription subscription24 = testScheduler16.schedule(schedulerFunc1_23);
        testScheduler16.settime(100L);
        testScheduler16.settime((long) 0);
        long long29 = testScheduler16.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue30 = testScheduler16.queue;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_32 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction34 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, 0L, schedulerFunc2_32, "");
        testScheduler16.time = 0L;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_38 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction40 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler16, 35L, schedulerFunc2_38, "");
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_41 = strTimedAction40.getaction();
        rx.concurrency.TestScheduler testScheduler42 = new rx.concurrency.TestScheduler();
        testScheduler42.triggerActions((long) 'a');
        testScheduler42.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue46 = testScheduler42.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue47 = testScheduler42.getqueue();
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_49 = null;
        rx.concurrency.TestScheduler.TimedAction<java.lang.String> strTimedAction51 = new rx.concurrency.TestScheduler.TimedAction<java.lang.String>(testScheduler42, 32L, schedulerFunc2_49, "");
        long long52 = strTimedAction51.time;
        rx.util.functions.Func2<rx.Scheduler, java.lang.String, rx.Subscription> schedulerFunc2_53 = strTimedAction51.action;
        int int54 = compareActionsByTime7.compare(strTimedAction40, strTimedAction51);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean55 = strTimedAction40.isCancelled;
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(subscription24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue30);
        org.junit.Assert.assertNull(schedulerFunc2_41);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue46);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue47);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
        org.junit.Assert.assertNull(schedulerFunc2_53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(atomicBoolean55);
    }
}

