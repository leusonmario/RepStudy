import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.AbstractJanitor.Context context1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor2 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, context1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor9 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "";
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str0 = com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY;
// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "owner" + "'", str0, "owner");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.Class<?> wildcardClass4 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.Class<?> wildcardClass4 = monkeyCalendar3.getClass();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext10 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker6, monkeyCalendar7, monkeyConfiguration8, monkeyRecorder9);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor11 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = basicJanitorMonkeyContext5.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = basicJanitorMonkeyContext5.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorMonkeyContext5.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext10 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorMonkeyContext10.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorMonkeyContext10.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder12);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyCalendar6);
        org.junit.Assert.assertNotNull(monkeyRecorder7);
        org.junit.Assert.assertNotNull(monkeyCalendar8);
        org.junit.Assert.assertNotNull(monkeyCalendar11);
        org.junit.Assert.assertNotNull(monkeyRecorder12);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext9.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = basicJanitorMonkeyContext9.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorMonkeyContext9.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider13 = basicJanitorMonkeyContext9.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext15.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = basicJanitorMonkeyContext15.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorMonkeyContext15.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorMonkeyContext24.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = basicJanitorMonkeyContext29.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine21, janitorCrawler22, janitorResourceTracker23, monkeyCalendar27, monkeyConfiguration28, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker14, monkeyCalendar18, monkeyConfiguration19, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar35 = basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration36 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar38 = basicJanitorMonkeyContext37.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = basicJanitorMonkeyContext37.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker14, monkeyCalendar35, monkeyConfiguration36, monkeyRecorder39);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine42 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler43 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker44 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine46 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler47 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker48 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext49 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder51 = basicJanitorMonkeyContext49.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration53 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext54 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar55 = basicJanitorMonkeyContext54.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder56 = basicJanitorMonkeyContext54.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext57 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine46, janitorCrawler47, janitorResourceTracker48, monkeyCalendar52, monkeyConfiguration53, monkeyRecorder56);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration58 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext59 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event60 = null;
        basicJanitorMonkeyContext59.reportEvent(event60);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder62 = basicJanitorMonkeyContext59.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext63 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine42, janitorCrawler43, janitorResourceTracker44, monkeyCalendar52, monkeyConfiguration58, monkeyRecorder62);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration64 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext65 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar66 = basicJanitorMonkeyContext65.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder67 = basicJanitorMonkeyContext65.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext68 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker14, monkeyCalendar52, monkeyConfiguration64, monkeyRecorder67);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker69 = basicJanitorContext68.janitorResourceTracker();
        org.junit.Assert.assertNotNull(aWSClient11);
        org.junit.Assert.assertNotNull(monkeyCalendar12);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider13);
        org.junit.Assert.assertNotNull(janitorResourceTracker14);
        org.junit.Assert.assertNotNull(aWSClient17);
        org.junit.Assert.assertNotNull(monkeyCalendar18);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(monkeyRecorder26);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyCalendar30);
        org.junit.Assert.assertNotNull(monkeyRecorder31);
        org.junit.Assert.assertNotNull(monkeyCalendar35);
        org.junit.Assert.assertNotNull(monkeyCalendar38);
        org.junit.Assert.assertNotNull(monkeyRecorder39);
        org.junit.Assert.assertNotNull(monkeyCalendar50);
        org.junit.Assert.assertNotNull(monkeyRecorder51);
        org.junit.Assert.assertNotNull(monkeyCalendar52);
        org.junit.Assert.assertNotNull(monkeyCalendar55);
        org.junit.Assert.assertNotNull(monkeyRecorder56);
        org.junit.Assert.assertNotNull(monkeyRecorder62);
        org.junit.Assert.assertNotNull(monkeyCalendar66);
        org.junit.Assert.assertNotNull(monkeyRecorder67);
        org.junit.Assert.assertNotNull(janitorResourceTracker69);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(monkeyCalendar9);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "us-west-1";
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        org.junit.Assert.assertNotNull(monkeyCalendar5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder.Event event2 = null;
        basicJanitorMonkeyContext0.reportEvent(event2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = basicJanitorMonkeyContext0.getEventReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyCalendar1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "default";
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext10 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker6, monkeyCalendar7, monkeyConfiguration8, monkeyRecorder9);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorContext10.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext10.configuration();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor13 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNull(janitorResourceTracker11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext9.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = basicJanitorMonkeyContext9.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorMonkeyContext9.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider13 = basicJanitorMonkeyContext9.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext15.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = basicJanitorMonkeyContext15.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorMonkeyContext15.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorMonkeyContext24.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = basicJanitorMonkeyContext29.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine21, janitorCrawler22, janitorResourceTracker23, monkeyCalendar27, monkeyConfiguration28, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker14, monkeyCalendar18, monkeyConfiguration19, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar35 = basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext36 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event37 = null;
        basicJanitorMonkeyContext36.reportEvent(event37);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = basicJanitorMonkeyContext36.recorder();
        java.lang.String str40 = basicJanitorMonkeyContext36.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar41 = basicJanitorMonkeyContext36.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration42 = basicJanitorMonkeyContext36.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine44 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler45 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext46.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient48 = basicJanitorMonkeyContext46.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar49 = basicJanitorMonkeyContext46.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider50 = basicJanitorMonkeyContext46.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker51 = basicJanitorMonkeyContext46.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext52 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext52.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient54 = basicJanitorMonkeyContext52.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar55 = basicJanitorMonkeyContext52.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration56 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine58 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler59 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker60 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar62 = basicJanitorMonkeyContext61.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder63 = basicJanitorMonkeyContext61.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar64 = basicJanitorMonkeyContext61.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar67 = basicJanitorMonkeyContext66.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder68 = basicJanitorMonkeyContext66.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext69 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine58, janitorCrawler59, janitorResourceTracker60, monkeyCalendar64, monkeyConfiguration65, monkeyRecorder68);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext70 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine44, janitorCrawler45, janitorResourceTracker51, monkeyCalendar55, monkeyConfiguration56, monkeyRecorder68);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext71 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker14, monkeyCalendar35, monkeyConfiguration42, monkeyRecorder68);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor72 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(aWSClient11);
        org.junit.Assert.assertNotNull(monkeyCalendar12);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider13);
        org.junit.Assert.assertNotNull(janitorResourceTracker14);
        org.junit.Assert.assertNotNull(aWSClient17);
        org.junit.Assert.assertNotNull(monkeyCalendar18);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(monkeyRecorder26);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyCalendar30);
        org.junit.Assert.assertNotNull(monkeyRecorder31);
        org.junit.Assert.assertNotNull(monkeyCalendar35);
        org.junit.Assert.assertNotNull(monkeyRecorder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "default" + "'", str40, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar41);
        org.junit.Assert.assertNotNull(monkeyConfiguration42);
        org.junit.Assert.assertNotNull(aWSClient48);
        org.junit.Assert.assertNotNull(monkeyCalendar49);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider50);
        org.junit.Assert.assertNotNull(janitorResourceTracker51);
        org.junit.Assert.assertNotNull(aWSClient54);
        org.junit.Assert.assertNotNull(monkeyCalendar55);
        org.junit.Assert.assertNotNull(monkeyCalendar62);
        org.junit.Assert.assertNotNull(monkeyRecorder63);
        org.junit.Assert.assertNotNull(monkeyCalendar64);
        org.junit.Assert.assertNotNull(monkeyCalendar67);
        org.junit.Assert.assertNotNull(monkeyRecorder68);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorMonkeyContext8.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorMonkeyContext13.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar11, monkeyConfiguration12, monkeyRecorder15);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event19 = null;
        basicJanitorMonkeyContext18.reportEvent(event19);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorMonkeyContext18.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext22 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar11, monkeyConfiguration17, monkeyRecorder21);
        java.lang.String str23 = basicJanitorContext22.region();
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(monkeyRecorder10);
        org.junit.Assert.assertNotNull(monkeyCalendar11);
        org.junit.Assert.assertNotNull(monkeyCalendar14);
        org.junit.Assert.assertNotNull(monkeyRecorder15);
        org.junit.Assert.assertNotNull(monkeyRecorder21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.CloudClient cloudClient6 = basicJanitorMonkeyContext0.cloudClient();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        org.junit.Assert.assertNotNull(abstractJanitorList5);
        org.junit.Assert.assertNotNull(cloudClient6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertNotNull(abstractJanitorList6);
        org.junit.Assert.assertNotNull(context7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
        basicJanitorMonkeyContext0.reportEvent(event5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = basicJanitorMonkeyContext0.getEventReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.Class<?> wildcardClass4 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = basicJanitorMonkeyContext3.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = basicJanitorMonkeyContext3.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext16.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient18 = basicJanitorMonkeyContext16.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorMonkeyContext16.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider20 = basicJanitorMonkeyContext16.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorMonkeyContext16.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext22.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient24 = basicJanitorMonkeyContext22.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler29 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar32 = basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder33 = basicJanitorMonkeyContext31.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar34 = basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration35 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext36 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = basicJanitorMonkeyContext36.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder38 = basicJanitorMonkeyContext36.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext39 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine28, janitorCrawler29, janitorResourceTracker30, monkeyCalendar34, monkeyConfiguration35, monkeyRecorder38);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine14, janitorCrawler15, janitorResourceTracker21, monkeyCalendar25, monkeyConfiguration26, monkeyRecorder38);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = basicJanitorMonkeyContext41.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration43 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar45 = basicJanitorMonkeyContext44.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder46 = basicJanitorMonkeyContext44.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext47 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine11, janitorCrawler12, janitorResourceTracker21, monkeyCalendar42, monkeyConfiguration43, monkeyRecorder46);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine49 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler50 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker51 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine53 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler54 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker55 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext56 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar57 = basicJanitorMonkeyContext56.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder58 = basicJanitorMonkeyContext56.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar59 = basicJanitorMonkeyContext56.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration60 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar62 = basicJanitorMonkeyContext61.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder63 = basicJanitorMonkeyContext61.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext64 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine53, janitorCrawler54, janitorResourceTracker55, monkeyCalendar59, monkeyConfiguration60, monkeyRecorder63);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event67 = null;
        basicJanitorMonkeyContext66.reportEvent(event67);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder69 = basicJanitorMonkeyContext66.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext70 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine49, janitorCrawler50, janitorResourceTracker51, monkeyCalendar59, monkeyConfiguration65, monkeyRecorder69);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration71 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext72 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar73 = basicJanitorMonkeyContext72.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder74 = basicJanitorMonkeyContext72.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext75 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker21, monkeyCalendar59, monkeyConfiguration71, monkeyRecorder74);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration76 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext77 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event78 = null;
        basicJanitorMonkeyContext77.reportEvent(event78);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder80 = basicJanitorMonkeyContext77.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext81 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker6, monkeyCalendar59, monkeyConfiguration76, monkeyRecorder80);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar82 = basicJanitorContext81.calendar();
        org.junit.Assert.assertNotNull(monkeyCalendar4);
        org.junit.Assert.assertNotNull(monkeyRecorder5);
        org.junit.Assert.assertNotNull(janitorResourceTracker6);
        org.junit.Assert.assertNotNull(aWSClient18);
        org.junit.Assert.assertNotNull(monkeyCalendar19);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider20);
        org.junit.Assert.assertNotNull(janitorResourceTracker21);
        org.junit.Assert.assertNotNull(aWSClient24);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(monkeyCalendar32);
        org.junit.Assert.assertNotNull(monkeyRecorder33);
        org.junit.Assert.assertNotNull(monkeyCalendar34);
        org.junit.Assert.assertNotNull(monkeyCalendar37);
        org.junit.Assert.assertNotNull(monkeyRecorder38);
        org.junit.Assert.assertNotNull(monkeyCalendar42);
        org.junit.Assert.assertNotNull(monkeyCalendar45);
        org.junit.Assert.assertNotNull(monkeyRecorder46);
        org.junit.Assert.assertNotNull(monkeyCalendar57);
        org.junit.Assert.assertNotNull(monkeyRecorder58);
        org.junit.Assert.assertNotNull(monkeyCalendar59);
        org.junit.Assert.assertNotNull(monkeyCalendar62);
        org.junit.Assert.assertNotNull(monkeyRecorder63);
        org.junit.Assert.assertNotNull(monkeyRecorder69);
        org.junit.Assert.assertNotNull(monkeyCalendar73);
        org.junit.Assert.assertNotNull(monkeyRecorder74);
        org.junit.Assert.assertNotNull(monkeyRecorder80);
        org.junit.Assert.assertNotNull(monkeyCalendar82);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str7 = basicJanitorMonkeyContext0.getEventReport();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertNotNull(monkeyRecorder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = basicJanitorMonkeyContext0.configuration();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(monkeyConfiguration4);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertNotNull(context4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorMonkeyContext11.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorMonkeyContext16.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorMonkeyContext16.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker10, monkeyCalendar14, monkeyConfiguration15, monkeyRecorder18);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event22 = null;
        basicJanitorMonkeyContext21.reportEvent(event22);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorMonkeyContext21.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext25 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker6, monkeyCalendar14, monkeyConfiguration20, monkeyRecorder24);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor26 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar12);
        org.junit.Assert.assertNotNull(monkeyRecorder13);
        org.junit.Assert.assertNotNull(monkeyCalendar14);
        org.junit.Assert.assertNotNull(monkeyCalendar17);
        org.junit.Assert.assertNotNull(monkeyRecorder18);
        org.junit.Assert.assertNotNull(monkeyRecorder24);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorMonkeyContext8.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorMonkeyContext8.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext21.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient23 = basicJanitorMonkeyContext21.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorMonkeyContext21.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider25 = basicJanitorMonkeyContext21.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorMonkeyContext21.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext27 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext27.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient29 = basicJanitorMonkeyContext27.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = basicJanitorMonkeyContext27.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration31 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine33 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler34 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext36 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = basicJanitorMonkeyContext36.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder38 = basicJanitorMonkeyContext36.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar39 = basicJanitorMonkeyContext36.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration40 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = basicJanitorMonkeyContext41.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder43 = basicJanitorMonkeyContext41.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine33, janitorCrawler34, janitorResourceTracker35, monkeyCalendar39, monkeyConfiguration40, monkeyRecorder43);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine19, janitorCrawler20, janitorResourceTracker26, monkeyCalendar30, monkeyConfiguration31, monkeyRecorder43);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar47 = basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration48 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext49 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder51 = basicJanitorMonkeyContext49.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext52 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine16, janitorCrawler17, janitorResourceTracker26, monkeyCalendar47, monkeyConfiguration48, monkeyRecorder51);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine54 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler55 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker56 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine58 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler59 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker60 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar62 = basicJanitorMonkeyContext61.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder63 = basicJanitorMonkeyContext61.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar64 = basicJanitorMonkeyContext61.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar67 = basicJanitorMonkeyContext66.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder68 = basicJanitorMonkeyContext66.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext69 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine58, janitorCrawler59, janitorResourceTracker60, monkeyCalendar64, monkeyConfiguration65, monkeyRecorder68);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration70 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext71 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event72 = null;
        basicJanitorMonkeyContext71.reportEvent(event72);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder74 = basicJanitorMonkeyContext71.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext75 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine54, janitorCrawler55, janitorResourceTracker56, monkeyCalendar64, monkeyConfiguration70, monkeyRecorder74);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration76 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext77 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar78 = basicJanitorMonkeyContext77.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder79 = basicJanitorMonkeyContext77.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext80 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine13, janitorCrawler14, janitorResourceTracker26, monkeyCalendar64, monkeyConfiguration76, monkeyRecorder79);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration81 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext82 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event83 = null;
        basicJanitorMonkeyContext82.reportEvent(event83);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder85 = basicJanitorMonkeyContext82.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext86 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker11, monkeyCalendar64, monkeyConfiguration81, monkeyRecorder85);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor87 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(monkeyRecorder10);
        org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNotNull(aWSClient23);
        org.junit.Assert.assertNotNull(monkeyCalendar24);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider25);
        org.junit.Assert.assertNotNull(janitorResourceTracker26);
        org.junit.Assert.assertNotNull(aWSClient29);
        org.junit.Assert.assertNotNull(monkeyCalendar30);
        org.junit.Assert.assertNotNull(monkeyCalendar37);
        org.junit.Assert.assertNotNull(monkeyRecorder38);
        org.junit.Assert.assertNotNull(monkeyCalendar39);
        org.junit.Assert.assertNotNull(monkeyCalendar42);
        org.junit.Assert.assertNotNull(monkeyRecorder43);
        org.junit.Assert.assertNotNull(monkeyCalendar47);
        org.junit.Assert.assertNotNull(monkeyCalendar50);
        org.junit.Assert.assertNotNull(monkeyRecorder51);
        org.junit.Assert.assertNotNull(monkeyCalendar62);
        org.junit.Assert.assertNotNull(monkeyRecorder63);
        org.junit.Assert.assertNotNull(monkeyCalendar64);
        org.junit.Assert.assertNotNull(monkeyCalendar67);
        org.junit.Assert.assertNotNull(monkeyRecorder68);
        org.junit.Assert.assertNotNull(monkeyRecorder74);
        org.junit.Assert.assertNotNull(monkeyCalendar78);
        org.junit.Assert.assertNotNull(monkeyRecorder79);
        org.junit.Assert.assertNotNull(monkeyRecorder85);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = basicJanitorMonkeyContext5.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = basicJanitorMonkeyContext5.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorMonkeyContext5.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext10 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorMonkeyContext10.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorMonkeyContext10.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder12);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext13.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor15 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyCalendar6);
        org.junit.Assert.assertNotNull(monkeyRecorder7);
        org.junit.Assert.assertNotNull(monkeyCalendar8);
        org.junit.Assert.assertNotNull(monkeyCalendar11);
        org.junit.Assert.assertNotNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorRuleEngine14);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.String str6 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext0.resourceTracker();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "default" + "'", str6, "default");
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "owner";
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context1 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = basicJanitorMonkeyContext0.calendar();
        org.junit.Assert.assertNotNull(context1);
        org.junit.Assert.assertNotNull(monkeyCalendar2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = basicJanitorMonkeyContext0.janitors();
        java.lang.String str6 = basicJanitorMonkeyContext0.getEventReport();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        org.junit.Assert.assertNotNull(abstractJanitorList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
        basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler7 = basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context8 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
        org.junit.Assert.assertNotNull(monkeyScheduler7);
        org.junit.Assert.assertNotNull(context8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNull(monkeyConfiguration10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext6.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext6.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext6.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = basicJanitorMonkeyContext6.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext12.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient14 = basicJanitorMonkeyContext12.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorMonkeyContext21.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext26.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = basicJanitorMonkeyContext26.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker20, monkeyCalendar24, monkeyConfiguration25, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar32 = basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration33 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar35 = basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = basicJanitorMonkeyContext34.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker11, monkeyCalendar32, monkeyConfiguration33, monkeyRecorder36);
        java.lang.String str38 = basicJanitorContext37.region();
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
        org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNotNull(aWSClient14);
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(monkeyCalendar22);
        org.junit.Assert.assertNotNull(monkeyRecorder23);
        org.junit.Assert.assertNotNull(monkeyCalendar24);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyRecorder28);
        org.junit.Assert.assertNotNull(monkeyCalendar32);
        org.junit.Assert.assertNotNull(monkeyCalendar35);
        org.junit.Assert.assertNotNull(monkeyRecorder36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "us-west-1" + "'", str38, "us-west-1");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext12.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext12.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor15 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = basicJanitorMonkeyContext3.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = basicJanitorMonkeyContext3.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = basicJanitorMonkeyContext3.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext9.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = basicJanitorMonkeyContext9.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorMonkeyContext9.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorMonkeyContext18.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorMonkeyContext18.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorMonkeyContext18.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorMonkeyContext23.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorMonkeyContext23.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine15, janitorCrawler16, janitorResourceTracker17, monkeyCalendar21, monkeyConfiguration22, monkeyRecorder25);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext27 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar12, monkeyConfiguration13, monkeyRecorder25);
        java.lang.Class<?> wildcardClass28 = janitorResourceTracker8.getClass();
        org.junit.Assert.assertNotNull(aWSClient5);
        org.junit.Assert.assertNotNull(monkeyCalendar6);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider7);
        org.junit.Assert.assertNotNull(janitorResourceTracker8);
        org.junit.Assert.assertNotNull(aWSClient11);
        org.junit.Assert.assertNotNull(monkeyCalendar12);
        org.junit.Assert.assertNotNull(monkeyCalendar19);
        org.junit.Assert.assertNotNull(monkeyRecorder20);
        org.junit.Assert.assertNotNull(monkeyCalendar21);
        org.junit.Assert.assertNotNull(monkeyCalendar24);
        org.junit.Assert.assertNotNull(monkeyRecorder25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext9.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = basicJanitorMonkeyContext9.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorMonkeyContext9.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider13 = basicJanitorMonkeyContext9.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext15.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = basicJanitorMonkeyContext15.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorMonkeyContext15.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorMonkeyContext24.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = basicJanitorMonkeyContext29.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine21, janitorCrawler22, janitorResourceTracker23, monkeyCalendar27, monkeyConfiguration28, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker14, monkeyCalendar18, monkeyConfiguration19, monkeyRecorder31);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine35 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler36 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine38 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler39 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext40.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient42 = basicJanitorMonkeyContext40.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar43 = basicJanitorMonkeyContext40.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider44 = basicJanitorMonkeyContext40.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker45 = basicJanitorMonkeyContext40.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext46.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient48 = basicJanitorMonkeyContext46.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar49 = basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration50 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine52 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler53 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker54 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext55 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = basicJanitorMonkeyContext55.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder57 = basicJanitorMonkeyContext55.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar58 = basicJanitorMonkeyContext55.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration59 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext60 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar61 = basicJanitorMonkeyContext60.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder62 = basicJanitorMonkeyContext60.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext63 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine52, janitorCrawler53, janitorResourceTracker54, monkeyCalendar58, monkeyConfiguration59, monkeyRecorder62);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext64 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine38, janitorCrawler39, janitorResourceTracker45, monkeyCalendar49, monkeyConfiguration50, monkeyRecorder62);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext65 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar66 = basicJanitorMonkeyContext65.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration67 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext68 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar69 = basicJanitorMonkeyContext68.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder70 = basicJanitorMonkeyContext68.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext71 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine35, janitorCrawler36, janitorResourceTracker45, monkeyCalendar66, monkeyConfiguration67, monkeyRecorder70);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext72 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar73 = basicJanitorMonkeyContext72.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder74 = basicJanitorMonkeyContext72.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration75 = basicJanitorMonkeyContext72.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext76 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar77 = basicJanitorMonkeyContext76.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder78 = basicJanitorMonkeyContext76.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration79 = basicJanitorMonkeyContext76.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder80 = basicJanitorMonkeyContext76.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext81 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("default", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker14, monkeyCalendar66, monkeyConfiguration75, monkeyRecorder80);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext82 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar83 = basicJanitorMonkeyContext82.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder84 = basicJanitorMonkeyContext82.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar85 = basicJanitorMonkeyContext82.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext86 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event87 = null;
        basicJanitorMonkeyContext86.reportEvent(event87);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder89 = basicJanitorMonkeyContext86.recorder();
        java.lang.String str90 = basicJanitorMonkeyContext86.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar91 = basicJanitorMonkeyContext86.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration92 = basicJanitorMonkeyContext86.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext93 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar94 = basicJanitorMonkeyContext93.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder95 = basicJanitorMonkeyContext93.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker96 = basicJanitorMonkeyContext93.resourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder97 = basicJanitorMonkeyContext93.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext98 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker14, monkeyCalendar85, monkeyConfiguration92, monkeyRecorder97);
        org.junit.Assert.assertNotNull(aWSClient11);
        org.junit.Assert.assertNotNull(monkeyCalendar12);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider13);
        org.junit.Assert.assertNotNull(janitorResourceTracker14);
        org.junit.Assert.assertNotNull(aWSClient17);
        org.junit.Assert.assertNotNull(monkeyCalendar18);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(monkeyRecorder26);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyCalendar30);
        org.junit.Assert.assertNotNull(monkeyRecorder31);
        org.junit.Assert.assertNotNull(aWSClient42);
        org.junit.Assert.assertNotNull(monkeyCalendar43);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider44);
        org.junit.Assert.assertNotNull(janitorResourceTracker45);
        org.junit.Assert.assertNotNull(aWSClient48);
        org.junit.Assert.assertNotNull(monkeyCalendar49);
        org.junit.Assert.assertNotNull(monkeyCalendar56);
        org.junit.Assert.assertNotNull(monkeyRecorder57);
        org.junit.Assert.assertNotNull(monkeyCalendar58);
        org.junit.Assert.assertNotNull(monkeyCalendar61);
        org.junit.Assert.assertNotNull(monkeyRecorder62);
        org.junit.Assert.assertNotNull(monkeyCalendar66);
        org.junit.Assert.assertNotNull(monkeyCalendar69);
        org.junit.Assert.assertNotNull(monkeyRecorder70);
        org.junit.Assert.assertNotNull(monkeyCalendar73);
        org.junit.Assert.assertNotNull(monkeyRecorder74);
        org.junit.Assert.assertNotNull(monkeyConfiguration75);
        org.junit.Assert.assertNotNull(monkeyCalendar77);
        org.junit.Assert.assertNotNull(monkeyRecorder78);
        org.junit.Assert.assertNotNull(monkeyConfiguration79);
        org.junit.Assert.assertNotNull(monkeyRecorder80);
        org.junit.Assert.assertNotNull(monkeyCalendar83);
        org.junit.Assert.assertNotNull(monkeyRecorder84);
        org.junit.Assert.assertNotNull(monkeyCalendar85);
        org.junit.Assert.assertNotNull(monkeyRecorder89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "default" + "'", str90, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar91);
        org.junit.Assert.assertNotNull(monkeyConfiguration92);
        org.junit.Assert.assertNotNull(monkeyCalendar94);
        org.junit.Assert.assertNotNull(monkeyRecorder95);
        org.junit.Assert.assertNotNull(janitorResourceTracker96);
        org.junit.Assert.assertNotNull(monkeyRecorder97);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        java.lang.String str5 = basicJanitorMonkeyContext0.accountName();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "default" + "'", str5, "default");
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = basicJanitorMonkeyContext3.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = basicJanitorMonkeyContext3.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext16.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient18 = basicJanitorMonkeyContext16.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorMonkeyContext16.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider20 = basicJanitorMonkeyContext16.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorMonkeyContext16.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext22.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient24 = basicJanitorMonkeyContext22.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler29 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar32 = basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder33 = basicJanitorMonkeyContext31.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar34 = basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration35 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext36 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = basicJanitorMonkeyContext36.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder38 = basicJanitorMonkeyContext36.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext39 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine28, janitorCrawler29, janitorResourceTracker30, monkeyCalendar34, monkeyConfiguration35, monkeyRecorder38);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine14, janitorCrawler15, janitorResourceTracker21, monkeyCalendar25, monkeyConfiguration26, monkeyRecorder38);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = basicJanitorMonkeyContext41.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration43 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar45 = basicJanitorMonkeyContext44.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder46 = basicJanitorMonkeyContext44.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext47 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine11, janitorCrawler12, janitorResourceTracker21, monkeyCalendar42, monkeyConfiguration43, monkeyRecorder46);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine49 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler50 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker51 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine53 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler54 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker55 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext56 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar57 = basicJanitorMonkeyContext56.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder58 = basicJanitorMonkeyContext56.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar59 = basicJanitorMonkeyContext56.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration60 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar62 = basicJanitorMonkeyContext61.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder63 = basicJanitorMonkeyContext61.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext64 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine53, janitorCrawler54, janitorResourceTracker55, monkeyCalendar59, monkeyConfiguration60, monkeyRecorder63);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event67 = null;
        basicJanitorMonkeyContext66.reportEvent(event67);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder69 = basicJanitorMonkeyContext66.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext70 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine49, janitorCrawler50, janitorResourceTracker51, monkeyCalendar59, monkeyConfiguration65, monkeyRecorder69);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration71 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext72 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar73 = basicJanitorMonkeyContext72.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder74 = basicJanitorMonkeyContext72.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext75 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker21, monkeyCalendar59, monkeyConfiguration71, monkeyRecorder74);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration76 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext77 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event78 = null;
        basicJanitorMonkeyContext77.reportEvent(event78);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder80 = basicJanitorMonkeyContext77.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext81 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker6, monkeyCalendar59, monkeyConfiguration76, monkeyRecorder80);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder82 = basicJanitorContext81.recorder();
        org.junit.Assert.assertNotNull(monkeyCalendar4);
        org.junit.Assert.assertNotNull(monkeyRecorder5);
        org.junit.Assert.assertNotNull(janitorResourceTracker6);
        org.junit.Assert.assertNotNull(aWSClient18);
        org.junit.Assert.assertNotNull(monkeyCalendar19);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider20);
        org.junit.Assert.assertNotNull(janitorResourceTracker21);
        org.junit.Assert.assertNotNull(aWSClient24);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(monkeyCalendar32);
        org.junit.Assert.assertNotNull(monkeyRecorder33);
        org.junit.Assert.assertNotNull(monkeyCalendar34);
        org.junit.Assert.assertNotNull(monkeyCalendar37);
        org.junit.Assert.assertNotNull(monkeyRecorder38);
        org.junit.Assert.assertNotNull(monkeyCalendar42);
        org.junit.Assert.assertNotNull(monkeyCalendar45);
        org.junit.Assert.assertNotNull(monkeyRecorder46);
        org.junit.Assert.assertNotNull(monkeyCalendar57);
        org.junit.Assert.assertNotNull(monkeyRecorder58);
        org.junit.Assert.assertNotNull(monkeyCalendar59);
        org.junit.Assert.assertNotNull(monkeyCalendar62);
        org.junit.Assert.assertNotNull(monkeyRecorder63);
        org.junit.Assert.assertNotNull(monkeyRecorder69);
        org.junit.Assert.assertNotNull(monkeyCalendar73);
        org.junit.Assert.assertNotNull(monkeyRecorder74);
        org.junit.Assert.assertNotNull(monkeyRecorder80);
        org.junit.Assert.assertNotNull(monkeyRecorder82);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str6 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient7 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker12, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext16.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor18 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient8, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
        org.junit.Assert.assertNotNull(cloudClient7);
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNull(monkeyCalendar17);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str6 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient7 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker12, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext16.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor18 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient8, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
        org.junit.Assert.assertNotNull(cloudClient7);
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNull(janitorRuleEngine17);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        java.lang.String str5 = basicJanitorMonkeyContext0.accountName();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "default" + "'", str5, "default");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext6.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext6.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext6.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = basicJanitorMonkeyContext6.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext12.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient14 = basicJanitorMonkeyContext12.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorMonkeyContext21.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext26.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = basicJanitorMonkeyContext26.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker20, monkeyCalendar24, monkeyConfiguration25, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar32 = basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event34 = null;
        basicJanitorMonkeyContext33.reportEvent(event34);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = basicJanitorMonkeyContext33.recorder();
        java.lang.String str37 = basicJanitorMonkeyContext33.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar38 = basicJanitorMonkeyContext33.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration39 = basicJanitorMonkeyContext33.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine41 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler42 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext43.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient45 = basicJanitorMonkeyContext43.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar46 = basicJanitorMonkeyContext43.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider47 = basicJanitorMonkeyContext43.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker48 = basicJanitorMonkeyContext43.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext49 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext49.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient51 = basicJanitorMonkeyContext49.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration53 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine55 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler56 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker57 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext58 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar59 = basicJanitorMonkeyContext58.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder60 = basicJanitorMonkeyContext58.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar61 = basicJanitorMonkeyContext58.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration62 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext63 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar64 = basicJanitorMonkeyContext63.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder65 = basicJanitorMonkeyContext63.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine55, janitorCrawler56, janitorResourceTracker57, monkeyCalendar61, monkeyConfiguration62, monkeyRecorder65);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext67 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine41, janitorCrawler42, janitorResourceTracker48, monkeyCalendar52, monkeyConfiguration53, monkeyRecorder65);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext68 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker11, monkeyCalendar32, monkeyConfiguration39, monkeyRecorder65);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration69 = basicJanitorContext68.configuration();
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
        org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNotNull(aWSClient14);
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(monkeyCalendar22);
        org.junit.Assert.assertNotNull(monkeyRecorder23);
        org.junit.Assert.assertNotNull(monkeyCalendar24);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyRecorder28);
        org.junit.Assert.assertNotNull(monkeyCalendar32);
        org.junit.Assert.assertNotNull(monkeyRecorder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "default" + "'", str37, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar38);
        org.junit.Assert.assertNotNull(monkeyConfiguration39);
        org.junit.Assert.assertNotNull(aWSClient45);
        org.junit.Assert.assertNotNull(monkeyCalendar46);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider47);
        org.junit.Assert.assertNotNull(janitorResourceTracker48);
        org.junit.Assert.assertNotNull(aWSClient51);
        org.junit.Assert.assertNotNull(monkeyCalendar52);
        org.junit.Assert.assertNotNull(monkeyCalendar59);
        org.junit.Assert.assertNotNull(monkeyRecorder60);
        org.junit.Assert.assertNotNull(monkeyCalendar61);
        org.junit.Assert.assertNotNull(monkeyCalendar64);
        org.junit.Assert.assertNotNull(monkeyRecorder65);
        org.junit.Assert.assertNotNull(monkeyConfiguration69);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
        basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str8 = basicJanitorMonkeyContext0.region();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = basicJanitorMonkeyContext0.getEventReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
        org.junit.Assert.assertNotNull(context7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorMonkeyContext8.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorMonkeyContext13.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar11, monkeyConfiguration12, monkeyRecorder15);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event19 = null;
        basicJanitorMonkeyContext18.reportEvent(event19);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorMonkeyContext18.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext22 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar11, monkeyConfiguration17, monkeyRecorder21);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext22.configuration();
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(monkeyRecorder10);
        org.junit.Assert.assertNotNull(monkeyCalendar11);
        org.junit.Assert.assertNotNull(monkeyCalendar14);
        org.junit.Assert.assertNotNull(monkeyRecorder15);
        org.junit.Assert.assertNotNull(monkeyRecorder21);
        org.junit.Assert.assertNull(monkeyConfiguration23);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext4.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = basicJanitorMonkeyContext4.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext4.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorMonkeyContext9.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorMonkeyContext9.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar7, monkeyConfiguration8, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext12.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext12.configuration();
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertNotNull(monkeyRecorder6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
        org.junit.Assert.assertNotNull(monkeyCalendar10);
        org.junit.Assert.assertNotNull(monkeyRecorder11);
        org.junit.Assert.assertNotNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.String str5 = basicJanitorMonkeyContext0.getEventReport();
        basicJanitorMonkeyContext0.resetEventReport();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.resetEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler1 = basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = basicJanitorMonkeyContext0.calendar();
        org.junit.Assert.assertNotNull(monkeyScheduler1);
        org.junit.Assert.assertNotNull(monkeyCalendar2);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        java.lang.String str5 = basicJanitorMonkeyContext0.region();
        basicJanitorMonkeyContext0.exportCredentials("", "");
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorMonkeyContext13.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorMonkeyContext18.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorMonkeyContext18.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker12, monkeyCalendar16, monkeyConfiguration17, monkeyRecorder20);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event24 = null;
        basicJanitorMonkeyContext23.reportEvent(event24);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorMonkeyContext23.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext27 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker8, monkeyCalendar16, monkeyConfiguration22, monkeyRecorder26);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor28 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNotNull(monkeyCalendar14);
        org.junit.Assert.assertNotNull(monkeyRecorder15);
        org.junit.Assert.assertNotNull(monkeyCalendar16);
        org.junit.Assert.assertNotNull(monkeyCalendar19);
        org.junit.Assert.assertNotNull(monkeyRecorder20);
        org.junit.Assert.assertNotNull(monkeyRecorder26);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = basicJanitorMonkeyContext0.janitors();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = basicJanitorMonkeyContext0.janitors();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        org.junit.Assert.assertNotNull(abstractJanitorList5);
        org.junit.Assert.assertNotNull(abstractJanitorList6);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext8.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor10 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyCalendar9);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str6 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient7 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker12, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext16.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext16.configuration();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor19 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient8, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
        org.junit.Assert.assertNotNull(cloudClient7);
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext6.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext6.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext6.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = basicJanitorMonkeyContext6.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext12.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient14 = basicJanitorMonkeyContext12.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorMonkeyContext21.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext26.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = basicJanitorMonkeyContext26.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker20, monkeyCalendar24, monkeyConfiguration25, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder28);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine32 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler33 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext34.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient36 = basicJanitorMonkeyContext34.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = basicJanitorMonkeyContext34.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider38 = basicJanitorMonkeyContext34.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker39 = basicJanitorMonkeyContext34.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext40.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient42 = basicJanitorMonkeyContext40.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar43 = basicJanitorMonkeyContext40.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration44 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine46 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler47 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker48 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext49 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder51 = basicJanitorMonkeyContext49.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration53 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext54 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar55 = basicJanitorMonkeyContext54.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder56 = basicJanitorMonkeyContext54.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext57 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine46, janitorCrawler47, janitorResourceTracker48, monkeyCalendar52, monkeyConfiguration53, monkeyRecorder56);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext58 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine32, janitorCrawler33, janitorResourceTracker39, monkeyCalendar43, monkeyConfiguration44, monkeyRecorder56);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext59 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event60 = null;
        basicJanitorMonkeyContext59.reportEvent(event60);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder62 = basicJanitorMonkeyContext59.recorder();
        java.lang.String str63 = basicJanitorMonkeyContext59.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar64 = basicJanitorMonkeyContext59.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = basicJanitorMonkeyContext59.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine67 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler68 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker69 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine71 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler72 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker73 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext74 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar75 = basicJanitorMonkeyContext74.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder76 = basicJanitorMonkeyContext74.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar77 = basicJanitorMonkeyContext74.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration78 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext79 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar80 = basicJanitorMonkeyContext79.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder81 = basicJanitorMonkeyContext79.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext82 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine71, janitorCrawler72, janitorResourceTracker73, monkeyCalendar77, monkeyConfiguration78, monkeyRecorder81);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration83 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext84 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event85 = null;
        basicJanitorMonkeyContext84.reportEvent(event85);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder87 = basicJanitorMonkeyContext84.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext88 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine67, janitorCrawler68, janitorResourceTracker69, monkeyCalendar77, monkeyConfiguration83, monkeyRecorder87);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext89 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker11, monkeyCalendar43, monkeyConfiguration65, monkeyRecorder87);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler90 = basicJanitorContext89.janitorCrawler();
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
        org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNotNull(aWSClient14);
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(monkeyCalendar22);
        org.junit.Assert.assertNotNull(monkeyRecorder23);
        org.junit.Assert.assertNotNull(monkeyCalendar24);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyRecorder28);
        org.junit.Assert.assertNotNull(aWSClient36);
        org.junit.Assert.assertNotNull(monkeyCalendar37);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider38);
        org.junit.Assert.assertNotNull(janitorResourceTracker39);
        org.junit.Assert.assertNotNull(aWSClient42);
        org.junit.Assert.assertNotNull(monkeyCalendar43);
        org.junit.Assert.assertNotNull(monkeyCalendar50);
        org.junit.Assert.assertNotNull(monkeyRecorder51);
        org.junit.Assert.assertNotNull(monkeyCalendar52);
        org.junit.Assert.assertNotNull(monkeyCalendar55);
        org.junit.Assert.assertNotNull(monkeyRecorder56);
        org.junit.Assert.assertNotNull(monkeyRecorder62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "default" + "'", str63, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar64);
        org.junit.Assert.assertNotNull(monkeyConfiguration65);
        org.junit.Assert.assertNotNull(monkeyCalendar75);
        org.junit.Assert.assertNotNull(monkeyRecorder76);
        org.junit.Assert.assertNotNull(monkeyCalendar77);
        org.junit.Assert.assertNotNull(monkeyCalendar80);
        org.junit.Assert.assertNotNull(monkeyRecorder81);
        org.junit.Assert.assertNotNull(monkeyRecorder87);
        org.junit.Assert.assertNull(janitorCrawler90);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext4.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = basicJanitorMonkeyContext4.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext4.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorMonkeyContext9.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorMonkeyContext9.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar7, monkeyConfiguration8, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext12.calendar();
        java.lang.String str14 = basicJanitorContext12.region();
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertNotNull(monkeyRecorder6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
        org.junit.Assert.assertNotNull(monkeyCalendar10);
        org.junit.Assert.assertNotNull(monkeyRecorder11);
        org.junit.Assert.assertNotNull(monkeyCalendar13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(abstractJanitorList4);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext4.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = basicJanitorMonkeyContext4.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext4.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorMonkeyContext9.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorMonkeyContext9.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar7, monkeyConfiguration8, monkeyRecorder11);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext12.janitorCrawler();
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertNotNull(monkeyRecorder6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
        org.junit.Assert.assertNotNull(monkeyCalendar10);
        org.junit.Assert.assertNotNull(monkeyRecorder11);
        org.junit.Assert.assertNull(janitorCrawler13);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
        basicJanitorMonkeyContext0.reportEvent(event7);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider9 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertNotNull(monkeyConfiguration6);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider9);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = basicJanitorMonkeyContext3.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = basicJanitorMonkeyContext3.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext16.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient18 = basicJanitorMonkeyContext16.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorMonkeyContext16.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider20 = basicJanitorMonkeyContext16.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorMonkeyContext16.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext22.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient24 = basicJanitorMonkeyContext22.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler29 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar32 = basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder33 = basicJanitorMonkeyContext31.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar34 = basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration35 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext36 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = basicJanitorMonkeyContext36.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder38 = basicJanitorMonkeyContext36.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext39 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine28, janitorCrawler29, janitorResourceTracker30, monkeyCalendar34, monkeyConfiguration35, monkeyRecorder38);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine14, janitorCrawler15, janitorResourceTracker21, monkeyCalendar25, monkeyConfiguration26, monkeyRecorder38);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = basicJanitorMonkeyContext41.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration43 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar45 = basicJanitorMonkeyContext44.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder46 = basicJanitorMonkeyContext44.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext47 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine11, janitorCrawler12, janitorResourceTracker21, monkeyCalendar42, monkeyConfiguration43, monkeyRecorder46);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine49 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler50 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker51 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine53 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler54 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker55 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext56 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar57 = basicJanitorMonkeyContext56.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder58 = basicJanitorMonkeyContext56.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar59 = basicJanitorMonkeyContext56.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration60 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar62 = basicJanitorMonkeyContext61.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder63 = basicJanitorMonkeyContext61.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext64 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine53, janitorCrawler54, janitorResourceTracker55, monkeyCalendar59, monkeyConfiguration60, monkeyRecorder63);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event67 = null;
        basicJanitorMonkeyContext66.reportEvent(event67);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder69 = basicJanitorMonkeyContext66.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext70 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine49, janitorCrawler50, janitorResourceTracker51, monkeyCalendar59, monkeyConfiguration65, monkeyRecorder69);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration71 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext72 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar73 = basicJanitorMonkeyContext72.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder74 = basicJanitorMonkeyContext72.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext75 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker21, monkeyCalendar59, monkeyConfiguration71, monkeyRecorder74);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration76 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext77 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event78 = null;
        basicJanitorMonkeyContext77.reportEvent(event78);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder80 = basicJanitorMonkeyContext77.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext81 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker6, monkeyCalendar59, monkeyConfiguration76, monkeyRecorder80);
        java.lang.String str82 = basicJanitorContext81.region();
        org.junit.Assert.assertNotNull(monkeyCalendar4);
        org.junit.Assert.assertNotNull(monkeyRecorder5);
        org.junit.Assert.assertNotNull(janitorResourceTracker6);
        org.junit.Assert.assertNotNull(aWSClient18);
        org.junit.Assert.assertNotNull(monkeyCalendar19);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider20);
        org.junit.Assert.assertNotNull(janitorResourceTracker21);
        org.junit.Assert.assertNotNull(aWSClient24);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(monkeyCalendar32);
        org.junit.Assert.assertNotNull(monkeyRecorder33);
        org.junit.Assert.assertNotNull(monkeyCalendar34);
        org.junit.Assert.assertNotNull(monkeyCalendar37);
        org.junit.Assert.assertNotNull(monkeyRecorder38);
        org.junit.Assert.assertNotNull(monkeyCalendar42);
        org.junit.Assert.assertNotNull(monkeyCalendar45);
        org.junit.Assert.assertNotNull(monkeyRecorder46);
        org.junit.Assert.assertNotNull(monkeyCalendar57);
        org.junit.Assert.assertNotNull(monkeyRecorder58);
        org.junit.Assert.assertNotNull(monkeyCalendar59);
        org.junit.Assert.assertNotNull(monkeyCalendar62);
        org.junit.Assert.assertNotNull(monkeyRecorder63);
        org.junit.Assert.assertNotNull(monkeyRecorder69);
        org.junit.Assert.assertNotNull(monkeyCalendar73);
        org.junit.Assert.assertNotNull(monkeyRecorder74);
        org.junit.Assert.assertNotNull(monkeyRecorder80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.CloudClient cloudClient7 = basicJanitorMonkeyContext0.cloudClient();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertNotNull(monkeyRecorder6);
        org.junit.Assert.assertNotNull(cloudClient7);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext9.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = basicJanitorMonkeyContext9.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorMonkeyContext9.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider13 = basicJanitorMonkeyContext9.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext15.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = basicJanitorMonkeyContext15.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorMonkeyContext15.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorMonkeyContext24.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = basicJanitorMonkeyContext29.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine21, janitorCrawler22, janitorResourceTracker23, monkeyCalendar27, monkeyConfiguration28, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker14, monkeyCalendar18, monkeyConfiguration19, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar35 = basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration36 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar38 = basicJanitorMonkeyContext37.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = basicJanitorMonkeyContext37.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker14, monkeyCalendar35, monkeyConfiguration36, monkeyRecorder39);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine42 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler43 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker44 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine46 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler47 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker48 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext49 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder51 = basicJanitorMonkeyContext49.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration53 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext54 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar55 = basicJanitorMonkeyContext54.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder56 = basicJanitorMonkeyContext54.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext57 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine46, janitorCrawler47, janitorResourceTracker48, monkeyCalendar52, monkeyConfiguration53, monkeyRecorder56);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration58 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext59 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event60 = null;
        basicJanitorMonkeyContext59.reportEvent(event60);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder62 = basicJanitorMonkeyContext59.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext63 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine42, janitorCrawler43, janitorResourceTracker44, monkeyCalendar52, monkeyConfiguration58, monkeyRecorder62);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration64 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext65 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar66 = basicJanitorMonkeyContext65.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder67 = basicJanitorMonkeyContext65.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext68 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker14, monkeyCalendar52, monkeyConfiguration64, monkeyRecorder67);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar69 = basicJanitorContext68.calendar();
        java.lang.String str70 = basicJanitorContext68.region();
        org.junit.Assert.assertNotNull(aWSClient11);
        org.junit.Assert.assertNotNull(monkeyCalendar12);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider13);
        org.junit.Assert.assertNotNull(janitorResourceTracker14);
        org.junit.Assert.assertNotNull(aWSClient17);
        org.junit.Assert.assertNotNull(monkeyCalendar18);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(monkeyRecorder26);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyCalendar30);
        org.junit.Assert.assertNotNull(monkeyRecorder31);
        org.junit.Assert.assertNotNull(monkeyCalendar35);
        org.junit.Assert.assertNotNull(monkeyCalendar38);
        org.junit.Assert.assertNotNull(monkeyRecorder39);
        org.junit.Assert.assertNotNull(monkeyCalendar50);
        org.junit.Assert.assertNotNull(monkeyRecorder51);
        org.junit.Assert.assertNotNull(monkeyCalendar52);
        org.junit.Assert.assertNotNull(monkeyCalendar55);
        org.junit.Assert.assertNotNull(monkeyRecorder56);
        org.junit.Assert.assertNotNull(monkeyRecorder62);
        org.junit.Assert.assertNotNull(monkeyCalendar66);
        org.junit.Assert.assertNotNull(monkeyRecorder67);
        org.junit.Assert.assertNotNull(monkeyCalendar69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
        basicJanitorMonkeyContext0.reportEvent(event7);
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList9 = basicJanitorMonkeyContext0.janitors();
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertNotNull(monkeyConfiguration6);
        org.junit.Assert.assertNotNull(abstractJanitorList9);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        basicJanitorMonkeyContext0.resetEventReport();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler5 = basicJanitorMonkeyContext0.scheduler();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
        org.junit.Assert.assertNotNull(monkeyScheduler5);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = basicJanitorMonkeyContext0.recorder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = basicJanitorMonkeyContext0.awsClient();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(monkeyRecorder4);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
        org.junit.Assert.assertNotNull(aWSClient6);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str6 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient7 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.AbstractJanitor.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor10 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient8, context9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
        org.junit.Assert.assertNotNull(cloudClient7);
        org.junit.Assert.assertNotNull(aWSClient8);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext0.calendar();
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertNotNull(monkeyCalendar6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        java.lang.String str5 = basicJanitorMonkeyContext0.region();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = basicJanitorMonkeyContext0.calendar();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(monkeyRecorder4);
        org.junit.Assert.assertNotNull(aWSClient5);
        org.junit.Assert.assertNotNull(monkeyCalendar6);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker9, monkeyCalendar10, monkeyConfiguration11, monkeyRecorder12);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient5, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(monkeyRecorder4);
        org.junit.Assert.assertNotNull(aWSClient5);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str6 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient7 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker12, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext16.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext16.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor19 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient8, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
        org.junit.Assert.assertNotNull(cloudClient7);
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertNull(monkeyRecorder18);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str6 = basicJanitorMonkeyContext0.getEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = basicJanitorMonkeyContext0.janitors();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(abstractJanitorList7);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.CloudClient cloudClient8 = basicJanitorMonkeyContext0.cloudClient();
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertNotNull(abstractJanitorList7);
        org.junit.Assert.assertNotNull(cloudClient8);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext6.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext6.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext6.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = basicJanitorMonkeyContext6.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext12.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient14 = basicJanitorMonkeyContext12.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorMonkeyContext21.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext26.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = basicJanitorMonkeyContext26.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker20, monkeyCalendar24, monkeyConfiguration25, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder28);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine32 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler33 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine35 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler36 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext37.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient39 = basicJanitorMonkeyContext37.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar40 = basicJanitorMonkeyContext37.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider41 = basicJanitorMonkeyContext37.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker42 = basicJanitorMonkeyContext37.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext43.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient45 = basicJanitorMonkeyContext43.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar46 = basicJanitorMonkeyContext43.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration47 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine49 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler50 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker51 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext52 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar53 = basicJanitorMonkeyContext52.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder54 = basicJanitorMonkeyContext52.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar55 = basicJanitorMonkeyContext52.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration56 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext57 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar58 = basicJanitorMonkeyContext57.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder59 = basicJanitorMonkeyContext57.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext60 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine49, janitorCrawler50, janitorResourceTracker51, monkeyCalendar55, monkeyConfiguration56, monkeyRecorder59);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine35, janitorCrawler36, janitorResourceTracker42, monkeyCalendar46, monkeyConfiguration47, monkeyRecorder59);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext62 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar63 = basicJanitorMonkeyContext62.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration64 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext65 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar66 = basicJanitorMonkeyContext65.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder67 = basicJanitorMonkeyContext65.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext68 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine32, janitorCrawler33, janitorResourceTracker42, monkeyCalendar63, monkeyConfiguration64, monkeyRecorder67);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext69 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar70 = basicJanitorMonkeyContext69.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder71 = basicJanitorMonkeyContext69.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration72 = basicJanitorMonkeyContext69.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext73 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar74 = basicJanitorMonkeyContext73.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder75 = basicJanitorMonkeyContext73.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration76 = basicJanitorMonkeyContext73.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder77 = basicJanitorMonkeyContext73.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext78 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("default", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker11, monkeyCalendar63, monkeyConfiguration72, monkeyRecorder77);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker79 = basicJanitorContext78.janitorResourceTracker();
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
        org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNotNull(aWSClient14);
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(monkeyCalendar22);
        org.junit.Assert.assertNotNull(monkeyRecorder23);
        org.junit.Assert.assertNotNull(monkeyCalendar24);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyRecorder28);
        org.junit.Assert.assertNotNull(aWSClient39);
        org.junit.Assert.assertNotNull(monkeyCalendar40);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider41);
        org.junit.Assert.assertNotNull(janitorResourceTracker42);
        org.junit.Assert.assertNotNull(aWSClient45);
        org.junit.Assert.assertNotNull(monkeyCalendar46);
        org.junit.Assert.assertNotNull(monkeyCalendar53);
        org.junit.Assert.assertNotNull(monkeyRecorder54);
        org.junit.Assert.assertNotNull(monkeyCalendar55);
        org.junit.Assert.assertNotNull(monkeyCalendar58);
        org.junit.Assert.assertNotNull(monkeyRecorder59);
        org.junit.Assert.assertNotNull(monkeyCalendar63);
        org.junit.Assert.assertNotNull(monkeyCalendar66);
        org.junit.Assert.assertNotNull(monkeyRecorder67);
        org.junit.Assert.assertNotNull(monkeyCalendar70);
        org.junit.Assert.assertNotNull(monkeyRecorder71);
        org.junit.Assert.assertNotNull(monkeyConfiguration72);
        org.junit.Assert.assertNotNull(monkeyCalendar74);
        org.junit.Assert.assertNotNull(monkeyRecorder75);
        org.junit.Assert.assertNotNull(monkeyConfiguration76);
        org.junit.Assert.assertNotNull(monkeyRecorder77);
        org.junit.Assert.assertNotNull(janitorResourceTracker79);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        basicJanitorMonkeyContext0.exportCredentials("", "hi!");
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = basicJanitorMonkeyContext0.resourceTracker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = basicJanitorMonkeyContext0.getEventReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorResourceTracker6);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
        basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier8 = basicJanitorMonkeyContext0.emailNotifier();
        basicJanitorMonkeyContext0.resetEventReport();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
        org.junit.Assert.assertNotNull(context7);
        org.junit.Assert.assertNotNull(janitorEmailNotifier8);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyConfiguration9);
        org.junit.Assert.assertNull(monkeyRecorder10);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext9.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = basicJanitorMonkeyContext9.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorMonkeyContext9.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider13 = basicJanitorMonkeyContext9.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext15.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = basicJanitorMonkeyContext15.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorMonkeyContext15.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorMonkeyContext24.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext24.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = basicJanitorMonkeyContext29.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine21, janitorCrawler22, janitorResourceTracker23, monkeyCalendar27, monkeyConfiguration28, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker14, monkeyCalendar18, monkeyConfiguration19, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar35 = basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration36 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar38 = basicJanitorMonkeyContext37.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = basicJanitorMonkeyContext37.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker14, monkeyCalendar35, monkeyConfiguration36, monkeyRecorder39);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker41 = basicJanitorContext40.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine43 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler44 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker45 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar47 = basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder48 = basicJanitorMonkeyContext46.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar49 = basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration50 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext51 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = basicJanitorMonkeyContext51.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder53 = basicJanitorMonkeyContext51.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext54 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine43, janitorCrawler44, janitorResourceTracker45, monkeyCalendar49, monkeyConfiguration50, monkeyRecorder53);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext55 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event56 = null;
        basicJanitorMonkeyContext55.reportEvent(event56);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder58 = basicJanitorMonkeyContext55.recorder();
        java.lang.String str59 = basicJanitorMonkeyContext55.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar60 = basicJanitorMonkeyContext55.calendar();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList61 = basicJanitorMonkeyContext55.janitors();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration62 = basicJanitorMonkeyContext55.configuration();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider63 = basicJanitorMonkeyContext55.getAwsCredentialsProvider();
        basicJanitorMonkeyContext55.resetEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = basicJanitorMonkeyContext55.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event67 = null;
        basicJanitorMonkeyContext66.reportEvent(event67);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder69 = basicJanitorMonkeyContext66.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext70 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("owner", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker41, monkeyCalendar49, monkeyConfiguration65, monkeyRecorder69);
        org.junit.Assert.assertNotNull(aWSClient11);
        org.junit.Assert.assertNotNull(monkeyCalendar12);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider13);
        org.junit.Assert.assertNotNull(janitorResourceTracker14);
        org.junit.Assert.assertNotNull(aWSClient17);
        org.junit.Assert.assertNotNull(monkeyCalendar18);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(monkeyRecorder26);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyCalendar30);
        org.junit.Assert.assertNotNull(monkeyRecorder31);
        org.junit.Assert.assertNotNull(monkeyCalendar35);
        org.junit.Assert.assertNotNull(monkeyCalendar38);
        org.junit.Assert.assertNotNull(monkeyRecorder39);
        org.junit.Assert.assertNotNull(janitorResourceTracker41);
        org.junit.Assert.assertNotNull(monkeyCalendar47);
        org.junit.Assert.assertNotNull(monkeyRecorder48);
        org.junit.Assert.assertNotNull(monkeyCalendar49);
        org.junit.Assert.assertNotNull(monkeyCalendar52);
        org.junit.Assert.assertNotNull(monkeyRecorder53);
        org.junit.Assert.assertNotNull(monkeyRecorder58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "default" + "'", str59, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar60);
        org.junit.Assert.assertNotNull(abstractJanitorList61);
        org.junit.Assert.assertNotNull(monkeyConfiguration62);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider63);
        org.junit.Assert.assertNotNull(monkeyConfiguration65);
        org.junit.Assert.assertNotNull(monkeyRecorder69);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = basicJanitorMonkeyContext0.janitors();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider8 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler9 = basicJanitorMonkeyContext0.scheduler();
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar5);
        org.junit.Assert.assertNotNull(abstractJanitorList7);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider8);
        org.junit.Assert.assertNotNull(monkeyScheduler9);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str6 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(context7);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = basicJanitorMonkeyContext0.janitors();
        org.junit.Assert.assertNotNull(monkeyCalendar1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(monkeyRecorder4);
        org.junit.Assert.assertNotNull(aWSClient5);
        org.junit.Assert.assertNotNull(abstractJanitorList6);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
        basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event8 = null;
        basicJanitorMonkeyContext0.reportEvent(event8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = basicJanitorMonkeyContext0.getEventReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
        org.junit.Assert.assertNotNull(context7);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext6.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = basicJanitorMonkeyContext6.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext6.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = basicJanitorMonkeyContext6.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext12.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient14 = basicJanitorMonkeyContext12.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorMonkeyContext21.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorMonkeyContext26.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = basicJanitorMonkeyContext26.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker20, monkeyCalendar24, monkeyConfiguration25, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar32 = basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration33 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar35 = basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = basicJanitorMonkeyContext34.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker11, monkeyCalendar32, monkeyConfiguration33, monkeyRecorder36);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker38 = basicJanitorContext37.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = basicJanitorContext37.recorder();
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
        org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNotNull(aWSClient14);
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(monkeyCalendar22);
        org.junit.Assert.assertNotNull(monkeyRecorder23);
        org.junit.Assert.assertNotNull(monkeyCalendar24);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyRecorder28);
        org.junit.Assert.assertNotNull(monkeyCalendar32);
        org.junit.Assert.assertNotNull(monkeyCalendar35);
        org.junit.Assert.assertNotNull(monkeyRecorder36);
        org.junit.Assert.assertNotNull(janitorResourceTracker38);
        org.junit.Assert.assertNotNull(monkeyRecorder39);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        basicJanitorMonkeyContext0.exportCredentials("default", "default");
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = basicJanitorMonkeyContext0.configuration();
        org.junit.Assert.assertNotNull(monkeyConfiguration6);
        org.junit.Assert.assertNotNull(monkeyConfiguration7);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event8 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event8);
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList10 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context7);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList10);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient7 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker12, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext16.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor18 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient8, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(cloudClient7);
// flaky:         org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNull(monkeyCalendar17);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext6.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = null; // flaky: basicJanitorMonkeyContext6.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext6.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = null; // flaky: basicJanitorMonkeyContext6.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext12.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient14 = null; // flaky: basicJanitorMonkeyContext12.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null; // flaky: basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = null; // flaky: basicJanitorMonkeyContext21.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = null; // flaky: basicJanitorMonkeyContext26.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = null; // flaky: basicJanitorMonkeyContext26.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker20, monkeyCalendar24, monkeyConfiguration25, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder28);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine32 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler33 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext34.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient36 = null; // flaky: basicJanitorMonkeyContext34.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = null; // flaky: basicJanitorMonkeyContext34.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider38 = null; // flaky: basicJanitorMonkeyContext34.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker39 = null; // flaky: basicJanitorMonkeyContext34.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext40 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext40.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient42 = basicJanitorMonkeyContext40.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar43 = basicJanitorMonkeyContext40.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration44 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine46 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler47 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker48 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext49 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder51 = basicJanitorMonkeyContext49.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = basicJanitorMonkeyContext49.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration53 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext54 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar55 = basicJanitorMonkeyContext54.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder56 = basicJanitorMonkeyContext54.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext57 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine46, janitorCrawler47, janitorResourceTracker48, monkeyCalendar52, monkeyConfiguration53, monkeyRecorder56);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext58 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine32, janitorCrawler33, janitorResourceTracker39, monkeyCalendar43, monkeyConfiguration44, monkeyRecorder56);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext59 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event60 = null;
        basicJanitorMonkeyContext59.reportEvent(event60);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder62 = basicJanitorMonkeyContext59.recorder();
        java.lang.String str63 = basicJanitorMonkeyContext59.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar64 = basicJanitorMonkeyContext59.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = basicJanitorMonkeyContext59.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine67 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler68 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker69 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine71 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler72 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker73 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext74 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar75 = basicJanitorMonkeyContext74.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder76 = basicJanitorMonkeyContext74.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar77 = basicJanitorMonkeyContext74.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration78 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext79 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar80 = basicJanitorMonkeyContext79.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder81 = basicJanitorMonkeyContext79.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext82 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine71, janitorCrawler72, janitorResourceTracker73, monkeyCalendar77, monkeyConfiguration78, monkeyRecorder81);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration83 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext84 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event85 = null;
        basicJanitorMonkeyContext84.reportEvent(event85);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder87 = basicJanitorMonkeyContext84.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext88 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine67, janitorCrawler68, janitorResourceTracker69, monkeyCalendar77, monkeyConfiguration83, monkeyRecorder87);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext89 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker11, monkeyCalendar43, monkeyConfiguration65, monkeyRecorder87);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine90 = basicJanitorContext89.janitorRuleEngine();
        org.junit.Assert.assertNotNull(aWSClient8);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
        org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNotNull(aWSClient14);
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(monkeyCalendar22);
        org.junit.Assert.assertNotNull(monkeyRecorder23);
        org.junit.Assert.assertNotNull(monkeyCalendar24);
        org.junit.Assert.assertNotNull(monkeyCalendar27);
        org.junit.Assert.assertNotNull(monkeyRecorder28);
        org.junit.Assert.assertNotNull(aWSClient36);
        org.junit.Assert.assertNotNull(monkeyCalendar37);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider38);
        org.junit.Assert.assertNotNull(janitorResourceTracker39);
        org.junit.Assert.assertNotNull(aWSClient42);
        org.junit.Assert.assertNotNull(monkeyCalendar43);
        org.junit.Assert.assertNotNull(monkeyCalendar50);
        org.junit.Assert.assertNotNull(monkeyRecorder51);
        org.junit.Assert.assertNotNull(monkeyCalendar52);
        org.junit.Assert.assertNotNull(monkeyCalendar55);
        org.junit.Assert.assertNotNull(monkeyRecorder56);
        org.junit.Assert.assertNotNull(monkeyRecorder62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "default" + "'", str63, "default");
        org.junit.Assert.assertNotNull(monkeyCalendar64);
        org.junit.Assert.assertNotNull(monkeyConfiguration65);
        org.junit.Assert.assertNotNull(monkeyCalendar75);
        org.junit.Assert.assertNotNull(monkeyRecorder76);
        org.junit.Assert.assertNotNull(monkeyCalendar77);
        org.junit.Assert.assertNotNull(monkeyCalendar80);
        org.junit.Assert.assertNotNull(monkeyRecorder81);
        org.junit.Assert.assertNotNull(monkeyRecorder87);
        org.junit.Assert.assertNull(janitorRuleEngine90);
    }
}
