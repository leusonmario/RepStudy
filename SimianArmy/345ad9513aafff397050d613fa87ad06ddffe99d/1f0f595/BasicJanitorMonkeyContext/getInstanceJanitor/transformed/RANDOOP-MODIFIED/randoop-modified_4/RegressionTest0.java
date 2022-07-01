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
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.amazonaws.ClientConfiguration clientConfiguration1 = null;
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient3 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0, clientConfiguration1, requestMetricCollector2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext1 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor2 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorMonkeyContext0.janitorResourceTracker;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.ImageJanitor imageJanitor2 = basicJanitorMonkeyContext0.getImageJanitor();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Image Janitor only works when Edda is enabled.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorResourceTracker1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorMonkeyContext0.janitorResourceTracker;
        basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        basicJanitorMonkeyContext0.exportCredentials("hi!", "hi!");
        org.junit.Assert.assertNotNull(janitorResourceTracker1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = 'a';
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.Class<?> wildcardClass1 = null; // flaky: basicJanitorMonkeyContext0.getClass();
// flaky:         org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        boolean boolean0 = com.amazonaws.AmazonWebServiceClient.LOGGING_AWS_REQUEST_METRIC;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection2 = null; // flaky: eBSVolumeJanitor1.getFailedToCleanResources();
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor1);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection5 = null; // flaky: launchConfigJanitor4.getMarkedResources();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection6 = null; // flaky: launchConfigJanitor4.getCleanedResources();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection5);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext1 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorContext1.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorContext1.configuration();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor4 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorResourceTracker2);
        org.junit.Assert.assertNull(monkeyConfiguration3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext1 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorContext1.janitorResourceTracker();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor3 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorResourceTracker2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
// flaky:         basicJanitorMonkeyContext0.ownerEmailDomain = "us-west-1";
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        java.net.URI uRI1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.auth.Signer signer2 = amazonSimpleEmailServiceClient0.getSignerByURI(uRI1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult getIdentityDkimAttributesResult2 = amazonSimpleEmailServiceClient0.getIdentityDkimAttributes(getIdentityDkimAttributesRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verifyDomainIdentityRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult verifyDomainIdentityResult2 = amazonSimpleEmailServiceClient0.verifyDomainIdentity(verifyDomainIdentityRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection2 = null; // flaky: eBSVolumeJanitor1.getCleanedResources();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             eBSVolumeJanitor1.cleanupResources();
// flaky:             org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: The AWS Access Key Id you provided does not exist in our records. (Service: AmazonSimpleDB; Status Code: 403; Error Code: InvalidClientTokenId; Request ID: 62e7bac8-0b4b-f73b-cc70-88d50489e76a)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor1);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        java.util.Set<java.lang.String> strSet3 = null; // flaky: basicJanitorMonkeyContext0.getPropertySet("hi!");
// flaky:         basicJanitorMonkeyContext0.sourceEmail = "hi!";
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.client.edda.EddaClient eddaClient3 = null; // flaky: basicJanitorMonkeyContext0.createEddaClient();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(eddaClient3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult1 = amazonSimpleEmailServiceClient0.getSendStatistics();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.regions.Region region1 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.setRegion(region1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult2 = amazonSimpleEmailServiceClient0.listVerifiedEmailAddresses(listVerifiedEmailAddressesRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest verifyEmailIdentityRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult verifyEmailIdentityResult4 = amazonSimpleEmailServiceClient0.verifyEmailIdentity(verifyEmailIdentityRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray12 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray12;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null; // flaky: basicJanitorMonkeyContext0.resourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(strArray12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest verifyEmailIdentityRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult verifyEmailIdentityResult6 = amazonSimpleEmailServiceClient4.verifyEmailIdentity(verifyEmailIdentityRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        java.net.URI uRI3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.auth.Signer signer4 = amazonSimpleEmailServiceClient0.getSignerByURI(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest verifyEmailAddressRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient4.verifyEmailAddress(verifyEmailAddressRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult5 = null; // flaky: amazonSimpleEmailServiceClient4.getSendQuota();
// flaky:             org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest1 = null;
        com.amazonaws.ResponseMetadata responseMetadata2 = amazonSimpleEmailServiceClient0.getCachedResponseMetadata(amazonWebServiceRequest1);
        com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest verifyEmailIdentityRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult verifyEmailIdentityResult4 = amazonSimpleEmailServiceClient0.verifyEmailIdentity(verifyEmailIdentityRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(responseMetadata2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.netflix.simianarmy.ResourceType resourceType5 = null; // flaky: launchConfigJanitor4.getResourceType();
        java.lang.String str6 = null; // flaky: launchConfigJanitor4.getRegion();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertTrue("'" + resourceType5 + "' != '" + com.netflix.simianarmy.aws.AWSResourceType.LAUNCH_CONFIG + "'", resourceType5.equals(com.netflix.simianarmy.aws.AWSResourceType.LAUNCH_CONFIG));
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.ClientConfiguration clientConfiguration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0, clientConfiguration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext8.resourceTracker;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor10 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorResourceTracker9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.amazonaws.ClientConfiguration clientConfiguration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0, clientConfiguration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult setIdentityDkimEnabledResult3 = amazonSimpleEmailServiceClient1.setIdentityDkimEnabled(setIdentityDkimEnabledRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext1 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = basicJanitorContext1.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor3 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorRuleEngine2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker7;
        com.netflix.simianarmy.CloudClient cloudClient9 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(cloudClient9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             janitorEmailNotifier6.sendNotifications();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Default email foo@bar.com is invalid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors;
// flaky:         basicJanitorMonkeyContext0.ownerEmailDomain = "";
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest1 = null;
        com.amazonaws.ResponseMetadata responseMetadata2 = amazonSimpleEmailServiceClient0.getCachedResponseMetadata(amazonWebServiceRequest1);
        com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult setIdentityDkimEnabledResult4 = amazonSimpleEmailServiceClient0.setIdentityDkimEnabled(setIdentityDkimEnabledRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(responseMetadata2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor3 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null; // flaky: basicJanitorMonkeyContext4.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext4.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context8 = null; // flaky: basicJanitorMonkeyContext4.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext4.monkeyCalendar;
// flaky:         basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar9;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor3);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker5);
// flaky:         org.junit.Assert.assertNotNull(context8);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabledResult4 = amazonSimpleEmailServiceClient0.setIdentityFeedbackForwardingEnabled(setIdentityFeedbackForwardingEnabledRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient4.setSignerRegionOverride("");
// flaky:         amazonSimpleEmailServiceClient4.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult8 = null; // flaky: amazonSimpleEmailServiceClient4.getSendStatistics();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Connection pool shut down");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult5 = null; // flaky: amazonSimpleEmailServiceClient4.listVerifiedEmailAddresses();
// flaky:             org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: The security token included in the request is invalid. (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: InvalidClientTokenId; Request ID: 1c799b68-39ae-4726-9147-94dd41fe2684)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient4.setSignerRegionOverride("");
// flaky:         amazonSimpleEmailServiceClient4.shutdown();
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector8 = null; // flaky: amazonSimpleEmailServiceClient4.getRequestMetricsCollector();
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult9 = null; // flaky: amazonSimpleEmailServiceClient4.getSendQuota();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Connection pool shut down");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
        org.junit.Assert.assertNull(requestMetricCollector8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest1 = null;
        com.amazonaws.ResponseMetadata responseMetadata2 = amazonSimpleEmailServiceClient0.getCachedResponseMetadata(amazonWebServiceRequest1);
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult4 = amazonSimpleEmailServiceClient0.sendEmail(sendEmailRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(responseMetadata2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult2 = amazonSimpleEmailServiceClient1.getSendStatistics();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: e1d5ebac-7428-4bb5-a38c-9f5bc1e10c6c)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        java.util.Map<java.lang.String, java.util.Collection<com.netflix.simianarmy.Resource>> strMap6 = null; // flaky: janitorEmailNotifier5.getInvalidEmailToResources();
// flaky:         janitorEmailNotifier5.sendEmail("us-west-1", "us-west-1", "us-west-1");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             janitorEmailNotifier5.sendNotifications();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Default email foo@bar.com is invalid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult getIdentityDkimAttributesResult5 = amazonSimpleEmailServiceClient1.getIdentityDkimAttributes(getIdentityDkimAttributesRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult5 = amazonSimpleEmailServiceClient1.sendEmail(sendEmailRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentitiesResult listIdentitiesResult2 = amazonSimpleEmailServiceClient1.listIdentities();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: b518b6ab-0d43-4c51-be8f-d3ff8a1cdbfa)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder6 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor7 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        java.lang.String str8 = null; // flaky: eBSSnapshotJanitor7.getRegion();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder6);
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorContext0.calendar();
        java.lang.String str2 = basicJanitorContext0.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorContext0.recorder;
        org.junit.Assert.assertNull(monkeyCalendar1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(monkeyRecorder3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest1 = null;
        com.amazonaws.ResponseMetadata responseMetadata2 = amazonSimpleEmailServiceClient0.getCachedResponseMetadata(amazonWebServiceRequest1);
        java.net.URI uRI3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.auth.Signer signer4 = amazonSimpleEmailServiceClient0.getSignerByURI(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(responseMetadata2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler2 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor3 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        com.netflix.simianarmy.client.edda.EddaClient eddaClient4 = null; // flaky: basicJanitorMonkeyContext0.createEddaClient();
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor1);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler2);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor3);
// flaky:         org.junit.Assert.assertNotNull(eddaClient4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray12 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (byte) 1;
        java.lang.String str17 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         basicJanitorMonkeyContext0.ownerEmailDomain = "hi!";
// flaky:         basicJanitorMonkeyContext0.ownerEmailDomain = "";
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(strArray12);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext6.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient10 = null; // flaky: basicJanitorMonkeyContext6.sesClient;
// flaky:         amazonSimpleEmailServiceClient10.setSignerRegionOverride("");
// flaky:         amazonSimpleEmailServiceClient10.shutdown();
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector14 = null; // flaky: amazonSimpleEmailServiceClient10.getRequestMetricsCollector();
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient10;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient10);
        org.junit.Assert.assertNull(requestMetricCollector14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray12 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray12;
        java.lang.String str15 = null; // flaky: basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null; // flaky: basicJanitorMonkeyContext19.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null; // flaky: basicJanitorMonkeyContext21.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext21.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context25 = null; // flaky: basicJanitorMonkeyContext21.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null; // flaky: basicJanitorMonkeyContext21.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext27 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = null; // flaky: basicJanitorMonkeyContext27.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext27.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor31 = null; // flaky: basicJanitorMonkeyContext27.getLaunchConfigJanitor();
        java.lang.String str32 = null; // flaky: basicJanitorMonkeyContext27.monkeyRegion;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration33 = null; // flaky: basicJanitorMonkeyContext27.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder34 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext35 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine17, janitorCrawler18, janitorResourceTracker20, monkeyCalendar26, monkeyConfiguration33, monkeyRecorder34);
// flaky:         basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar26;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(strArray12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker20);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker22);
// flaky:         org.junit.Assert.assertNotNull(context25);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar26);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker28);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "us-west-1" + "'", str32, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration33);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray9 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null; // flaky: basicJanitorMonkeyContext15.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext17 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null; // flaky: basicJanitorMonkeyContext17.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext17.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null; // flaky: basicJanitorMonkeyContext17.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null; // flaky: basicJanitorMonkeyContext22.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext22.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor26 = null; // flaky: basicJanitorMonkeyContext22.getLaunchConfigJanitor();
        java.lang.String str27 = null; // flaky: basicJanitorMonkeyContext22.monkeyRegion;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext22.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder29 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine13, janitorCrawler14, janitorResourceTracker16, monkeyCalendar21, monkeyConfiguration28, monkeyRecorder29);
        basicJanitorContext30.region = "us-west-1";
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor33 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient11, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient11);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker18);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar21);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker23);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "us-west-1" + "'", str27, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration28);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray9 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext12.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient11, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient11);
        org.junit.Assert.assertNull(janitorRuleEngine13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray9 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor11 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine8;
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient4.setSignerRegionOverride("");
// flaky:         amazonSimpleEmailServiceClient4.shutdown();
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector8 = null; // flaky: amazonSimpleEmailServiceClient4.getRequestMetricsCollector();
        com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult getIdentityVerificationAttributesResult10 = amazonSimpleEmailServiceClient4.getIdentityVerificationAttributes(getIdentityVerificationAttributesRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
        org.junit.Assert.assertNull(requestMetricCollector8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray12 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (byte) 1;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext17 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null; // flaky: basicJanitorMonkeyContext17.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext17.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor21 = null; // flaky: basicJanitorMonkeyContext17.getLaunchConfigJanitor();
        java.lang.String str22 = null; // flaky: basicJanitorMonkeyContext17.monkeyRegion;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null; // flaky: basicJanitorMonkeyContext17.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = null; // flaky: basicJanitorMonkeyContext24.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext24.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null; // flaky: basicJanitorMonkeyContext24.monkeyCalendar;
// flaky:         basicJanitorMonkeyContext17.monkeyCalendar = monkeyCalendar28;
// flaky:         basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar28;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(strArray12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker18);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "us-west-1" + "'", str22, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration23);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker25);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar28);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient4.setSignerRegionOverride("");
// flaky:         amazonSimpleEmailServiceClient4.shutdown();
// flaky:         amazonSimpleEmailServiceClient4.setEndpoint("us-west-1");
        com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult11 = amazonSimpleEmailServiceClient4.listVerifiedEmailAddresses(listVerifiedEmailAddressesRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient4.setSignerRegionOverride("");
// flaky:         amazonSimpleEmailServiceClient4.shutdown();
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector8 = null; // flaky: amazonSimpleEmailServiceClient4.getRequestMetricsCollector();
        com.amazonaws.regions.Region region9 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             amazonSimpleEmailServiceClient4.setRegion(region9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
        org.junit.Assert.assertNull(requestMetricCollector8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.setEndpoint("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Expected authority at index 8: https://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        java.lang.String str4 = amazonSimpleEmailServiceClient1.getServiceName();
        com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest verifyEmailIdentityRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult verifyEmailIdentityResult6 = amazonSimpleEmailServiceClient1.verifyEmailIdentity(verifyEmailIdentityRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "email" + "'", str4, "email");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList7);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient4.deleteVerifiedEmailAddress(deleteVerifiedEmailAddressRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "";
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.GetSendQuotaRequest getSendQuotaRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult6 = amazonSimpleEmailServiceClient4.getSendQuota(getSendQuotaRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest1 = null;
        com.amazonaws.ResponseMetadata responseMetadata2 = amazonSimpleEmailServiceClient0.getCachedResponseMetadata(amazonWebServiceRequest1);
        com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest verifyEmailAddressRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.verifyEmailAddress(verifyEmailAddressRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(responseMetadata2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.CloudClient cloudClient8 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList7);
// flaky:         org.junit.Assert.assertNotNull(cloudClient8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray12 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "hi!");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null; // flaky: basicJanitorMonkeyContext21.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null; // flaky: basicJanitorMonkeyContext23.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext23.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = null; // flaky: basicJanitorMonkeyContext23.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker29 = null; // flaky: basicJanitorMonkeyContext28.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext28.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor32 = null; // flaky: basicJanitorMonkeyContext28.getLaunchConfigJanitor();
        java.lang.String str33 = null; // flaky: basicJanitorMonkeyContext28.monkeyRegion;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration34 = null; // flaky: basicJanitorMonkeyContext28.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder35 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext36 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine19, janitorCrawler20, janitorResourceTracker22, monkeyCalendar27, monkeyConfiguration34, monkeyRecorder35);
// flaky:         basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar27;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(strArray12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker22);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker24);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar27);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker29);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "us-west-1" + "'", str33, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration34);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray9 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor13 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.amazonaws.ClientConfiguration clientConfiguration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(clientConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorContext0.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine3;
        org.junit.Assert.assertNull(janitorResourceTracker1);
        org.junit.Assert.assertNull(monkeyConfiguration2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient4.setSignerRegionOverride("");
        com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verifyDomainIdentityRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult verifyDomainIdentityResult8 = amazonSimpleEmailServiceClient4.verifyDomainIdentity(verifyDomainIdentityRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             launchConfigJanitor4.cleanupResources();
// flaky:             org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: The AWS Access Key Id you provided does not exist in our records. (Service: AmazonSimpleDB; Status Code: 403; Error Code: InvalidClientTokenId; Request ID: 937ec8dc-0ed8-ac2d-c96c-5bceb1dfb556)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "";
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient4.setServiceNameIntern("hi!");
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient4.setSignerRegionOverride("");
// flaky:         amazonSimpleEmailServiceClient4.shutdown();
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector8 = null; // flaky: amazonSimpleEmailServiceClient4.getRequestMetricsCollector();
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult10 = amazonSimpleEmailServiceClient4.sendEmail(sendEmailRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
        org.junit.Assert.assertNull(requestMetricCollector8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "";
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult getIdentityNotificationAttributesResult6 = amazonSimpleEmailServiceClient4.getIdentityNotificationAttributes(getIdentityNotificationAttributesRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        amazonSimpleEmailServiceClient1.setSignerRegionOverride("hi!");
        java.lang.String str6 = amazonSimpleEmailServiceClient1.getServiceName();
        com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest verifyEmailAddressRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient1.verifyEmailAddress(verifyEmailAddressRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "email" + "'", str6, "email");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder6 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList1 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null; // flaky: basicJanitorMonkeyContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList1);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest1 = null;
        com.amazonaws.ResponseMetadata responseMetadata2 = amazonSimpleEmailServiceClient0.getCachedResponseMetadata(amazonWebServiceRequest1);
        com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult getIdentityNotificationAttributesResult4 = amazonSimpleEmailServiceClient0.getIdentityNotificationAttributes(getIdentityNotificationAttributesRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(responseMetadata2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient4.setSignerRegionOverride("");
// flaky:         amazonSimpleEmailServiceClient4.shutdown();
// flaky:         amazonSimpleEmailServiceClient4.setEndpoint("us-west-1");
        com.amazonaws.regions.Region region10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             amazonSimpleEmailServiceClient4.setRegion(region10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray9 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.AbstractJanitor.Context context12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor13 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient11, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray9 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext12.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext12.configuration();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor15 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient11, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient11);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorContext0.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        basicJanitorContext0.crawler = janitorCrawler2;
        java.lang.Class<?> wildcardClass4 = basicJanitorContext0.getClass();
        org.junit.Assert.assertNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        java.util.Map<java.lang.String, java.util.Collection<com.netflix.simianarmy.Resource>> strMap6 = null; // flaky: janitorEmailNotifier5.getInvalidEmailToResources();
        java.util.Map<java.lang.String, java.util.Collection<com.netflix.simianarmy.Resource>> strMap7 = null; // flaky: janitorEmailNotifier5.getInvalidEmailToResources();
        java.lang.String str9 = null; // flaky: janitorEmailNotifier5.buildEmailSubject("hi!");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(strMap6);
// flaky:         org.junit.Assert.assertNotNull(strMap7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Janitor Monkey Notification for hi!" + "'", str9, "Janitor Monkey Notification for hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "";
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult setIdentityNotificationTopicResult6 = amazonSimpleEmailServiceClient4.setIdentityNotificationTopic(setIdentityNotificationTopicRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        java.lang.String[] strArray9 = null; // flaky: janitorEmailNotifier7.getCcAddresses("Janitor Monkey Notification for hi!");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor1 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "";
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.DeleteIdentityRequest deleteIdentityRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.DeleteIdentityResult deleteIdentityResult6 = amazonSimpleEmailServiceClient4.deleteIdentity(deleteIdentityRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.ownerEmailDomain = "";
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_3 = null;
        amazonSimpleEmailServiceClient0.addRequestHandler(requestHandler2_3);
        java.lang.String str5 = amazonSimpleEmailServiceClient0.getServiceName();
        com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult getIdentityNotificationAttributesResult7 = amazonSimpleEmailServiceClient0.getIdentityNotificationAttributes(getIdentityNotificationAttributesRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email" + "'", str5, "email");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient6 = null; // flaky: amazonSimpleEmailServiceClient4.withTimeOffset(100);
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult8 = amazonSimpleEmailServiceClient4.sendEmail(sendEmailRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
// flaky:         org.junit.Assert.assertNotNull(amazonWebServiceClient6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList1 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = basicJanitorContext0.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorContext0.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorRuleEngine1);
        org.junit.Assert.assertNull(janitorResourceTracker2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection6 = null; // flaky: instanceJanitor5.getCleanedResources();
        java.lang.String str7 = null; // flaky: instanceJanitor5.getRegion();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection8 = null; // flaky: instanceJanitor5.getCleanedResources();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection9 = null; // flaky: instanceJanitor5.getCleanedResources();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor5);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(resourceCollection8);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest getSendStatisticsRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult6 = amazonSimpleEmailServiceClient4.getSendStatistics(getSendStatisticsRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = null; // flaky: basicJanitorMonkeyContext6.janitors();
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList7;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker7;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient9 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult10 = null; // flaky: amazonSimpleEmailServiceClient9.listVerifiedEmailAddresses();
// flaky:             org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: The security token included in the request is invalid. (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: InvalidClientTokenId; Request ID: 96a28b74-ff52-4c95-99a7-7a3196eff8dc)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0);
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentitiesResult listIdentitiesResult2 = amazonSimpleEmailServiceClient1.listIdentities();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker7;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null; // flaky: basicJanitorMonkeyContext9.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext9.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context13 = null; // flaky: basicJanitorMonkeyContext9.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null; // flaky: basicJanitorMonkeyContext9.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null; // flaky: basicJanitorMonkeyContext15.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext9.janitorResourceTracker = janitorResourceTracker16;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker16;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker10);
// flaky:         org.junit.Assert.assertNotNull(context13);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar14);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker16);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0);
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult3 = amazonSimpleEmailServiceClient1.sendEmail(sendEmailRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler3 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList1 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar2 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.ImageJanitor imageJanitor3 = basicJanitorMonkeyContext0.getImageJanitor();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Image Janitor only works when Edda is enabled.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList1);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        amazonSimpleEmailServiceClient1.setSignerRegionOverride("hi!");
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest6 = null;
        com.amazonaws.ResponseMetadata responseMetadata7 = amazonSimpleEmailServiceClient1.getCachedResponseMetadata(amazonWebServiceRequest6);
        com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest verifyDomainDkimRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult verifyDomainDkimResult9 = amazonSimpleEmailServiceClient1.verifyDomainDkim(verifyDomainDkimRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(responseMetadata7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        com.amazonaws.regions.Region region4 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient1.setRegion(region4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_3 = null;
        amazonSimpleEmailServiceClient0.addRequestHandler(requestHandler2_3);
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult6 = amazonSimpleEmailServiceClient0.sendEmail(sendEmailRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_4);
        com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verifyDomainIdentityRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult verifyDomainIdentityResult7 = amazonSimpleEmailServiceClient1.verifyDomainIdentity(verifyDomainIdentityRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker7;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient9 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient9.setTimeOffset(1);
// flaky:         amazonSimpleEmailServiceClient9.setSignerRegionOverride("Janitor Monkey Notification for hi!");
        com.amazonaws.handlers.RequestHandler2 requestHandler2_14 = null;
// flaky:         amazonSimpleEmailServiceClient9.addRequestHandler(requestHandler2_14);
// flaky:         amazonSimpleEmailServiceClient9.shutdown();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker7;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient9 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient9.setTimeOffset(1);
// flaky:         amazonSimpleEmailServiceClient9.setSignerRegionOverride("Janitor Monkey Notification for hi!");
        java.lang.String str14 = null; // flaky: amazonSimpleEmailServiceClient9.getSignerRegionOverride();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Janitor Monkey Notification for hi!" + "'", str14, "Janitor Monkey Notification for hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient4);
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection6 = null; // flaky: instanceJanitor5.getCleanedResources();
        java.lang.String str7 = null; // flaky: instanceJanitor5.getRegion();
        java.lang.String str8 = null; // flaky: instanceJanitor5.getRegion();
        com.netflix.simianarmy.ResourceType resourceType9 = null; // flaky: instanceJanitor5.getResourceType();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor5);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us-west-1" + "'", str7, "us-west-1");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
// flaky:         org.junit.Assert.assertTrue("'" + resourceType9 + "' != '" + com.netflix.simianarmy.aws.AWSResourceType.INSTANCE + "'", resourceType9.equals(com.netflix.simianarmy.aws.AWSResourceType.INSTANCE));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_4);
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult6 = amazonSimpleEmailServiceClient1.getSendQuota();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: 244e7dd6-9b30-4fba-bfe9-0fa57ee25487)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray12 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray12;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient15 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(strArray12);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList7 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: basicJanitorMonkeyContext0.getPropertySet("");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList7);
// flaky:         org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray12 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "hi!");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient18 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(strArray12);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient18);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration1 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = basicJanitorContext0.config;
        org.junit.Assert.assertNull(monkeyConfiguration1);
        org.junit.Assert.assertNull(monkeyConfiguration2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker7;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient9 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient9.setTimeOffset(1);
// flaky:         amazonSimpleEmailServiceClient9.setSignerRegionOverride("Janitor Monkey Notification for hi!");
// flaky:         amazonSimpleEmailServiceClient9.setServiceNameIntern("Janitor Monkey Notification for hi!");
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult17 = amazonSimpleEmailServiceClient9.sendEmail(sendEmailRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder6 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor7 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
// flaky:         basicJanitorMonkeyContext0.exportCredentials("", "Janitor Monkey Notification for hi!");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder6);
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder6 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor7 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: basicJanitorMonkeyContext0.getPropertySet("us-west-1");
        java.util.Set<java.lang.String> strSet11 = null; // flaky: basicJanitorMonkeyContext0.getPropertySet("Janitor Monkey Notification for hi!");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder6);
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor7);
// flaky:         org.junit.Assert.assertNotNull(strSet9);
// flaky:         org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext10 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null; // flaky: basicJanitorMonkeyContext10.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null; // flaky: basicJanitorMonkeyContext12.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext12.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context16 = null; // flaky: basicJanitorMonkeyContext12.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null; // flaky: basicJanitorMonkeyContext12.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = null; // flaky: basicJanitorMonkeyContext18.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext18.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor22 = null; // flaky: basicJanitorMonkeyContext18.getLaunchConfigJanitor();
        java.lang.String str23 = null; // flaky: basicJanitorMonkeyContext18.monkeyRegion;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null; // flaky: basicJanitorMonkeyContext18.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker11, monkeyCalendar17, monkeyConfiguration24, monkeyRecorder25);
// flaky:         basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar17;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration6);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker11);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker13);
// flaky:         org.junit.Assert.assertNotNull(context16);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar17);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker19);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "us-west-1" + "'", str23, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration24);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker28);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabledResult3 = amazonSimpleEmailServiceClient1.setIdentityFeedbackForwardingEnabled(setIdentityFeedbackForwardingEnabledRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray9 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext18 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = null; // flaky: basicJanitorMonkeyContext18.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext20 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null; // flaky: basicJanitorMonkeyContext20.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext20.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext20.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null; // flaky: basicJanitorMonkeyContext25.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext25.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor29 = null; // flaky: basicJanitorMonkeyContext25.getLaunchConfigJanitor();
        java.lang.String str30 = null; // flaky: basicJanitorMonkeyContext25.monkeyRegion;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration31 = null; // flaky: basicJanitorMonkeyContext25.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext33 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine16, janitorCrawler17, janitorResourceTracker19, monkeyCalendar24, monkeyConfiguration31, monkeyRecorder32);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext34 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker35 = null; // flaky: basicJanitorMonkeyContext34.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext34.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar38 = null; // flaky: basicJanitorMonkeyContext34.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker40 = null; // flaky: basicJanitorMonkeyContext39.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext39.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor43 = null; // flaky: basicJanitorMonkeyContext39.getLaunchConfigJanitor();
        java.lang.String str44 = null; // flaky: basicJanitorMonkeyContext39.monkeyRegion;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration45 = null; // flaky: basicJanitorMonkeyContext39.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder46 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext47 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine13, janitorCrawler14, janitorResourceTracker19, monkeyCalendar38, monkeyConfiguration45, monkeyRecorder46);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor48 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient11, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient11);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker19);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker21);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker26);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "us-west-1" + "'", str30, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration31);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker35);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar38);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker40);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "us-west-1" + "'", str44, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration45);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier8 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context4);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray9 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray9;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient11 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext12 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext12.configuration();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient11, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient11);
        org.junit.Assert.assertNull(monkeyConfiguration13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorContext0.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        basicJanitorContext0.crawler = janitorCrawler2;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = basicJanitorContext0.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = basicJanitorContext0.recorder;
        org.junit.Assert.assertNull(janitorResourceTracker1);
        org.junit.Assert.assertNull(monkeyRecorder4);
        org.junit.Assert.assertNull(monkeyRecorder5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult3 = amazonSimpleEmailServiceClient0.listVerifiedEmailAddresses();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorContext0.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        basicJanitorContext0.crawler = janitorCrawler2;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = basicJanitorContext0.calendar;
        org.junit.Assert.assertNull(janitorResourceTracker1);
        org.junit.Assert.assertNull(monkeyCalendar4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest verifyEmailIdentityRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult verifyEmailIdentityResult2 = amazonSimpleEmailServiceClient0.verifyEmailIdentity(verifyEmailIdentityRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors;
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0);
        com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult setIdentityNotificationTopicResult3 = amazonSimpleEmailServiceClient1.setIdentityNotificationTopic(setIdentityNotificationTopicRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor6 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        java.util.Set<java.lang.String> strSet8 = null; // flaky: basicJanitorMonkeyContext0.getPropertySet("email");
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor6);
// flaky:         org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = null; // flaky: basicJanitorMonkeyContext0.janitors;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context3 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.edda.EddaClient eddaClient4 = null; // flaky: basicJanitorMonkeyContext0.createEddaClient();
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList2);
// flaky:         org.junit.Assert.assertNotNull(context3);
// flaky:         org.junit.Assert.assertNotNull(eddaClient4);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context4 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null; // flaky: basicJanitorMonkeyContext0.monkeyCalendar;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null; // flaky: basicJanitorMonkeyContext6.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker7;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient9 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
// flaky:         amazonSimpleEmailServiceClient9.setTimeOffset(1);
        com.amazonaws.services.simpleemail.model.SendRawEmailRequest sendRawEmailRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendRawEmailResult sendRawEmailResult13 = amazonSimpleEmailServiceClient9.sendRawEmail(sendRawEmailRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(context4);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar5);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker7);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.daysBeforeTermination = (short) 0;
        java.lang.String[] strArray12 = new java.lang.String[] { "us-west-1", "hi!", "hi!", "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray12;
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (byte) 1;
        java.lang.String str17 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         basicJanitorMonkeyContext0.ownerEmailDomain = "hi!";
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder20 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null; // flaky: basicJanitorMonkeyContext21.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext21.daysBeforeTermination = (short) 0;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context25 = null; // flaky: basicJanitorMonkeyContext21.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier26 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context25);
        java.util.Map<java.lang.String, java.util.Collection<com.netflix.simianarmy.Resource>> strMap27 = null; // flaky: janitorEmailNotifier26.getInvalidEmailToResources();
        java.util.Map<java.lang.String, java.util.Collection<com.netflix.simianarmy.Resource>> strMap28 = null; // flaky: janitorEmailNotifier26.getInvalidEmailToResources();
// flaky:         janitorEmailBuilder20.setEmailToResources(strMap28);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker4);
        org.junit.Assert.assertNotNull(strArray12);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder20);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker22);
// flaky:         org.junit.Assert.assertNotNull(context25);
// flaky:         org.junit.Assert.assertNotNull(strMap27);
// flaky:         org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_4);
        com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest verifyEmailAddressRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient1.verifyEmailAddress(verifyEmailAddressRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.slf4j.Logger logger0 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER = logger0;
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.services.simpleemail.model.ListIdentitiesRequest listIdentitiesRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentitiesResult listIdentitiesResult3 = amazonSimpleEmailServiceClient1.listIdentities(listIdentitiesRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        java.lang.String str4 = amazonSimpleEmailServiceClient1.getServiceName();
        com.amazonaws.handlers.RequestHandler requestHandler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient1.addRequestHandler(requestHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "email" + "'", str4, "email");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        java.lang.String str4 = amazonSimpleEmailServiceClient1.getServiceName();
        com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest getSendStatisticsRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult6 = amazonSimpleEmailServiceClient1.getSendStatistics(getSendStatisticsRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "email" + "'", str4, "email");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.ClientConfiguration clientConfiguration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.setConfiguration(clientConfiguration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_3 = null;
        amazonSimpleEmailServiceClient0.addRequestHandler(requestHandler2_3);
        java.lang.String str5 = amazonSimpleEmailServiceClient0.getServiceName();
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.setEndpoint("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Expected authority at index 8: https://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email" + "'", str5, "email");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = basicJanitorContext0.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null;
        basicJanitorContext0.recorder = monkeyRecorder2;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler4 = basicJanitorContext0.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = basicJanitorContext0.calendar;
        org.junit.Assert.assertNull(janitorRuleEngine1);
        org.junit.Assert.assertNull(janitorCrawler4);
        org.junit.Assert.assertNull(monkeyCalendar5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_3 = null;
        amazonSimpleEmailServiceClient0.addRequestHandler(requestHandler2_3);
        java.lang.String str5 = amazonSimpleEmailServiceClient0.getServiceName();
        com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult setIdentityDkimEnabledResult7 = amazonSimpleEmailServiceClient0.setIdentityDkimEnabled(setIdentityDkimEnabledRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email" + "'", str5, "email");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest getSendStatisticsRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult5 = amazonSimpleEmailServiceClient1.getSendStatistics(getSendStatisticsRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration1 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorContext0.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorContext0.calendar();
        org.junit.Assert.assertNull(monkeyConfiguration1);
        org.junit.Assert.assertNull(monkeyRecorder2);
        org.junit.Assert.assertNull(monkeyCalendar3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        amazonSimpleEmailServiceClient1.setSignerRegionOverride("hi!");
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest6 = null;
        com.amazonaws.ResponseMetadata responseMetadata7 = amazonSimpleEmailServiceClient1.getCachedResponseMetadata(amazonWebServiceRequest6);
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient1.setEndpoint("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(responseMetadata7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult4 = amazonSimpleEmailServiceClient1.listVerifiedEmailAddresses();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: 86b975cd-3c70-4759-ac44-6036b24fbea9)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest getSendStatisticsRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult4 = amazonSimpleEmailServiceClient0.getSendStatistics(getSendStatisticsRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        amazonSimpleEmailServiceClient1.setSignerRegionOverride("hi!");
        com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult setIdentityNotificationTopicResult7 = amazonSimpleEmailServiceClient1.setIdentityNotificationTopic(setIdentityNotificationTopicRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest1 = null;
        com.amazonaws.ResponseMetadata responseMetadata2 = amazonSimpleEmailServiceClient0.getCachedResponseMetadata(amazonWebServiceRequest1);
        com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.deleteVerifiedEmailAddress(deleteVerifiedEmailAddressRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(responseMetadata2);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        java.lang.String str4 = amazonSimpleEmailServiceClient1.getServiceName();
        java.lang.String str5 = amazonSimpleEmailServiceClient1.getServiceName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "email" + "'", str4, "email");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email" + "'", str5, "email");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext1 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorContext1.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = basicJanitorContext1.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor4 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorResourceTracker2);
        org.junit.Assert.assertNull(janitorRuleEngine3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(janitorRuleEngine8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorContext0.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        basicJanitorContext0.crawler = janitorCrawler2;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = basicJanitorContext0.janitorRuleEngine();
        org.junit.Assert.assertNull(janitorResourceTracker1);
        org.junit.Assert.assertNull(janitorRuleEngine4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar;
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyCalendar9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorContext0.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        basicJanitorContext0.crawler = janitorCrawler2;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = null;
        basicJanitorContext0.recorder = monkeyRecorder4;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = basicJanitorContext0.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker1);
        org.junit.Assert.assertNull(monkeyRecorder6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest verifyEmailIdentityRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult verifyEmailIdentityResult5 = amazonSimpleEmailServiceClient1.verifyEmailIdentity(verifyEmailIdentityRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest1 = null;
        com.amazonaws.ResponseMetadata responseMetadata2 = amazonSimpleEmailServiceClient0.getCachedResponseMetadata(amazonWebServiceRequest1);
        java.lang.String str3 = amazonSimpleEmailServiceClient0.getServiceName();
        org.junit.Assert.assertNull(responseMetadata2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "email" + "'", str3, "email");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration1 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null;
        basicJanitorContext0.recorder = monkeyRecorder2;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine4;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        basicJanitorContext0.crawler = janitorCrawler6;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = basicJanitorContext0.recorder();
        org.junit.Assert.assertNull(monkeyConfiguration1);
        org.junit.Assert.assertNull(monkeyRecorder8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_3 = null;
        amazonSimpleEmailServiceClient0.addRequestHandler(requestHandler2_3);
        java.lang.String str5 = amazonSimpleEmailServiceClient0.getServiceName();
        com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult7 = amazonSimpleEmailServiceClient0.listVerifiedEmailAddresses(listVerifiedEmailAddressesRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email" + "'", str5, "email");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0);
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult2 = amazonSimpleEmailServiceClient1.listVerifiedEmailAddresses();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        amazonSimpleEmailServiceClient0.setTimeOffset((int) (short) 100);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_3 = null;
        amazonSimpleEmailServiceClient0.addRequestHandler(requestHandler2_3);
        java.lang.String str5 = amazonSimpleEmailServiceClient0.getServiceName();
        com.amazonaws.handlers.RequestHandler requestHandler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.removeRequestHandler(requestHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email" + "'", str5, "email");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorContext0.calendar();
        java.lang.String str2 = basicJanitorContext0.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorContext0.recorder();
        org.junit.Assert.assertNull(monkeyCalendar1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(monkeyRecorder3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_2 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_2);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler2_4);
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult7 = amazonSimpleEmailServiceClient1.sendEmail(sendEmailRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker1 = basicJanitorContext0.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        basicJanitorContext0.crawler = janitorCrawler2;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = null;
        basicJanitorContext0.crawler = janitorCrawler5;
        org.junit.Assert.assertNull(janitorResourceTracker1);
        org.junit.Assert.assertNull(monkeyConfiguration4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorContext0.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine2;
        org.junit.Assert.assertNull(monkeyCalendar1);
    }
}
