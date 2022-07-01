import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorMonkeyContext0.resourceTracker();
        java.lang.Class<?> wildcardClass2 = janitorResourceTracker1.getClass();
        org.junit.Assert.assertNotNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext4.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor10 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.accountName();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "default" + "'", str2, "default");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "owner" + "'", str0, "owner");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "us-west-1";
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor13 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(cloudClient2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(aWSClient4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "default";
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(cloudClient2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(aWSClient4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(monkeyCalendar10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext8.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = basicJanitorContext8.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext8.recorder();
        org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(janitorRuleEngine10);
        org.junit.Assert.assertNull(monkeyRecorder11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str4 = basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient8 = basicJanitorMonkeyContext7.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient9 = basicJanitorMonkeyContext7.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorMonkeyContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext12.calendar();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertNotNull(cloudClient8);
        org.junit.Assert.assertNotNull(cloudClient9);
        org.junit.Assert.assertNotNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str3 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
        basicJanitorMonkeyContext0.reportEvent(event5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(context4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(monkeyConfiguration13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = basicJanitorMonkeyContext0.janitors();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(cloudClient2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertNotNull(abstractJanitorList6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = basicJanitorMonkeyContext0.configuration();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(cloudClient2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(monkeyConfiguration4);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "owner";
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(monkeyRecorder12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = basicJanitorMonkeyContext0.awsClient();
        java.lang.String str8 = basicJanitorMonkeyContext0.accountName();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(monkeyCalendar2);
        org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(monkeyConfiguration5);
        org.junit.Assert.assertNotNull(context6);
        org.junit.Assert.assertNotNull(aWSClient7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "default" + "'", str8, "default");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = basicJanitorMonkeyContext0.region();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(cloudClient2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.Class<?> wildcardClass4 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext8.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = basicJanitorContext8.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext8.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext8.janitorRuleEngine();
        org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(janitorRuleEngine10);
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(janitorRuleEngine12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context3 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(context3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorMonkeyContext11.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine9, janitorCrawler10, janitorResourceTracker12, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor17 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient7, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(monkeyCalendar2);
        org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(monkeyConfiguration5);
        org.junit.Assert.assertNotNull(context6);
        org.junit.Assert.assertNotNull(aWSClient7);
        org.junit.Assert.assertNotNull(janitorResourceTracker12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext0.cloudClient();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cloudClient4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors();
        java.lang.String str5 = basicJanitorMonkeyContext0.getEventReport();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(abstractJanitorList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext12.calendar();
        java.lang.String str14 = basicJanitorContext12.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext12.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext12.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext12.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor18 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(cloudClient2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar17);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        java.lang.String str8 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(janitorCrawler10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = basicJanitorMonkeyContext0.awsClient();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider8 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context9 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(monkeyCalendar2);
        org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(monkeyConfiguration5);
        org.junit.Assert.assertNotNull(context6);
        org.junit.Assert.assertNotNull(aWSClient7);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider8);
        org.junit.Assert.assertNotNull(context9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = basicJanitorMonkeyContext0.region();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors();
        java.lang.String str5 = basicJanitorMonkeyContext0.accountName();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(cloudClient2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(abstractJanitorList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "default" + "'", str5, "default");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = basicJanitorMonkeyContext0.scheduler();
        java.lang.String str3 = basicJanitorMonkeyContext0.region();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(monkeyScheduler2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorCrawler13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        basicJanitorMonkeyContext0.exportCredentials("owner", "default");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(context7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.accountName();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str10 = null; // flaky: basicJanitorMonkeyContext9.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null; // flaky: basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient14 = null; // flaky: basicJanitorMonkeyContext13.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient15 = null; // flaky: basicJanitorMonkeyContext13.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null; // flaky: basicJanitorMonkeyContext13.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker11, monkeyCalendar12, monkeyConfiguration16, monkeyRecorder17);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str23 = null; // flaky: basicJanitorMonkeyContext22.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null; // flaky: basicJanitorMonkeyContext22.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient26 = null; // flaky: basicJanitorMonkeyContext25.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = null; // flaky: basicJanitorMonkeyContext25.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler30 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str32 = null; // flaky: basicJanitorMonkeyContext31.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker33 = null; // flaky: basicJanitorMonkeyContext31.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar34 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext35 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient36 = null; // flaky: basicJanitorMonkeyContext35.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient37 = null; // flaky: basicJanitorMonkeyContext35.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration38 = null; // flaky: basicJanitorMonkeyContext35.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine29, janitorCrawler30, janitorResourceTracker33, monkeyCalendar34, monkeyConfiguration38, monkeyRecorder39);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient42 = null; // flaky: basicJanitorMonkeyContext41.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient43 = null; // flaky: basicJanitorMonkeyContext41.cloudClient();
        java.lang.String str44 = null; // flaky: basicJanitorMonkeyContext41.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder45 = null; // flaky: basicJanitorMonkeyContext41.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext46 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine20, janitorCrawler21, janitorResourceTracker24, monkeyCalendar27, monkeyConfiguration38, monkeyRecorder45);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext47 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient48 = null; // flaky: basicJanitorMonkeyContext47.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient49 = null; // flaky: basicJanitorMonkeyContext47.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration50 = null; // flaky: basicJanitorMonkeyContext47.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine52 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler53 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext54 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str55 = null; // flaky: basicJanitorMonkeyContext54.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker56 = null; // flaky: basicJanitorMonkeyContext54.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext57 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient58 = null; // flaky: basicJanitorMonkeyContext57.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar59 = null; // flaky: basicJanitorMonkeyContext57.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine61 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler62 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext63 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str64 = null; // flaky: basicJanitorMonkeyContext63.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker65 = null; // flaky: basicJanitorMonkeyContext63.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar66 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext67 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient68 = null; // flaky: basicJanitorMonkeyContext67.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient69 = null; // flaky: basicJanitorMonkeyContext67.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration70 = null; // flaky: basicJanitorMonkeyContext67.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder71 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext72 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine61, janitorCrawler62, janitorResourceTracker65, monkeyCalendar66, monkeyConfiguration70, monkeyRecorder71);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext73 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient74 = null; // flaky: basicJanitorMonkeyContext73.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient75 = null; // flaky: basicJanitorMonkeyContext73.cloudClient();
        java.lang.String str76 = null; // flaky: basicJanitorMonkeyContext73.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder77 = null; // flaky: basicJanitorMonkeyContext73.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext78 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine52, janitorCrawler53, janitorResourceTracker56, monkeyCalendar59, monkeyConfiguration70, monkeyRecorder77);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext79 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar27, monkeyConfiguration50, monkeyRecorder77);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext80 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient81 = null; // flaky: basicJanitorMonkeyContext80.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient82 = null; // flaky: basicJanitorMonkeyContext80.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar83 = null; // flaky: basicJanitorMonkeyContext80.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext84 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient85 = null; // flaky: basicJanitorMonkeyContext84.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient86 = null; // flaky: basicJanitorMonkeyContext84.cloudClient();
        java.lang.String str87 = null; // flaky: basicJanitorMonkeyContext84.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration88 = null; // flaky: basicJanitorMonkeyContext84.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration89 = null; // flaky: basicJanitorMonkeyContext84.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext90 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str91 = null; // flaky: basicJanitorMonkeyContext90.getEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context92 = null; // flaky: basicJanitorMonkeyContext90.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder93 = null; // flaky: basicJanitorMonkeyContext90.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext94 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker11, monkeyCalendar83, monkeyConfiguration89, monkeyRecorder93);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker11);
// flaky:         org.junit.Assert.assertNotNull(cloudClient14);
// flaky:         org.junit.Assert.assertNotNull(cloudClient15);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration16);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker24);
// flaky:         org.junit.Assert.assertNotNull(cloudClient26);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker33);
// flaky:         org.junit.Assert.assertNotNull(cloudClient36);
// flaky:         org.junit.Assert.assertNotNull(cloudClient37);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration38);
// flaky:         org.junit.Assert.assertNotNull(cloudClient42);
// flaky:         org.junit.Assert.assertNotNull(cloudClient43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "us-west-1" + "'", str44, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder45);
// flaky:         org.junit.Assert.assertNotNull(cloudClient48);
// flaky:         org.junit.Assert.assertNotNull(cloudClient49);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration50);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker56);
// flaky:         org.junit.Assert.assertNotNull(cloudClient58);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar59);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker65);
// flaky:         org.junit.Assert.assertNotNull(cloudClient68);
// flaky:         org.junit.Assert.assertNotNull(cloudClient69);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration70);
// flaky:         org.junit.Assert.assertNotNull(cloudClient74);
// flaky:         org.junit.Assert.assertNotNull(cloudClient75);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "us-west-1" + "'", str76, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder77);
// flaky:         org.junit.Assert.assertNotNull(cloudClient81);
// flaky:         org.junit.Assert.assertNotNull(cloudClient82);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar83);
// flaky:         org.junit.Assert.assertNotNull(cloudClient85);
// flaky:         org.junit.Assert.assertNotNull(cloudClient86);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "us-west-1" + "'", str87, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration88);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration89);
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
// flaky:         org.junit.Assert.assertNotNull(context92);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder93);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.accountName();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyRecorder.Event event2 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(context6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.CloudClient cloudClient5 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
// flaky:         org.junit.Assert.assertNotNull(cloudClient5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(janitorRuleEngine8);
        org.junit.Assert.assertNull(monkeyConfiguration9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext12.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNull(janitorRuleEngine13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.Class<?> wildcardClass5 = null; // flaky: janitorResourceTracker4.getClass();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient13 = null; // flaky: basicJanitorMonkeyContext12.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient14 = null; // flaky: basicJanitorMonkeyContext12.cloudClient();
        java.lang.String str15 = null; // flaky: basicJanitorMonkeyContext12.region();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList16 = null; // flaky: basicJanitorMonkeyContext12.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null; // flaky: basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient19 = null; // flaky: basicJanitorMonkeyContext18.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient20 = null; // flaky: basicJanitorMonkeyContext18.cloudClient();
        java.lang.String str21 = null; // flaky: basicJanitorMonkeyContext18.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null; // flaky: basicJanitorMonkeyContext18.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient24 = null; // flaky: basicJanitorMonkeyContext23.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient25 = null; // flaky: basicJanitorMonkeyContext23.cloudClient();
        java.lang.String str26 = null; // flaky: basicJanitorMonkeyContext23.region();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList27 = null; // flaky: basicJanitorMonkeyContext23.janitors();
        java.lang.String str28 = null; // flaky: basicJanitorMonkeyContext23.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder29 = null; // flaky: basicJanitorMonkeyContext23.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("default", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar17, monkeyConfiguration22, monkeyRecorder29);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(cloudClient13);
// flaky:         org.junit.Assert.assertNotNull(cloudClient14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "us-west-1" + "'", str15, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList16);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar17);
// flaky:         org.junit.Assert.assertNotNull(cloudClient19);
// flaky:         org.junit.Assert.assertNotNull(cloudClient20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "us-west-1" + "'", str21, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration22);
// flaky:         org.junit.Assert.assertNotNull(cloudClient24);
// flaky:         org.junit.Assert.assertNotNull(cloudClient25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "us-west-1" + "'", str26, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder29);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(context6);
// flaky:         org.junit.Assert.assertNotNull(context7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.lang.Class<?> wildcardClass4 = null; // flaky: monkeyScheduler3.getClass();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context3 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(context3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext6.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext10 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient11 = null; // flaky: basicJanitorMonkeyContext10.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient12 = null; // flaky: basicJanitorMonkeyContext10.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null; // flaky: basicJanitorMonkeyContext10.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration13, monkeyRecorder14);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str20 = null; // flaky: basicJanitorMonkeyContext19.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext19.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient23 = null; // flaky: basicJanitorMonkeyContext22.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str29 = null; // flaky: basicJanitorMonkeyContext28.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null; // flaky: basicJanitorMonkeyContext28.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext32 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient33 = null; // flaky: basicJanitorMonkeyContext32.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient34 = null; // flaky: basicJanitorMonkeyContext32.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration35 = null; // flaky: basicJanitorMonkeyContext32.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine26, janitorCrawler27, janitorResourceTracker30, monkeyCalendar31, monkeyConfiguration35, monkeyRecorder36);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext38 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient39 = null; // flaky: basicJanitorMonkeyContext38.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient40 = null; // flaky: basicJanitorMonkeyContext38.cloudClient();
        java.lang.String str41 = null; // flaky: basicJanitorMonkeyContext38.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder42 = null; // flaky: basicJanitorMonkeyContext38.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine17, janitorCrawler18, janitorResourceTracker21, monkeyCalendar24, monkeyConfiguration35, monkeyRecorder42);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient45 = null; // flaky: basicJanitorMonkeyContext44.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient46 = null; // flaky: basicJanitorMonkeyContext44.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration47 = null; // flaky: basicJanitorMonkeyContext44.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine49 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler50 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext51 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str52 = null; // flaky: basicJanitorMonkeyContext51.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker53 = null; // flaky: basicJanitorMonkeyContext51.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext54 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient55 = null; // flaky: basicJanitorMonkeyContext54.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = null; // flaky: basicJanitorMonkeyContext54.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine58 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler59 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext60 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str61 = null; // flaky: basicJanitorMonkeyContext60.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker62 = null; // flaky: basicJanitorMonkeyContext60.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar63 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext64 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient65 = null; // flaky: basicJanitorMonkeyContext64.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient66 = null; // flaky: basicJanitorMonkeyContext64.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration67 = null; // flaky: basicJanitorMonkeyContext64.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder68 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext69 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine58, janitorCrawler59, janitorResourceTracker62, monkeyCalendar63, monkeyConfiguration67, monkeyRecorder68);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext70 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient71 = null; // flaky: basicJanitorMonkeyContext70.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient72 = null; // flaky: basicJanitorMonkeyContext70.cloudClient();
        java.lang.String str73 = null; // flaky: basicJanitorMonkeyContext70.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder74 = null; // flaky: basicJanitorMonkeyContext70.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext75 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine49, janitorCrawler50, janitorResourceTracker53, monkeyCalendar56, monkeyConfiguration67, monkeyRecorder74);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext76 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar24, monkeyConfiguration47, monkeyRecorder74);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration77 = basicJanitorContext76.configuration();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(cloudClient11);
// flaky:         org.junit.Assert.assertNotNull(cloudClient12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration13);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
// flaky:         org.junit.Assert.assertNotNull(cloudClient23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker30);
// flaky:         org.junit.Assert.assertNotNull(cloudClient33);
// flaky:         org.junit.Assert.assertNotNull(cloudClient34);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration35);
// flaky:         org.junit.Assert.assertNotNull(cloudClient39);
// flaky:         org.junit.Assert.assertNotNull(cloudClient40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "us-west-1" + "'", str41, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder42);
// flaky:         org.junit.Assert.assertNotNull(cloudClient45);
// flaky:         org.junit.Assert.assertNotNull(cloudClient46);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration47);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker53);
// flaky:         org.junit.Assert.assertNotNull(cloudClient55);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar56);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker62);
// flaky:         org.junit.Assert.assertNotNull(cloudClient65);
// flaky:         org.junit.Assert.assertNotNull(cloudClient66);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration67);
// flaky:         org.junit.Assert.assertNotNull(cloudClient71);
// flaky:         org.junit.Assert.assertNotNull(cloudClient72);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "us-west-1" + "'", str73, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder74);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration77);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(monkeyCalendar12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        java.lang.String str11 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(monkeyConfiguration13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(context6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext12.calendar();
        java.lang.String str14 = basicJanitorContext12.region();
        java.lang.String str15 = basicJanitorContext12.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext12.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor17 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(monkeyRecorder16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext3.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext3.calendar();
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str9 = null; // flaky: basicJanitorMonkeyContext8.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext8.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str13 = null; // flaky: basicJanitorMonkeyContext12.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider14 = null; // flaky: basicJanitorMonkeyContext12.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null; // flaky: basicJanitorMonkeyContext12.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient17 = null; // flaky: basicJanitorMonkeyContext16.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient18 = null; // flaky: basicJanitorMonkeyContext16.cloudClient();
        java.lang.String str19 = null; // flaky: basicJanitorMonkeyContext16.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null; // flaky: basicJanitorMonkeyContext16.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar11, monkeyConfiguration15, monkeyRecorder20);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext21.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext21.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext21.calendar();
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider14);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration15);
// flaky:         org.junit.Assert.assertNotNull(cloudClient17);
// flaky:         org.junit.Assert.assertNotNull(cloudClient18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "us-west-1" + "'", str19, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar22);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "";
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.CloudClient cloudClient7 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(cloudClient7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList1 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.accountName();
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext6.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext10 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient11 = null; // flaky: basicJanitorMonkeyContext10.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient12 = null; // flaky: basicJanitorMonkeyContext10.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null; // flaky: basicJanitorMonkeyContext10.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration13, monkeyRecorder14);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str20 = null; // flaky: basicJanitorMonkeyContext19.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext19.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient23 = null; // flaky: basicJanitorMonkeyContext22.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str29 = null; // flaky: basicJanitorMonkeyContext28.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null; // flaky: basicJanitorMonkeyContext28.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext32 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient33 = null; // flaky: basicJanitorMonkeyContext32.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient34 = null; // flaky: basicJanitorMonkeyContext32.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration35 = null; // flaky: basicJanitorMonkeyContext32.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine26, janitorCrawler27, janitorResourceTracker30, monkeyCalendar31, monkeyConfiguration35, monkeyRecorder36);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext38 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient39 = null; // flaky: basicJanitorMonkeyContext38.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient40 = null; // flaky: basicJanitorMonkeyContext38.cloudClient();
        java.lang.String str41 = null; // flaky: basicJanitorMonkeyContext38.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder42 = null; // flaky: basicJanitorMonkeyContext38.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine17, janitorCrawler18, janitorResourceTracker21, monkeyCalendar24, monkeyConfiguration35, monkeyRecorder42);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient45 = null; // flaky: basicJanitorMonkeyContext44.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient46 = null; // flaky: basicJanitorMonkeyContext44.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration47 = null; // flaky: basicJanitorMonkeyContext44.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine49 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler50 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext51 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str52 = null; // flaky: basicJanitorMonkeyContext51.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker53 = null; // flaky: basicJanitorMonkeyContext51.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext54 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient55 = null; // flaky: basicJanitorMonkeyContext54.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = null; // flaky: basicJanitorMonkeyContext54.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine58 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler59 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext60 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str61 = null; // flaky: basicJanitorMonkeyContext60.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker62 = null; // flaky: basicJanitorMonkeyContext60.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar63 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext64 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient65 = null; // flaky: basicJanitorMonkeyContext64.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient66 = null; // flaky: basicJanitorMonkeyContext64.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration67 = null; // flaky: basicJanitorMonkeyContext64.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder68 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext69 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine58, janitorCrawler59, janitorResourceTracker62, monkeyCalendar63, monkeyConfiguration67, monkeyRecorder68);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext70 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient71 = null; // flaky: basicJanitorMonkeyContext70.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient72 = null; // flaky: basicJanitorMonkeyContext70.cloudClient();
        java.lang.String str73 = null; // flaky: basicJanitorMonkeyContext70.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder74 = null; // flaky: basicJanitorMonkeyContext70.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext75 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine49, janitorCrawler50, janitorResourceTracker53, monkeyCalendar56, monkeyConfiguration67, monkeyRecorder74);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext76 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar24, monkeyConfiguration47, monkeyRecorder74);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler77 = basicJanitorContext76.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler78 = basicJanitorContext76.janitorCrawler();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(cloudClient11);
// flaky:         org.junit.Assert.assertNotNull(cloudClient12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration13);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
// flaky:         org.junit.Assert.assertNotNull(cloudClient23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker30);
// flaky:         org.junit.Assert.assertNotNull(cloudClient33);
// flaky:         org.junit.Assert.assertNotNull(cloudClient34);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration35);
// flaky:         org.junit.Assert.assertNotNull(cloudClient39);
// flaky:         org.junit.Assert.assertNotNull(cloudClient40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "us-west-1" + "'", str41, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder42);
// flaky:         org.junit.Assert.assertNotNull(cloudClient45);
// flaky:         org.junit.Assert.assertNotNull(cloudClient46);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration47);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker53);
// flaky:         org.junit.Assert.assertNotNull(cloudClient55);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar56);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker62);
// flaky:         org.junit.Assert.assertNotNull(cloudClient65);
// flaky:         org.junit.Assert.assertNotNull(cloudClient66);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration67);
// flaky:         org.junit.Assert.assertNotNull(cloudClient71);
// flaky:         org.junit.Assert.assertNotNull(cloudClient72);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "us-west-1" + "'", str73, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder74);
        org.junit.Assert.assertNull(janitorCrawler77);
        org.junit.Assert.assertNull(janitorCrawler78);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient13 = null; // flaky: basicJanitorMonkeyContext12.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient14 = null; // flaky: basicJanitorMonkeyContext12.cloudClient();
        java.lang.String str15 = null; // flaky: basicJanitorMonkeyContext12.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient16 = null; // flaky: basicJanitorMonkeyContext12.awsClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = null; // flaky: basicJanitorMonkeyContext12.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null; // flaky: basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient20 = null; // flaky: basicJanitorMonkeyContext19.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient21 = null; // flaky: basicJanitorMonkeyContext19.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null; // flaky: basicJanitorMonkeyContext19.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient27 = null; // flaky: basicJanitorMonkeyContext26.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null; // flaky: basicJanitorMonkeyContext26.calendar();
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null; // flaky: basicJanitorMonkeyContext26.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str32 = null; // flaky: basicJanitorMonkeyContext31.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker33 = null; // flaky: basicJanitorMonkeyContext31.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar34 = null; // flaky: basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext35 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str36 = null; // flaky: basicJanitorMonkeyContext35.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider37 = null; // flaky: basicJanitorMonkeyContext35.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration38 = null; // flaky: basicJanitorMonkeyContext35.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient40 = null; // flaky: basicJanitorMonkeyContext39.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient41 = null; // flaky: basicJanitorMonkeyContext39.cloudClient();
        java.lang.String str42 = null; // flaky: basicJanitorMonkeyContext39.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder43 = null; // flaky: basicJanitorMonkeyContext39.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine24, janitorCrawler25, janitorResourceTracker30, monkeyCalendar34, monkeyConfiguration38, monkeyRecorder43);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar18, monkeyConfiguration22, monkeyRecorder43);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker46 = basicJanitorContext45.janitorResourceTracker();
        java.lang.String str47 = basicJanitorContext45.region();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(cloudClient13);
// flaky:         org.junit.Assert.assertNotNull(cloudClient14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "us-west-1" + "'", str15, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker17);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar18);
// flaky:         org.junit.Assert.assertNotNull(cloudClient20);
// flaky:         org.junit.Assert.assertNotNull(cloudClient21);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration22);
// flaky:         org.junit.Assert.assertNotNull(cloudClient27);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar28);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker33);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider37);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration38);
// flaky:         org.junit.Assert.assertNotNull(cloudClient40);
// flaky:         org.junit.Assert.assertNotNull(cloudClient41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "us-west-1" + "'", str42, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder43);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext3.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext3.calendar();
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null; // flaky: basicJanitorMonkeyContext3.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context9 = null; // flaky: basicJanitorMonkeyContext3.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient10 = null; // flaky: basicJanitorMonkeyContext3.awsClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient13 = null; // flaky: basicJanitorMonkeyContext12.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient14 = null; // flaky: basicJanitorMonkeyContext12.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient17 = null; // flaky: basicJanitorMonkeyContext16.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient18 = null; // flaky: basicJanitorMonkeyContext16.cloudClient();
        java.lang.String str19 = null; // flaky: basicJanitorMonkeyContext16.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker29 = null; // flaky: basicJanitorMonkeyContext28.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration31 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine26, janitorCrawler27, janitorResourceTracker29, monkeyCalendar30, monkeyConfiguration31, monkeyRecorder32);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient35 = null; // flaky: basicJanitorMonkeyContext34.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient36 = null; // flaky: basicJanitorMonkeyContext34.cloudClient();
        java.lang.String str37 = null; // flaky: basicJanitorMonkeyContext34.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient38 = null; // flaky: basicJanitorMonkeyContext34.awsClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker39 = null; // flaky: basicJanitorMonkeyContext34.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar40 = null; // flaky: basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient42 = null; // flaky: basicJanitorMonkeyContext41.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient43 = null; // flaky: basicJanitorMonkeyContext41.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration44 = null; // flaky: basicJanitorMonkeyContext41.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine46 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler47 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext48 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient49 = null; // flaky: basicJanitorMonkeyContext48.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = null; // flaky: basicJanitorMonkeyContext48.calendar();
// flaky:         basicJanitorMonkeyContext48.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker52 = null; // flaky: basicJanitorMonkeyContext48.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext53 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str54 = null; // flaky: basicJanitorMonkeyContext53.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker55 = null; // flaky: basicJanitorMonkeyContext53.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = null; // flaky: basicJanitorMonkeyContext53.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext57 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str58 = null; // flaky: basicJanitorMonkeyContext57.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider59 = null; // flaky: basicJanitorMonkeyContext57.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration60 = null; // flaky: basicJanitorMonkeyContext57.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext61 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient62 = null; // flaky: basicJanitorMonkeyContext61.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient63 = null; // flaky: basicJanitorMonkeyContext61.cloudClient();
        java.lang.String str64 = null; // flaky: basicJanitorMonkeyContext61.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder65 = null; // flaky: basicJanitorMonkeyContext61.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine46, janitorCrawler47, janitorResourceTracker52, monkeyCalendar56, monkeyConfiguration60, monkeyRecorder65);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext67 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine23, janitorCrawler24, janitorResourceTracker29, monkeyCalendar40, monkeyConfiguration44, monkeyRecorder65);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext68 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker11, monkeyCalendar15, monkeyConfiguration21, monkeyRecorder65);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler69 = basicJanitorContext68.janitorCrawler();
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration8);
// flaky:         org.junit.Assert.assertNotNull(context9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient10);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker11);
// flaky:         org.junit.Assert.assertNotNull(cloudClient13);
// flaky:         org.junit.Assert.assertNotNull(cloudClient14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(cloudClient17);
// flaky:         org.junit.Assert.assertNotNull(cloudClient18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "us-west-1" + "'", str19, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration20);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration21);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker29);
// flaky:         org.junit.Assert.assertNotNull(cloudClient35);
// flaky:         org.junit.Assert.assertNotNull(cloudClient36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "us-west-1" + "'", str37, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient38);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker39);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar40);
// flaky:         org.junit.Assert.assertNotNull(cloudClient42);
// flaky:         org.junit.Assert.assertNotNull(cloudClient43);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration44);
// flaky:         org.junit.Assert.assertNotNull(cloudClient49);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar50);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker52);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker55);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar56);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider59);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration60);
// flaky:         org.junit.Assert.assertNotNull(cloudClient62);
// flaky:         org.junit.Assert.assertNotNull(cloudClient63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "us-west-1" + "'", str64, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder65);
        org.junit.Assert.assertNull(janitorCrawler69);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.CloudClient cloudClient5 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(cloudClient5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        java.lang.String str15 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList8 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(context6);
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.AbstractJanitor.Context context6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor7 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient5, context6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList1 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(janitorRuleEngine13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("owner", "owner");
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event3);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("default", "default");
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient16 = null; // flaky: basicJanitorMonkeyContext15.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null; // flaky: basicJanitorMonkeyContext15.calendar();
// flaky:         basicJanitorMonkeyContext15.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = null; // flaky: basicJanitorMonkeyContext15.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext20 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str21 = null; // flaky: basicJanitorMonkeyContext20.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null; // flaky: basicJanitorMonkeyContext20.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null; // flaky: basicJanitorMonkeyContext20.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str25 = null; // flaky: basicJanitorMonkeyContext24.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider26 = null; // flaky: basicJanitorMonkeyContext24.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = null; // flaky: basicJanitorMonkeyContext24.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient29 = null; // flaky: basicJanitorMonkeyContext28.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient30 = null; // flaky: basicJanitorMonkeyContext28.cloudClient();
        java.lang.String str31 = null; // flaky: basicJanitorMonkeyContext28.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext28.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine13, janitorCrawler14, janitorResourceTracker19, monkeyCalendar23, monkeyConfiguration27, monkeyRecorder32);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient35 = null; // flaky: basicJanitorMonkeyContext34.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient36 = null; // flaky: basicJanitorMonkeyContext34.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration37 = null; // flaky: basicJanitorMonkeyContext34.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine39 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler40 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient42 = null; // flaky: basicJanitorMonkeyContext41.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar43 = null; // flaky: basicJanitorMonkeyContext41.calendar();
// flaky:         basicJanitorMonkeyContext41.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker45 = null; // flaky: basicJanitorMonkeyContext41.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str47 = null; // flaky: basicJanitorMonkeyContext46.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker48 = null; // flaky: basicJanitorMonkeyContext46.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar49 = null; // flaky: basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext50 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str51 = null; // flaky: basicJanitorMonkeyContext50.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider52 = null; // flaky: basicJanitorMonkeyContext50.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration53 = null; // flaky: basicJanitorMonkeyContext50.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext54 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient55 = null; // flaky: basicJanitorMonkeyContext54.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient56 = null; // flaky: basicJanitorMonkeyContext54.cloudClient();
        java.lang.String str57 = null; // flaky: basicJanitorMonkeyContext54.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder58 = null; // flaky: basicJanitorMonkeyContext54.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext59 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine39, janitorCrawler40, janitorResourceTracker45, monkeyCalendar49, monkeyConfiguration53, monkeyRecorder58);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext60 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("owner", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar23, monkeyConfiguration37, monkeyRecorder58);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine61 = basicJanitorContext60.janitorRuleEngine();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(cloudClient16);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar17);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker22);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider26);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration27);
// flaky:         org.junit.Assert.assertNotNull(cloudClient29);
// flaky:         org.junit.Assert.assertNotNull(cloudClient30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "us-west-1" + "'", str31, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder32);
// flaky:         org.junit.Assert.assertNotNull(cloudClient35);
// flaky:         org.junit.Assert.assertNotNull(cloudClient36);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration37);
// flaky:         org.junit.Assert.assertNotNull(cloudClient42);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar43);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker45);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker48);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar49);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider52);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration53);
// flaky:         org.junit.Assert.assertNotNull(cloudClient55);
// flaky:         org.junit.Assert.assertNotNull(cloudClient56);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "us-west-1" + "'", str57, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder58);
        org.junit.Assert.assertNull(janitorRuleEngine61);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(janitorCrawler15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "default");
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.CloudClient cloudClient7 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder6);
// flaky:         org.junit.Assert.assertNotNull(cloudClient7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertNull(janitorResourceTracker11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("owner", "default");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler5 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context9 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context10 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(context6);
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(context9);
// flaky:         org.junit.Assert.assertNotNull(context10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler4 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext14 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker10, monkeyCalendar11, monkeyConfiguration12, monkeyRecorder13);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext14.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor16 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient5, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertNull(monkeyRecorder15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.janitorCrawler();
        java.lang.String str13 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorRuleEngine14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext12.calendar();
        java.lang.String str14 = basicJanitorContext12.region();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor15 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null; // flaky: basicJanitorMonkeyContext8.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker9, monkeyCalendar10, monkeyConfiguration11, monkeyRecorder12);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext13.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = basicJanitorContext13.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext13.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext13.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor18 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(janitorRuleEngine15);
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyRecorder17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("owner", "owner");
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList8 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.Class<?> wildcardClass9 = null; // flaky: abstractJanitorList8.getClass();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList7);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList8);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider8 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(context6);
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider8);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(context6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler5 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler5);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient13 = null; // flaky: basicJanitorMonkeyContext12.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient14 = null; // flaky: basicJanitorMonkeyContext12.cloudClient();
        java.lang.String str15 = null; // flaky: basicJanitorMonkeyContext12.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient16 = null; // flaky: basicJanitorMonkeyContext12.awsClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = null; // flaky: basicJanitorMonkeyContext12.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null; // flaky: basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient20 = null; // flaky: basicJanitorMonkeyContext19.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient21 = null; // flaky: basicJanitorMonkeyContext19.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null; // flaky: basicJanitorMonkeyContext19.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient27 = null; // flaky: basicJanitorMonkeyContext26.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null; // flaky: basicJanitorMonkeyContext26.calendar();
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null; // flaky: basicJanitorMonkeyContext26.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str32 = null; // flaky: basicJanitorMonkeyContext31.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker33 = null; // flaky: basicJanitorMonkeyContext31.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar34 = null; // flaky: basicJanitorMonkeyContext31.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext35 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str36 = null; // flaky: basicJanitorMonkeyContext35.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider37 = null; // flaky: basicJanitorMonkeyContext35.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration38 = null; // flaky: basicJanitorMonkeyContext35.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient40 = null; // flaky: basicJanitorMonkeyContext39.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient41 = null; // flaky: basicJanitorMonkeyContext39.cloudClient();
        java.lang.String str42 = null; // flaky: basicJanitorMonkeyContext39.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder43 = null; // flaky: basicJanitorMonkeyContext39.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine24, janitorCrawler25, janitorResourceTracker30, monkeyCalendar34, monkeyConfiguration38, monkeyRecorder43);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar18, monkeyConfiguration22, monkeyRecorder43);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker46 = basicJanitorContext45.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler47 = basicJanitorContext45.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine48 = basicJanitorContext45.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder49 = basicJanitorContext45.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(cloudClient13);
// flaky:         org.junit.Assert.assertNotNull(cloudClient14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "us-west-1" + "'", str15, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker17);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar18);
// flaky:         org.junit.Assert.assertNotNull(cloudClient20);
// flaky:         org.junit.Assert.assertNotNull(cloudClient21);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration22);
// flaky:         org.junit.Assert.assertNotNull(cloudClient27);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar28);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker33);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider37);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration38);
// flaky:         org.junit.Assert.assertNotNull(cloudClient40);
// flaky:         org.junit.Assert.assertNotNull(cloudClient41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "us-west-1" + "'", str42, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder43);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker46);
        org.junit.Assert.assertNull(janitorCrawler47);
        org.junit.Assert.assertNull(janitorRuleEngine48);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder49);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker9, monkeyCalendar10, monkeyConfiguration11, monkeyRecorder12);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorContext13.calendar();
        java.lang.String str15 = basicJanitorContext13.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext13.configuration();
        java.lang.String str17 = basicJanitorContext13.region();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor18 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient5, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
        org.junit.Assert.assertNull(monkeyCalendar14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.accountName();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.lang.Class<?> wildcardClass8 = null; // flaky: basicJanitorMonkeyContext0.getClass();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder7);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(context6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler7 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler4 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder3);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(monkeyCalendar10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(janitorCrawler9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyConfiguration9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext3.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext3.calendar();
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str9 = null; // flaky: basicJanitorMonkeyContext8.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext8.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str13 = null; // flaky: basicJanitorMonkeyContext12.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider14 = null; // flaky: basicJanitorMonkeyContext12.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null; // flaky: basicJanitorMonkeyContext12.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient17 = null; // flaky: basicJanitorMonkeyContext16.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient18 = null; // flaky: basicJanitorMonkeyContext16.cloudClient();
        java.lang.String str19 = null; // flaky: basicJanitorMonkeyContext16.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null; // flaky: basicJanitorMonkeyContext16.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar11, monkeyConfiguration15, monkeyRecorder20);
        java.lang.String str22 = basicJanitorContext21.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext21.recorder();
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider14);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration15);
// flaky:         org.junit.Assert.assertNotNull(cloudClient17);
// flaky:         org.junit.Assert.assertNotNull(cloudClient18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "us-west-1" + "'", str19, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder23);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        java.lang.String str9 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(monkeyConfiguration16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList1 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient2 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event9);
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(cloudClient2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext6.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext10 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient11 = null; // flaky: basicJanitorMonkeyContext10.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient12 = null; // flaky: basicJanitorMonkeyContext10.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null; // flaky: basicJanitorMonkeyContext10.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration13, monkeyRecorder14);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str20 = null; // flaky: basicJanitorMonkeyContext19.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext19.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient23 = null; // flaky: basicJanitorMonkeyContext22.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str29 = null; // flaky: basicJanitorMonkeyContext28.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null; // flaky: basicJanitorMonkeyContext28.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext32 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient33 = null; // flaky: basicJanitorMonkeyContext32.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient34 = null; // flaky: basicJanitorMonkeyContext32.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration35 = null; // flaky: basicJanitorMonkeyContext32.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine26, janitorCrawler27, janitorResourceTracker30, monkeyCalendar31, monkeyConfiguration35, monkeyRecorder36);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext38 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient39 = null; // flaky: basicJanitorMonkeyContext38.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient40 = null; // flaky: basicJanitorMonkeyContext38.cloudClient();
        java.lang.String str41 = null; // flaky: basicJanitorMonkeyContext38.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder42 = null; // flaky: basicJanitorMonkeyContext38.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine17, janitorCrawler18, janitorResourceTracker21, monkeyCalendar24, monkeyConfiguration35, monkeyRecorder42);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient45 = null; // flaky: basicJanitorMonkeyContext44.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient46 = null; // flaky: basicJanitorMonkeyContext44.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration47 = null; // flaky: basicJanitorMonkeyContext44.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine49 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler50 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext51 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str52 = null; // flaky: basicJanitorMonkeyContext51.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker53 = null; // flaky: basicJanitorMonkeyContext51.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext54 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient55 = null; // flaky: basicJanitorMonkeyContext54.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = null; // flaky: basicJanitorMonkeyContext54.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine58 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler59 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext60 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str61 = null; // flaky: basicJanitorMonkeyContext60.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker62 = null; // flaky: basicJanitorMonkeyContext60.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar63 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext64 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient65 = null; // flaky: basicJanitorMonkeyContext64.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient66 = null; // flaky: basicJanitorMonkeyContext64.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration67 = null; // flaky: basicJanitorMonkeyContext64.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder68 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext69 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine58, janitorCrawler59, janitorResourceTracker62, monkeyCalendar63, monkeyConfiguration67, monkeyRecorder68);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext70 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient71 = null; // flaky: basicJanitorMonkeyContext70.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient72 = null; // flaky: basicJanitorMonkeyContext70.cloudClient();
        java.lang.String str73 = null; // flaky: basicJanitorMonkeyContext70.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder74 = null; // flaky: basicJanitorMonkeyContext70.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext75 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine49, janitorCrawler50, janitorResourceTracker53, monkeyCalendar56, monkeyConfiguration67, monkeyRecorder74);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext76 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar24, monkeyConfiguration47, monkeyRecorder74);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler77 = basicJanitorContext76.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar78 = basicJanitorContext76.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder79 = basicJanitorContext76.recorder();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(cloudClient11);
// flaky:         org.junit.Assert.assertNotNull(cloudClient12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration13);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
// flaky:         org.junit.Assert.assertNotNull(cloudClient23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker30);
// flaky:         org.junit.Assert.assertNotNull(cloudClient33);
// flaky:         org.junit.Assert.assertNotNull(cloudClient34);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration35);
// flaky:         org.junit.Assert.assertNotNull(cloudClient39);
// flaky:         org.junit.Assert.assertNotNull(cloudClient40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "us-west-1" + "'", str41, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder42);
// flaky:         org.junit.Assert.assertNotNull(cloudClient45);
// flaky:         org.junit.Assert.assertNotNull(cloudClient46);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration47);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker53);
// flaky:         org.junit.Assert.assertNotNull(cloudClient55);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar56);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker62);
// flaky:         org.junit.Assert.assertNotNull(cloudClient65);
// flaky:         org.junit.Assert.assertNotNull(cloudClient66);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration67);
// flaky:         org.junit.Assert.assertNotNull(cloudClient71);
// flaky:         org.junit.Assert.assertNotNull(cloudClient72);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "us-west-1" + "'", str73, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder74);
        org.junit.Assert.assertNull(janitorCrawler77);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar78);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder79);
    }
}
