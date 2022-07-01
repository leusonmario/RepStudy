import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.triggerActions((long) (short) 10);
        testScheduler0.settime((long) (-1));
        long long9 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long12 = testScheduler0.time;
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        long long8 = testScheduler0.time;
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.gettime();
        testScheduler0.settime(32L);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.gettime();
        testScheduler0.time = (byte) 0;
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.time;
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.time;
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.gettime();
        long long12 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) 10);
        testScheduler0.time = 0L;
        testScheduler0.settime((long) 0);
        long long11 = testScheduler0.time;
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator11.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator12.thenComparing(wildcardTimedActionComparator15);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator18.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator18.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator20.thenComparing(wildcardTimedActionComparator22);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator15.thenComparing(wildcardTimedActionComparator29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator30.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime32.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator33.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator37.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator35.thenComparing(wildcardTimedActionComparator37);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = compareActionsByTime44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator43.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime44);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime49 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = compareActionsByTime49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator50.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator50.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator48.thenComparing(wildcardTimedActionComparator52);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator52.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime55.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator56.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator56.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime59.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = wildcardTimedActionComparator60.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime63 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime63.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = wildcardTimedActionComparator64.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator62.thenComparing(wildcardTimedActionComparator64);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime67.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = wildcardTimedActionComparator68.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = wildcardTimedActionComparator62.thenComparing(wildcardTimedActionComparator68);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator58.thenComparing(wildcardTimedActionComparator68);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime72.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime74 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = compareActionsByTime74.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime72.thenComparing(wildcardTimedActionComparator75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator71.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator77.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator78.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator52.thenComparing(wildcardTimedActionComparator79);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator79.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime82 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = compareActionsByTime82.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator84 = wildcardTimedActionComparator83.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = wildcardTimedActionComparator83.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime86 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator87 = compareActionsByTime86.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator88 = wildcardTimedActionComparator87.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator89 = wildcardTimedActionComparator85.thenComparing(wildcardTimedActionComparator87);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime90 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator91 = compareActionsByTime90.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator92 = compareActionsByTime90.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator93 = wildcardTimedActionComparator89.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime90);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator94 = wildcardTimedActionComparator93.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator95 = wildcardTimedActionComparator93.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator96 = wildcardTimedActionComparator81.thenComparing(wildcardTimedActionComparator93);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator97 = wildcardTimedActionComparator31.thenComparing(wildcardTimedActionComparator81);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator98 = wildcardTimedActionComparator81.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator99 = wildcardTimedActionComparator81.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator83);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator84);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator87);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator88);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator89);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator91);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator92);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator93);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator94);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator95);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator96);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator97);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator98);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator99);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.time;
        testScheduler0.settime(97L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) (byte) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        testScheduler0.triggerActions(0L);
        long long15 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) -1);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        long long20 = testScheduler0.time;
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator9);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator3.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator20.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator22.thenComparing(wildcardTimedActionComparator24);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime27.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime27.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator26.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator18.thenComparing(wildcardTimedActionComparator26);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime32.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator18.thenComparing(wildcardTimedActionComparator35);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator37.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator37.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime3.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = wildcardTimedActionComparator4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator6.thenComparing(wildcardTimedActionComparator8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime0.thenComparing(wildcardTimedActionComparator11);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime16.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime24.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator27.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime28);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator22.thenComparing(wildcardTimedActionComparator31);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime33.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime37.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator22.thenComparing(wildcardTimedActionComparator41);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime43 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime43.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator42.thenComparing(wildcardTimedActionComparator45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator45.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime48 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator49.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime52 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime52.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator53.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = wildcardTimedActionComparator51.thenComparing(wildcardTimedActionComparator53);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator53.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator53.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime58.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = compareActionsByTime60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = wildcardTimedActionComparator61.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator61.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime64 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime64.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator65.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = wildcardTimedActionComparator63.thenComparing(wildcardTimedActionComparator65);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime68.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime68.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator67.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime68);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = compareActionsByTime58.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime68);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime73.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime75 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator74.thenComparing(wildcardTimedActionComparator76);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator72.thenComparing(wildcardTimedActionComparator76);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime80 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = compareActionsByTime80.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = compareActionsByTime80.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = compareActionsByTime80.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime84 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = compareActionsByTime84.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator86 = wildcardTimedActionComparator83.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime84);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator87 = wildcardTimedActionComparator83.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator88 = wildcardTimedActionComparator72.thenComparing(wildcardTimedActionComparator83);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime89 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator90 = compareActionsByTime89.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator91 = wildcardTimedActionComparator90.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator92 = wildcardTimedActionComparator91.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator93 = wildcardTimedActionComparator88.thenComparing(wildcardTimedActionComparator91);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator94 = wildcardTimedActionComparator53.thenComparing(wildcardTimedActionComparator88);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator95 = wildcardTimedActionComparator88.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator96 = wildcardTimedActionComparator47.thenComparing(wildcardTimedActionComparator95);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator97 = wildcardTimedActionComparator15.thenComparing(wildcardTimedActionComparator95);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator83);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator87);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator88);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator90);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator91);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator92);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator93);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator94);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator95);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator96);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator97);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) 1);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.gettime();
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        testScheduler0.triggerActions((long) (short) 10);
        testScheduler0.settime((long) '#');
        testScheduler0.triggerActions();
        testScheduler0.time = 10L;
        testScheduler0.settime(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        testScheduler0.time = 0;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.triggerActions();
        long long8 = testScheduler0.time;
        testScheduler0.time = (short) -1;
        long long11 = testScheduler0.time;
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) 1);
        long long4 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (short) -1);
        long long7 = testScheduler0.time;
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(32L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.time;
        testScheduler0.settime((long) 0);
        long long9 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 100;
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        testScheduler0.time = '4';
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.lang.Class<?> wildcardClass13 = subscription12.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.time;
        testScheduler0.triggerActions(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        testScheduler0.triggerActions(35L);
        testScheduler0.time = 10L;
        long long17 = testScheduler0.now();
        testScheduler0.time = (-1);
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        testScheduler0.time = 100L;
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        testScheduler0.triggerActions((long) (short) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        testScheduler0.settime((long) (short) 1);
        testScheduler0.settime((long) (short) 10);
        testScheduler0.triggerActions(35L);
        testScheduler0.settime((-1L));
        long long15 = testScheduler0.time;
        testScheduler0.time = 100;
        long long18 = testScheduler0.time;
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        testScheduler0.settime((long) (short) 100);
        testScheduler0.time = 97L;
        testScheduler0.settime(35L);
        testScheduler0.time = 10;
        long long14 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions((long) 'a');
        long long6 = testScheduler0.time;
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) (short) 0, (long) (byte) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 1;
        long long11 = testScheduler0.time;
        testScheduler0.settime((long) (byte) 10);
        testScheduler0.triggerActions((long) (byte) 100);
        long long16 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        testScheduler0.settime((long) (-1));
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.gettime();
        testScheduler0.settime(10L);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 0, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.time;
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime3.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = wildcardTimedActionComparator4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator6.thenComparing(wildcardTimedActionComparator8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime11 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator10.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime11);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator2.thenComparing(wildcardTimedActionComparator10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator15.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator18.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator18.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator22.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator26.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator24.thenComparing(wildcardTimedActionComparator26);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator24.thenComparing(wildcardTimedActionComparator30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator20.thenComparing(wildcardTimedActionComparator30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator33.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator37.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator37.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator39.thenComparing(wildcardTimedActionComparator41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator43.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator35.thenComparing(wildcardTimedActionComparator43);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator16.thenComparing(wildcardTimedActionComparator43);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator48.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator52.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator50.thenComparing(wildcardTimedActionComparator52);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime55.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = wildcardTimedActionComparator58.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = compareActionsByTime60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = wildcardTimedActionComparator61.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator59.thenComparing(wildcardTimedActionComparator62);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime64 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime64.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator65.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = wildcardTimedActionComparator65.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime68.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = wildcardTimedActionComparator69.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator67.thenComparing(wildcardTimedActionComparator69);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = wildcardTimedActionComparator71.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = wildcardTimedActionComparator75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator62.thenComparing(wildcardTimedActionComparator76);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator43.thenComparing(wildcardTimedActionComparator76);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator43.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator79.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator79.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 1);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.gettime();
        long long10 = testScheduler0.now();
        testScheduler0.settime(35L);
        testScheduler0.triggerActions((long) 100);
        long long15 = testScheduler0.now();
        testScheduler0.settime(1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        testScheduler0.settime((long) (byte) 0);
        testScheduler0.triggerActions((long) '4');
        long long11 = testScheduler0.now();
        testScheduler0.triggerActions((long) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        testScheduler0.time = (-1L);
        long long18 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        testScheduler0.time = 0L;
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long13 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) 100);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedule(action0_19, (long) (byte) 100, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.settime((long) (short) 1);
        testScheduler0.settime((long) (byte) 10);
        long long11 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        long long13 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        testScheduler0.time = ' ';
        testScheduler0.triggerActions(10L);
        java.lang.Class<?> wildcardClass9 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.time;
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        testScheduler0.settime((long) 0);
        long long17 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        long long5 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator6.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime8.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator11.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator14.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator17.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator19.thenComparing(wildcardTimedActionComparator21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator15.thenComparing(wildcardTimedActionComparator25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator7.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (short) 10);
        testScheduler0.time = '4';
        testScheduler0.time = ' ';
        long long15 = testScheduler0.now();
        testScheduler0.triggerActions(32L);
        java.lang.Class<?> wildcardClass18 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.gettime();
        long long7 = testScheduler0.time;
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.lang.Class<?> wildcardClass10 = subscription9.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (byte) -1);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions((long) 100);
        testScheduler0.time = 32L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        long long16 = testScheduler0.time;
        long long17 = testScheduler0.time;
        long long18 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.time;
        long long12 = testScheduler0.time;
        testScheduler0.triggerActions((long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.time = (byte) 1;
        testScheduler0.time = '4';
        long long15 = testScheduler0.time;
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (long) (short) 100, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime((-1L));
        testScheduler0.triggerActions((long) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        long long14 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        long long16 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 1);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        testScheduler0.time = (short) 1;
        long long16 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.time = 'a';
        long long7 = testScheduler0.time;
        testScheduler0.settime(52L);
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) (short) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.triggerActions((long) (short) 10);
        testScheduler0.settime((long) (-1));
        long long9 = testScheduler0.now();
        testScheduler0.settime(10L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        testScheduler0.triggerActions((long) 10);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        testScheduler0.triggerActions((long) (short) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(32L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator9);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator15.thenComparing(wildcardTimedActionComparator17);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator15.thenComparing(wildcardTimedActionComparator21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator3.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime27.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator28.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime31.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator32.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator30.thenComparing(wildcardTimedActionComparator32);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime35.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator30.thenComparing(wildcardTimedActionComparator38);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator40.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime42.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator43.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator43.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime46.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator47.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime50.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator49.thenComparing(wildcardTimedActionComparator51);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime54.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator55.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator49.thenComparing(wildcardTimedActionComparator55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator45.thenComparing(wildcardTimedActionComparator55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = wildcardTimedActionComparator58.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = wildcardTimedActionComparator58.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime61.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator62.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator62.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = compareActionsByTime65.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = wildcardTimedActionComparator66.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = wildcardTimedActionComparator66.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime69.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator70.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = wildcardTimedActionComparator68.thenComparing(wildcardTimedActionComparator70);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime73.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = wildcardTimedActionComparator74.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = wildcardTimedActionComparator68.thenComparing(wildcardTimedActionComparator74);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator64.thenComparing(wildcardTimedActionComparator74);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator77.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator58.thenComparing(wildcardTimedActionComparator77);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator58.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator40.thenComparing(wildcardTimedActionComparator80);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator80);
        java.lang.Class<?> wildcardClass83 = wildcardTimedActionComparator80.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '#', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.gettime();
        testScheduler0.time = (-1);
        testScheduler0.settime((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions((long) 'a');
        long long6 = testScheduler0.gettime();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, 0L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        testScheduler0.triggerActions(32L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.triggerActions(32L);
        testScheduler0.triggerActions((long) (short) 0);
        testScheduler0.time = (byte) 1;
        testScheduler0.settime((long) 0);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 10, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions(100L);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.gettime();
        testScheduler0.settime((long) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        testScheduler0.time = (byte) -1;
        testScheduler0.time = (short) -1;
        long long19 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 0);
        testScheduler0.time = 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.gettime();
        long long19 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        testScheduler0.settime((long) (byte) 0);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.now();
        testScheduler0.time = '#';
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.gettime();
        testScheduler0.time = (-1L);
        long long9 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (short) 10);
        long long14 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.settime((long) (byte) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.gettime();
        long long8 = testScheduler0.time;
        testScheduler0.time = 97L;
        long long11 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (short) 10);
        testScheduler0.triggerActions(0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) 1);
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) 1);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) '4', (long) (short) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        testScheduler0.triggerActions(0L);
        testScheduler0.settime((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        rx.Subscription subscription22 = testScheduler0.schedule(action0_21);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertNotNull(subscription22);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions((long) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        testScheduler0.settime((long) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator15.thenComparing(wildcardTimedActionComparator17);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator11.thenComparing(wildcardTimedActionComparator19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator8.thenComparing(wildcardTimedActionComparator19);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator29.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime32.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator31.thenComparing(wildcardTimedActionComparator33);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator35.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator39.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator42.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator40.thenComparing(wildcardTimedActionComparator43);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator43.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator19.thenComparing(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.settime((long) '4');
        testScheduler0.triggerActions((long) (byte) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.settime((long) (short) 1);
        testScheduler0.time = (short) 10;
        testScheduler0.settime(10L);
        long long13 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, (long) 0, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        testScheduler0.time = 0L;
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long13 = testScheduler0.gettime();
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(35L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator15.thenComparing(wildcardTimedActionComparator17);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator11.thenComparing(wildcardTimedActionComparator19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator8.thenComparing(wildcardTimedActionComparator19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator8.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (short) -1);
        testScheduler0.time = 10L;
        long long8 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator10.thenComparing(wildcardTimedActionComparator14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator17);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator17.thenComparing(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) 1);
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 0);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.time;
        long long14 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue20 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue20);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.time;
        testScheduler0.time = (-1);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        testScheduler0.time = (short) 100;
        long long11 = testScheduler0.now();
        testScheduler0.settime((long) '4');
        long long14 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        long long16 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.settime((long) (short) 1);
        testScheduler0.settime((long) (byte) 10);
        testScheduler0.triggerActions();
        testScheduler0.settime((long) ' ');
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(1L);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.time;
        long long13 = testScheduler0.gettime();
        testScheduler0.settime((long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        testScheduler0.settime((long) 'a');
        testScheduler0.triggerActions(1L);
        long long10 = testScheduler0.time;
        testScheduler0.triggerActions((long) 0);
        long long13 = testScheduler0.now();
        testScheduler0.settime((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(100L);
        testScheduler0.triggerActions();
        testScheduler0.time = (short) 100;
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        testScheduler0.time = 35L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 100;
        testScheduler0.settime(1L);
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long13 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions((long) 1);
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions(1L);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.time;
        testScheduler0.settime((long) (short) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.gettime();
        testScheduler0.time = (short) 1;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        testScheduler0.triggerActions(0L);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 1);
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) -1);
        long long12 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, 35L, (long) (short) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) 10);
        testScheduler0.time = 0L;
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        long long14 = testScheduler0.gettime();
        testScheduler0.settime(1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        long long4 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.gettime();
        testScheduler0.time = (short) 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        long long13 = testScheduler0.time;
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.time = ' ';
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (long) 100, (long) 1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.now();
        testScheduler0.time = (byte) 0;
        testScheduler0.settime((long) (short) 1);
        long long14 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) 1);
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions(0L);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        testScheduler0.time = 0L;
        testScheduler0.time = (short) 10;
        long long17 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.settime((long) 10);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 1);
        testScheduler0.time = '#';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(35L);
        testScheduler0.time = (short) 100;
        long long16 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        testScheduler0.settime((long) (byte) -1);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.time = (short) 1;
        long long10 = testScheduler0.time;
        testScheduler0.time = 0L;
        long long13 = testScheduler0.gettime();
        testScheduler0.settime((long) (-1));
        testScheduler0.time = 97L;
        testScheduler0.settime((-1L));
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.time;
        testScheduler0.time = (byte) 0;
        long long9 = testScheduler0.gettime();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        testScheduler0.time = ' ';
        testScheduler0.settime((long) 100);
        testScheduler0.settime(100L);
        long long11 = testScheduler0.gettime();
        long long12 = testScheduler0.gettime();
        testScheduler0.triggerActions(100L);
        long long15 = testScheduler0.gettime();
        testScheduler0.settime(1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.time;
        testScheduler0.settime((long) (short) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.now();
        testScheduler0.triggerActions((long) ' ');
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue19 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue19);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        testScheduler0.time = ' ';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        long long10 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.time;
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        long long14 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.now();
        testScheduler0.settime((long) 0);
        testScheduler0.settime(35L);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.gettime();
        testScheduler0.time = (-1L);
        long long9 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) 'a');
        testScheduler0.triggerActions(10L);
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator15.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
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
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (-1));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.settime(35L);
        long long9 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) 'a');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        long long15 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator11.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator15.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator15.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime18.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator17.thenComparing(wildcardTimedActionComparator19);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator17.thenComparing(wildcardTimedActionComparator23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator13.thenComparing(wildcardTimedActionComparator23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator26.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator9.thenComparing(wildcardTimedActionComparator27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator29.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime3.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = wildcardTimedActionComparator4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator6.thenComparing(wildcardTimedActionComparator8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime11 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator10.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime11);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator2.thenComparing(wildcardTimedActionComparator10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime18.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator20.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime22.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator25.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator27.thenComparing(wildcardTimedActionComparator29);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime32.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime32.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime32);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime32);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime37.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator38.thenComparing(wildcardTimedActionComparator40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator36.thenComparing(wildcardTimedActionComparator40);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = compareActionsByTime44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime44.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime48 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator47.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime48);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator36.thenComparing(wildcardTimedActionComparator47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator21.thenComparing(wildcardTimedActionComparator36);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator17.thenComparing(wildcardTimedActionComparator21);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime55.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator56.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator56.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime59.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = wildcardTimedActionComparator60.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime63 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime63.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = wildcardTimedActionComparator64.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator62.thenComparing(wildcardTimedActionComparator64);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime67.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = wildcardTimedActionComparator68.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = wildcardTimedActionComparator62.thenComparing(wildcardTimedActionComparator68);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator58.thenComparing(wildcardTimedActionComparator68);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = wildcardTimedActionComparator71.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = wildcardTimedActionComparator71.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = wildcardTimedActionComparator21.thenComparing(wildcardTimedActionComparator71);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime75 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator77.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator77.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator79.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator71.thenComparing(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.gettime();
        long long8 = testScheduler0.time;
        testScheduler0.time = 97L;
        long long11 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long13 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 100;
        testScheduler0.settime(1L);
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.triggerActions((long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        testScheduler0.time = (byte) -1;
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        testScheduler0.time = (byte) 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.settime((long) 10);
        testScheduler0.triggerActions((long) 0);
        long long15 = testScheduler0.now();
        testScheduler0.triggerActions(10L);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        testScheduler0.settime(32L);
        long long22 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) 10);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        testScheduler0.time = (-1L);
        testScheduler0.time = 'a';
        testScheduler0.triggerActions(1L);
        testScheduler0.settime((long) (short) 0);
        long long17 = testScheduler0.time;
        testScheduler0.triggerActions((long) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue20 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue20);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.settime(100L);
        testScheduler0.time = 0L;
        testScheduler0.triggerActions((long) (byte) 10);
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        long long12 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        testScheduler0.time = (byte) 10;
        testScheduler0.settime((long) '#');
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        long long7 = testScheduler0.gettime();
        long long8 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator9);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator18.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator18.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator18.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime22);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator26.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator29.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime33);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator37.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator26.thenComparing(wildcardTimedActionComparator38);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator13.thenComparing(wildcardTimedActionComparator26);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime42.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime42.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator45.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator48.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator52.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator52.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime55.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator56.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator54.thenComparing(wildcardTimedActionComparator56);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime59.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = wildcardTimedActionComparator54.thenComparing(wildcardTimedActionComparator60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator50.thenComparing(wildcardTimedActionComparator60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator46.thenComparing(wildcardTimedActionComparator60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = wildcardTimedActionComparator46.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator41.thenComparing(wildcardTimedActionComparator65);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = wildcardTimedActionComparator65.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = wildcardTimedActionComparator65.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.triggerActions();
        long long8 = testScheduler0.time;
        testScheduler0.time = (short) -1;
        long long11 = testScheduler0.time;
        long long12 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (byte) 1);
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(100L);
        long long12 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (-1L), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        testScheduler0.time = (short) 100;
        testScheduler0.time = 0L;
        long long7 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        testScheduler0.settime((-1L));
        testScheduler0.settime((long) (short) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        long long6 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        testScheduler0.time = 100L;
        long long14 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) 1);
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        long long12 = testScheduler0.now();
        testScheduler0.triggerActions((long) '4');
        long long15 = testScheduler0.now();
        testScheduler0.settime((long) 10);
        testScheduler0.time = ' ';
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        long long22 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.gettime();
        testScheduler0.time = (byte) 10;
        long long12 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 1);
        testScheduler0.time = '#';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(35L);
        long long14 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        long long16 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (short) 10);
        long long10 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator6.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime8.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator11.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing(wildcardTimedActionComparator15);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime17.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator20.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator6.thenComparing(wildcardTimedActionComparator25);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime27.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator28.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime31.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator32.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator32.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime35.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator34.thenComparing(wildcardTimedActionComparator36);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator34.thenComparing(wildcardTimedActionComparator40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator30.thenComparing(wildcardTimedActionComparator40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator30.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime46.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator47.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime50.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator49.thenComparing(wildcardTimedActionComparator51);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime54.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime54.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime54);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator45.thenComparing(wildcardTimedActionComparator53);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime59.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = wildcardTimedActionComparator60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator45.thenComparing(wildcardTimedActionComparator62);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator63.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = wildcardTimedActionComparator6.thenComparing(wildcardTimedActionComparator63);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime66 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime66.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime68.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = wildcardTimedActionComparator69.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator69.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = wildcardTimedActionComparator73.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = wildcardTimedActionComparator71.thenComparing(wildcardTimedActionComparator73);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime76 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = compareActionsByTime76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = compareActionsByTime76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator75.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime76);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = compareActionsByTime66.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime76);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime81 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = compareActionsByTime81.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime83 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator84 = compareActionsByTime83.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = wildcardTimedActionComparator84.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator86 = wildcardTimedActionComparator82.thenComparing(wildcardTimedActionComparator84);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator87 = wildcardTimedActionComparator80.thenComparing(wildcardTimedActionComparator84);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator88 = wildcardTimedActionComparator87.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator89 = wildcardTimedActionComparator87.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator90 = wildcardTimedActionComparator65.thenComparing(wildcardTimedActionComparator89);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator91 = wildcardTimedActionComparator90.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator84);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator87);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator88);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator89);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator90);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator91);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.time;
        testScheduler0.time = (-1);
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 0, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.time;
        testScheduler0.time = (byte) 0;
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.now();
        testScheduler0.settime((long) (byte) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.settime((long) 'a');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.time = '4';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        long long12 = testScheduler0.time;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.time;
        testScheduler0.time = (short) 10;
        testScheduler0.time = 32L;
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedulePeriodically(action0_20, (long) (short) 1, 10L, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.time = 'a';
        long long7 = testScheduler0.time;
        testScheduler0.settime(52L);
        testScheduler0.settime((-1L));
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (byte) -1);
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.gettime();
        long long10 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 0);
        java.lang.Class<?> wildcardClass13 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        testScheduler0.settime((long) (short) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (byte) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        long long15 = testScheduler0.time;
        long long16 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime3.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = wildcardTimedActionComparator4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator6.thenComparing(wildcardTimedActionComparator8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime11 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator10.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime11);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator2.thenComparing(wildcardTimedActionComparator10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator15.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator15.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime18.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator21.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator23.thenComparing(wildcardTimedActionComparator25);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator27.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime28);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime28);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime33.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime35.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator34.thenComparing(wildcardTimedActionComparator36);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator32.thenComparing(wildcardTimedActionComparator36);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime40.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator43.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime44);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator43.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator32.thenComparing(wildcardTimedActionComparator43);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime49 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = compareActionsByTime49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator50.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator48.thenComparing(wildcardTimedActionComparator51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator17.thenComparing(wildcardTimedActionComparator53);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime55.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = compareActionsByTime57.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime55.thenComparing(wildcardTimedActionComparator58);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = wildcardTimedActionComparator54.thenComparing(wildcardTimedActionComparator59);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator54.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (byte) 10);
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (-1), timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(100L);
        testScheduler0.triggerActions();
        testScheduler0.time = (short) 100;
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.time;
        testScheduler0.triggerActions(35L);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long12 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.triggerActions((long) (short) 10);
        testScheduler0.settime((long) (-1));
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) (short) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.time = ' ';
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.gettime();
        long long16 = testScheduler0.time;
        testScheduler0.settime((-1L));
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator2.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator2.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator4.thenComparing(wildcardTimedActionComparator7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime16.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime24.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator27.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime28);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator22.thenComparing(wildcardTimedActionComparator31);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime33.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime37.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator22.thenComparing(wildcardTimedActionComparator41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator4.thenComparing(wildcardTimedActionComparator42);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator43.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime45 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = compareActionsByTime45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime45.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime49 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = compareActionsByTime49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator48.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime49);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = wildcardTimedActionComparator43.thenComparing(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        long long5 = testScheduler0.time;
        long long6 = testScheduler0.gettime();
        testScheduler0.triggerActions(10L);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) (byte) 0, (long) (short) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(1L);
        long long10 = testScheduler0.gettime();
        testScheduler0.settime(0L);
        testScheduler0.time = (short) -1;
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        testScheduler0.time = (-1);
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions(52L);
        testScheduler0.settime((long) (byte) 1);
        testScheduler0.settime((long) 0);
        long long14 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        testScheduler0.settime((long) (short) 1);
        testScheduler0.triggerActions();
        testScheduler0.time = 1L;
        long long12 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        testScheduler0.settime(52L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.time;
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.triggerActions(35L);
        long long11 = testScheduler0.time;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        long long14 = testScheduler0.time;
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, 52L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions();
        long long7 = testScheduler0.now();
        testScheduler0.time = 100L;
        testScheduler0.time = 0L;
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.time;
        long long14 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.now();
        testScheduler0.time = 100;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 100;
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) 'a');
        testScheduler0.triggerActions((long) 0);
        testScheduler0.settime((long) (short) 100);
        testScheduler0.triggerActions(10L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.time;
        testScheduler0.triggerActions(10L);
        long long13 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.time = 10L;
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        testScheduler0.triggerActions((-1L));
        testScheduler0.settime((long) '#');
        testScheduler0.settime(0L);
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_20 = null;
        rx.Subscription subscription21 = testScheduler0.schedule(action0_20);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription21);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime(32L);
        testScheduler0.settime(0L);
        long long9 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions(0L);
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        testScheduler0.time = (short) -1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        testScheduler0.settime(52L);
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (byte) 0);
        long long8 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        testScheduler0.settime((long) (short) 10);
        long long13 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) (short) 100, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.now();
        testScheduler0.settime((long) 0);
        testScheduler0.settime(35L);
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.time;
        testScheduler0.settime(0L);
        testScheduler0.time = 0;
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) 'a', 100L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        testScheduler0.settime(52L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.gettime();
        testScheduler0.settime(32L);
        testScheduler0.time = 97L;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) (byte) 1, (long) (byte) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions((long) 'a');
        long long6 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        testScheduler0.time = 52L;
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        testScheduler0.time = (byte) 10;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.time;
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions((long) (short) -1);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 0);
        testScheduler0.time = 100;
        testScheduler0.triggerActions(97L);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        testScheduler0.triggerActions(10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.time;
        testScheduler0.time = (byte) 0;
        testScheduler0.time = (short) 0;
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        long long17 = testScheduler0.now();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        long long20 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        testScheduler0.settime((long) 'a');
        testScheduler0.triggerActions(1L);
        long long10 = testScheduler0.time;
        long long11 = testScheduler0.now();
        testScheduler0.time = (-1L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.triggerActions();
        testScheduler0.time = 10;
        testScheduler0.time = 32L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        testScheduler0.settime((long) (short) 0);
        testScheduler0.settime((long) 0);
        long long19 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.time;
        testScheduler0.time = (byte) 1;
        long long12 = testScheduler0.time;
        long long13 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        long long15 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) 'a');
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions(10L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.settime(100L);
        testScheduler0.settime((long) (short) 1);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        testScheduler0.time = 35L;
        long long13 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        long long15 = testScheduler0.time;
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.settime(1L);
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.gettime();
        long long12 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator9);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime17.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime17.thenComparing(wildcardTimedActionComparator20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator16.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator16.thenComparing(wildcardTimedActionComparator27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator16.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (byte) -1);
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator15.thenComparing(wildcardTimedActionComparator17);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator11.thenComparing(wildcardTimedActionComparator19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator8.thenComparing(wildcardTimedActionComparator19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator28.thenComparing(wildcardTimedActionComparator29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator2.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator2.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator6.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator7.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator2.thenComparing(wildcardTimedActionComparator7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator17.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime20.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator19.thenComparing(wildcardTimedActionComparator21);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime24.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator19.thenComparing(wildcardTimedActionComparator25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator15.thenComparing(wildcardTimedActionComparator25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator28.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator31.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator34.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime37.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator38.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator36.thenComparing(wildcardTimedActionComparator38);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator32.thenComparing(wildcardTimedActionComparator40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator28.thenComparing(wildcardTimedActionComparator40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator2.thenComparing(wildcardTimedActionComparator48);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator2.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.triggerActions();
        testScheduler0.time = 10;
        testScheduler0.settime(10L);
        testScheduler0.settime((long) ' ');
        testScheduler0.settime(35L);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        long long19 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        testScheduler0.settime((long) 0);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.time;
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 100;
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        testScheduler0.settime(0L);
        testScheduler0.triggerActions(32L);
        testScheduler0.triggerActions(1L);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.time;
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedulePeriodically(action0_8, (long) (byte) -1, (long) (byte) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime11 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = wildcardTimedActionComparator12.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime15 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime15.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator16.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator14.thenComparing(wildcardTimedActionComparator16);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator10.thenComparing(wildcardTimedActionComparator18);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator23.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator26.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator27.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator23.thenComparing(wildcardTimedActionComparator27);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime30.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator36.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime38 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime38.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator41.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator43.thenComparing(wildcardTimedActionComparator45);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime48 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = compareActionsByTime48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator47.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime48);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime38.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime48);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator37.thenComparing(wildcardTimedActionComparator52);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator52.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime55.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator56.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator56.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime59.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = wildcardTimedActionComparator60.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime63 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime63.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = wildcardTimedActionComparator64.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator62.thenComparing(wildcardTimedActionComparator64);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime67.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = wildcardTimedActionComparator68.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = wildcardTimedActionComparator62.thenComparing(wildcardTimedActionComparator68);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator58.thenComparing(wildcardTimedActionComparator68);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = wildcardTimedActionComparator73.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = wildcardTimedActionComparator74.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = wildcardTimedActionComparator71.thenComparing(wildcardTimedActionComparator74);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator54.thenComparing(wildcardTimedActionComparator71);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator71.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator27.thenComparing(wildcardTimedActionComparator71);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator79.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator80.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = wildcardTimedActionComparator5.thenComparing(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(100L);
        long long7 = testScheduler0.gettime();
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions((long) 1);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.time;
        long long14 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.time;
        testScheduler0.triggerActions(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        testScheduler0.triggerActions(35L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.getqueue();
        long long17 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(0L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedulePeriodically(action0_7, (long) (byte) 10, (long) (byte) -1, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        testScheduler0.triggerActions((long) (byte) 0);
        long long10 = testScheduler0.time;
        testScheduler0.triggerActions((long) (short) -1);
        testScheduler0.time = 0;
        testScheduler0.settime((long) 0);
        long long17 = testScheduler0.gettime();
        long long18 = testScheduler0.now();
        java.lang.Class<?> wildcardClass19 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        long long12 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (short) 10);
        long long11 = testScheduler0.time;
        long long12 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.time = 'a';
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        testScheduler0.time = 0L;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 'a', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) 'a');
        testScheduler0.settime(32L);
        testScheduler0.time = 0;
        testScheduler0.settime((long) (-1));
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        testScheduler0.settime((long) '4');
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.time;
        testScheduler0.time = (byte) 0;
        testScheduler0.time = (short) 0;
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        testScheduler0.settime((-1L));
        long long15 = testScheduler0.time;
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        java.lang.Class<?> wildcardClass20 = subscription19.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) 10);
        testScheduler0.time = 0L;
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.time;
        testScheduler0.time = 1;
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) (byte) 0, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.settime((-1L));
        testScheduler0.triggerActions((long) 10);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions((long) (short) -1);
        long long8 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.time;
        testScheduler0.triggerActions(32L);
        testScheduler0.time = (byte) 10;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions((long) 'a');
        long long6 = testScheduler0.gettime();
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.time = 0L;
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        testScheduler0.settime((long) (byte) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.settime(35L);
        long long9 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.time = (-1L);
        long long13 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.time = 97L;
        long long7 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 1);
        long long10 = testScheduler0.now();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        testScheduler0.settime((long) (short) 1);
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator1 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = wildcardTimedActionComparator1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = wildcardTimedActionComparator1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = wildcardTimedActionComparator5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator11.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator14.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator18.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator18.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator20.thenComparing(wildcardTimedActionComparator22);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator26.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator20.thenComparing(wildcardTimedActionComparator26);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator16.thenComparing(wildcardTimedActionComparator26);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator29.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime32.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator33.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator37.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator35.thenComparing(wildcardTimedActionComparator37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator31.thenComparing(wildcardTimedActionComparator39);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator11.thenComparing(wildcardTimedActionComparator39);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator39.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator1);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime(52L);
        testScheduler0.settime((long) (-1));
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.gettime();
        long long15 = testScheduler0.now();
        long long16 = testScheduler0.time;
        long long17 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.time;
        testScheduler0.time = (byte) 0;
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.gettime();
        long long12 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        testScheduler0.settime(52L);
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        testScheduler0.time = (short) 0;
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        testScheduler0.settime((long) (byte) 0);
        testScheduler0.settime((long) (short) -1);
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.gettime();
        testScheduler0.settime(32L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 0);
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(100L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        long long7 = testScheduler0.time;
        testScheduler0.settime((long) (byte) 0);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        long long13 = testScheduler0.now();
        testScheduler0.settime((long) (byte) 0);
        long long16 = testScheduler0.now();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        testScheduler0.triggerActions((long) (-1));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue21 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue21);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        long long4 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (short) 10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.time = (short) 0;
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        long long9 = testScheduler0.now();
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.time;
        testScheduler0.time = (byte) 0;
        testScheduler0.time = (short) 0;
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        testScheduler0.triggerActions(1L);
        long long18 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) -1);
        long long21 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.time;
        long long11 = testScheduler0.now();
        testScheduler0.time = (short) 10;
        long long14 = testScheduler0.time;
        long long15 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        testScheduler0.settime(52L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.gettime();
        testScheduler0.settime(32L);
        long long12 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime((-1L));
        testScheduler0.settime((long) (byte) 100);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) (byte) -1, 97L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        testScheduler0.settime((long) 'a');
        testScheduler0.triggerActions(1L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        testScheduler0.settime((long) (short) 100);
        testScheduler0.time = 97L;
        testScheduler0.triggerActions((long) 0);
        long long12 = testScheduler0.now();
        testScheduler0.time = (short) 100;
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        testScheduler0.settime((long) (byte) 100);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.time = 'a';
        long long7 = testScheduler0.time;
        testScheduler0.settime(52L);
        testScheduler0.settime((-1L));
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, 35L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = 100L;
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions(35L);
        long long7 = testScheduler0.gettime();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.gettime();
        testScheduler0.triggerActions(35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = 1;
        testScheduler0.time = (-1);
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        testScheduler0.settime((long) (short) 1);
        testScheduler0.settime((long) (short) 10);
        testScheduler0.triggerActions((long) (short) 0);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        java.lang.Class<?> wildcardClass17 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (-1));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.time;
        testScheduler0.time = (-1);
        long long7 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.now();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.now();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.time;
        testScheduler0.triggerActions(0L);
        testScheduler0.time = (byte) 10;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '4');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.time;
        testScheduler0.settime((long) (short) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.gettime();
        testScheduler0.time = (short) 1;
        long long13 = testScheduler0.now();
        testScheduler0.time = (byte) 1;
        testScheduler0.settime((long) 'a');
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        long long20 = testScheduler0.now();
        java.lang.Class<?> wildcardClass21 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        long long13 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 1);
        testScheduler0.time = '#';
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (short) -1);
        long long17 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.settime((long) '4');
        long long3 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.settime(0L);
        testScheduler0.time = (short) 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        long long15 = testScheduler0.time;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }
}

