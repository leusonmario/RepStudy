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
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "";
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY;
// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "owner" + "'", str0, "owner");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.ImageJanitor imageJanitor4 = basicJanitorMonkeyContext0.getImageJanitor();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Image Janitor only works when Edda is enabled.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor6 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        // The following exception was thrown during execution in test generation
        try {
            eBSSnapshotJanitor6.markResources();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
        basicJanitorMonkeyContext0.reportEvent(event3);
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor5 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        // The following exception was thrown during execution in test generation
        try {
            launchConfigJanitor5.markResources();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(launchConfigJanitor5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        java.lang.Class<?> wildcardClass4 = janitorResourceTracker3.getClass();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.ownerEmailDomain;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient5 = basicJanitorMonkeyContext4.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext4.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext4.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList8 = basicJanitorMonkeyContext4.janitors();
        basicJanitorMonkeyContext0.janitors = abstractJanitorList8;
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
        org.junit.Assert.assertNotNull(abstractJanitorList8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        java.util.Set<java.lang.String> strSet2 = basicJanitorMonkeyContext0.getEnabledResourceSet();
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
        basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = basicJanitorMonkeyContext5.emailNotifier;
        basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext0.monkeyCalendar;
        java.util.Set<java.lang.String> strSet10 = basicJanitorMonkeyContext0.getEnabledResourceSet();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
        org.junit.Assert.assertNotNull(janitorEmailNotifier7);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
        basicJanitorMonkeyContext0.reportEvent(event4);
        java.lang.String str6 = basicJanitorMonkeyContext0.sourceEmail;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.Class<?> wildcardClass1 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = basicJanitorMonkeyContext3.sesClient;
        basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient4;
        java.lang.String str6 = basicJanitorMonkeyContext0.getEventReport();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        java.lang.String str4 = basicJanitorMonkeyContext0.getEventReport();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null;
        basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker1;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder3 = null;
        basicJanitorMonkeyContext0.janitorEmailBuilder = janitorEmailBuilder3;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context5 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray8;
        com.netflix.simianarmy.MonkeyRecorder.Event event10 = null;
        basicJanitorMonkeyContext0.reportEvent(event10);
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = basicJanitorMonkeyContext3.sesClient;
        basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient4;
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        int int7 = basicJanitorMonkeyContext0.daysBeforeTermination;
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider8 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str4 = basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.CloudClient cloudClient5 = basicJanitorMonkeyContext0.cloudClient();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(cloudClient5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext5.monkeyRegion = "hi!";
        basicJanitorMonkeyContext5.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor10 = basicJanitorMonkeyContext5.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor11 = basicJanitorMonkeyContext5.getLaunchConfigJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext12.monkeyRegion = "hi!";
        java.lang.String str15 = basicJanitorMonkeyContext12.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event16 = null;
        basicJanitorMonkeyContext12.reportEvent(event16);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = basicJanitorMonkeyContext12.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorMonkeyContext12.janitorResourceTracker;
        basicJanitorMonkeyContext5.janitorResourceTracker = janitorResourceTracker19;
        basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker19;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(monkeyCalendar4);
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor10);
        org.junit.Assert.assertNotNull(launchConfigJanitor11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(janitorResourceTracker19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder3 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor4 = basicJanitorMonkeyContext0.getEBSVolumeJanitor();
        // The following exception was thrown during execution in test generation
        try {
            eBSVolumeJanitor4.markResources();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailBuilder3);
        org.junit.Assert.assertNotNull(eBSVolumeJanitor4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor6 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext7.monkeyRegion = "hi!";
        java.lang.String str10 = basicJanitorMonkeyContext7.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event11 = null;
        basicJanitorMonkeyContext7.reportEvent(event11);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = basicJanitorMonkeyContext7.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorMonkeyContext7.janitorResourceTracker;
        basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker14;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext16.monkeyRegion = "hi!";
        basicJanitorMonkeyContext16.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor21 = basicJanitorMonkeyContext16.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor22 = basicJanitorMonkeyContext16.getASGJanitor();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList23 = basicJanitorMonkeyContext16.janitors();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient25 = basicJanitorMonkeyContext24.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = basicJanitorMonkeyContext24.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList27 = null;
        basicJanitorMonkeyContext24.janitors = abstractJanitorList27;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient30 = basicJanitorMonkeyContext29.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier31 = basicJanitorMonkeyContext29.emailNotifier;
        basicJanitorMonkeyContext24.emailNotifier = janitorEmailNotifier31;
        basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier31;
        basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier31;
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(launchConfigJanitor6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier13);
        org.junit.Assert.assertNotNull(janitorResourceTracker14);
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor21);
        org.junit.Assert.assertNotNull(aSGJanitor22);
        org.junit.Assert.assertNotNull(abstractJanitorList23);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient25);
        org.junit.Assert.assertNotNull(janitorEmailNotifier26);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient30);
        org.junit.Assert.assertNotNull(janitorEmailNotifier31);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor6 = basicJanitorMonkeyContext0.getASGJanitor();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier8 = basicJanitorMonkeyContext0.emailNotifier;
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(aSGJanitor6);
        org.junit.Assert.assertNotNull(abstractJanitorList7);
        org.junit.Assert.assertNotNull(janitorEmailNotifier8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(abstractJanitorList4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        basicJanitorMonkeyContext0.exportCredentials("owner", "");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.AbstractJanitor.Context context8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor9 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient7, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(aWSClient7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection6 = eBSSnapshotJanitor5.getCleanedResources();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection7 = eBSSnapshotJanitor5.getUnmarkedResources();
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(resourceCollection6);
        org.junit.Assert.assertNotNull(resourceCollection7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection2 = aSGJanitor1.getUnmarkedResources();
        // The following exception was thrown during execution in test generation
        try {
            aSGJanitor1.cleanupResources();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(resourceCollection2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.lang.String str3 = basicJanitorMonkeyContext0.monkeyRegion;
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.resetEventReport();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder3 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor4 = basicJanitorMonkeyContext0.getEBSVolumeJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection5 = eBSVolumeJanitor4.getCleanedResources();
        org.junit.Assert.assertNotNull(janitorEmailBuilder3);
        org.junit.Assert.assertNotNull(eBSVolumeJanitor4);
        org.junit.Assert.assertNotNull(resourceCollection5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        basicJanitorMonkeyContext0.exportCredentials("", "owner");
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = basicJanitorMonkeyContext0.scheduler();
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(abstractJanitorList5);
        org.junit.Assert.assertNotNull(monkeyScheduler6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
        basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        java.lang.String str5 = basicJanitorMonkeyContext0.ownerEmailDomain;
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = basicJanitorMonkeyContext0.janitors;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler4 = basicJanitorMonkeyContext0.scheduler();
        org.junit.Assert.assertNotNull(abstractJanitorList3);
        org.junit.Assert.assertNotNull(monkeyScheduler4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection2 = aSGJanitor1.getUnmarkedResources();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection3 = aSGJanitor1.getCleanedResources();
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(resourceCollection2);
        org.junit.Assert.assertNotNull(resourceCollection3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor6 = basicJanitorMonkeyContext0.getASGJanitor();
        // The following exception was thrown during execution in test generation
        try {
            aSGJanitor6.markResources();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(aSGJanitor6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor3 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext0.janitorResourceTracker;
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor3);
        org.junit.Assert.assertNotNull(janitorEmailNotifier4);
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection6 = eBSSnapshotJanitor5.getCleanedResources();
        com.netflix.simianarmy.ResourceType resourceType7 = eBSSnapshotJanitor5.getResourceType();
        // The following exception was thrown during execution in test generation
        try {
            eBSSnapshotJanitor5.cleanupResources();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(resourceCollection6);
        org.junit.Assert.assertTrue("'" + resourceType7 + "' != '" + com.netflix.simianarmy.aws.AWSResourceType.EBS_SNAPSHOT + "'", resourceType7.equals(com.netflix.simianarmy.aws.AWSResourceType.EBS_SNAPSHOT));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext0.resourceTracker();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(monkeyCalendar4);
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor3 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor5 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor3);
        org.junit.Assert.assertNotNull(janitorEmailNotifier4);
        org.junit.Assert.assertNotNull(launchConfigJanitor5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.sourceEmail = "";
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.edda.EddaClient eddaClient5 = basicJanitorMonkeyContext0.createEddaClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
        basicJanitorMonkeyContext0.reportEvent(event6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorMonkeyContext0.calendar();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(abstractJanitorList4);
        org.junit.Assert.assertNotNull(eddaClient5);
        org.junit.Assert.assertNotNull(monkeyCalendar8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        basicJanitorMonkeyContext0.exportCredentials("hi!", "");
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor8 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider9 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        basicJanitorMonkeyContext0.ownerEmailDomain = "hi!";
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor8);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder3 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient5 = basicJanitorMonkeyContext4.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext4.emailNotifier;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext4.calendar();
        basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar7;
        java.util.Set<java.lang.String> strSet9 = basicJanitorMonkeyContext0.getEnabledResourceSet();
        org.junit.Assert.assertNotNull(janitorEmailBuilder3);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
        basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = basicJanitorMonkeyContext5.emailNotifier;
        basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext0.monkeyCalendar;
        basicJanitorMonkeyContext0.resetEventReport();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
        org.junit.Assert.assertNotNull(janitorEmailNotifier7);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.lang.String str3 = basicJanitorMonkeyContext0.monkeyRegion;
        java.lang.String str4 = basicJanitorMonkeyContext0.monkeyRegion;
        java.lang.String str5 = basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = basicJanitorMonkeyContext0.configuration();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor3 = basicJanitorMonkeyContext0.getASGJanitor();
        java.lang.String[] strArray4 = basicJanitorMonkeyContext0.ccEmails;
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(aSGJanitor3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors();
        java.lang.String str5 = basicJanitorMonkeyContext0.ownerEmailDomain;
        java.lang.Class<?> wildcardClass6 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(abstractJanitorList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
        basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = basicJanitorMonkeyContext5.emailNotifier;
        basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient10 = basicJanitorMonkeyContext0.awsClient();
        java.lang.String str11 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorMonkeyContext0.configuration();
        java.lang.String str13 = basicJanitorMonkeyContext0.sourceEmail;
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
        org.junit.Assert.assertNotNull(janitorEmailNotifier7);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(aWSClient10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor3 = basicJanitorMonkeyContext0.getASGJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext4.monkeyRegion = "hi!";
        java.lang.String str7 = basicJanitorMonkeyContext4.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event8 = null;
        basicJanitorMonkeyContext4.reportEvent(event8);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = basicJanitorMonkeyContext4.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorMonkeyContext4.janitorResourceTracker;
        basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker11;
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(aSGJanitor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier10);
        org.junit.Assert.assertNotNull(janitorResourceTracker11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null;
        basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker5;
        basicJanitorMonkeyContext0.daysBeforeTermination = (short) -1;
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
        basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = basicJanitorMonkeyContext5.emailNotifier;
        basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient10 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext14.monkeyRegion = "hi!";
        java.lang.String str17 = basicJanitorMonkeyContext14.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
        basicJanitorMonkeyContext14.reportEvent(event18);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier20 = basicJanitorMonkeyContext14.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorMonkeyContext14.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext22.monkeyRegion = "hi!";
        java.lang.String str25 = basicJanitorMonkeyContext22.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext27 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient28 = basicJanitorMonkeyContext27.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier29 = basicJanitorMonkeyContext27.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList30 = null;
        basicJanitorMonkeyContext27.janitors = abstractJanitorList30;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext32 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient33 = basicJanitorMonkeyContext32.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier34 = basicJanitorMonkeyContext32.emailNotifier;
        basicJanitorMonkeyContext27.emailNotifier = janitorEmailNotifier34;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar36 = basicJanitorMonkeyContext27.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient37 = basicJanitorMonkeyContext27.awsClient();
        java.lang.String str38 = basicJanitorMonkeyContext27.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration39 = basicJanitorMonkeyContext27.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext40.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder43 = basicJanitorMonkeyContext40.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine12, janitorCrawler13, janitorResourceTracker21, monkeyCalendar26, monkeyConfiguration39, monkeyRecorder43);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor45 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient10, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
        org.junit.Assert.assertNotNull(janitorEmailNotifier7);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(aWSClient10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier20);
        org.junit.Assert.assertNotNull(janitorResourceTracker21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(monkeyCalendar26);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient28);
        org.junit.Assert.assertNotNull(janitorEmailNotifier29);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient33);
        org.junit.Assert.assertNotNull(janitorEmailNotifier34);
        org.junit.Assert.assertNotNull(monkeyCalendar36);
        org.junit.Assert.assertNotNull(aWSClient37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration39);
        org.junit.Assert.assertNotNull(monkeyRecorder43);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        basicJanitorMonkeyContext0.ownerEmailDomain = "hi!";
        java.util.Set<java.lang.String> strSet6 = basicJanitorMonkeyContext0.getEnabledResourceSet();
        java.lang.String[] strArray7 = basicJanitorMonkeyContext0.ccEmails;
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        java.lang.String str3 = basicJanitorMonkeyContext0.defaultEmail;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors;
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        org.junit.Assert.assertNotNull(abstractJanitorList4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection2 = aSGJanitor1.getUnmarkedResources();
        com.netflix.simianarmy.ResourceType resourceType3 = aSGJanitor1.getResourceType();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection4 = aSGJanitor1.getMarkedResources();
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(resourceCollection2);
        org.junit.Assert.assertTrue("'" + resourceType3 + "' != '" + com.netflix.simianarmy.aws.AWSResourceType.ASG + "'", resourceType3.equals(com.netflix.simianarmy.aws.AWSResourceType.ASG));
        org.junit.Assert.assertNotNull(resourceCollection4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
        basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
        basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = basicJanitorMonkeyContext21.emailNotifier;
        basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        java.lang.String str36 = basicJanitorContext33.region;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration37 = basicJanitorContext33.configuration();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "us-west-1" + "'", str36, "us-west-1");
        org.junit.Assert.assertNotNull(monkeyConfiguration37);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
        basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
        basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = basicJanitorMonkeyContext21.emailNotifier;
        basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        java.lang.String str34 = basicJanitorContext33.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar35 = basicJanitorContext33.calendar;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "us-west-1" + "'", str34, "us-west-1");
        org.junit.Assert.assertNotNull(monkeyCalendar35);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        basicJanitorMonkeyContext0.exportCredentials("owner", "");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event15 = null;
        basicJanitorMonkeyContext11.reportEvent(event15);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier17 = basicJanitorMonkeyContext11.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorMonkeyContext11.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext19.monkeyRegion = "hi!";
        java.lang.String str22 = basicJanitorMonkeyContext19.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorMonkeyContext19.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient25 = basicJanitorMonkeyContext24.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = basicJanitorMonkeyContext24.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList27 = null;
        basicJanitorMonkeyContext24.janitors = abstractJanitorList27;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient30 = basicJanitorMonkeyContext29.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier31 = basicJanitorMonkeyContext29.emailNotifier;
        basicJanitorMonkeyContext24.emailNotifier = janitorEmailNotifier31;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar33 = basicJanitorMonkeyContext24.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient34 = basicJanitorMonkeyContext24.awsClient();
        java.lang.String str35 = basicJanitorMonkeyContext24.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration36 = basicJanitorMonkeyContext24.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext37.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder40 = basicJanitorMonkeyContext37.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext41 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine9, janitorCrawler10, janitorResourceTracker18, monkeyCalendar23, monkeyConfiguration36, monkeyRecorder40);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine42 = basicJanitorContext41.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker43 = basicJanitorContext41.resourceTracker;
        java.lang.String str44 = basicJanitorContext41.region;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor45 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient7, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(aWSClient7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier17);
        org.junit.Assert.assertNotNull(janitorResourceTracker18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(monkeyCalendar23);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient25);
        org.junit.Assert.assertNotNull(janitorEmailNotifier26);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient30);
        org.junit.Assert.assertNotNull(janitorEmailNotifier31);
        org.junit.Assert.assertNotNull(monkeyCalendar33);
        org.junit.Assert.assertNotNull(aWSClient34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration36);
        org.junit.Assert.assertNotNull(monkeyRecorder40);
        org.junit.Assert.assertNull(janitorRuleEngine42);
        org.junit.Assert.assertNotNull(janitorResourceTracker43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "us-west-1" + "'", str44, "us-west-1");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str4 = basicJanitorMonkeyContext0.monkeyRegion;
        java.lang.String str5 = basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor6 = basicJanitorMonkeyContext0.getInstanceJanitor();
        java.lang.String str7 = basicJanitorMonkeyContext0.ownerEmailDomain;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(instanceJanitor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        java.lang.String str4 = basicJanitorMonkeyContext0.getEventReport();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(monkeyCalendar2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor6 = basicJanitorMonkeyContext0.getASGJanitor();
        java.lang.Class<?> wildcardClass7 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(aSGJanitor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor5 = basicJanitorMonkeyContext4.getASGJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext6.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder9 = basicJanitorMonkeyContext6.janitorEmailBuilder;
        basicJanitorMonkeyContext4.janitorEmailBuilder = janitorEmailBuilder9;
        basicJanitorMonkeyContext0.janitorEmailBuilder = janitorEmailBuilder9;
        org.junit.Assert.assertNotNull(monkeyRecorder3);
        org.junit.Assert.assertNotNull(aSGJanitor5);
        org.junit.Assert.assertNotNull(janitorEmailBuilder9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        basicJanitorMonkeyContext0.ownerEmailDomain = "hi!";
        java.util.Set<java.lang.String> strSet6 = basicJanitorMonkeyContext0.getEnabledResourceSet();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList9 = basicJanitorMonkeyContext0.janitors();
        basicJanitorMonkeyContext0.sourceEmail = "us-west-1";
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
        org.junit.Assert.assertNotNull(abstractJanitorList9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = basicJanitorMonkeyContext0.janitors;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient8 = basicJanitorMonkeyContext7.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext7.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorMonkeyContext7.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList11 = basicJanitorMonkeyContext7.janitors();
        basicJanitorMonkeyContext0.janitors = abstractJanitorList11;
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(abstractJanitorList6);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient8);
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertNotNull(abstractJanitorList11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor6 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        basicJanitorMonkeyContext0.sourceEmail = "";
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(launchConfigJanitor6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor6 = basicJanitorMonkeyContext0.getASGJanitor();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient9 = basicJanitorMonkeyContext8.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = basicJanitorMonkeyContext8.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList11 = null;
        basicJanitorMonkeyContext8.janitors = abstractJanitorList11;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient14 = basicJanitorMonkeyContext13.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier15 = basicJanitorMonkeyContext13.emailNotifier;
        basicJanitorMonkeyContext8.emailNotifier = janitorEmailNotifier15;
        basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier15;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor18 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext19.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder22 = basicJanitorMonkeyContext19.janitorEmailBuilder;
        basicJanitorMonkeyContext0.janitorEmailBuilder = janitorEmailBuilder22;
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(aSGJanitor6);
        org.junit.Assert.assertNotNull(abstractJanitorList7);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient9);
        org.junit.Assert.assertNotNull(janitorEmailNotifier10);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient14);
        org.junit.Assert.assertNotNull(janitorEmailNotifier15);
        org.junit.Assert.assertNotNull(launchConfigJanitor18);
        org.junit.Assert.assertNotNull(janitorEmailBuilder22);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
        basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
        basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = basicJanitorMonkeyContext21.emailNotifier;
        basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler37 = null;
        basicJanitorContext33.crawler = janitorCrawler37;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNull(janitorRuleEngine36);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
        basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = basicJanitorMonkeyContext5.emailNotifier;
        basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor10 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection11 = eBSSnapshotJanitor10.getUnmarkedResources();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
        org.junit.Assert.assertNotNull(janitorEmailNotifier7);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor10);
        org.junit.Assert.assertNotNull(resourceCollection11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder3 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient5 = basicJanitorMonkeyContext4.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext4.emailNotifier;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext4.calendar();
        basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar7;
        java.lang.String str9 = basicJanitorMonkeyContext0.region();
        org.junit.Assert.assertNotNull(janitorEmailBuilder3);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "us-west-1" + "'", str9, "us-west-1");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        basicJanitorMonkeyContext0.exportCredentials("", "owner");
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
        basicJanitorMonkeyContext0.reportEvent(event5);
        basicJanitorMonkeyContext0.resetEventReport();
        org.junit.Assert.assertNotNull(aSGJanitor1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
        basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
        basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = basicJanitorMonkeyContext21.emailNotifier;
        basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = basicJanitorContext33.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration38 = basicJanitorContext33.config;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNull(janitorRuleEngine36);
        org.junit.Assert.assertNotNull(monkeyCalendar37);
        org.junit.Assert.assertNotNull(monkeyConfiguration38);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        basicJanitorMonkeyContext0.exportCredentials("", "owner");
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str7 = basicJanitorMonkeyContext0.getEventReport();
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(abstractJanitorList5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.edda.EddaClient eddaClient5 = basicJanitorMonkeyContext0.createEddaClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(abstractJanitorList4);
        org.junit.Assert.assertNotNull(eddaClient5);
        org.junit.Assert.assertNotNull(context6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection2 = aSGJanitor1.getUnmarkedResources();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection3 = aSGJanitor1.getMarkedResources();
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(resourceCollection2);
        org.junit.Assert.assertNotNull(resourceCollection3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        basicJanitorMonkeyContext0.ownerEmailDomain = "";
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null;
        basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker1;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder3 = null;
        basicJanitorMonkeyContext0.janitorEmailBuilder = janitorEmailBuilder3;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context5 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray8;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.ImageJanitor imageJanitor10 = basicJanitorMonkeyContext0.getImageJanitor();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Image Janitor only works when Edda is enabled.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder3 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        java.lang.String str4 = basicJanitorMonkeyContext0.monkeyRegion;
        org.junit.Assert.assertNotNull(janitorEmailBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
        basicJanitorMonkeyContext0.reportEvent(event3);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = basicJanitorMonkeyContext0.resourceTracker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = basicJanitorMonkeyContext0.getEventReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorResourceTracker5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor6 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient7 = basicJanitorMonkeyContext0.sesClient;
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(launchConfigJanitor6);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = basicJanitorMonkeyContext0.calendar();
        java.lang.String[] strArray5 = basicJanitorMonkeyContext0.ccEmails;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor6 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        basicJanitorMonkeyContext0.daysBeforeTermination = 1;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(monkeyCalendar4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(launchConfigJanitor6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
        basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
        basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = basicJanitorMonkeyContext21.emailNotifier;
        basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        java.lang.String str34 = basicJanitorContext33.region;
        basicJanitorContext33.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine38 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler39 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext40 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext40.monkeyRegion = "hi!";
        java.lang.String str43 = basicJanitorMonkeyContext40.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event44 = null;
        basicJanitorMonkeyContext40.reportEvent(event44);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier46 = basicJanitorMonkeyContext40.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker47 = basicJanitorMonkeyContext40.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext48 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext48.monkeyRegion = "hi!";
        java.lang.String str51 = basicJanitorMonkeyContext48.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = basicJanitorMonkeyContext48.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext53 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient54 = basicJanitorMonkeyContext53.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier55 = basicJanitorMonkeyContext53.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList56 = null;
        basicJanitorMonkeyContext53.janitors = abstractJanitorList56;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext58 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient59 = basicJanitorMonkeyContext58.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier60 = basicJanitorMonkeyContext58.emailNotifier;
        basicJanitorMonkeyContext53.emailNotifier = janitorEmailNotifier60;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar62 = basicJanitorMonkeyContext53.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient63 = basicJanitorMonkeyContext53.awsClient();
        java.lang.String str64 = basicJanitorMonkeyContext53.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = basicJanitorMonkeyContext53.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext66.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder69 = basicJanitorMonkeyContext66.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext70 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine38, janitorCrawler39, janitorResourceTracker47, monkeyCalendar52, monkeyConfiguration65, monkeyRecorder69);
        basicJanitorContext33.config = monkeyConfiguration65;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "us-west-1" + "'", str34, "us-west-1");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier46);
        org.junit.Assert.assertNotNull(janitorResourceTracker47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(monkeyCalendar52);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient54);
        org.junit.Assert.assertNotNull(janitorEmailNotifier55);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient59);
        org.junit.Assert.assertNotNull(janitorEmailNotifier60);
        org.junit.Assert.assertNotNull(monkeyCalendar62);
        org.junit.Assert.assertNotNull(aWSClient63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration65);
        org.junit.Assert.assertNotNull(monkeyRecorder69);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder3 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient5 = basicJanitorMonkeyContext4.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext4.emailNotifier;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext4.calendar();
        basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar7;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext0.emailNotifier();
        org.junit.Assert.assertNotNull(janitorEmailBuilder3);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor6 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection7 = launchConfigJanitor6.getUnmarkedResources();
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(launchConfigJanitor6);
        org.junit.Assert.assertNotNull(resourceCollection7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder3 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient5 = basicJanitorMonkeyContext4.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext4.emailNotifier;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext4.calendar();
        basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar7;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler9 = basicJanitorMonkeyContext0.scheduler();
        org.junit.Assert.assertNotNull(janitorEmailBuilder3);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
        org.junit.Assert.assertNotNull(monkeyScheduler9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor6 = basicJanitorMonkeyContext0.getASGJanitor();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorMonkeyContext0.monkeyCalendar;
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(aSGJanitor6);
        org.junit.Assert.assertNotNull(abstractJanitorList7);
        org.junit.Assert.assertNotNull(monkeyCalendar8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.lang.String str3 = basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor4 = basicJanitorMonkeyContext0.getASGJanitor();
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(aSGJanitor4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        basicJanitorMonkeyContext0.ownerEmailDomain = "hi!";
        java.util.Set<java.lang.String> strSet6 = basicJanitorMonkeyContext0.getEnabledResourceSet();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.resetEventReport();
        basicJanitorMonkeyContext0.defaultEmail = "owner";
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.slf4j.Logger logger0 = com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER = logger0;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER = logger0;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER = logger0;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = basicJanitorContext0.ruleEngine;
        org.junit.Assert.assertNull(janitorRuleEngine1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        basicJanitorMonkeyContext0.ownerEmailDomain = "hi!";
        java.util.Set<java.lang.String> strSet6 = basicJanitorMonkeyContext0.getEnabledResourceSet();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext0.calendar();
        basicJanitorMonkeyContext0.defaultEmail = "";
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.edda.EddaClient eddaClient5 = basicJanitorMonkeyContext0.createEddaClient();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor6 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        basicJanitorMonkeyContext0.daysBeforeTermination = (short) 1;
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(janitorResourceTracker3);
        org.junit.Assert.assertNotNull(abstractJanitorList4);
        org.junit.Assert.assertNotNull(eddaClient5);
        org.junit.Assert.assertNotNull(launchConfigJanitor6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient5 = basicJanitorMonkeyContext4.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext4.emailNotifier;
        java.lang.String str7 = basicJanitorMonkeyContext4.monkeyRegion;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "us-west-1", "us-west-1", "us-west-1" };
        basicJanitorMonkeyContext4.ccEmails = strArray13;
        basicJanitorMonkeyContext0.ccEmails = strArray13;
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
        basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
        basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = basicJanitorMonkeyContext21.emailNotifier;
        basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker34 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine35 = basicJanitorContext33.janitorRuleEngine();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNotNull(janitorResourceTracker34);
        org.junit.Assert.assertNull(janitorRuleEngine35);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        basicJanitorMonkeyContext0.ownerEmailDomain = "hi!";
        com.netflix.simianarmy.client.aws.AWSClient aWSClient6 = basicJanitorMonkeyContext0.awsClient();
        basicJanitorMonkeyContext0.exportCredentials("", "us-west-1");
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(aWSClient6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = basicJanitorMonkeyContext0.getASGJanitor();
        basicJanitorMonkeyContext0.exportCredentials("", "owner");
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor8 = basicJanitorMonkeyContext7.getASGJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext9.monkeyRegion = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder12 = basicJanitorMonkeyContext9.janitorEmailBuilder;
        basicJanitorMonkeyContext7.janitorEmailBuilder = janitorEmailBuilder12;
        basicJanitorMonkeyContext0.janitorEmailBuilder = janitorEmailBuilder12;
        org.junit.Assert.assertNotNull(aSGJanitor1);
        org.junit.Assert.assertNotNull(abstractJanitorList5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier6);
        org.junit.Assert.assertNotNull(aSGJanitor8);
        org.junit.Assert.assertNotNull(janitorEmailBuilder12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
        basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
        basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = basicJanitorMonkeyContext21.emailNotifier;
        basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker36 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient38 = basicJanitorMonkeyContext37.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier39 = basicJanitorMonkeyContext37.emailNotifier;
        java.lang.String str40 = basicJanitorMonkeyContext37.monkeyRegion;
        java.lang.String str41 = basicJanitorMonkeyContext37.monkeyRegion;
        java.lang.String str42 = basicJanitorMonkeyContext37.ownerEmailDomain;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker43 = basicJanitorMonkeyContext37.janitorResourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration44 = basicJanitorMonkeyContext37.configuration();
        basicJanitorContext33.config = monkeyConfiguration44;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNotNull(janitorResourceTracker36);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient38);
        org.junit.Assert.assertNotNull(janitorEmailNotifier39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "us-west-1" + "'", str40, "us-west-1");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "us-west-1" + "'", str41, "us-west-1");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(janitorResourceTracker43);
        org.junit.Assert.assertNotNull(monkeyConfiguration44);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "owner";
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier;
        java.lang.String str3 = basicJanitorMonkeyContext0.monkeyRegion;
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        basicJanitorMonkeyContext0.exportCredentials("hi!", "owner");
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        java.lang.String str36 = basicJanitorContext33.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine37 = basicJanitorContext33.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar38 = basicJanitorContext33.calendar();
        java.lang.String str39 = basicJanitorContext33.region();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "us-west-1" + "'", str36, "us-west-1");
        org.junit.Assert.assertNull(janitorRuleEngine37);
        org.junit.Assert.assertNotNull(monkeyCalendar38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "us-west-1" + "'", str39, "us-west-1");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = null; // flaky: basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext5.emailNotifier;
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler10 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.lang.String str11 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "us-west-1" + "'", str11, "us-west-1");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker36 = basicJanitorContext33.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine38 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler39 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext40 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext40.monkeyRegion = "hi!";
        java.lang.String str43 = null; // flaky: basicJanitorMonkeyContext40.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event44 = null;
// flaky:         basicJanitorMonkeyContext40.reportEvent(event44);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier46 = null; // flaky: basicJanitorMonkeyContext40.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker47 = null; // flaky: basicJanitorMonkeyContext40.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext48 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext48.monkeyRegion = "hi!";
        java.lang.String str51 = null; // flaky: basicJanitorMonkeyContext48.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = null; // flaky: basicJanitorMonkeyContext48.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext53 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient54 = null; // flaky: basicJanitorMonkeyContext53.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier55 = basicJanitorMonkeyContext53.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList56 = null;
        basicJanitorMonkeyContext53.janitors = abstractJanitorList56;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext58 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient59 = basicJanitorMonkeyContext58.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier60 = basicJanitorMonkeyContext58.emailNotifier;
        basicJanitorMonkeyContext53.emailNotifier = janitorEmailNotifier60;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar62 = basicJanitorMonkeyContext53.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient63 = basicJanitorMonkeyContext53.awsClient();
        java.lang.String str64 = basicJanitorMonkeyContext53.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = basicJanitorMonkeyContext53.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext66.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder69 = basicJanitorMonkeyContext66.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext70 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine38, janitorCrawler39, janitorResourceTracker47, monkeyCalendar52, monkeyConfiguration65, monkeyRecorder69);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker71 = basicJanitorContext70.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker72 = basicJanitorContext70.resourceTracker;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder73 = basicJanitorContext70.recorder;
        basicJanitorContext33.recorder = monkeyRecorder73;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNotNull(janitorResourceTracker36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier46);
        org.junit.Assert.assertNotNull(janitorResourceTracker47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(monkeyCalendar52);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient54);
        org.junit.Assert.assertNotNull(janitorEmailNotifier55);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient59);
        org.junit.Assert.assertNotNull(janitorEmailNotifier60);
        org.junit.Assert.assertNotNull(monkeyCalendar62);
        org.junit.Assert.assertNotNull(aWSClient63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration65);
        org.junit.Assert.assertNotNull(monkeyRecorder69);
        org.junit.Assert.assertNotNull(janitorResourceTracker71);
        org.junit.Assert.assertNotNull(janitorResourceTracker72);
        org.junit.Assert.assertNotNull(monkeyRecorder73);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
// flaky:         basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection6 = null; // flaky: eBSSnapshotJanitor5.getMarkedResources();
        java.lang.String str7 = null; // flaky: eBSSnapshotJanitor5.getRegion();
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("owner", "");
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "";
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = null; // flaky: basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext5.emailNotifier;
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient10 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier11 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor13 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient10);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier11);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList4 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor6 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor7 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor6);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = null; // flaky: basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext5.emailNotifier;
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        int int9 = 0; // flaky: basicJanitorMonkeyContext0.daysBeforeTermination;
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor10 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "hi!";
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        java.lang.String str34 = basicJanitorContext33.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine35 = basicJanitorContext33.ruleEngine;
        basicJanitorContext33.region = "us-west-1";
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "us-west-1" + "'", str34, "us-west-1");
        org.junit.Assert.assertNull(janitorRuleEngine35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = basicJanitorContext33.calendar;
        basicJanitorContext33.region = "us-west-1";
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNull(janitorRuleEngine36);
        org.junit.Assert.assertNotNull(monkeyCalendar37);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        java.lang.String str36 = basicJanitorContext33.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine37 = basicJanitorContext33.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine38 = null;
        basicJanitorContext33.ruleEngine = janitorRuleEngine38;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder40 = basicJanitorContext33.recorder();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "us-west-1" + "'", str36, "us-west-1");
        org.junit.Assert.assertNull(janitorRuleEngine37);
        org.junit.Assert.assertNotNull(monkeyRecorder40);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar36 = basicJanitorContext33.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine37 = null;
        basicJanitorContext33.ruleEngine = janitorRuleEngine37;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNotNull(monkeyCalendar36);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("owner", "");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList8 = null; // flaky: basicJanitorMonkeyContext0.janitors;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient10 = null; // flaky: basicJanitorMonkeyContext9.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier11 = null; // flaky: basicJanitorMonkeyContext9.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList12 = null;
// flaky:         basicJanitorMonkeyContext9.janitors = abstractJanitorList12;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient15 = null; // flaky: basicJanitorMonkeyContext14.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier16 = null; // flaky: basicJanitorMonkeyContext14.emailNotifier;
// flaky:         basicJanitorMonkeyContext9.emailNotifier = janitorEmailNotifier16;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null; // flaky: basicJanitorMonkeyContext9.monkeyCalendar;
// flaky:         basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar18;
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList8);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient10);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier11);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient15);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier16);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar18);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection2 = null; // flaky: aSGJanitor1.getUnmarkedResources();
        com.netflix.simianarmy.ResourceType resourceType3 = null; // flaky: aSGJanitor1.getResourceType();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection4 = null; // flaky: aSGJanitor1.getCleanedResources();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection5 = null; // flaky: aSGJanitor1.getCleanedResources();
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor1);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection2);
// flaky:         org.junit.Assert.assertTrue("'" + resourceType3 + "' != '" + com.netflix.simianarmy.aws.AWSResourceType.ASG + "'", resourceType3.equals(com.netflix.simianarmy.aws.AWSResourceType.ASG));
// flaky:         org.junit.Assert.assertNotNull(resourceCollection4);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker36 = basicJanitorContext33.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine38 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler39 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext40 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext40.monkeyRegion = "hi!";
        java.lang.String str43 = null; // flaky: basicJanitorMonkeyContext40.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event44 = null;
// flaky:         basicJanitorMonkeyContext40.reportEvent(event44);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier46 = null; // flaky: basicJanitorMonkeyContext40.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker47 = null; // flaky: basicJanitorMonkeyContext40.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext48 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext48.monkeyRegion = "hi!";
        java.lang.String str51 = null; // flaky: basicJanitorMonkeyContext48.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar52 = null; // flaky: basicJanitorMonkeyContext48.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext53 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient54 = null; // flaky: basicJanitorMonkeyContext53.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier55 = basicJanitorMonkeyContext53.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList56 = null;
        basicJanitorMonkeyContext53.janitors = abstractJanitorList56;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext58 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient59 = basicJanitorMonkeyContext58.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier60 = basicJanitorMonkeyContext58.emailNotifier;
        basicJanitorMonkeyContext53.emailNotifier = janitorEmailNotifier60;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar62 = basicJanitorMonkeyContext53.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient63 = basicJanitorMonkeyContext53.awsClient();
        java.lang.String str64 = basicJanitorMonkeyContext53.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration65 = basicJanitorMonkeyContext53.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext66 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext66.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder69 = basicJanitorMonkeyContext66.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext70 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine38, janitorCrawler39, janitorResourceTracker47, monkeyCalendar52, monkeyConfiguration65, monkeyRecorder69);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine71 = basicJanitorContext70.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker72 = basicJanitorContext70.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine73 = basicJanitorContext70.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder74 = basicJanitorContext70.recorder;
        basicJanitorContext33.recorder = monkeyRecorder74;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNotNull(janitorResourceTracker36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier46);
        org.junit.Assert.assertNotNull(janitorResourceTracker47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(monkeyCalendar52);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient54);
        org.junit.Assert.assertNotNull(janitorEmailNotifier55);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient59);
        org.junit.Assert.assertNotNull(janitorEmailNotifier60);
        org.junit.Assert.assertNotNull(monkeyCalendar62);
        org.junit.Assert.assertNotNull(aWSClient63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration65);
        org.junit.Assert.assertNotNull(monkeyRecorder69);
        org.junit.Assert.assertNull(janitorRuleEngine71);
        org.junit.Assert.assertNotNull(janitorResourceTracker72);
        org.junit.Assert.assertNull(janitorRuleEngine73);
        org.junit.Assert.assertNotNull(monkeyRecorder74);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker1;
        com.netflix.simianarmy.MonkeyRecorder.Event event3 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.lang.String[] strArray5 = null; // flaky: basicJanitorMonkeyContext0.ccEmails;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor6 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection7 = null; // flaky: launchConfigJanitor6.getFailedToCleanResources();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar4);
// flaky:         org.junit.Assert.assertNotNull(strArray5);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor6);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
// flaky:         basicJanitorMonkeyContext0.ownerEmailDomain = "";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext8.monkeyRegion = "hi!";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient12 = null; // flaky: basicJanitorMonkeyContext11.sesClient;
// flaky:         basicJanitorMonkeyContext8.sesClient = amazonSimpleEmailServiceClient12;
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient12;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "owner");
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor1);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker34 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration35 = basicJanitorContext33.configuration();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNotNull(janitorResourceTracker34);
        org.junit.Assert.assertNotNull(monkeyConfiguration35);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection2 = null; // flaky: aSGJanitor1.getUnmarkedResources();
        com.netflix.simianarmy.ResourceType resourceType3 = null; // flaky: aSGJanitor1.getResourceType();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection4 = null; // flaky: aSGJanitor1.getFailedToCleanResources();
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor1);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection2);
// flaky:         org.junit.Assert.assertTrue("'" + resourceType3 + "' != '" + com.netflix.simianarmy.aws.AWSResourceType.ASG + "'", resourceType3.equals(com.netflix.simianarmy.aws.AWSResourceType.ASG));
// flaky:         org.junit.Assert.assertNotNull(resourceCollection4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = null; // flaky: basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext5.emailNotifier;
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.client.edda.EddaClient eddaClient10 = null; // flaky: basicJanitorMonkeyContext0.createEddaClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext14.monkeyRegion = "hi!";
        java.lang.String str17 = null; // flaky: basicJanitorMonkeyContext14.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
// flaky:         basicJanitorMonkeyContext14.reportEvent(event18);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier20 = null; // flaky: basicJanitorMonkeyContext14.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext14.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext22.monkeyRegion = "hi!";
        java.lang.String str25 = null; // flaky: basicJanitorMonkeyContext22.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null; // flaky: basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext27 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient28 = null; // flaky: basicJanitorMonkeyContext27.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier29 = null; // flaky: basicJanitorMonkeyContext27.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList30 = null;
// flaky:         basicJanitorMonkeyContext27.janitors = abstractJanitorList30;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext32 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient33 = null; // flaky: basicJanitorMonkeyContext32.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier34 = null; // flaky: basicJanitorMonkeyContext32.emailNotifier;
// flaky:         basicJanitorMonkeyContext27.emailNotifier = janitorEmailNotifier34;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar36 = null; // flaky: basicJanitorMonkeyContext27.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient37 = null; // flaky: basicJanitorMonkeyContext27.awsClient();
        java.lang.String str38 = null; // flaky: basicJanitorMonkeyContext27.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration39 = null; // flaky: basicJanitorMonkeyContext27.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext40 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext40.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder43 = null; // flaky: basicJanitorMonkeyContext40.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine12, janitorCrawler13, janitorResourceTracker21, monkeyCalendar26, monkeyConfiguration39, monkeyRecorder43);
        java.lang.String str45 = basicJanitorContext44.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine46 = basicJanitorContext44.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker47 = basicJanitorContext44.janitorResourceTracker();
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker47;
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
        org.junit.Assert.assertNotNull(janitorEmailNotifier7);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(eddaClient10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier20);
        org.junit.Assert.assertNotNull(janitorResourceTracker21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(monkeyCalendar26);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient28);
        org.junit.Assert.assertNotNull(janitorEmailNotifier29);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient33);
        org.junit.Assert.assertNotNull(janitorEmailNotifier34);
        org.junit.Assert.assertNotNull(monkeyCalendar36);
        org.junit.Assert.assertNotNull(aWSClient37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration39);
        org.junit.Assert.assertNotNull(monkeyRecorder43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "us-west-1" + "'", str45, "us-west-1");
        org.junit.Assert.assertNull(janitorRuleEngine46);
        org.junit.Assert.assertNotNull(janitorResourceTracker47);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor6 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        java.lang.String str7 = null; // flaky: instanceJanitor6.getRegion();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        java.lang.String str36 = basicJanitorContext33.region;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient38 = null; // flaky: basicJanitorMonkeyContext37.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier39 = null; // flaky: basicJanitorMonkeyContext37.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker40 = null; // flaky: basicJanitorMonkeyContext37.resourceTracker();
// flaky:         basicJanitorMonkeyContext37.exportCredentials("owner", "");
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null; // flaky: basicJanitorMonkeyContext37.recorder();
        basicJanitorContext33.recorder = monkeyRecorder44;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler46 = basicJanitorContext33.crawler;
        basicJanitorContext33.region = "";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar49 = basicJanitorContext33.calendar();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "us-west-1" + "'", str36, "us-west-1");
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient38);
        org.junit.Assert.assertNotNull(janitorEmailNotifier39);
        org.junit.Assert.assertNotNull(janitorResourceTracker40);
        org.junit.Assert.assertNotNull(monkeyRecorder44);
        org.junit.Assert.assertNull(janitorCrawler46);
        org.junit.Assert.assertNotNull(monkeyCalendar49);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor5 = null; // flaky: basicJanitorMonkeyContext4.getASGJanitor();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = null; // flaky: basicJanitorMonkeyContext4.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker6;
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder3);
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor3 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar37 = basicJanitorContext33.calendar;
        java.lang.String str38 = basicJanitorContext33.region;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNull(janitorRuleEngine36);
        org.junit.Assert.assertNotNull(monkeyCalendar37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "us-west-1" + "'", str38, "us-west-1");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker1;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler34 = basicJanitorContext33.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder35 = basicJanitorContext33.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar36 = basicJanitorContext33.calendar();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorCrawler34);
        org.junit.Assert.assertNotNull(monkeyRecorder35);
        org.junit.Assert.assertNotNull(monkeyCalendar36);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler34 = basicJanitorContext33.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler37 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext38 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext38.monkeyRegion = "hi!";
        java.lang.String str41 = null; // flaky: basicJanitorMonkeyContext38.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event42 = null;
// flaky:         basicJanitorMonkeyContext38.reportEvent(event42);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier44 = null; // flaky: basicJanitorMonkeyContext38.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker45 = null; // flaky: basicJanitorMonkeyContext38.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext46.monkeyRegion = "hi!";
        java.lang.String str49 = null; // flaky: basicJanitorMonkeyContext46.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = null; // flaky: basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext51 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient52 = null; // flaky: basicJanitorMonkeyContext51.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier53 = basicJanitorMonkeyContext51.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList54 = null;
        basicJanitorMonkeyContext51.janitors = abstractJanitorList54;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext56 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient57 = basicJanitorMonkeyContext56.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier58 = basicJanitorMonkeyContext56.emailNotifier;
        basicJanitorMonkeyContext51.emailNotifier = janitorEmailNotifier58;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar60 = basicJanitorMonkeyContext51.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient61 = basicJanitorMonkeyContext51.awsClient();
        java.lang.String str62 = basicJanitorMonkeyContext51.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration63 = basicJanitorMonkeyContext51.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext64 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext64.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder67 = basicJanitorMonkeyContext64.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext68 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine36, janitorCrawler37, janitorResourceTracker45, monkeyCalendar50, monkeyConfiguration63, monkeyRecorder67);
        basicJanitorContext33.resourceTracker = janitorResourceTracker45;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder70 = basicJanitorContext33.recorder();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorCrawler34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier44);
        org.junit.Assert.assertNotNull(janitorResourceTracker45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(monkeyCalendar50);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient52);
        org.junit.Assert.assertNotNull(janitorEmailNotifier53);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient57);
        org.junit.Assert.assertNotNull(janitorEmailNotifier58);
        org.junit.Assert.assertNotNull(monkeyCalendar60);
        org.junit.Assert.assertNotNull(aWSClient61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration63);
        org.junit.Assert.assertNotNull(monkeyRecorder67);
        org.junit.Assert.assertNotNull(monkeyRecorder70);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "us-west-1", "us-west-1", "us-west-1" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor11 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection12 = null; // flaky: launchConfigJanitor11.getFailedToCleanResources();
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor11);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
// flaky:         basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.client.edda.EddaClient eddaClient5 = null; // flaky: basicJanitorMonkeyContext0.createEddaClient();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
// flaky:         org.junit.Assert.assertNotNull(eddaClient5);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler34 = basicJanitorContext33.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler37 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext38 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext38.monkeyRegion = "hi!";
        java.lang.String str41 = null; // flaky: basicJanitorMonkeyContext38.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event42 = null;
// flaky:         basicJanitorMonkeyContext38.reportEvent(event42);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier44 = null; // flaky: basicJanitorMonkeyContext38.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker45 = null; // flaky: basicJanitorMonkeyContext38.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext46 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext46.monkeyRegion = "hi!";
        java.lang.String str49 = null; // flaky: basicJanitorMonkeyContext46.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = null; // flaky: basicJanitorMonkeyContext46.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext51 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient52 = null; // flaky: basicJanitorMonkeyContext51.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier53 = basicJanitorMonkeyContext51.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList54 = null;
        basicJanitorMonkeyContext51.janitors = abstractJanitorList54;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext56 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient57 = basicJanitorMonkeyContext56.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier58 = basicJanitorMonkeyContext56.emailNotifier;
        basicJanitorMonkeyContext51.emailNotifier = janitorEmailNotifier58;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar60 = basicJanitorMonkeyContext51.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient61 = basicJanitorMonkeyContext51.awsClient();
        java.lang.String str62 = basicJanitorMonkeyContext51.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration63 = basicJanitorMonkeyContext51.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext64 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext64.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder67 = basicJanitorMonkeyContext64.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext68 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine36, janitorCrawler37, janitorResourceTracker45, monkeyCalendar50, monkeyConfiguration63, monkeyRecorder67);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine69 = basicJanitorContext68.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker70 = basicJanitorContext68.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine71 = basicJanitorContext68.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar72 = basicJanitorContext68.calendar;
        basicJanitorContext33.calendar = monkeyCalendar72;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(janitorResourceTracker10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(monkeyCalendar15);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorCrawler34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier44);
        org.junit.Assert.assertNotNull(janitorResourceTracker45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(monkeyCalendar50);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient52);
        org.junit.Assert.assertNotNull(janitorEmailNotifier53);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient57);
        org.junit.Assert.assertNotNull(janitorEmailNotifier58);
        org.junit.Assert.assertNotNull(monkeyCalendar60);
        org.junit.Assert.assertNotNull(aWSClient61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration63);
        org.junit.Assert.assertNotNull(monkeyRecorder67);
        org.junit.Assert.assertNull(janitorRuleEngine69);
        org.junit.Assert.assertNotNull(janitorResourceTracker70);
        org.junit.Assert.assertNull(janitorRuleEngine71);
        org.junit.Assert.assertNotNull(monkeyCalendar72);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = null; // flaky: basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext5.emailNotifier;
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient10 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext14.monkeyRegion = "hi!";
        java.lang.String str17 = null; // flaky: basicJanitorMonkeyContext14.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
// flaky:         basicJanitorMonkeyContext14.reportEvent(event18);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier20 = null; // flaky: basicJanitorMonkeyContext14.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext14.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext22.monkeyRegion = "hi!";
        java.lang.String str25 = null; // flaky: basicJanitorMonkeyContext22.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null; // flaky: basicJanitorMonkeyContext22.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext27 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient28 = null; // flaky: basicJanitorMonkeyContext27.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier29 = null; // flaky: basicJanitorMonkeyContext27.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList30 = null;
// flaky:         basicJanitorMonkeyContext27.janitors = abstractJanitorList30;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext32 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient33 = null; // flaky: basicJanitorMonkeyContext32.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier34 = null; // flaky: basicJanitorMonkeyContext32.emailNotifier;
// flaky:         basicJanitorMonkeyContext27.emailNotifier = janitorEmailNotifier34;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar36 = null; // flaky: basicJanitorMonkeyContext27.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient37 = null; // flaky: basicJanitorMonkeyContext27.awsClient();
        java.lang.String str38 = null; // flaky: basicJanitorMonkeyContext27.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration39 = null; // flaky: basicJanitorMonkeyContext27.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext40 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext40.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder43 = null; // flaky: basicJanitorMonkeyContext40.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext44 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine12, janitorCrawler13, janitorResourceTracker21, monkeyCalendar26, monkeyConfiguration39, monkeyRecorder43);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine45 = basicJanitorContext44.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker46 = basicJanitorContext44.resourceTracker;
        java.lang.String str47 = basicJanitorContext44.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine48 = basicJanitorContext44.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor49 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient10, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
        org.junit.Assert.assertNotNull(janitorEmailNotifier7);
        org.junit.Assert.assertNotNull(monkeyCalendar9);
        org.junit.Assert.assertNotNull(aWSClient10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(janitorEmailNotifier20);
        org.junit.Assert.assertNotNull(janitorResourceTracker21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(monkeyCalendar26);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient28);
        org.junit.Assert.assertNotNull(janitorEmailNotifier29);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient33);
        org.junit.Assert.assertNotNull(janitorEmailNotifier34);
        org.junit.Assert.assertNotNull(monkeyCalendar36);
        org.junit.Assert.assertNotNull(aWSClient37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration39);
        org.junit.Assert.assertNotNull(monkeyRecorder43);
        org.junit.Assert.assertNull(janitorRuleEngine45);
        org.junit.Assert.assertNotNull(janitorResourceTracker46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "us-west-1" + "'", str47, "us-west-1");
        org.junit.Assert.assertNull(janitorRuleEngine48);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        java.lang.String str34 = basicJanitorContext33.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine35 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration36 = basicJanitorContext33.config;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "us-west-1" + "'", str34, "us-west-1");
        org.junit.Assert.assertNull(janitorRuleEngine35);
        org.junit.Assert.assertNotNull(monkeyConfiguration36);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.lang.String str9 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "us-west-1" + "'", str9, "us-west-1");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = null; // flaky: basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext5.emailNotifier;
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.client.edda.EddaClient eddaClient10 = null; // flaky: basicJanitorMonkeyContext0.createEddaClient();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: basicJanitorMonkeyContext0.getEnabledResourceSet();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext13 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient14 = null; // flaky: basicJanitorMonkeyContext13.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier15 = null; // flaky: basicJanitorMonkeyContext13.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList16 = null;
// flaky:         basicJanitorMonkeyContext13.janitors = abstractJanitorList16;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient19 = null; // flaky: basicJanitorMonkeyContext18.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier20 = null; // flaky: basicJanitorMonkeyContext18.emailNotifier;
// flaky:         basicJanitorMonkeyContext13.emailNotifier = janitorEmailNotifier20;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null; // flaky: basicJanitorMonkeyContext13.monkeyCalendar;
// flaky:         basicJanitorMonkeyContext12.monkeyCalendar = monkeyCalendar22;
// flaky:         basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar22;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList25 = null; // flaky: basicJanitorMonkeyContext0.janitors;
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertNotNull(eddaClient10);
// flaky:         org.junit.Assert.assertNotNull(strSet11);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient14);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient19);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier20);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar22);
        org.junit.Assert.assertNull(abstractJanitorList25);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker36 = basicJanitorContext33.janitorResourceTracker();
        java.lang.String str37 = basicJanitorContext33.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine38 = basicJanitorContext33.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine39 = basicJanitorContext33.ruleEngine;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertNotNull(janitorResourceTracker36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "us-west-1" + "'", str37, "us-west-1");
        org.junit.Assert.assertNull(janitorRuleEngine38);
        org.junit.Assert.assertNull(janitorRuleEngine39);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("owner", "");
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "";
        com.netflix.simianarmy.CloudClient cloudClient9 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker3);
// flaky:         org.junit.Assert.assertNotNull(cloudClient9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = null; // flaky: basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext5.emailNotifier;
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient10 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        java.lang.String str11 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor13 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier14 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration12);
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor13);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor3 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null;
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList3;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient6 = null; // flaky: basicJanitorMonkeyContext5.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: basicJanitorMonkeyContext5.emailNotifier;
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier7;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler10 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         basicJanitorMonkeyContext0.ownerEmailDomain = "";
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient13 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler10);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
// flaky:         basicJanitorMonkeyContext0.sourceEmail = "hi!";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor6 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext7.monkeyRegion = "hi!";
        java.lang.String str10 = null; // flaky: basicJanitorMonkeyContext7.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event11 = null;
// flaky:         basicJanitorMonkeyContext7.reportEvent(event11);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = null; // flaky: basicJanitorMonkeyContext7.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null; // flaky: basicJanitorMonkeyContext7.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker14;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor6);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier13);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor6 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor6);
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor7 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        basicJanitorContext33.region = "us-west-1";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler36 = basicJanitorContext33.janitorCrawler();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorCrawler36);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        java.lang.String str34 = basicJanitorContext33.region;
        basicJanitorContext33.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler37 = null;
        basicJanitorContext33.crawler = janitorCrawler37;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar25);
// flaky:         org.junit.Assert.assertNotNull(aWSClient26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "us-west-1" + "'", str34, "us-west-1");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors;
        java.util.Set<java.lang.String> strSet4 = null; // flaky: basicJanitorMonkeyContext0.getEnabledResourceSet();
        com.netflix.simianarmy.MonkeyRecorder.Event event5 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event5);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "hi!";
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext3.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event7 = null;
// flaky:         basicJanitorMonkeyContext3.reportEvent(event7);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "hi!";
        java.lang.String str14 = null; // flaky: basicJanitorMonkeyContext11.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient17 = null; // flaky: basicJanitorMonkeyContext16.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList19 = null;
// flaky:         basicJanitorMonkeyContext16.janitors = abstractJanitorList19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient22 = null; // flaky: basicJanitorMonkeyContext21.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier;
// flaky:         basicJanitorMonkeyContext16.emailNotifier = janitorEmailNotifier23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null; // flaky: basicJanitorMonkeyContext16.monkeyCalendar;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient26 = null; // flaky: basicJanitorMonkeyContext16.awsClient();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext16.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext29 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext29.monkeyRegion = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null; // flaky: basicJanitorMonkeyContext29.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker10, monkeyCalendar15, monkeyConfiguration28, monkeyRecorder32);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext33.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = basicJanitorContext33.resourceTracker;
        java.lang.String str36 = basicJanitorContext33.region;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient38 = null; // flaky: basicJanitorMonkeyContext37.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier39 = null; // flaky: basicJanitorMonkeyContext37.emailNotifier;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker40 = null; // flaky: basicJanitorMonkeyContext37.resourceTracker();
// flaky:         basicJanitorMonkeyContext37.exportCredentials("owner", "");
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null; // flaky: basicJanitorMonkeyContext37.recorder();
        basicJanitorContext33.recorder = monkeyRecorder44;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler46 = null;
        basicJanitorContext33.crawler = janitorCrawler46;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier18);
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient22);
        org.junit.Assert.assertNotNull(janitorEmailNotifier23);
        org.junit.Assert.assertNotNull(monkeyCalendar25);
        org.junit.Assert.assertNotNull(aWSClient26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(monkeyConfiguration28);
        org.junit.Assert.assertNotNull(monkeyRecorder32);
        org.junit.Assert.assertNull(janitorRuleEngine34);
        org.junit.Assert.assertNotNull(janitorResourceTracker35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "us-west-1" + "'", str36, "us-west-1");
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient38);
        org.junit.Assert.assertNotNull(janitorEmailNotifier39);
        org.junit.Assert.assertNotNull(janitorResourceTracker40);
        org.junit.Assert.assertNotNull(monkeyRecorder44);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "us-west-1", "us-west-1", "us-west-1" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor11 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor3 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null;
// flaky:         basicJanitorMonkeyContext4.janitorResourceTracker = janitorResourceTracker5;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder7 = null;
// flaky:         basicJanitorMonkeyContext4.janitorEmailBuilder = janitorEmailBuilder7;
// flaky:         basicJanitorMonkeyContext4.sourceEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor12 = null; // flaky: basicJanitorMonkeyContext11.getASGJanitor();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList13 = null; // flaky: basicJanitorMonkeyContext11.janitors();
// flaky:         basicJanitorMonkeyContext4.janitors = abstractJanitorList13;
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList13;
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor1);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker2);
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor3);
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor12);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList13);
    }
}
