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
        java.lang.Class<?> wildcardClass1 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        java.lang.Class<?> wildcardClass8 = basicJanitorContext7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext8.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext8.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext8.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext8.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor13 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(monkeyRecorder12);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        java.lang.String str3 = basicJanitorMonkeyContext0.region();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = basicJanitorMonkeyContext4.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = basicJanitorMonkeyContext4.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = basicJanitorMonkeyContext8.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker6, monkeyCalendar7, monkeyConfiguration9, monkeyRecorder10);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor12 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailNotifier5);
        org.junit.Assert.assertNotNull(janitorResourceTracker6);
        org.junit.Assert.assertNotNull(monkeyConfiguration9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = basicJanitorMonkeyContext0.resourceTracker();
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(janitorResourceTracker4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = basicJanitorMonkeyContext0.emailNotifier();
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        org.junit.Assert.assertNotNull(aWSClient3);
        org.junit.Assert.assertNotNull(janitorEmailNotifier4);
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
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = basicJanitorContext7.configuration();
        java.lang.String str10 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyConfiguration9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyConfiguration9);
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext11.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext11.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext11.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext11.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor16 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient3, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        org.junit.Assert.assertNotNull(aWSClient3);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyRecorder15);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyCalendar8);
        org.junit.Assert.assertNull(monkeyRecorder9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext11.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext11.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext11.configuration();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor15 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient3, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cloudClient1);
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        org.junit.Assert.assertNotNull(aWSClient3);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext0.resourceTracker();
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
        org.junit.Assert.assertNotNull(abstractJanitorList3);
        org.junit.Assert.assertNotNull(monkeyRecorder4);
        org.junit.Assert.assertNotNull(monkeyConfiguration5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
        basicJanitorMonkeyContext0.reportEvent(event1);
        basicJanitorMonkeyContext0.exportCredentials("us-west-1", "us-west-1");
        java.lang.Class<?> wildcardClass6 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.Class<?> wildcardClass3 = null; // flaky: abstractJanitorList2.getClass();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext7.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event10 = null;
// flaky:         basicJanitorMonkeyContext9.reportEvent(event10);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null; // flaky: basicJanitorMonkeyContext9.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null; // flaky: basicJanitorMonkeyContext9.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null; // flaky: basicJanitorMonkeyContext14.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext17 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker8, monkeyCalendar13, monkeyConfiguration15, monkeyRecorder16);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event19 = null;
// flaky:         basicJanitorMonkeyContext18.reportEvent(event19);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext18.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null; // flaky: basicJanitorMonkeyContext18.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier27 = null; // flaky: basicJanitorMonkeyContext26.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = null; // flaky: basicJanitorMonkeyContext26.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar29 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext30 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration31 = null; // flaky: basicJanitorMonkeyContext30.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine24, janitorCrawler25, janitorResourceTracker28, monkeyCalendar29, monkeyConfiguration31, monkeyRecorder32);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient35 = null; // flaky: basicJanitorMonkeyContext34.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context36 = null; // flaky: basicJanitorMonkeyContext34.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder37 = null; // flaky: basicJanitorMonkeyContext34.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext38 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker8, monkeyCalendar22, monkeyConfiguration31, monkeyRecorder37);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor39 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar12);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar13);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration15);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier27);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker28);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration31);
// flaky:         org.junit.Assert.assertNotNull(cloudClient35);
// flaky:         org.junit.Assert.assertNotNull(context36);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder37);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor12 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient3, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context3 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = basicJanitorMonkeyContext0.getEventReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(context3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext5.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null; // flaky: basicJanitorMonkeyContext5.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier12 = null; // flaky: basicJanitorMonkeyContext11.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null; // flaky: basicJanitorMonkeyContext11.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null; // flaky: basicJanitorMonkeyContext15.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine9, janitorCrawler10, janitorResourceTracker13, monkeyCalendar14, monkeyConfiguration16, monkeyRecorder17);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext20 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker4, monkeyCalendar7, monkeyConfiguration16, monkeyRecorder19);
        java.lang.String str21 = basicJanitorContext20.region();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar7);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "us-west-1" + "'", str21, "us-west-1");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         org.junit.Assert.assertNotNull(aWSClient1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker9, monkeyCalendar10, monkeyConfiguration11, monkeyRecorder12);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext13.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext13.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext13.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor17 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient5, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyCalendar15);
        org.junit.Assert.assertNull(monkeyCalendar16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "hi!");
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertNull(monkeyRecorder11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorContext10.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext10.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext10.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext10.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext10.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor16 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNull(janitorResourceTracker11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(monkeyRecorder15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event12 = null;
// flaky:         basicJanitorMonkeyContext11.reportEvent(event12);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration17, monkeyRecorder18);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor20 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient5, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration17);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar6);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(monkeyCalendar10);
        org.junit.Assert.assertNull(monkeyCalendar11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event9);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration7);
// flaky:         org.junit.Assert.assertNotNull(aWSClient8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.CloudClient cloudClient5 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(cloudClient5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider8 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event9);
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext5.cloudClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null; // flaky: basicJanitorMonkeyContext5.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier12 = null; // flaky: basicJanitorMonkeyContext11.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null; // flaky: basicJanitorMonkeyContext11.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null; // flaky: basicJanitorMonkeyContext15.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine9, janitorCrawler10, janitorResourceTracker13, monkeyCalendar14, monkeyConfiguration16, monkeyRecorder17);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext20 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker4, monkeyCalendar7, monkeyConfiguration16, monkeyRecorder19);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext20.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar7);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(monkeyRecorder21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(janitorRuleEngine13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event3);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "us-west-1");
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier5);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.lang.Class<?> wildcardClass5 = null; // flaky: basicJanitorMonkeyContext0.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.CloudClient cloudClient3 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorRuleEngine13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.CloudClient cloudClient8 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler9 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(cloudClient8);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler9);
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
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(monkeyConfiguration10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider8 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.String str9 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext8.reportEvent(event9);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null; // flaky: basicJanitorMonkeyContext13.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar12, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext17 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
// flaky:         basicJanitorMonkeyContext17.reportEvent(event18);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = null; // flaky: basicJanitorMonkeyContext25.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = null; // flaky: basicJanitorMonkeyContext29.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine23, janitorCrawler24, janitorResourceTracker27, monkeyCalendar28, monkeyConfiguration30, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient34 = null; // flaky: basicJanitorMonkeyContext33.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context35 = null; // flaky: basicJanitorMonkeyContext33.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null; // flaky: basicJanitorMonkeyContext33.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar21, monkeyConfiguration30, monkeyRecorder36);
        java.lang.String str38 = basicJanitorContext37.region();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker27);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration30);
// flaky:         org.junit.Assert.assertNotNull(cloudClient34);
// flaky:         org.junit.Assert.assertNotNull(context35);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "us-west-1" + "'", str38, "us-west-1");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context3 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(context3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient5 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar4);
// flaky:         org.junit.Assert.assertNotNull(aWSClient5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyConfiguration9);
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertNull(janitorRuleEngine11);
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(monkeyRecorder13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null; // flaky: basicJanitorMonkeyContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext10 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration8, monkeyRecorder9);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = basicJanitorContext10.janitorRuleEngine();
        java.lang.String str12 = basicJanitorContext10.region();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(janitorRuleEngine11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        java.lang.String str8 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(janitorCrawler9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyConfiguration9);
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(janitorResourceTracker11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.CloudClient cloudClient5 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(cloudClient5);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker6);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar7);
// flaky:         org.junit.Assert.assertNotNull(aWSClient8);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker9);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext8.reportEvent(event9);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null; // flaky: basicJanitorMonkeyContext13.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar12, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext17 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
// flaky:         basicJanitorMonkeyContext17.reportEvent(event18);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = null; // flaky: basicJanitorMonkeyContext25.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = null; // flaky: basicJanitorMonkeyContext29.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine23, janitorCrawler24, janitorResourceTracker27, monkeyCalendar28, monkeyConfiguration30, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient34 = null; // flaky: basicJanitorMonkeyContext33.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context35 = null; // flaky: basicJanitorMonkeyContext33.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null; // flaky: basicJanitorMonkeyContext33.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar21, monkeyConfiguration30, monkeyRecorder36);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler38 = basicJanitorContext37.janitorCrawler();
        java.lang.String str39 = basicJanitorContext37.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler40 = basicJanitorContext37.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine41 = basicJanitorContext37.janitorRuleEngine();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker27);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration30);
// flaky:         org.junit.Assert.assertNotNull(cloudClient34);
// flaky:         org.junit.Assert.assertNotNull(context35);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder36);
        org.junit.Assert.assertNull(janitorCrawler38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "us-west-1" + "'", str39, "us-west-1");
        org.junit.Assert.assertNull(janitorCrawler40);
        org.junit.Assert.assertNull(janitorRuleEngine41);
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
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertNull(janitorCrawler11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
// flaky:         org.junit.Assert.assertNotNull(context7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient7 = null; // flaky: basicJanitorMonkeyContext6.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context8 = null; // flaky: basicJanitorMonkeyContext6.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context10 = null; // flaky: basicJanitorMonkeyContext6.getJanitorEmailNotifierContext();
        java.lang.String str11 = null; // flaky: basicJanitorMonkeyContext6.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null; // flaky: basicJanitorMonkeyContext6.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event16 = null;
// flaky:         basicJanitorMonkeyContext15.reportEvent(event16);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null; // flaky: basicJanitorMonkeyContext15.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null; // flaky: basicJanitorMonkeyContext15.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null; // flaky: basicJanitorMonkeyContext15.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker5, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder20);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(cloudClient7);
// flaky:         org.junit.Assert.assertNotNull(context8);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker9);
// flaky:         org.junit.Assert.assertNotNull(context10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker12);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar13);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar18);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar19);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = basicJanitorMonkeyContext0.getEventReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.Class<?> wildcardClass2 = null; // flaky: janitorResourceTracker1.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
        java.lang.String str8 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertNull(janitorRuleEngine11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(monkeyCalendar13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.lang.Class<?> wildcardClass4 = null; // flaky: monkeyRecorder3.getClass();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertNull(janitorRuleEngine11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(monkeyRecorder15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(janitorCrawler12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event8 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event8);
        com.netflix.simianarmy.CloudClient cloudClient10 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(cloudClient10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null; // flaky: basicJanitorMonkeyContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext10 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration8, monkeyRecorder9);
        java.lang.String str11 = basicJanitorContext10.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext10.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext10.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext10.janitorRuleEngine();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        java.lang.Class<?> wildcardClass10 = basicJanitorContext7.getClass();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext9.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event12 = null;
// flaky:         basicJanitorMonkeyContext11.reportEvent(event12);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration17, monkeyRecorder18);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext20 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event21 = null;
// flaky:         basicJanitorMonkeyContext20.reportEvent(event21);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null; // flaky: basicJanitorMonkeyContext20.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext20.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier29 = null; // flaky: basicJanitorMonkeyContext28.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null; // flaky: basicJanitorMonkeyContext28.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext32 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration33 = null; // flaky: basicJanitorMonkeyContext32.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder34 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext35 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine26, janitorCrawler27, janitorResourceTracker30, monkeyCalendar31, monkeyConfiguration33, monkeyRecorder34);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext36 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient37 = null; // flaky: basicJanitorMonkeyContext36.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context38 = null; // flaky: basicJanitorMonkeyContext36.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder39 = null; // flaky: basicJanitorMonkeyContext36.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker10, monkeyCalendar24, monkeyConfiguration33, monkeyRecorder39);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event42 = null;
// flaky:         basicJanitorMonkeyContext41.reportEvent(event42);
// flaky:         basicJanitorMonkeyContext41.exportCredentials("us-west-1", "us-west-1");
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar47 = null; // flaky: basicJanitorMonkeyContext41.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext48 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier49 = null; // flaky: basicJanitorMonkeyContext48.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker50 = null; // flaky: basicJanitorMonkeyContext48.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList51 = null; // flaky: basicJanitorMonkeyContext48.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder52 = null; // flaky: basicJanitorMonkeyContext48.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration53 = null; // flaky: basicJanitorMonkeyContext48.configuration();
        java.lang.String str54 = null; // flaky: basicJanitorMonkeyContext48.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration55 = null; // flaky: basicJanitorMonkeyContext48.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext56 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event57 = null;
// flaky:         basicJanitorMonkeyContext56.reportEvent(event57);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar59 = null; // flaky: basicJanitorMonkeyContext56.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar60 = null; // flaky: basicJanitorMonkeyContext56.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder61 = null; // flaky: basicJanitorMonkeyContext56.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext62 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar47, monkeyConfiguration55, monkeyRecorder61);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration17);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier29);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker30);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration33);
// flaky:         org.junit.Assert.assertNotNull(cloudClient37);
// flaky:         org.junit.Assert.assertNotNull(context38);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder39);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar47);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier49);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker50);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList51);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder52);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "us-west-1" + "'", str54, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration55);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar59);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar60);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder61);
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
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext8.reportEvent(event9);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null; // flaky: basicJanitorMonkeyContext13.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar12, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext17 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
// flaky:         basicJanitorMonkeyContext17.reportEvent(event18);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = null; // flaky: basicJanitorMonkeyContext25.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = null; // flaky: basicJanitorMonkeyContext29.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine23, janitorCrawler24, janitorResourceTracker27, monkeyCalendar28, monkeyConfiguration30, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient34 = null; // flaky: basicJanitorMonkeyContext33.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context35 = null; // flaky: basicJanitorMonkeyContext33.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null; // flaky: basicJanitorMonkeyContext33.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar21, monkeyConfiguration30, monkeyRecorder36);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler38 = basicJanitorContext37.janitorCrawler();
        java.lang.String str39 = basicJanitorContext37.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration40 = basicJanitorContext37.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder41 = basicJanitorContext37.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker27);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration30);
// flaky:         org.junit.Assert.assertNotNull(cloudClient34);
// flaky:         org.junit.Assert.assertNotNull(context35);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder36);
        org.junit.Assert.assertNull(janitorCrawler38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "us-west-1" + "'", str39, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration40);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder41);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext5.reportEvent(event6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null; // flaky: basicJanitorMonkeyContext5.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext5.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext10 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null; // flaky: basicJanitorMonkeyContext10.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker4, monkeyCalendar9, monkeyConfiguration11, monkeyRecorder12);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext13.janitorRuleEngine();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar8);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(janitorRuleEngine14);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertNull(janitorRuleEngine11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(janitorResourceTracker14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.CloudClient cloudClient8 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context9 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(cloudClient8);
// flaky:         org.junit.Assert.assertNotNull(context9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        java.lang.Class<?> wildcardClass2 = null; // flaky: janitorEmailNotifier1.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient3 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(cloudClient3);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "us-west-1");
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration10);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.CloudClient cloudClient4 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("hi!", "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertNull(janitorRuleEngine11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(janitorRuleEngine13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration1 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context5 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = basicJanitorMonkeyContext0.getEventReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "us-west-1");
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        java.lang.Class<?> wildcardClass7 = null; // flaky: janitorEmailNotifier6.getClass();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient3 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext8.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null; // flaky: basicJanitorMonkeyContext12.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker10, monkeyCalendar11, monkeyConfiguration13, monkeyRecorder14);
        java.lang.String str16 = basicJanitorContext15.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext15.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext15.janitorCrawler();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor19 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(cloudClient3);
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertNull(janitorCrawler18);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext10.janitorCrawler();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor12 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient2, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(aWSClient2);
        org.junit.Assert.assertNull(janitorCrawler11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler11 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(janitorCrawler11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = null; // flaky: basicJanitorMonkeyContext16.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event19 = null;
// flaky:         basicJanitorMonkeyContext18.reportEvent(event19);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext18.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null; // flaky: basicJanitorMonkeyContext18.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null; // flaky: basicJanitorMonkeyContext23.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine14, janitorCrawler15, janitorResourceTracker17, monkeyCalendar22, monkeyConfiguration24, monkeyRecorder25);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext27 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event28 = null;
// flaky:         basicJanitorMonkeyContext27.reportEvent(event28);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = null; // flaky: basicJanitorMonkeyContext27.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar31 = null; // flaky: basicJanitorMonkeyContext27.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine33 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler34 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext35 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier36 = null; // flaky: basicJanitorMonkeyContext35.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker37 = null; // flaky: basicJanitorMonkeyContext35.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar38 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration40 = null; // flaky: basicJanitorMonkeyContext39.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder41 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext42 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine33, janitorCrawler34, janitorResourceTracker37, monkeyCalendar38, monkeyConfiguration40, monkeyRecorder41);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext43 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient44 = null; // flaky: basicJanitorMonkeyContext43.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context45 = null; // flaky: basicJanitorMonkeyContext43.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder46 = null; // flaky: basicJanitorMonkeyContext43.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext47 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine11, janitorCrawler12, janitorResourceTracker17, monkeyCalendar31, monkeyConfiguration40, monkeyRecorder46);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext48 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier49 = null; // flaky: basicJanitorMonkeyContext48.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker50 = null; // flaky: basicJanitorMonkeyContext48.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList51 = null; // flaky: basicJanitorMonkeyContext48.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = null; // flaky: basicJanitorMonkeyContext48.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine54 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler55 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext56 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier57 = null; // flaky: basicJanitorMonkeyContext56.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker58 = null; // flaky: basicJanitorMonkeyContext56.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar59 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext60 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration61 = null; // flaky: basicJanitorMonkeyContext60.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder62 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext63 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine54, janitorCrawler55, janitorResourceTracker58, monkeyCalendar59, monkeyConfiguration61, monkeyRecorder62);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext64 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient65 = null; // flaky: basicJanitorMonkeyContext64.cloudClient();
        java.lang.String str66 = null; // flaky: basicJanitorMonkeyContext64.region();
        com.netflix.simianarmy.CloudClient cloudClient67 = null; // flaky: basicJanitorMonkeyContext64.cloudClient();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder68 = null; // flaky: basicJanitorMonkeyContext64.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext69 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker17, monkeyCalendar52, monkeyConfiguration61, monkeyRecorder68);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration70 = basicJanitorContext69.configuration();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor71 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient6, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker17);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar22);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration24);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar30);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar31);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier36);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker37);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration40);
// flaky:         org.junit.Assert.assertNotNull(cloudClient44);
// flaky:         org.junit.Assert.assertNotNull(context45);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder46);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier49);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker50);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList51);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar52);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier57);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker58);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration61);
// flaky:         org.junit.Assert.assertNotNull(cloudClient65);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "us-west-1" + "'", str66, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(cloudClient67);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder68);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration70);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(monkeyCalendar11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient3 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine6 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler7 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine6, janitorCrawler7, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration10, monkeyRecorder11);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext12.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorContext12.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext12.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext12.janitorCrawler();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor17 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(cloudClient3);
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyCalendar14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(janitorCrawler16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.AbstractJanitor.Context context7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor8 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient6, context7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(aWSClient6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient8 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.lang.String str9 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration7);
// flaky:         org.junit.Assert.assertNotNull(aWSClient8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext8.reportEvent(event9);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null; // flaky: basicJanitorMonkeyContext13.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar12, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext17 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
// flaky:         basicJanitorMonkeyContext17.reportEvent(event18);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = null; // flaky: basicJanitorMonkeyContext25.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = null; // flaky: basicJanitorMonkeyContext29.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine23, janitorCrawler24, janitorResourceTracker27, monkeyCalendar28, monkeyConfiguration30, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient34 = null; // flaky: basicJanitorMonkeyContext33.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context35 = null; // flaky: basicJanitorMonkeyContext33.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null; // flaky: basicJanitorMonkeyContext33.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar21, monkeyConfiguration30, monkeyRecorder36);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler38 = basicJanitorContext37.janitorCrawler();
        java.lang.String str39 = basicJanitorContext37.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration40 = basicJanitorContext37.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine41 = basicJanitorContext37.janitorRuleEngine();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker27);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration30);
// flaky:         org.junit.Assert.assertNotNull(cloudClient34);
// flaky:         org.junit.Assert.assertNotNull(context35);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder36);
        org.junit.Assert.assertNull(janitorCrawler38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "us-west-1" + "'", str39, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration40);
        org.junit.Assert.assertNull(janitorRuleEngine41);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext8.reportEvent(event9);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null; // flaky: basicJanitorMonkeyContext13.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar12, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext17 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
// flaky:         basicJanitorMonkeyContext17.reportEvent(event18);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = null; // flaky: basicJanitorMonkeyContext25.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = null; // flaky: basicJanitorMonkeyContext29.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine23, janitorCrawler24, janitorResourceTracker27, monkeyCalendar28, monkeyConfiguration30, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient34 = null; // flaky: basicJanitorMonkeyContext33.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context35 = null; // flaky: basicJanitorMonkeyContext33.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null; // flaky: basicJanitorMonkeyContext33.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar21, monkeyConfiguration30, monkeyRecorder36);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler38 = basicJanitorContext37.janitorCrawler();
        java.lang.String str39 = basicJanitorContext37.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler40 = basicJanitorContext37.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler41 = basicJanitorContext37.janitorCrawler();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker27);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration30);
// flaky:         org.junit.Assert.assertNotNull(cloudClient34);
// flaky:         org.junit.Assert.assertNotNull(context35);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder36);
        org.junit.Assert.assertNull(janitorCrawler38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "us-west-1" + "'", str39, "us-west-1");
        org.junit.Assert.assertNull(janitorCrawler40);
        org.junit.Assert.assertNull(janitorCrawler41);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context5 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context5);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(janitorRuleEngine11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event3);
// flaky:         basicJanitorMonkeyContext0.exportCredentials("hi!", "hi!");
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext7.recorder();
        java.lang.String str9 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyRecorder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertNull(janitorRuleEngine11);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(monkeyCalendar15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event9 = null;
// flaky:         basicJanitorMonkeyContext8.reportEvent(event9);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null; // flaky: basicJanitorMonkeyContext13.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker7, monkeyCalendar12, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext17 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
// flaky:         basicJanitorMonkeyContext17.reportEvent(event18);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext17.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: basicJanitorMonkeyContext25.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = null; // flaky: basicJanitorMonkeyContext25.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = null; // flaky: basicJanitorMonkeyContext29.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine23, janitorCrawler24, janitorResourceTracker27, monkeyCalendar28, monkeyConfiguration30, monkeyRecorder31);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient34 = null; // flaky: basicJanitorMonkeyContext33.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context35 = null; // flaky: basicJanitorMonkeyContext33.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder36 = null; // flaky: basicJanitorMonkeyContext33.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar21, monkeyConfiguration30, monkeyRecorder36);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration38 = basicJanitorContext37.configuration();
        java.lang.String str39 = basicJanitorContext37.region();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier26);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker27);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration30);
// flaky:         org.junit.Assert.assertNotNull(cloudClient34);
// flaky:         org.junit.Assert.assertNotNull(context35);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder36);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "us-west-1" + "'", str39, "us-west-1");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext6.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext6.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext10 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null; // flaky: basicJanitorMonkeyContext10.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine4, janitorCrawler5, janitorResourceTracker8, monkeyCalendar9, monkeyConfiguration11, monkeyRecorder12);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext13.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext13.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null; // flaky: basicJanitorMonkeyContext19.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event22 = null;
// flaky:         basicJanitorMonkeyContext21.reportEvent(event22);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext21.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = null; // flaky: basicJanitorMonkeyContext26.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine17, janitorCrawler18, janitorResourceTracker20, monkeyCalendar25, monkeyConfiguration27, monkeyRecorder28);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext30 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event31 = null;
// flaky:         basicJanitorMonkeyContext30.reportEvent(event31);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker33 = null; // flaky: basicJanitorMonkeyContext30.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration34 = null; // flaky: basicJanitorMonkeyContext30.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler37 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine39 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler40 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker42 = null; // flaky: basicJanitorMonkeyContext41.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext43 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event44 = null;
// flaky:         basicJanitorMonkeyContext43.reportEvent(event44);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar46 = null; // flaky: basicJanitorMonkeyContext43.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar47 = null; // flaky: basicJanitorMonkeyContext43.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext48 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration49 = null; // flaky: basicJanitorMonkeyContext48.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder50 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext51 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine39, janitorCrawler40, janitorResourceTracker42, monkeyCalendar47, monkeyConfiguration49, monkeyRecorder50);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext52 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event53 = null;
// flaky:         basicJanitorMonkeyContext52.reportEvent(event53);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar55 = null; // flaky: basicJanitorMonkeyContext52.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar56 = null; // flaky: basicJanitorMonkeyContext52.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine58 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler59 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext60 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier61 = null; // flaky: basicJanitorMonkeyContext60.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker62 = null; // flaky: basicJanitorMonkeyContext60.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar63 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext64 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = null; // flaky: basicJanitorMonkeyContext64.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder66 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext67 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine58, janitorCrawler59, janitorResourceTracker62, monkeyCalendar63, monkeyConfiguration65, monkeyRecorder66);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext68 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient69 = null; // flaky: basicJanitorMonkeyContext68.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context70 = null; // flaky: basicJanitorMonkeyContext68.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder71 = null; // flaky: basicJanitorMonkeyContext68.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext72 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine36, janitorCrawler37, janitorResourceTracker42, monkeyCalendar56, monkeyConfiguration65, monkeyRecorder71);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext73 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker15, monkeyCalendar25, monkeyConfiguration34, monkeyRecorder71);
        java.lang.String str74 = basicJanitorContext73.region();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(janitorRuleEngine14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration27);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker33);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration34);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker42);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar46);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar47);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration49);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar55);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar56);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier61);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker62);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration65);
// flaky:         org.junit.Assert.assertNotNull(cloudClient69);
// flaky:         org.junit.Assert.assertNotNull(context70);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder71);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "us-west-1" + "'", str74, "us-west-1");
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
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyConfiguration9);
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.CloudClient cloudClient5 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(cloudClient5);
// flaky:         org.junit.Assert.assertNotNull(context6);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "us-west-1");
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context7);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorCrawler14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        java.lang.String str8 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(monkeyCalendar10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider8 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.CloudClient cloudClient3 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.CloudClient cloudClient6 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(cloudClient3);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder4);
// flaky:         org.junit.Assert.assertNotNull(cloudClient6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "us-west-1");
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList10 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList10);
// flaky:         org.junit.Assert.assertNotNull(aWSClient11);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration1 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event3);
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyRecorder.Event event1 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event1);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler7 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler7);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder8);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null; // flaky: basicJanitorMonkeyContext0.configuration();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker6);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        java.lang.String str11 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(monkeyCalendar10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(monkeyRecorder12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.region();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context8 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider9 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context8);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(monkeyConfiguration10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.region();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(cloudClient1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-west-1" + "'", str2, "us-west-1");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }
}
