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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.Class<?> wildcardClass1 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
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
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(aWSClient2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext10 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker6, monkeyCalendar7, monkeyConfiguration8, monkeyRecorder9);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext10.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext10.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor13 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(monkeyCalendar12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext12.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(janitorEmailNotifier7);
        org.junit.Assert.assertNotNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyCalendar13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event2 = null;
        basicJanitorMonkeyContext0.reportEvent(event2);
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext0.cloudClient();
        org.junit.Assert.assertNotNull(cloudClient4);
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
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        java.lang.Class<?> wildcardClass9 = basicJanitorContext7.getClass();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
        basicJanitorMonkeyContext0.reportEvent(event3);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = basicJanitorMonkeyContext0.emailNotifier();
        java.lang.Class<?> wildcardClass6 = janitorEmailNotifier5.getClass();
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(janitorEmailNotifier5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.resourceTracker();
        basicJanitorMonkeyContext0.exportCredentials("", "hi!");
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext0.calendar();
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = basicJanitorMonkeyContext4.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = basicJanitorMonkeyContext4.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext10 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker6, monkeyCalendar7, monkeyConfiguration8, monkeyRecorder9);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext10.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext10.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor13 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailNotifier5);
        org.junit.Assert.assertNotNull(janitorResourceTracker6);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyRecorder12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext8.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext8.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext8.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor12 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(monkeyCalendar10);
        org.junit.Assert.assertNull(monkeyCalendar11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = basicJanitorMonkeyContext0.scheduler();
        basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors();
        java.lang.String str5 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.AbstractJanitor.Context context7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor8 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient6, context7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monkeyScheduler2);
        org.junit.Assert.assertNotNull(abstractJanitorList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(aWSClient6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = basicJanitorMonkeyContext0.scheduler();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = basicJanitorMonkeyContext0.scheduler();
        org.junit.Assert.assertNotNull(monkeyScheduler2);
        org.junit.Assert.assertNotNull(janitorEmailNotifier4);
        org.junit.Assert.assertNotNull(monkeyRecorder5);
        org.junit.Assert.assertNotNull(monkeyScheduler6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler4 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext5.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext5.resourceTracker();
        basicJanitorMonkeyContext5.exportCredentials("", "hi!");
        basicJanitorMonkeyContext5.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorMonkeyContext5.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler15 = basicJanitorMonkeyContext13.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine3, janitorCrawler4, janitorResourceTracker12, monkeyCalendar16, monkeyConfiguration17, monkeyRecorder18);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor20 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
        org.junit.Assert.assertNotNull(janitorResourceTracker12);
        org.junit.Assert.assertNotNull(monkeyScheduler15);
        org.junit.Assert.assertNotNull(monkeyCalendar16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = basicJanitorMonkeyContext0.scheduler();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        org.junit.Assert.assertNotNull(monkeyScheduler2);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = basicJanitorMonkeyContext9.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker11, monkeyCalendar12, monkeyConfiguration13, monkeyRecorder14);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar16, monkeyConfiguration17, monkeyRecorder18);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext20 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier21 = basicJanitorMonkeyContext20.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorMonkeyContext20.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorMonkeyContext20.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier29 = basicJanitorMonkeyContext28.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = basicJanitorMonkeyContext28.resourceTracker();
        basicJanitorMonkeyContext28.exportCredentials("", "hi!");
        basicJanitorMonkeyContext28.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorMonkeyContext28.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext36 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier37 = basicJanitorMonkeyContext36.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker38 = basicJanitorMonkeyContext36.resourceTracker();
        basicJanitorMonkeyContext36.exportCredentials("", "hi!");
        basicJanitorMonkeyContext36.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker43 = basicJanitorMonkeyContext36.resourceTracker();
        java.lang.String str44 = basicJanitorMonkeyContext36.region();
        basicJanitorMonkeyContext36.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar46 = basicJanitorMonkeyContext36.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration47 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext48 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext48.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler50 = basicJanitorMonkeyContext48.scheduler();
        basicJanitorMonkeyContext48.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList52 = basicJanitorMonkeyContext48.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder53 = basicJanitorMonkeyContext48.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext54 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine26, janitorCrawler27, janitorResourceTracker35, monkeyCalendar46, monkeyConfiguration47, monkeyRecorder53);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext55 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker11, monkeyCalendar23, monkeyConfiguration24, monkeyRecorder53);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder56 = basicJanitorContext55.recorder();
        org.junit.Assert.assertNotNull(janitorEmailNotifier10);
        org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNotNull(janitorEmailNotifier21);
        org.junit.Assert.assertNotNull(monkeyRecorder22);
        org.junit.Assert.assertNotNull(monkeyCalendar23);
        org.junit.Assert.assertNotNull(janitorEmailNotifier29);
        org.junit.Assert.assertNotNull(janitorResourceTracker30);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNotNull(janitorEmailNotifier37);
        org.junit.Assert.assertNotNull(janitorResourceTracker38);
        org.junit.Assert.assertNotNull(janitorResourceTracker43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "us-west-1" + "'", str44, "us-west-1");
        org.junit.Assert.assertNotNull(monkeyCalendar46);
        org.junit.Assert.assertNotNull(monkeyScheduler50);
        org.junit.Assert.assertNotNull(abstractJanitorList52);
        org.junit.Assert.assertNotNull(monkeyRecorder53);
        org.junit.Assert.assertNotNull(monkeyRecorder56);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext14 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker10, monkeyCalendar11, monkeyConfiguration12, monkeyRecorder13);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext14.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext14.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext14.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor18 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient6, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(cloudClient4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(aWSClient6);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar17);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = basicJanitorMonkeyContext0.emailNotifier();
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(janitorEmailNotifier4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
        basicJanitorMonkeyContext0.reportEvent(event3);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
        basicJanitorMonkeyContext0.reportEvent(event6);
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNotNull(janitorEmailNotifier5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorMonkeyContext0.recorder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
        basicJanitorMonkeyContext0.reportEvent(event4);
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(monkeyRecorder2);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.resourceTracker();
        basicJanitorMonkeyContext0.exportCredentials("", "hi!");
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = basicJanitorMonkeyContext0.emailNotifier();
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
        org.junit.Assert.assertNotNull(janitorEmailNotifier7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = basicJanitorMonkeyContext0.awsClient();
        basicJanitorMonkeyContext0.exportCredentials("us-west-1", "us-west-1");
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(aWSClient2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        java.lang.Class<?> wildcardClass6 = null; // flaky: basicJanitorMonkeyContext0.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event2 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event2);
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext14 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker10, monkeyCalendar11, monkeyConfiguration12, monkeyRecorder13);
        java.lang.String str15 = basicJanitorContext14.region();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor16 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient6, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext12.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = null; // flaky: basicJanitorMonkeyContext9.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null; // flaky: basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker11, monkeyCalendar12, monkeyConfiguration13, monkeyRecorder14);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier17 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null; // flaky: basicJanitorMonkeyContext16.resourceTracker();
// flaky:         basicJanitorMonkeyContext16.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext16.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null; // flaky: basicJanitorMonkeyContext16.resourceTracker();
        java.lang.String str24 = null; // flaky: basicJanitorMonkeyContext16.region();
// flaky:         basicJanitorMonkeyContext16.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null; // flaky: basicJanitorMonkeyContext16.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier29 = null; // flaky: basicJanitorMonkeyContext28.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = null; // flaky: basicJanitorMonkeyContext28.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar26, monkeyConfiguration27, monkeyRecorder30);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor32 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier10);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker11);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier17);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker18);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "us-west-1" + "'", str24, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar26);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier29);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder30);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = basicJanitorContext7.janitorCrawler();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(janitorCrawler9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(monkeyRecorder11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier14 = null; // flaky: basicJanitorMonkeyContext13.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
// flaky:         basicJanitorMonkeyContext13.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
        java.lang.String str21 = null; // flaky: basicJanitorMonkeyContext13.region();
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null; // flaky: basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null; // flaky: basicJanitorMonkeyContext25.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext28 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar23, monkeyConfiguration24, monkeyRecorder27);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration29 = basicJanitorContext28.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "us-west-1" + "'", str21, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder27);
        org.junit.Assert.assertNull(monkeyConfiguration29);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext9.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext9.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext9.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext9.janitorCrawler();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertNull(monkeyCalendar10);
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorCrawler13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
// flaky:         basicJanitorMonkeyContext3.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler13 = null; // flaky: basicJanitorMonkeyContext11.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext17 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar14, monkeyConfiguration15, monkeyRecorder16);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext17.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext17.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler13);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar14);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler4 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine3, janitorCrawler4, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext9.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext9.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext9.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext9.janitorResourceTracker();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(aWSClient1);
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = null; // flaky: basicJanitorMonkeyContext12.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null; // flaky: basicJanitorMonkeyContext12.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker14, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder17);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext22 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker14, monkeyCalendar19, monkeyConfiguration20, monkeyRecorder21);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier27 = null; // flaky: basicJanitorMonkeyContext26.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = null; // flaky: basicJanitorMonkeyContext26.resourceTracker();
// flaky:         basicJanitorMonkeyContext26.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker33 = null; // flaky: basicJanitorMonkeyContext26.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext34.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler36 = null; // flaky: basicJanitorMonkeyContext34.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = null; // flaky: basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration38 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine24, janitorCrawler25, janitorResourceTracker33, monkeyCalendar37, monkeyConfiguration38, monkeyRecorder39);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration41 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder42 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker14, monkeyCalendar37, monkeyConfiguration41, monkeyRecorder42);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine45 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler46 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine48 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler49 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine51 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler52 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext53 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier54 = null; // flaky: basicJanitorMonkeyContext53.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker55 = null; // flaky: basicJanitorMonkeyContext53.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration57 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder58 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext59 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine51, janitorCrawler52, janitorResourceTracker55, monkeyCalendar56, monkeyConfiguration57, monkeyRecorder58);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar60 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration61 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder62 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext63 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine48, janitorCrawler49, janitorResourceTracker55, monkeyCalendar60, monkeyConfiguration61, monkeyRecorder62);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine65 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler66 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext67 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier68 = null; // flaky: basicJanitorMonkeyContext67.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker69 = null; // flaky: basicJanitorMonkeyContext67.resourceTracker();
// flaky:         basicJanitorMonkeyContext67.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext67.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker74 = null; // flaky: basicJanitorMonkeyContext67.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext75 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext75.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler77 = null; // flaky: basicJanitorMonkeyContext75.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar78 = null; // flaky: basicJanitorMonkeyContext75.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration79 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder80 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext81 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine65, janitorCrawler66, janitorResourceTracker74, monkeyCalendar78, monkeyConfiguration79, monkeyRecorder80);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration82 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder83 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext84 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine45, janitorCrawler46, janitorResourceTracker55, monkeyCalendar78, monkeyConfiguration82, monkeyRecorder83);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext85 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier86 = null; // flaky: basicJanitorMonkeyContext85.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker87 = null; // flaky: basicJanitorMonkeyContext85.resourceTracker();
// flaky:         basicJanitorMonkeyContext85.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext85.resetEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration92 = null; // flaky: basicJanitorMonkeyContext85.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext93 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext93.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler95 = null; // flaky: basicJanitorMonkeyContext93.scheduler();
// flaky:         basicJanitorMonkeyContext93.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier97 = null; // flaky: basicJanitorMonkeyContext93.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder98 = null; // flaky: basicJanitorMonkeyContext93.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext99 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker14, monkeyCalendar78, monkeyConfiguration92, monkeyRecorder98);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier13);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker14);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier27);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker28);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker33);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler36);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar37);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier54);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker55);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier68);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker69);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker74);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler77);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar78);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier86);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker87);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration92);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler95);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier97);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder98);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = basicJanitorContext7.janitorCrawler();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(janitorCrawler9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(janitorResourceTracker11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event3);
        java.lang.Class<?> wildcardClass5 = null; // flaky: basicJanitorMonkeyContext0.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.Class<?> wildcardClass5 = null; // flaky: aWSCredentialsProvider4.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration1 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration1);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext14 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker10, monkeyCalendar11, monkeyConfiguration12, monkeyRecorder13);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext14.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext14.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext14.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext14.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext14.janitorCrawler();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor20 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient6, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(janitorResourceTracker18);
        org.junit.Assert.assertNull(janitorCrawler19);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext14 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker10, monkeyCalendar11, monkeyConfiguration12, monkeyRecorder13);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext14.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor16 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient6, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
        org.junit.Assert.assertNull(monkeyCalendar15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.lang.Class<?> wildcardClass8 = null; // flaky: monkeyRecorder7.getClass();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder7);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = null; // flaky: basicJanitorMonkeyContext9.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null; // flaky: basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker11, monkeyCalendar12, monkeyConfiguration13, monkeyRecorder14);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = basicJanitorContext15.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor17 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient5, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier10);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNull(janitorRuleEngine16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = null; // flaky: basicJanitorMonkeyContext12.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null; // flaky: basicJanitorMonkeyContext12.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker14, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder17);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext22 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker14, monkeyCalendar19, monkeyConfiguration20, monkeyRecorder21);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier24 = null; // flaky: basicJanitorMonkeyContext23.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null; // flaky: basicJanitorMonkeyContext23.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null; // flaky: basicJanitorMonkeyContext23.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler30 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier32 = null; // flaky: basicJanitorMonkeyContext31.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker33 = null; // flaky: basicJanitorMonkeyContext31.resourceTracker();
// flaky:         basicJanitorMonkeyContext31.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext31.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker38 = null; // flaky: basicJanitorMonkeyContext31.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier40 = null; // flaky: basicJanitorMonkeyContext39.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker41 = null; // flaky: basicJanitorMonkeyContext39.resourceTracker();
// flaky:         basicJanitorMonkeyContext39.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext39.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker46 = null; // flaky: basicJanitorMonkeyContext39.resourceTracker();
        java.lang.String str47 = null; // flaky: basicJanitorMonkeyContext39.region();
// flaky:         basicJanitorMonkeyContext39.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar49 = null; // flaky: basicJanitorMonkeyContext39.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration50 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext51 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext51.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler53 = null; // flaky: basicJanitorMonkeyContext51.scheduler();
// flaky:         basicJanitorMonkeyContext51.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList55 = null; // flaky: basicJanitorMonkeyContext51.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder56 = null; // flaky: basicJanitorMonkeyContext51.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext57 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine29, janitorCrawler30, janitorResourceTracker38, monkeyCalendar49, monkeyConfiguration50, monkeyRecorder56);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext58 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker14, monkeyCalendar26, monkeyConfiguration27, monkeyRecorder56);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration59 = basicJanitorContext58.configuration();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor60 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier13);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker14);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier24);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder25);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar26);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier32);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker33);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker38);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier40);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker41);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "us-west-1" + "'", str47, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar49);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler53);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList55);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder56);
        org.junit.Assert.assertNull(monkeyConfiguration59);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler4 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine3, janitorCrawler4, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext9.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext9.janitorCrawler();
        java.lang.String str12 = basicJanitorContext9.region();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor13 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(aWSClient1);
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList10 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = null; // flaky: basicJanitorMonkeyContext9.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null; // flaky: basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker11, monkeyCalendar12, monkeyConfiguration13, monkeyRecorder14);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar16, monkeyConfiguration17, monkeyRecorder18);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext19.janitorRuleEngine();
        java.lang.String str21 = basicJanitorContext19.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext19.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor23 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier10);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(janitorRuleEngine22);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier19 = null; // flaky: basicJanitorMonkeyContext18.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null; // flaky: basicJanitorMonkeyContext18.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext24 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine16, janitorCrawler17, janitorResourceTracker20, monkeyCalendar21, monkeyConfiguration22, monkeyRecorder23);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext28 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine13, janitorCrawler14, janitorResourceTracker20, monkeyCalendar25, monkeyConfiguration26, monkeyRecorder27);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier30 = null; // flaky: basicJanitorMonkeyContext29.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar32 = null; // flaky: basicJanitorMonkeyContext29.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration33 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine35 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler36 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier38 = null; // flaky: basicJanitorMonkeyContext37.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker39 = null; // flaky: basicJanitorMonkeyContext37.resourceTracker();
// flaky:         basicJanitorMonkeyContext37.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext37.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker44 = null; // flaky: basicJanitorMonkeyContext37.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext45 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier46 = null; // flaky: basicJanitorMonkeyContext45.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker47 = null; // flaky: basicJanitorMonkeyContext45.resourceTracker();
// flaky:         basicJanitorMonkeyContext45.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext45.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker52 = null; // flaky: basicJanitorMonkeyContext45.resourceTracker();
        java.lang.String str53 = null; // flaky: basicJanitorMonkeyContext45.region();
// flaky:         basicJanitorMonkeyContext45.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar55 = null; // flaky: basicJanitorMonkeyContext45.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration56 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext57 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext57.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler59 = null; // flaky: basicJanitorMonkeyContext57.scheduler();
// flaky:         basicJanitorMonkeyContext57.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList61 = null; // flaky: basicJanitorMonkeyContext57.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder62 = null; // flaky: basicJanitorMonkeyContext57.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext63 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine35, janitorCrawler36, janitorResourceTracker44, monkeyCalendar55, monkeyConfiguration56, monkeyRecorder62);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext64 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker20, monkeyCalendar32, monkeyConfiguration33, monkeyRecorder62);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = basicJanitorContext64.configuration();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor66 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient8, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(aWSClient8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier19);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker20);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier30);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder31);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar32);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier38);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker39);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker44);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier46);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker47);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "us-west-1" + "'", str53, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar55);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler59);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList61);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder62);
        org.junit.Assert.assertNull(monkeyConfiguration65);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
// flaky:         basicJanitorMonkeyContext6.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext6.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier15 = null; // flaky: basicJanitorMonkeyContext14.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
// flaky:         basicJanitorMonkeyContext14.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
        java.lang.String str22 = null; // flaky: basicJanitorMonkeyContext14.region();
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext14.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler28 = null; // flaky: basicJanitorMonkeyContext26.scheduler();
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList30 = null; // flaky: basicJanitorMonkeyContext26.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null; // flaky: basicJanitorMonkeyContext26.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker13, monkeyCalendar24, monkeyConfiguration25, monkeyRecorder31);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler35 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine37 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler38 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier40 = null; // flaky: basicJanitorMonkeyContext39.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker41 = null; // flaky: basicJanitorMonkeyContext39.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration43 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine37, janitorCrawler38, janitorResourceTracker41, monkeyCalendar42, monkeyConfiguration43, monkeyRecorder44);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier47 = null; // flaky: basicJanitorMonkeyContext46.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker48 = null; // flaky: basicJanitorMonkeyContext46.resourceTracker();
// flaky:         basicJanitorMonkeyContext46.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext46.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker53 = null; // flaky: basicJanitorMonkeyContext46.resourceTracker();
        java.lang.String str54 = null; // flaky: basicJanitorMonkeyContext46.region();
// flaky:         basicJanitorMonkeyContext46.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = null; // flaky: basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration57 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext58 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier59 = null; // flaky: basicJanitorMonkeyContext58.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder60 = null; // flaky: basicJanitorMonkeyContext58.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine34, janitorCrawler35, janitorResourceTracker41, monkeyCalendar56, monkeyConfiguration57, monkeyRecorder60);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext62 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier63 = null; // flaky: basicJanitorMonkeyContext62.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient64 = null; // flaky: basicJanitorMonkeyContext62.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler65 = null; // flaky: basicJanitorMonkeyContext62.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration66 = null; // flaky: basicJanitorMonkeyContext62.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine68 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler69 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine71 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler72 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext73 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier74 = null; // flaky: basicJanitorMonkeyContext73.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker75 = null; // flaky: basicJanitorMonkeyContext73.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar76 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration77 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder78 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext79 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine71, janitorCrawler72, janitorResourceTracker75, monkeyCalendar76, monkeyConfiguration77, monkeyRecorder78);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext80 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier81 = null; // flaky: basicJanitorMonkeyContext80.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker82 = null; // flaky: basicJanitorMonkeyContext80.resourceTracker();
// flaky:         basicJanitorMonkeyContext80.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext80.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker87 = null; // flaky: basicJanitorMonkeyContext80.resourceTracker();
        java.lang.String str88 = null; // flaky: basicJanitorMonkeyContext80.region();
// flaky:         basicJanitorMonkeyContext80.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar90 = null; // flaky: basicJanitorMonkeyContext80.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration91 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext92 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier93 = null; // flaky: basicJanitorMonkeyContext92.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder94 = null; // flaky: basicJanitorMonkeyContext92.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext95 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine68, janitorCrawler69, janitorResourceTracker75, monkeyCalendar90, monkeyConfiguration91, monkeyRecorder94);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext96 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker13, monkeyCalendar56, monkeyConfiguration66, monkeyRecorder94);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder97 = basicJanitorContext96.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar98 = basicJanitorContext96.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "us-west-1" + "'", str22, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler28);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList30);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder31);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier40);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker41);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier47);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker48);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "us-west-1" + "'", str54, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar56);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier59);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder60);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier63);
// flaky:         org.junit.Assert.assertNotNull(aWSClient64);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler65);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration66);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier74);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker75);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier81);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker82);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker87);
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "us-west-1" + "'", str88, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar90);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier93);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder94);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder97);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar98);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
// flaky:         basicJanitorMonkeyContext3.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler13 = null; // flaky: basicJanitorMonkeyContext11.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext17 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar14, monkeyConfiguration15, monkeyRecorder16);
        java.lang.String str18 = basicJanitorContext17.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext17.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler13);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(monkeyRecorder19);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event2 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event2);
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext9.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorContext9.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext9.janitorCrawler();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNull(janitorCrawler12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext9.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorContext9.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext9.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker11);
        org.junit.Assert.assertNull(monkeyCalendar12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event3);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.CloudClient cloudClient7 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier5);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration6);
// flaky:         org.junit.Assert.assertNotNull(cloudClient7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context3 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
// flaky:         org.junit.Assert.assertNotNull(context3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier16 = null; // flaky: basicJanitorMonkeyContext15.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = null; // flaky: basicJanitorMonkeyContext15.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine13, janitorCrawler14, janitorResourceTracker17, monkeyCalendar18, monkeyConfiguration19, monkeyRecorder20);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext25 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker17, monkeyCalendar22, monkeyConfiguration23, monkeyRecorder24);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = basicJanitorContext25.janitorRuleEngine();
        java.lang.String str27 = basicJanitorContext25.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = basicJanitorContext25.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor29 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient8, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(aWSClient8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(janitorRuleEngine26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(janitorRuleEngine28);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler4 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext5.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext5.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine3, janitorCrawler4, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext11.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext11.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext11.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext11.janitorResourceTracker();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor16 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(aWSClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(janitorCrawler14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(aWSClient8);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
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
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext7.janitorResourceTracker();
        java.lang.String str11 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
// flaky:         basicJanitorMonkeyContext6.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext6.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier15 = null; // flaky: basicJanitorMonkeyContext14.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
// flaky:         basicJanitorMonkeyContext14.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
        java.lang.String str22 = null; // flaky: basicJanitorMonkeyContext14.region();
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext14.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler28 = null; // flaky: basicJanitorMonkeyContext26.scheduler();
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList30 = null; // flaky: basicJanitorMonkeyContext26.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null; // flaky: basicJanitorMonkeyContext26.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker13, monkeyCalendar24, monkeyConfiguration25, monkeyRecorder31);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler35 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine37 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler38 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier40 = null; // flaky: basicJanitorMonkeyContext39.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker41 = null; // flaky: basicJanitorMonkeyContext39.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration43 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine37, janitorCrawler38, janitorResourceTracker41, monkeyCalendar42, monkeyConfiguration43, monkeyRecorder44);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier47 = null; // flaky: basicJanitorMonkeyContext46.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker48 = null; // flaky: basicJanitorMonkeyContext46.resourceTracker();
// flaky:         basicJanitorMonkeyContext46.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext46.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker53 = null; // flaky: basicJanitorMonkeyContext46.resourceTracker();
        java.lang.String str54 = null; // flaky: basicJanitorMonkeyContext46.region();
// flaky:         basicJanitorMonkeyContext46.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = null; // flaky: basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration57 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext58 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier59 = null; // flaky: basicJanitorMonkeyContext58.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder60 = null; // flaky: basicJanitorMonkeyContext58.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine34, janitorCrawler35, janitorResourceTracker41, monkeyCalendar56, monkeyConfiguration57, monkeyRecorder60);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext62 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier63 = null; // flaky: basicJanitorMonkeyContext62.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient64 = null; // flaky: basicJanitorMonkeyContext62.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler65 = null; // flaky: basicJanitorMonkeyContext62.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration66 = null; // flaky: basicJanitorMonkeyContext62.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine68 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler69 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine71 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler72 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext73 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier74 = null; // flaky: basicJanitorMonkeyContext73.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker75 = null; // flaky: basicJanitorMonkeyContext73.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar76 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration77 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder78 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext79 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine71, janitorCrawler72, janitorResourceTracker75, monkeyCalendar76, monkeyConfiguration77, monkeyRecorder78);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext80 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier81 = null; // flaky: basicJanitorMonkeyContext80.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker82 = null; // flaky: basicJanitorMonkeyContext80.resourceTracker();
// flaky:         basicJanitorMonkeyContext80.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext80.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker87 = null; // flaky: basicJanitorMonkeyContext80.resourceTracker();
        java.lang.String str88 = null; // flaky: basicJanitorMonkeyContext80.region();
// flaky:         basicJanitorMonkeyContext80.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar90 = null; // flaky: basicJanitorMonkeyContext80.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration91 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext92 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier93 = null; // flaky: basicJanitorMonkeyContext92.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder94 = null; // flaky: basicJanitorMonkeyContext92.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext95 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine68, janitorCrawler69, janitorResourceTracker75, monkeyCalendar90, monkeyConfiguration91, monkeyRecorder94);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext96 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker13, monkeyCalendar56, monkeyConfiguration66, monkeyRecorder94);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder97 = basicJanitorContext96.recorder();
        java.lang.Class<?> wildcardClass98 = basicJanitorContext96.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "us-west-1" + "'", str22, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler28);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList30);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder31);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier40);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker41);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier47);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker48);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "us-west-1" + "'", str54, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar56);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier59);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder60);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier63);
// flaky:         org.junit.Assert.assertNotNull(aWSClient64);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler65);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration66);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier74);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker75);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier81);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker82);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker87);
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "us-west-1" + "'", str88, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar90);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier93);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder94);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder97);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
// flaky:         basicJanitorMonkeyContext3.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier12 = null; // flaky: basicJanitorMonkeyContext11.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null; // flaky: basicJanitorMonkeyContext11.resourceTracker();
// flaky:         basicJanitorMonkeyContext11.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext11.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null; // flaky: basicJanitorMonkeyContext11.resourceTracker();
        java.lang.String str19 = null; // flaky: basicJanitorMonkeyContext11.region();
// flaky:         basicJanitorMonkeyContext11.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext23.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler25 = null; // flaky: basicJanitorMonkeyContext23.scheduler();
// flaky:         basicJanitorMonkeyContext23.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList27 = null; // flaky: basicJanitorMonkeyContext23.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = null; // flaky: basicJanitorMonkeyContext23.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar21, monkeyConfiguration22, monkeyRecorder28);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = basicJanitorContext29.configuration();
        java.lang.String str31 = basicJanitorContext29.region();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "us-west-1" + "'", str19, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler25);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList27);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder28);
        org.junit.Assert.assertNull(monkeyConfiguration30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.CloudClient cloudClient7 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertNotNull(cloudClient7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext16.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext16.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(monkeyRecorder18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier14 = null; // flaky: basicJanitorMonkeyContext13.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
// flaky:         basicJanitorMonkeyContext13.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
        java.lang.String str21 = null; // flaky: basicJanitorMonkeyContext13.region();
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null; // flaky: basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null; // flaky: basicJanitorMonkeyContext25.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext28 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar23, monkeyConfiguration24, monkeyRecorder27);
        java.lang.String str29 = basicJanitorContext28.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = basicJanitorContext28.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = basicJanitorContext28.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "us-west-1" + "'", str21, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker30);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder31);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient9 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier14 = null; // flaky: basicJanitorMonkeyContext13.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine11, janitorCrawler12, janitorResourceTracker15, monkeyCalendar16, monkeyConfiguration17, monkeyRecorder18);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor20 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient9, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(aWSClient9);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context17 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient18 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine20, janitorCrawler21, janitorResourceTracker22, monkeyCalendar23, monkeyConfiguration24, monkeyRecorder25);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = basicJanitorContext26.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler28 = basicJanitorContext26.janitorCrawler();
        java.lang.String str29 = basicJanitorContext26.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = basicJanitorContext26.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar31 = basicJanitorContext26.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor32 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient18, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(context17);
// flaky:         org.junit.Assert.assertNotNull(aWSClient18);
        org.junit.Assert.assertNull(monkeyRecorder27);
        org.junit.Assert.assertNull(janitorCrawler28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(monkeyRecorder30);
        org.junit.Assert.assertNull(monkeyCalendar31);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext12.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier24 = null; // flaky: basicJanitorMonkeyContext23.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = null; // flaky: basicJanitorMonkeyContext23.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine21, janitorCrawler22, janitorResourceTracker25, monkeyCalendar26, monkeyConfiguration27, monkeyRecorder28);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration31 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker25, monkeyCalendar30, monkeyConfiguration31, monkeyRecorder32);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier35 = null; // flaky: basicJanitorMonkeyContext34.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null; // flaky: basicJanitorMonkeyContext34.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = null; // flaky: basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration38 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine40 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler41 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext42 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier43 = null; // flaky: basicJanitorMonkeyContext42.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker44 = null; // flaky: basicJanitorMonkeyContext42.resourceTracker();
// flaky:         basicJanitorMonkeyContext42.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext42.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker49 = null; // flaky: basicJanitorMonkeyContext42.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext50 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier51 = null; // flaky: basicJanitorMonkeyContext50.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker52 = null; // flaky: basicJanitorMonkeyContext50.resourceTracker();
// flaky:         basicJanitorMonkeyContext50.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext50.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker57 = null; // flaky: basicJanitorMonkeyContext50.resourceTracker();
        java.lang.String str58 = null; // flaky: basicJanitorMonkeyContext50.region();
// flaky:         basicJanitorMonkeyContext50.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar60 = null; // flaky: basicJanitorMonkeyContext50.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration61 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext62 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext62.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler64 = null; // flaky: basicJanitorMonkeyContext62.scheduler();
// flaky:         basicJanitorMonkeyContext62.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList66 = null; // flaky: basicJanitorMonkeyContext62.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder67 = null; // flaky: basicJanitorMonkeyContext62.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext68 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine40, janitorCrawler41, janitorResourceTracker49, monkeyCalendar60, monkeyConfiguration61, monkeyRecorder67);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext69 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine15, janitorCrawler16, janitorResourceTracker25, monkeyCalendar37, monkeyConfiguration38, monkeyRecorder67);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext70 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration71 = null; // flaky: basicJanitorMonkeyContext70.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration72 = null; // flaky: basicJanitorMonkeyContext70.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext73 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier74 = null; // flaky: basicJanitorMonkeyContext73.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient75 = null; // flaky: basicJanitorMonkeyContext73.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler76 = null; // flaky: basicJanitorMonkeyContext73.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration77 = null; // flaky: basicJanitorMonkeyContext73.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder78 = null; // flaky: basicJanitorMonkeyContext73.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext79 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker13, monkeyCalendar37, monkeyConfiguration72, monkeyRecorder78);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder80 = basicJanitorContext79.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier24);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker25);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier35);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder36);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar37);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier43);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker44);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker49);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier51);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker52);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker57);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "us-west-1" + "'", str58, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar60);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler64);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList66);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder67);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration71);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration72);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier74);
// flaky:         org.junit.Assert.assertNotNull(aWSClient75);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler76);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration77);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder78);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder80);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.CloudClient cloudClient3 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
// flaky:         org.junit.Assert.assertNotNull(cloudClient3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.Class<?> wildcardClass5 = null; // flaky: basicJanitorMonkeyContext0.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event2 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event2);
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler5 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context17 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.Class<?> wildcardClass18 = null; // flaky: context17.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(context17);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(monkeyCalendar10);
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(context6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.CloudClient cloudClient7 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event8 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event8);
        java.lang.String str10 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
// flaky:         org.junit.Assert.assertNotNull(cloudClient7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "us-west-1" + "'", str10, "us-west-1");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier14 = null; // flaky: basicJanitorMonkeyContext13.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine11, janitorCrawler12, janitorResourceTracker15, monkeyCalendar16, monkeyConfiguration17, monkeyRecorder18);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext23 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker15, monkeyCalendar20, monkeyConfiguration21, monkeyRecorder22);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext23.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor25 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient6, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
        org.junit.Assert.assertNull(monkeyRecorder24);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext12.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext12.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext12.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = null; // flaky: basicJanitorMonkeyContext25.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration29 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine23, janitorCrawler24, janitorResourceTracker27, monkeyCalendar28, monkeyConfiguration29, monkeyRecorder30);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar32 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration33 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder34 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext35 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine20, janitorCrawler21, janitorResourceTracker27, monkeyCalendar32, monkeyConfiguration33, monkeyRecorder34);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine37 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler38 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier40 = null; // flaky: basicJanitorMonkeyContext39.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker41 = null; // flaky: basicJanitorMonkeyContext39.resourceTracker();
// flaky:         basicJanitorMonkeyContext39.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext39.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker46 = null; // flaky: basicJanitorMonkeyContext39.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext47 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext47.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler49 = null; // flaky: basicJanitorMonkeyContext47.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = null; // flaky: basicJanitorMonkeyContext47.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration51 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder52 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext53 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine37, janitorCrawler38, janitorResourceTracker46, monkeyCalendar50, monkeyConfiguration51, monkeyRecorder52);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration54 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder55 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext56 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine17, janitorCrawler18, janitorResourceTracker27, monkeyCalendar50, monkeyConfiguration54, monkeyRecorder55);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext57 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier58 = null; // flaky: basicJanitorMonkeyContext57.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient59 = null; // flaky: basicJanitorMonkeyContext57.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event60 = null;
// flaky:         basicJanitorMonkeyContext57.reportEvent(event60);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier62 = null; // flaky: basicJanitorMonkeyContext57.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration63 = null; // flaky: basicJanitorMonkeyContext57.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar64 = null; // flaky: basicJanitorMonkeyContext57.calendar();
        java.lang.String str65 = null; // flaky: basicJanitorMonkeyContext57.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration66 = null; // flaky: basicJanitorMonkeyContext57.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext67 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext67.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler69 = null; // flaky: basicJanitorMonkeyContext67.scheduler();
// flaky:         basicJanitorMonkeyContext67.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList71 = null; // flaky: basicJanitorMonkeyContext67.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder72 = null; // flaky: basicJanitorMonkeyContext67.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext73 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker15, monkeyCalendar50, monkeyConfiguration66, monkeyRecorder72);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyRecorder14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker27);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier40);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker41);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker46);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler49);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar50);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier58);
// flaky:         org.junit.Assert.assertNotNull(aWSClient59);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier62);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration63);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar64);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "us-west-1" + "'", str65, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration66);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler69);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList71);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder72);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier14 = null; // flaky: basicJanitorMonkeyContext13.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
// flaky:         basicJanitorMonkeyContext13.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
        java.lang.String str21 = null; // flaky: basicJanitorMonkeyContext13.region();
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null; // flaky: basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null; // flaky: basicJanitorMonkeyContext25.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext28 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar23, monkeyConfiguration24, monkeyRecorder27);
        java.lang.String str29 = basicJanitorContext28.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = basicJanitorContext28.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar31 = basicJanitorContext28.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "us-west-1" + "'", str21, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker30);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar31);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier14 = null; // flaky: basicJanitorMonkeyContext13.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
// flaky:         basicJanitorMonkeyContext13.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
        java.lang.String str21 = null; // flaky: basicJanitorMonkeyContext13.region();
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null; // flaky: basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null; // flaky: basicJanitorMonkeyContext25.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext28 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar23, monkeyConfiguration24, monkeyRecorder27);
        java.lang.String str29 = basicJanitorContext28.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = basicJanitorContext28.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "us-west-1" + "'", str21, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder30);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration1 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration1);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext14 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker10, monkeyCalendar11, monkeyConfiguration12, monkeyRecorder13);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor15 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient6, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(monkeyCalendar10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context5 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(context5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context17 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient18 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.AbstractJanitor.Context context19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor20 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient18, context19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(context17);
// flaky:         org.junit.Assert.assertNotNull(aWSClient18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
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
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyCalendar12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
// flaky:         basicJanitorMonkeyContext3.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier12 = null; // flaky: basicJanitorMonkeyContext11.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null; // flaky: basicJanitorMonkeyContext11.resourceTracker();
// flaky:         basicJanitorMonkeyContext11.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext11.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null; // flaky: basicJanitorMonkeyContext11.resourceTracker();
        java.lang.String str19 = null; // flaky: basicJanitorMonkeyContext11.region();
// flaky:         basicJanitorMonkeyContext11.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext23.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler25 = null; // flaky: basicJanitorMonkeyContext23.scheduler();
// flaky:         basicJanitorMonkeyContext23.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList27 = null; // flaky: basicJanitorMonkeyContext23.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = null; // flaky: basicJanitorMonkeyContext23.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar21, monkeyConfiguration22, monkeyRecorder28);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler30 = basicJanitorContext29.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = basicJanitorContext29.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration32 = basicJanitorContext29.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "us-west-1" + "'", str19, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler25);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList27);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder28);
        org.junit.Assert.assertNull(janitorCrawler30);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder31);
        org.junit.Assert.assertNull(monkeyConfiguration32);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList8 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList9 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient10 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier15 = null; // flaky: basicJanitorMonkeyContext14.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
// flaky:         basicJanitorMonkeyContext14.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext22.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler24 = null; // flaky: basicJanitorMonkeyContext22.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext28 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine12, janitorCrawler13, janitorResourceTracker21, monkeyCalendar25, monkeyConfiguration26, monkeyRecorder27);
        java.lang.String str29 = basicJanitorContext28.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine30 = basicJanitorContext28.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker31 = basicJanitorContext28.janitorResourceTracker();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor32 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient10, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder7);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList8);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient10);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler24);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(janitorRuleEngine30);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker31);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = null; // flaky: basicJanitorMonkeyContext9.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null; // flaky: basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker11, monkeyCalendar12, monkeyConfiguration13, monkeyRecorder14);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier17 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null; // flaky: basicJanitorMonkeyContext16.resourceTracker();
// flaky:         basicJanitorMonkeyContext16.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext16.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null; // flaky: basicJanitorMonkeyContext16.resourceTracker();
        java.lang.String str24 = null; // flaky: basicJanitorMonkeyContext16.region();
// flaky:         basicJanitorMonkeyContext16.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null; // flaky: basicJanitorMonkeyContext16.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier29 = null; // flaky: basicJanitorMonkeyContext28.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = null; // flaky: basicJanitorMonkeyContext28.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker11, monkeyCalendar26, monkeyConfiguration27, monkeyRecorder30);
        java.lang.String str32 = basicJanitorContext31.region();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor33 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier10);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker11);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier17);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker18);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "us-west-1" + "'", str24, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar26);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier29);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext9.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext9.recorder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = monkeyRecorder11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyRecorder11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyRecorder.Event event8 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event8);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context10 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder7);
// flaky:         org.junit.Assert.assertNotNull(context10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.CloudClient cloudClient7 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event8 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event8);
        java.lang.String str10 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList11 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
// flaky:         org.junit.Assert.assertNotNull(cloudClient7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "us-west-1" + "'", str10, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier8 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient9 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration7);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier8);
// flaky:         org.junit.Assert.assertNotNull(aWSClient9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient9 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context10 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(aWSClient9);
// flaky:         org.junit.Assert.assertNotNull(context10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event2 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event2);
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event9);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
// flaky:         basicJanitorMonkeyContext6.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext6.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier15 = null; // flaky: basicJanitorMonkeyContext14.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
// flaky:         basicJanitorMonkeyContext14.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
        java.lang.String str22 = null; // flaky: basicJanitorMonkeyContext14.region();
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext14.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler28 = null; // flaky: basicJanitorMonkeyContext26.scheduler();
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList30 = null; // flaky: basicJanitorMonkeyContext26.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null; // flaky: basicJanitorMonkeyContext26.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker13, monkeyCalendar24, monkeyConfiguration25, monkeyRecorder31);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler35 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine37 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler38 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier40 = null; // flaky: basicJanitorMonkeyContext39.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker41 = null; // flaky: basicJanitorMonkeyContext39.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration43 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine37, janitorCrawler38, janitorResourceTracker41, monkeyCalendar42, monkeyConfiguration43, monkeyRecorder44);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier47 = null; // flaky: basicJanitorMonkeyContext46.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker48 = null; // flaky: basicJanitorMonkeyContext46.resourceTracker();
// flaky:         basicJanitorMonkeyContext46.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext46.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker53 = null; // flaky: basicJanitorMonkeyContext46.resourceTracker();
        java.lang.String str54 = null; // flaky: basicJanitorMonkeyContext46.region();
// flaky:         basicJanitorMonkeyContext46.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = null; // flaky: basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration57 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext58 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier59 = null; // flaky: basicJanitorMonkeyContext58.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder60 = null; // flaky: basicJanitorMonkeyContext58.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine34, janitorCrawler35, janitorResourceTracker41, monkeyCalendar56, monkeyConfiguration57, monkeyRecorder60);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext62 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier63 = null; // flaky: basicJanitorMonkeyContext62.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient64 = null; // flaky: basicJanitorMonkeyContext62.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler65 = null; // flaky: basicJanitorMonkeyContext62.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration66 = null; // flaky: basicJanitorMonkeyContext62.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine68 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler69 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine71 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler72 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext73 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier74 = null; // flaky: basicJanitorMonkeyContext73.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker75 = null; // flaky: basicJanitorMonkeyContext73.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar76 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration77 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder78 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext79 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine71, janitorCrawler72, janitorResourceTracker75, monkeyCalendar76, monkeyConfiguration77, monkeyRecorder78);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext80 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier81 = null; // flaky: basicJanitorMonkeyContext80.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker82 = null; // flaky: basicJanitorMonkeyContext80.resourceTracker();
// flaky:         basicJanitorMonkeyContext80.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext80.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker87 = null; // flaky: basicJanitorMonkeyContext80.resourceTracker();
        java.lang.String str88 = null; // flaky: basicJanitorMonkeyContext80.region();
// flaky:         basicJanitorMonkeyContext80.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar90 = null; // flaky: basicJanitorMonkeyContext80.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration91 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext92 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier93 = null; // flaky: basicJanitorMonkeyContext92.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder94 = null; // flaky: basicJanitorMonkeyContext92.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext95 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine68, janitorCrawler69, janitorResourceTracker75, monkeyCalendar90, monkeyConfiguration91, monkeyRecorder94);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext96 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker13, monkeyCalendar56, monkeyConfiguration66, monkeyRecorder94);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder97 = basicJanitorContext96.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration98 = basicJanitorContext96.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "us-west-1" + "'", str22, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler28);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList30);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder31);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier40);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker41);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier47);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker48);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "us-west-1" + "'", str54, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar56);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier59);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder60);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier63);
// flaky:         org.junit.Assert.assertNotNull(aWSClient64);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler65);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration66);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier74);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker75);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier81);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker82);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker87);
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "us-west-1" + "'", str88, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar90);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier93);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder94);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder97);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration98);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext16.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext16.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertNull(monkeyCalendar18);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.lang.Class<?> wildcardClass9 = null; // flaky: basicJanitorMonkeyContext0.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration1 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder.Event event2 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker6);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler10 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler10);
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
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
// flaky:         basicJanitorMonkeyContext3.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler13 = null; // flaky: basicJanitorMonkeyContext11.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext17 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar14, monkeyConfiguration15, monkeyRecorder16);
        java.lang.String str18 = basicJanitorContext17.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext17.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext17.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext17.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext17.janitorRuleEngine();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler13);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(janitorRuleEngine19);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorRuleEngine22);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context17 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient18 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext22.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null; // flaky: basicJanitorMonkeyContext22.resourceTracker();
// flaky:         basicJanitorMonkeyContext22.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext22.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker29 = null; // flaky: basicJanitorMonkeyContext22.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext30 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier31 = null; // flaky: basicJanitorMonkeyContext30.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker32 = null; // flaky: basicJanitorMonkeyContext30.resourceTracker();
// flaky:         basicJanitorMonkeyContext30.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext30.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker37 = null; // flaky: basicJanitorMonkeyContext30.resourceTracker();
        java.lang.String str38 = null; // flaky: basicJanitorMonkeyContext30.region();
// flaky:         basicJanitorMonkeyContext30.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar40 = null; // flaky: basicJanitorMonkeyContext30.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration41 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext42 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext42.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler44 = null; // flaky: basicJanitorMonkeyContext42.scheduler();
// flaky:         basicJanitorMonkeyContext42.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList46 = null; // flaky: basicJanitorMonkeyContext42.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder47 = null; // flaky: basicJanitorMonkeyContext42.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext48 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine20, janitorCrawler21, janitorResourceTracker29, monkeyCalendar40, monkeyConfiguration41, monkeyRecorder47);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler49 = basicJanitorContext48.janitorCrawler();
        java.lang.String str50 = basicJanitorContext48.region();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor51 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient18, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(context17);
// flaky:         org.junit.Assert.assertNotNull(aWSClient18);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker24);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker29);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier31);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker32);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "us-west-1" + "'", str38, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar40);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler44);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList46);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder47);
        org.junit.Assert.assertNull(janitorCrawler49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration1 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.CloudClient cloudClient3 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(cloudClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext16.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext16.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext16.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(monkeyCalendar10);
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertNull(monkeyCalendar13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier8 = null; // flaky: basicJanitorMonkeyContext7.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null; // flaky: basicJanitorMonkeyContext7.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker9, monkeyCalendar10, monkeyConfiguration11, monkeyRecorder12);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler16 = null; // flaky: basicJanitorMonkeyContext14.scheduler();
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        java.lang.String str18 = null; // flaky: basicJanitorMonkeyContext14.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null; // flaky: basicJanitorMonkeyContext14.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext20 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier21 = null; // flaky: basicJanitorMonkeyContext20.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient22 = null; // flaky: basicJanitorMonkeyContext20.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler23 = null; // flaky: basicJanitorMonkeyContext20.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null; // flaky: basicJanitorMonkeyContext20.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier29 = null; // flaky: basicJanitorMonkeyContext28.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null; // flaky: basicJanitorMonkeyContext28.resourceTracker();
// flaky:         basicJanitorMonkeyContext28.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext28.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = null; // flaky: basicJanitorMonkeyContext28.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext36 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier37 = null; // flaky: basicJanitorMonkeyContext36.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker38 = null; // flaky: basicJanitorMonkeyContext36.resourceTracker();
// flaky:         basicJanitorMonkeyContext36.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext36.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker43 = null; // flaky: basicJanitorMonkeyContext36.resourceTracker();
        java.lang.String str44 = null; // flaky: basicJanitorMonkeyContext36.region();
// flaky:         basicJanitorMonkeyContext36.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar46 = null; // flaky: basicJanitorMonkeyContext36.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration47 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext48 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext48.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler50 = null; // flaky: basicJanitorMonkeyContext48.scheduler();
// flaky:         basicJanitorMonkeyContext48.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList52 = null; // flaky: basicJanitorMonkeyContext48.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder53 = null; // flaky: basicJanitorMonkeyContext48.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext54 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine26, janitorCrawler27, janitorResourceTracker35, monkeyCalendar46, monkeyConfiguration47, monkeyRecorder53);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext55 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker9, monkeyCalendar19, monkeyConfiguration24, monkeyRecorder53);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor56 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier8);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker9);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler16);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar19);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier21);
// flaky:         org.junit.Assert.assertNotNull(aWSClient22);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler23);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration24);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier29);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker30);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker35);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier37);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker38);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "us-west-1" + "'", str44, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar46);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler50);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList52);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder53);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext3.awsClient();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.region();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = null; // flaky: basicJanitorMonkeyContext9.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = null; // flaky: basicJanitorMonkeyContext9.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event12 = null;
// flaky:         basicJanitorMonkeyContext9.reportEvent(event12);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier14 = null; // flaky: basicJanitorMonkeyContext9.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null; // flaky: basicJanitorMonkeyContext9.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null; // flaky: basicJanitorMonkeyContext9.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext20 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext20.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler22 = null; // flaky: basicJanitorMonkeyContext20.scheduler();
// flaky:         basicJanitorMonkeyContext20.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList24 = null; // flaky: basicJanitorMonkeyContext20.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = null; // flaky: basicJanitorMonkeyContext20.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler28 = null; // flaky: basicJanitorMonkeyContext26.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar29 = null; // flaky: basicJanitorMonkeyContext26.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext30 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier31 = null; // flaky: basicJanitorMonkeyContext30.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient32 = null; // flaky: basicJanitorMonkeyContext30.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler33 = null; // flaky: basicJanitorMonkeyContext30.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration34 = null; // flaky: basicJanitorMonkeyContext30.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler37 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine39 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler40 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine42 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler43 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier45 = null; // flaky: basicJanitorMonkeyContext44.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker46 = null; // flaky: basicJanitorMonkeyContext44.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar47 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration48 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder49 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext50 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine42, janitorCrawler43, janitorResourceTracker46, monkeyCalendar47, monkeyConfiguration48, monkeyRecorder49);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar51 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration52 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder53 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext54 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine39, janitorCrawler40, janitorResourceTracker46, monkeyCalendar51, monkeyConfiguration52, monkeyRecorder53);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext55 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier56 = null; // flaky: basicJanitorMonkeyContext55.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder57 = null; // flaky: basicJanitorMonkeyContext55.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar58 = null; // flaky: basicJanitorMonkeyContext55.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration59 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine61 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler62 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext63 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier64 = null; // flaky: basicJanitorMonkeyContext63.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker65 = null; // flaky: basicJanitorMonkeyContext63.resourceTracker();
// flaky:         basicJanitorMonkeyContext63.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext63.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker70 = null; // flaky: basicJanitorMonkeyContext63.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext71 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier72 = null; // flaky: basicJanitorMonkeyContext71.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker73 = null; // flaky: basicJanitorMonkeyContext71.resourceTracker();
// flaky:         basicJanitorMonkeyContext71.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext71.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker78 = null; // flaky: basicJanitorMonkeyContext71.resourceTracker();
        java.lang.String str79 = null; // flaky: basicJanitorMonkeyContext71.region();
// flaky:         basicJanitorMonkeyContext71.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar81 = null; // flaky: basicJanitorMonkeyContext71.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration82 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext83 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext83.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler85 = null; // flaky: basicJanitorMonkeyContext83.scheduler();
// flaky:         basicJanitorMonkeyContext83.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList87 = null; // flaky: basicJanitorMonkeyContext83.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder88 = null; // flaky: basicJanitorMonkeyContext83.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext89 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine61, janitorCrawler62, janitorResourceTracker70, monkeyCalendar81, monkeyConfiguration82, monkeyRecorder88);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext90 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine36, janitorCrawler37, janitorResourceTracker46, monkeyCalendar58, monkeyConfiguration59, monkeyRecorder88);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext91 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker25, monkeyCalendar29, monkeyConfiguration34, monkeyRecorder88);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext92 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext92.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler94 = null; // flaky: basicJanitorMonkeyContext92.scheduler();
// flaky:         basicJanitorMonkeyContext92.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList96 = null; // flaky: basicJanitorMonkeyContext92.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder97 = null; // flaky: basicJanitorMonkeyContext92.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext98 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar16, monkeyConfiguration34, monkeyRecorder97);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier10);
// flaky:         org.junit.Assert.assertNotNull(aWSClient11);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier14);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration15);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar16);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler22);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList24);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker25);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler28);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar29);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier31);
// flaky:         org.junit.Assert.assertNotNull(aWSClient32);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler33);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration34);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier45);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker46);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier56);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder57);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar58);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier64);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker65);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker70);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier72);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker73);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker78);
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "us-west-1" + "'", str79, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar81);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler85);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList87);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder88);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler94);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList96);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder97);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext9.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler11 = null; // flaky: basicJanitorMonkeyContext9.scheduler();
// flaky:         basicJanitorMonkeyContext9.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList13 = null; // flaky: basicJanitorMonkeyContext9.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null; // flaky: basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext15.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler17 = null; // flaky: basicJanitorMonkeyContext15.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null; // flaky: basicJanitorMonkeyContext15.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier20 = null; // flaky: basicJanitorMonkeyContext19.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient21 = null; // flaky: basicJanitorMonkeyContext19.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler22 = null; // flaky: basicJanitorMonkeyContext19.scheduler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null; // flaky: basicJanitorMonkeyContext19.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine25 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler26 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler29 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine31 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler32 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier34 = null; // flaky: basicJanitorMonkeyContext33.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = null; // flaky: basicJanitorMonkeyContext33.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar36 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration37 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder38 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext39 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine31, janitorCrawler32, janitorResourceTracker35, monkeyCalendar36, monkeyConfiguration37, monkeyRecorder38);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar40 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration41 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder42 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine28, janitorCrawler29, janitorResourceTracker35, monkeyCalendar40, monkeyConfiguration41, monkeyRecorder42);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier45 = null; // flaky: basicJanitorMonkeyContext44.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder46 = null; // flaky: basicJanitorMonkeyContext44.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar47 = null; // flaky: basicJanitorMonkeyContext44.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration48 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine50 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler51 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext52 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier53 = null; // flaky: basicJanitorMonkeyContext52.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker54 = null; // flaky: basicJanitorMonkeyContext52.resourceTracker();
// flaky:         basicJanitorMonkeyContext52.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext52.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker59 = null; // flaky: basicJanitorMonkeyContext52.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext60 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier61 = null; // flaky: basicJanitorMonkeyContext60.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker62 = null; // flaky: basicJanitorMonkeyContext60.resourceTracker();
// flaky:         basicJanitorMonkeyContext60.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext60.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker67 = null; // flaky: basicJanitorMonkeyContext60.resourceTracker();
        java.lang.String str68 = null; // flaky: basicJanitorMonkeyContext60.region();
// flaky:         basicJanitorMonkeyContext60.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar70 = null; // flaky: basicJanitorMonkeyContext60.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration71 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext72 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext72.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler74 = null; // flaky: basicJanitorMonkeyContext72.scheduler();
// flaky:         basicJanitorMonkeyContext72.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList76 = null; // flaky: basicJanitorMonkeyContext72.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder77 = null; // flaky: basicJanitorMonkeyContext72.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext78 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine50, janitorCrawler51, janitorResourceTracker59, monkeyCalendar70, monkeyConfiguration71, monkeyRecorder77);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext79 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine25, janitorCrawler26, janitorResourceTracker35, monkeyCalendar47, monkeyConfiguration48, monkeyRecorder77);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext80 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker14, monkeyCalendar18, monkeyConfiguration23, monkeyRecorder77);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor81 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient5, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler11);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList13);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker14);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler17);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar18);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier20);
// flaky:         org.junit.Assert.assertNotNull(aWSClient21);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler22);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration23);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier34);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker35);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier45);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder46);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar47);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier53);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker54);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker59);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier61);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker62);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker67);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "us-west-1" + "'", str68, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar70);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler74);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList76);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder77);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(janitorCrawler9);
        org.junit.Assert.assertNull(monkeyCalendar10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.lang.Class<?> wildcardClass4 = null; // flaky: monkeyScheduler3.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.CloudClient cloudClient9 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertNotNull(cloudClient9);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList8 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList9 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient10 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier15 = null; // flaky: basicJanitorMonkeyContext14.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
// flaky:         basicJanitorMonkeyContext14.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext22.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null; // flaky: basicJanitorMonkeyContext22.resourceTracker();
// flaky:         basicJanitorMonkeyContext22.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext22.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker29 = null; // flaky: basicJanitorMonkeyContext22.resourceTracker();
        java.lang.String str30 = null; // flaky: basicJanitorMonkeyContext22.region();
// flaky:         basicJanitorMonkeyContext22.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar32 = null; // flaky: basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration33 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext34.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler36 = null; // flaky: basicJanitorMonkeyContext34.scheduler();
// flaky:         basicJanitorMonkeyContext34.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList38 = null; // flaky: basicJanitorMonkeyContext34.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = null; // flaky: basicJanitorMonkeyContext34.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine12, janitorCrawler13, janitorResourceTracker21, monkeyCalendar32, monkeyConfiguration33, monkeyRecorder39);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler41 = basicJanitorContext40.janitorCrawler();
        java.lang.String str42 = basicJanitorContext40.region();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor43 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient10, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder7);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList8);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient10);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker24);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "us-west-1" + "'", str30, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar32);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler36);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList38);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder39);
        org.junit.Assert.assertNull(janitorCrawler41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext3.recorder();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = null; // flaky: basicJanitorMonkeyContext12.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null; // flaky: basicJanitorMonkeyContext12.resourceTracker();
// flaky:         basicJanitorMonkeyContext12.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext12.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = null; // flaky: basicJanitorMonkeyContext12.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext20 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext20.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler22 = null; // flaky: basicJanitorMonkeyContext20.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null; // flaky: basicJanitorMonkeyContext20.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker19, monkeyCalendar23, monkeyConfiguration24, monkeyRecorder25);
        java.lang.String str27 = basicJanitorContext26.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = basicJanitorContext26.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker29 = basicJanitorContext26.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = basicJanitorContext26.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration32 = null; // flaky: basicJanitorMonkeyContext31.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler35 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext36 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier37 = null; // flaky: basicJanitorMonkeyContext36.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker38 = null; // flaky: basicJanitorMonkeyContext36.resourceTracker();
// flaky:         basicJanitorMonkeyContext36.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext36.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker43 = null; // flaky: basicJanitorMonkeyContext36.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier45 = null; // flaky: basicJanitorMonkeyContext44.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker46 = null; // flaky: basicJanitorMonkeyContext44.resourceTracker();
// flaky:         basicJanitorMonkeyContext44.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext44.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker51 = null; // flaky: basicJanitorMonkeyContext44.resourceTracker();
        java.lang.String str52 = null; // flaky: basicJanitorMonkeyContext44.region();
// flaky:         basicJanitorMonkeyContext44.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar54 = null; // flaky: basicJanitorMonkeyContext44.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration55 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext56 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext56.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler58 = null; // flaky: basicJanitorMonkeyContext56.scheduler();
// flaky:         basicJanitorMonkeyContext56.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList60 = null; // flaky: basicJanitorMonkeyContext56.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder61 = null; // flaky: basicJanitorMonkeyContext56.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext62 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine34, janitorCrawler35, janitorResourceTracker43, monkeyCalendar54, monkeyConfiguration55, monkeyRecorder61);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext63 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar30, monkeyConfiguration32, monkeyRecorder61);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier13);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker19);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler22);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(janitorRuleEngine28);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker29);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar30);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration32);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier37);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker38);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker43);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier45);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker46);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker51);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "us-west-1" + "'", str52, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar54);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler58);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList60);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder61);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = null; // flaky: basicJanitorMonkeyContext12.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null; // flaky: basicJanitorMonkeyContext12.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker14, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder17);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext22 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker14, monkeyCalendar19, monkeyConfiguration20, monkeyRecorder21);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier27 = null; // flaky: basicJanitorMonkeyContext26.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = null; // flaky: basicJanitorMonkeyContext26.resourceTracker();
// flaky:         basicJanitorMonkeyContext26.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext26.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker33 = null; // flaky: basicJanitorMonkeyContext26.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext34.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler36 = null; // flaky: basicJanitorMonkeyContext34.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = null; // flaky: basicJanitorMonkeyContext34.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration38 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine24, janitorCrawler25, janitorResourceTracker33, monkeyCalendar37, monkeyConfiguration38, monkeyRecorder39);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration41 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder42 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker14, monkeyCalendar37, monkeyConfiguration41, monkeyRecorder42);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext44 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext44.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler46 = null; // flaky: basicJanitorMonkeyContext44.scheduler();
// flaky:         basicJanitorMonkeyContext44.resetEventReport();
        java.lang.String str48 = null; // flaky: basicJanitorMonkeyContext44.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event49 = null;
// flaky:         basicJanitorMonkeyContext44.reportEvent(event49);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration51 = null; // flaky: basicJanitorMonkeyContext44.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier52 = null; // flaky: basicJanitorMonkeyContext44.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient53 = null; // flaky: basicJanitorMonkeyContext44.awsClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar54 = null; // flaky: basicJanitorMonkeyContext44.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration55 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext56 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier57 = null; // flaky: basicJanitorMonkeyContext56.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker58 = null; // flaky: basicJanitorMonkeyContext56.resourceTracker();
// flaky:         basicJanitorMonkeyContext56.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext56.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker63 = null; // flaky: basicJanitorMonkeyContext56.resourceTracker();
        java.lang.String str64 = null; // flaky: basicJanitorMonkeyContext56.region();
// flaky:         basicJanitorMonkeyContext56.resetEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder66 = null; // flaky: basicJanitorMonkeyContext56.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext67 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker14, monkeyCalendar54, monkeyConfiguration55, monkeyRecorder66);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker68 = basicJanitorContext67.janitorResourceTracker();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier13);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker14);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier27);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker28);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker33);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler36);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar37);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler46);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration51);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier52);
// flaky:         org.junit.Assert.assertNotNull(aWSClient53);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar54);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier57);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker58);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "us-west-1" + "'", str64, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder66);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker68);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context17 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient18 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.lang.String str19 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(context17);
// flaky:         org.junit.Assert.assertNotNull(aWSClient18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "us-west-1" + "'", str19, "us-west-1");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext9.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext9.janitorCrawler();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
        org.junit.Assert.assertNull(monkeyCalendar10);
        org.junit.Assert.assertNull(janitorCrawler11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient2 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext10 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker6, monkeyCalendar7, monkeyConfiguration8, monkeyRecorder9);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext10.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext10.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext10.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext10.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext10.janitorCrawler();
        java.lang.String str16 = basicJanitorContext10.region();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor17 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(monkeyConfiguration9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder11);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker12);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.CloudClient cloudClient7 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event8 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event8);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
// flaky:         org.junit.Assert.assertNotNull(cloudClient7);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList8 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.String str9 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration7);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "us-west-1" + "'", str9, "us-west-1");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "hi!");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider8 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier14 = null; // flaky: basicJanitorMonkeyContext13.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
// flaky:         basicJanitorMonkeyContext13.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null; // flaky: basicJanitorMonkeyContext13.resourceTracker();
        java.lang.String str21 = null; // flaky: basicJanitorMonkeyContext13.region();
// flaky:         basicJanitorMonkeyContext13.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null; // flaky: basicJanitorMonkeyContext13.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null; // flaky: basicJanitorMonkeyContext25.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext28 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar23, monkeyConfiguration24, monkeyRecorder27);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder29 = basicJanitorContext28.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = basicJanitorContext28.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "us-west-1" + "'", str21, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder27);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder29);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar30);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier12 = null; // flaky: basicJanitorMonkeyContext11.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null; // flaky: basicJanitorMonkeyContext11.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext17 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine9, janitorCrawler10, janitorResourceTracker13, monkeyCalendar14, monkeyConfiguration15, monkeyRecorder16);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext17.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext17.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = basicJanitorContext17.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext17.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext17.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext17.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext17.janitorCrawler();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor25 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient7, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyRecorder19);
        org.junit.Assert.assertNull(janitorCrawler20);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(janitorRuleEngine22);
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertNull(janitorCrawler24);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = null; // flaky: basicJanitorMonkeyContext12.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null; // flaky: basicJanitorMonkeyContext12.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine10, janitorCrawler11, janitorResourceTracker14, monkeyCalendar15, monkeyConfiguration16, monkeyRecorder17);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor19 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient8, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(aWSClient8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier13);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(monkeyCalendar10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList8 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder7);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler5 = null; // flaky: basicJanitorMonkeyContext3.scheduler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext7.resetEventReport();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler9 = null; // flaky: basicJanitorMonkeyContext7.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier15 = null; // flaky: basicJanitorMonkeyContext14.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = null; // flaky: basicJanitorMonkeyContext14.recorder();
        com.netflix.simianarmy.MonkeyRecorder.Event event17 = null;
// flaky:         basicJanitorMonkeyContext14.reportEvent(event17);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = null; // flaky: basicJanitorMonkeyContext14.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext20 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier21 = null; // flaky: basicJanitorMonkeyContext20.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null; // flaky: basicJanitorMonkeyContext20.resourceTracker();
// flaky:         basicJanitorMonkeyContext20.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext20.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = null; // flaky: basicJanitorMonkeyContext20.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = null; // flaky: basicJanitorMonkeyContext20.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar29 = null; // flaky: basicJanitorMonkeyContext20.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext30 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration31 = null; // flaky: basicJanitorMonkeyContext30.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine33 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler34 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler37 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext38 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier39 = null; // flaky: basicJanitorMonkeyContext38.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker40 = null; // flaky: basicJanitorMonkeyContext38.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar41 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration42 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder43 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine36, janitorCrawler37, janitorResourceTracker40, monkeyCalendar41, monkeyConfiguration42, monkeyRecorder43);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext45 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier46 = null; // flaky: basicJanitorMonkeyContext45.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker47 = null; // flaky: basicJanitorMonkeyContext45.resourceTracker();
// flaky:         basicJanitorMonkeyContext45.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext45.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker52 = null; // flaky: basicJanitorMonkeyContext45.resourceTracker();
        java.lang.String str53 = null; // flaky: basicJanitorMonkeyContext45.region();
// flaky:         basicJanitorMonkeyContext45.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar55 = null; // flaky: basicJanitorMonkeyContext45.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration56 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext57 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier58 = null; // flaky: basicJanitorMonkeyContext57.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder59 = null; // flaky: basicJanitorMonkeyContext57.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext60 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine33, janitorCrawler34, janitorResourceTracker40, monkeyCalendar55, monkeyConfiguration56, monkeyRecorder59);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext61 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine12, janitorCrawler13, janitorResourceTracker19, monkeyCalendar29, monkeyConfiguration31, monkeyRecorder59);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine63 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler64 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine66 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler67 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext68 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier69 = null; // flaky: basicJanitorMonkeyContext68.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker70 = null; // flaky: basicJanitorMonkeyContext68.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar71 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration72 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder73 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext74 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine66, janitorCrawler67, janitorResourceTracker70, monkeyCalendar71, monkeyConfiguration72, monkeyRecorder73);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext75 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier76 = null; // flaky: basicJanitorMonkeyContext75.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker77 = null; // flaky: basicJanitorMonkeyContext75.resourceTracker();
// flaky:         basicJanitorMonkeyContext75.exportCredentials("", "hi!");
// flaky:         basicJanitorMonkeyContext75.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker82 = null; // flaky: basicJanitorMonkeyContext75.resourceTracker();
        java.lang.String str83 = null; // flaky: basicJanitorMonkeyContext75.region();
// flaky:         basicJanitorMonkeyContext75.resetEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar85 = null; // flaky: basicJanitorMonkeyContext75.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration86 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext87 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier88 = null; // flaky: basicJanitorMonkeyContext87.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder89 = null; // flaky: basicJanitorMonkeyContext87.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext90 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine63, janitorCrawler64, janitorResourceTracker70, monkeyCalendar85, monkeyConfiguration86, monkeyRecorder89);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext91 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker6, monkeyCalendar10, monkeyConfiguration31, monkeyRecorder89);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder92 = basicJanitorContext91.recorder();
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker6);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler9);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier15);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker19);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier21);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker22);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker27);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker28);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar29);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration31);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier39);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker40);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier46);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker47);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "us-west-1" + "'", str53, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar55);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier58);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder59);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier69);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker70);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier76);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker77);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker82);
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "us-west-1" + "'", str83, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar85);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier88);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder89);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder92);
    }
}
