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
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0, clientConfiguration1);
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray3;
        java.lang.Class<?> wildcardClass5 = basicJanitorMonkeyContext0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext1 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        basicJanitorContext1.ruleEngine = janitorRuleEngine2;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder4 = basicJanitorContext1.recorder();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyRecorder4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler4 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine3, janitorCrawler4, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = basicJanitorContext9.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor11 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient1);
        org.junit.Assert.assertNull(janitorRuleEngine10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext2 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        basicJanitorContext2.ruleEngine = janitorRuleEngine3;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult2 = amazonSimpleEmailServiceClient1.getSendQuota();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: 378cc5ba-eb34-46bf-8b17-1c21079443d0)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.regions.Regions regions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient1.configureRegion(regions2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        java.lang.String str3 = basicJanitorMonkeyContext0.monkeyRegion;
        java.lang.String str4 = basicJanitorMonkeyContext0.ownerEmailDomain;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest verifyDomainDkimRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult verifyDomainDkimResult3 = amazonSimpleEmailServiceClient1.verifyDomainDkim(verifyDomainDkimRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest verifyEmailIdentityRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult verifyEmailIdentityResult3 = amazonSimpleEmailServiceClient1.verifyEmailIdentity(verifyEmailIdentityRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler requestHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient1.removeRequestHandler(requestHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.GetSendQuotaRequest getSendQuotaRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult5 = amazonSimpleEmailServiceClient1.getSendQuota(getSendQuotaRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult4 = amazonSimpleEmailServiceClient1.getSendStatistics();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: c905b407-7861-4805-8e67-f0c84eeaff45)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult5 = amazonSimpleEmailServiceClient1.sendEmail(sendEmailRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        com.amazonaws.regions.Regions regions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient7 = amazonWebServiceClient3.withRegion(regions6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult5 = amazonSimpleEmailServiceClient1.listVerifiedEmailAddresses(listVerifiedEmailAddressesRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        com.amazonaws.handlers.RequestHandler requestHandler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.removeRequestHandler(requestHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.ListIdentitiesRequest listIdentitiesRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentitiesResult listIdentitiesResult5 = amazonSimpleEmailServiceClient1.listIdentities(listIdentitiesRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.regions.Regions regions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.configureRegion(regions4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler5 = basicJanitorMonkeyContext0.scheduler();
        java.lang.String[] strArray6 = new java.lang.String[] {};
        basicJanitorMonkeyContext0.ccEmails = strArray6;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(monkeyScheduler5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentitiesResult listIdentitiesResult4 = amazonSimpleEmailServiceClient1.listIdentities();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: 107df53c-efc3-4307-be55-3218821f544b)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str2 = basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor3 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str4 = basicJanitorMonkeyContext0.monkeyRegion;
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(launchConfigJanitor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us-west-1" + "'", str4, "us-west-1");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext2 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        basicJanitorContext2.ruleEngine = janitorRuleEngine3;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = basicJanitorContext2.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = basicJanitorMonkeyContext6.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorMonkeyContext6.configuration();
        basicJanitorContext2.config = monkeyConfiguration8;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor10 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient1);
        org.junit.Assert.assertNull(monkeyRecorder5);
        org.junit.Assert.assertNotNull(aWSClient7);
        org.junit.Assert.assertNotNull(monkeyConfiguration8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext2 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = null;
        basicJanitorContext2.recorder = monkeyRecorder3;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        amazonSimpleEmailServiceClient1.setTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult getIdentityDkimAttributesResult9 = amazonSimpleEmailServiceClient1.getIdentityDkimAttributes(getIdentityDkimAttributesRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.regions.Region region6 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.setRegion(region6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor3 = basicJanitorMonkeyContext0.getInstanceJanitor();
        // The following exception was thrown during execution in test generation
        try {
            instanceJanitor3.cleanupResources();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(monkeyConfiguration2);
        org.junit.Assert.assertNotNull(instanceJanitor3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.slf4j.Logger logger0 = com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER = logger0;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        java.util.Set<java.lang.String> strSet6 = basicJanitorMonkeyContext0.getEnabledResourceSet();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(janitorEmailBuilder5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        janitorEmailNotifier3.sendEmail("us-west-1", "", "");
        // The following exception was thrown during execution in test generation
        try {
            janitorEmailNotifier3.sendNotifications();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Default email foo@bar.com is invalid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
        org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine1;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        basicJanitorContext0.crawler = janitorCrawler3;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = basicJanitorContext0.ruleEngine;
        org.junit.Assert.assertNull(janitorRuleEngine5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest getIdentityPoliciesRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult getIdentityPoliciesResult2 = amazonSimpleEmailServiceClient0.getIdentityPolicies(getIdentityPoliciesRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.monkeyRegion;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult setIdentityNotificationTopicResult4 = amazonSimpleEmailServiceClient2.setIdentityNotificationTopic(setIdentityNotificationTopicRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        // The following exception was thrown during execution in test generation
        try {
            janitorEmailNotifier1.sendNotifications();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Default email foo@bar.com is invalid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        basicJanitorMonkeyContext0.monkeyRegion = "hi!";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(janitorEmailBuilder5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler requestHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.removeRequestHandler(requestHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector2 = amazonSimpleEmailServiceClient1.getRequestMetricsCollector();
        com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest putIdentityPolicyRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult putIdentityPolicyResult4 = amazonSimpleEmailServiceClient1.putIdentityPolicy(putIdentityPolicyRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(requestMetricCollector2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        amazonWebServiceClient3.setEndpoint("us-west-1");
        com.amazonaws.handlers.RequestHandler requestHandler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.removeRequestHandler(requestHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor6 = basicJanitorMonkeyContext0.getASGJanitor();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext0.monkeyCalendar;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(janitorEmailBuilder5);
        org.junit.Assert.assertNotNull(aSGJanitor6);
        org.junit.Assert.assertNotNull(monkeyCalendar7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str2 = basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor3 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        // The following exception was thrown during execution in test generation
        try {
            launchConfigJanitor3.markResources();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(launchConfigJanitor3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str2 = basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor3 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection4 = launchConfigJanitor3.getCleanedResources();
        com.netflix.simianarmy.ResourceType resourceType5 = launchConfigJanitor3.getResourceType();
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(launchConfigJanitor3);
        org.junit.Assert.assertNotNull(resourceCollection4);
        org.junit.Assert.assertTrue("'" + resourceType5 + "' != '" + com.netflix.simianarmy.aws.AWSResourceType.LAUNCH_CONFIG + "'", resourceType5.equals(com.netflix.simianarmy.aws.AWSResourceType.LAUNCH_CONFIG));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str2 = basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor3 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = basicJanitorMonkeyContext0.sourceEmail;
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(launchConfigJanitor3);
        org.junit.Assert.assertNotNull(launchConfigJanitor4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult listVerifiedEmailAddressesResult1 = amazonSimpleEmailServiceClient0.listVerifiedEmailAddresses();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext1 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext1.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext1.configuration();
        basicJanitorContext0.config = monkeyConfiguration3;
        java.lang.Class<?> wildcardClass5 = monkeyConfiguration3.getClass();
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        boolean boolean0 = com.amazonaws.AmazonWebServiceClient.LOGGING_AWS_REQUEST_METRIC;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext8.emailNotifier();
        basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier20 = basicJanitorMonkeyContext19.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorMonkeyContext19.configuration();
        basicJanitorContext18.config = monkeyConfiguration21;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext23 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext23.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorMonkeyContext23.calendar();
        basicJanitorContext18.calendar = monkeyCalendar26;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor28 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient17, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(janitorEmailBuilder5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(aWSClient17);
        org.junit.Assert.assertNotNull(janitorEmailNotifier20);
        org.junit.Assert.assertNotNull(monkeyConfiguration21);
        org.junit.Assert.assertNotNull(monkeyCalendar26);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler4 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext9 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine3, janitorCrawler4, janitorResourceTracker5, monkeyCalendar6, monkeyConfiguration7, monkeyRecorder8);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext9.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine11 = basicJanitorContext9.ruleEngine;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor12 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aWSClient1);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertNull(janitorRuleEngine11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_6 = null;
        amazonWebServiceClient3.removeRequestHandler(requestHandler2_6);
        java.lang.String str8 = amazonWebServiceClient3.getSignerRegionOverride();
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient1.setEndpoint("Janitor Monkey Notification for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Illegal character in authority at index 8: https://Janitor Monkey Notification for hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult6 = amazonSimpleEmailServiceClient1.getSendQuota();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: 915dade5-8db4-4c21-ac0e-d2e7a325f498)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.regions.Region region4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient5 = amazonSimpleEmailServiceClient1.withRegion(region4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        org.junit.Assert.assertNull(janitorRuleEngine8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        amazonWebServiceClient3.setEndpoint("us-west-1");
        com.amazonaws.handlers.RequestHandler2 requestHandler2_8 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_8);
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.MonkeyRecorder.Event event4 = null;
        basicJanitorMonkeyContext0.reportEvent(event4);
        basicJanitorMonkeyContext0.sourceEmail = "hi!";
        org.junit.Assert.assertNotNull(abstractJanitorList3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.monkeyRegion;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = basicJanitorMonkeyContext0.sesClient;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult3 = amazonSimpleEmailServiceClient2.getSendQuota();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine1;
        basicJanitorContext0.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = basicJanitorContext0.janitorRuleEngine();
        org.junit.Assert.assertNull(janitorRuleEngine5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector6 = amazonWebServiceClient3.getRequestMetricsCollector();
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertNull(requestMetricCollector6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "email";
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector2 = amazonSimpleEmailServiceClient1.getRequestMetricsCollector();
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult3 = amazonSimpleEmailServiceClient1.getSendQuota();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: 3f11e94a-d432-49e9-b670-2d1c04d61bf4)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(requestMetricCollector2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        janitorEmailNotifier5.sendEmail("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
        org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        amazonWebServiceClient3.setEndpoint("us-west-1");
        com.amazonaws.regions.Region region8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient9 = amazonWebServiceClient3.withRegion(region8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0);
        com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest verifyDomainDkimRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult verifyDomainDkimResult3 = amazonSimpleEmailServiceClient1.verifyDomainDkim(verifyDomainDkimRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine1;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler4 = null;
        basicJanitorContext0.crawler = janitorCrawler4;
        org.junit.Assert.assertNull(monkeyRecorder3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        com.amazonaws.services.simpleemail.model.DeleteIdentityRequest deleteIdentityRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.DeleteIdentityResult deleteIdentityResult7 = amazonSimpleEmailServiceClient1.deleteIdentity(deleteIdentityRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.monkeyRegion;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.regions.Regions regions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient4 = amazonSimpleEmailServiceClient2.withRegion(regions3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentitiesResult listIdentitiesResult1 = amazonSimpleEmailServiceClient0.listIdentities();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest putIdentityPolicyRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult putIdentityPolicyResult5 = amazonSimpleEmailServiceClient1.putIdentityPolicy(putIdentityPolicyRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        com.amazonaws.services.simpleemail.model.ListIdentitiesRequest listIdentitiesRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentitiesResult listIdentitiesResult7 = amazonSimpleEmailServiceClient1.listIdentities(listIdentitiesRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient7 = amazonWebServiceClient3.withTimeOffset((int) (short) -1);
        com.amazonaws.regions.Regions regions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.configureRegion(regions8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertNotNull(amazonWebServiceClient7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        amazonSimpleEmailServiceClient1.setTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest putIdentityPolicyRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult putIdentityPolicyResult9 = amazonSimpleEmailServiceClient1.putIdentityPolicy(putIdentityPolicyRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext11.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext11.ruleEngine;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient3, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertNotNull(aWSClient3);
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(janitorRuleEngine13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = basicJanitorMonkeyContext8.emailNotifier();
        basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient12 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext13 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient12, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(janitorEmailBuilder5);
        org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(aWSClient12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest listIdentityPoliciesRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult listIdentityPoliciesResult5 = amazonSimpleEmailServiceClient1.listIdentityPolicies(listIdentityPoliciesRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.client.edda.EddaClient eddaClient4 = basicJanitorMonkeyContext0.createEddaClient();
        org.junit.Assert.assertNotNull(monkeyCalendar3);
        org.junit.Assert.assertNotNull(eddaClient4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_6 = null;
        amazonWebServiceClient3.removeRequestHandler(requestHandler2_6);
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector8 = amazonWebServiceClient3.getRequestMetricsCollector();
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertNull(requestMetricCollector8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.handlers.RequestHandler requestHandler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.removeRequestHandler(requestHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.edda.EddaClient eddaClient1 = basicJanitorMonkeyContext0.createEddaClient();
        org.junit.Assert.assertNotNull(eddaClient1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        amazonSimpleEmailServiceClient1.setTimeOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult8 = amazonSimpleEmailServiceClient1.getSendQuota();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: Missing Authentication Token (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: MissingAuthenticationToken; Request ID: 2f104080-97ff-4cc4-bd60-e293ee02fb5c)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0);
        com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult getIdentityDkimAttributesResult3 = amazonSimpleEmailServiceClient1.getIdentityDkimAttributes(getIdentityDkimAttributesRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker9;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar;
        org.junit.Assert.assertNull(janitorRuleEngine8);
        org.junit.Assert.assertNull(monkeyCalendar11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider0);
        com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest verifyEmailAddressRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient1.verifyEmailAddress(verifyEmailAddressRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder1 = null;
        basicJanitorContext0.recorder = monkeyRecorder1;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorContext0.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration4 = basicJanitorContext0.config;
        org.junit.Assert.assertNull(monkeyCalendar3);
        org.junit.Assert.assertNull(monkeyConfiguration4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.monkeyRegion;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verifyDomainIdentityRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult verifyDomainIdentityResult4 = amazonSimpleEmailServiceClient2.verifyDomainIdentity(verifyDomainIdentityRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        basicJanitorMonkeyContext0.sourceEmail = "Janitor Monkey Notification for hi!";
        java.lang.String str5 = basicJanitorMonkeyContext0.region();
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(launchConfigJanitor2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = basicJanitorMonkeyContext0.configuration();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(janitorEmailBuilder5);
        org.junit.Assert.assertNotNull(monkeyConfiguration6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine1;
        basicJanitorContext0.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine5;
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        basicJanitorMonkeyContext0.sourceEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext5.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorMonkeyContext5.calendar();
        basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar8;
        java.lang.String str10 = basicJanitorMonkeyContext0.accountName();
        org.junit.Assert.assertNotNull(monkeyCalendar8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "default" + "'", str10, "default");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        basicJanitorMonkeyContext0.sourceEmail = "us-west-1";
        java.lang.String str5 = basicJanitorMonkeyContext0.region();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext1 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext1.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorMonkeyContext1.configuration();
        basicJanitorContext0.config = monkeyConfiguration3;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = basicJanitorContext0.resourceTracker;
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        org.junit.Assert.assertNotNull(monkeyConfiguration3);
        org.junit.Assert.assertNotNull(monkeyConfiguration5);
        org.junit.Assert.assertNull(janitorResourceTracker6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        java.lang.String str3 = basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
        org.junit.Assert.assertNotNull(monkeyCalendar4);
        org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
        org.junit.Assert.assertNotNull(context6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.setEndpoint("", "hi!", "Janitor Monkey Notification for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Expected authority at index 8: https://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient7 = amazonWebServiceClient3.withTimeOffset((int) (short) -1);
        amazonWebServiceClient3.setTimeOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.setEndpoint("Janitor Monkey Notification for hi!", "email", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Illegal character in authority at index 8: https://Janitor Monkey Notification for hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertNotNull(amazonWebServiceClient7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.monkeyRegion;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = basicJanitorMonkeyContext0.sesClient;
        com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest listIdentityPoliciesRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult listIdentityPoliciesResult4 = amazonSimpleEmailServiceClient2.listIdentityPolicies(listIdentityPoliciesRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
        org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult getIdentityDkimAttributesResult5 = amazonSimpleEmailServiceClient1.getIdentityDkimAttributes(getIdentityDkimAttributesRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        basicJanitorMonkeyContext0.sourceEmail = "Janitor Monkey Notification for hi!";
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = basicJanitorMonkeyContext0.getInstanceJanitor();
        // The following exception was thrown during execution in test generation
        try {
            instanceJanitor5.markResources();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonClientException; message: Unable to load AWS credentials from any provider in the chain");
        } catch (com.amazonaws.AmazonClientException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(janitorEmailNotifier1);
        org.junit.Assert.assertNotNull(launchConfigJanitor2);
        org.junit.Assert.assertNotNull(instanceJanitor5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        janitorEmailNotifier3.sendEmail("us-west-1", "hi!", "us-west-1");
        java.lang.String[] strArray9 = janitorEmailNotifier3.getCcAddresses("hi!");
        java.lang.String str11 = janitorEmailNotifier3.getSourceAddress("");
        boolean boolean13 = janitorEmailNotifier3.isValidEmail("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        basicJanitorMonkeyContext0.sourceEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext5.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = basicJanitorMonkeyContext5.calendar();
        basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar8;
        basicJanitorMonkeyContext0.exportCredentials("Janitor Monkey Notification for hi!", "email");
        org.junit.Assert.assertNotNull(monkeyCalendar8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        amazonSimpleEmailServiceClient1.setTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verifyDomainIdentityRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult verifyDomainIdentityResult9 = amazonSimpleEmailServiceClient1.verifyDomainIdentity(verifyDomainIdentityRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_6 = null;
        amazonWebServiceClient3.removeRequestHandler(requestHandler2_6);
        java.lang.String str8 = amazonWebServiceClient3.getServiceName();
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient10 = amazonWebServiceClient3.withTimeOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "email" + "'", str8, "email");
        org.junit.Assert.assertNotNull(amazonWebServiceClient10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext8.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = null; // flaky: basicJanitorMonkeyContext12.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null; // flaky: basicJanitorMonkeyContext12.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar11, monkeyConfiguration14, monkeyRecorder15);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor17 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient3, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier13);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext18.ruleEngine = janitorRuleEngine19;
        basicJanitorContext18.region = "";
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor23 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient17, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext3.monkeyRegion = "us-west-1";
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = null; // flaky: basicJanitorMonkeyContext3.janitors();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = null; // flaky: basicJanitorMonkeyContext3.monkeyCalendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = null; // flaky: basicJanitorMonkeyContext9.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor11 = null; // flaky: basicJanitorMonkeyContext9.getLaunchConfigJanitor();
// flaky:         basicJanitorMonkeyContext9.sourceEmail = "Janitor Monkey Notification for hi!";
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor14 = null; // flaky: basicJanitorMonkeyContext9.getInstanceJanitor();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext9.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        basicJanitorContext16.ruleEngine = janitorRuleEngine17;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext16.crawler = janitorCrawler19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient22 = null; // flaky: basicJanitorMonkeyContext21.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null; // flaky: basicJanitorMonkeyContext21.configuration();
        basicJanitorContext16.config = monkeyConfiguration23;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine30 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler31 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker32 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler35 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker36 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext37 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext37.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar40 = null; // flaky: basicJanitorMonkeyContext37.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext41 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier42 = null; // flaky: basicJanitorMonkeyContext41.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration43 = null; // flaky: basicJanitorMonkeyContext41.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine34, janitorCrawler35, janitorResourceTracker36, monkeyCalendar40, monkeyConfiguration43, monkeyRecorder44);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine47 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler48 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker49 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext50 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext51 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier52 = null; // flaky: basicJanitorMonkeyContext51.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration53 = null; // flaky: basicJanitorMonkeyContext51.configuration();
        basicJanitorContext50.config = monkeyConfiguration53;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext55 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext55.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar58 = null; // flaky: basicJanitorMonkeyContext55.calendar();
        basicJanitorContext50.calendar = monkeyCalendar58;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine61 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler62 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker63 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext64 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext64.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar67 = null; // flaky: basicJanitorMonkeyContext64.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext68 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier69 = null; // flaky: basicJanitorMonkeyContext68.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration70 = null; // flaky: basicJanitorMonkeyContext68.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder71 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext72 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine61, janitorCrawler62, janitorResourceTracker63, monkeyCalendar67, monkeyConfiguration70, monkeyRecorder71);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder73 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext74 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine47, janitorCrawler48, janitorResourceTracker49, monkeyCalendar58, monkeyConfiguration70, monkeyRecorder73);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder75 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext76 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine30, janitorCrawler31, janitorResourceTracker32, monkeyCalendar40, monkeyConfiguration70, monkeyRecorder75);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext77 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier78 = null; // flaky: basicJanitorMonkeyContext77.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration79 = null; // flaky: basicJanitorMonkeyContext77.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext80 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str81 = null; // flaky: basicJanitorMonkeyContext80.monkeyRegion;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder82 = null; // flaky: basicJanitorMonkeyContext80.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext83 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine26, janitorCrawler27, janitorResourceTracker28, monkeyCalendar40, monkeyConfiguration79, monkeyRecorder82);
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext84 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("email", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker8, monkeyCalendar15, monkeyConfiguration23, monkeyRecorder82);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList6);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar7);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier10);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor11);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient22);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar40);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier42);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration43);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier52);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration53);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar58);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar67);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier69);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration70);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier78);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration79);
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "us-west-1" + "'", str81, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder82);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest getSendStatisticsRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult3 = amazonSimpleEmailServiceClient1.getSendStatistics(getSendStatisticsRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        java.lang.String str6 = amazonSimpleEmailServiceClient1.getServiceName();
        com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest putIdentityPolicyRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult putIdentityPolicyResult8 = amazonSimpleEmailServiceClient1.putIdentityPolicy(putIdentityPolicyRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "email" + "'", str6, "email");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        java.lang.String str6 = amazonSimpleEmailServiceClient1.getServiceName();
        com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult getIdentityVerificationAttributesResult8 = amazonSimpleEmailServiceClient1.getIdentityVerificationAttributes(getIdentityVerificationAttributesRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "email" + "'", str6, "email");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest deleteIdentityPolicyRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult deleteIdentityPolicyResult2 = amazonSimpleEmailServiceClient0.deleteIdentityPolicy(deleteIdentityPolicyRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
// flaky:         janitorEmailNotifier3.sendEmail("us-west-1", "", "");
// flaky:         janitorEmailNotifier3.sendEmail("us-west-1", "us-west-1", "");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             janitorEmailNotifier3.sendNotifications();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Default email foo@bar.com is invalid");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine1;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder3 = basicJanitorContext0.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = basicJanitorContext0.calendar;
        org.junit.Assert.assertNull(monkeyRecorder3);
        org.junit.Assert.assertNull(monkeyCalendar4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        java.lang.String str6 = amazonSimpleEmailServiceClient1.getServiceName();
        com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verifyDomainIdentityRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult verifyDomainIdentityResult8 = amazonSimpleEmailServiceClient1.verifyDomainIdentity(verifyDomainIdentityRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "email" + "'", str6, "email");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection3 = null; // flaky: launchConfigJanitor2.getCleanedResources();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.handlers.RequestHandler requestHandler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.addRequestHandler(requestHandler1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray6;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder8 = null; // flaky: basicJanitorMonkeyContext3.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.janitorEmailBuilder = janitorEmailBuilder8;
        java.util.Map<java.lang.String, java.util.Collection<com.netflix.simianarmy.Resource>> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             janitorEmailBuilder8.setEmailToResources(strMap10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
        org.junit.Assert.assertNotNull(strArray6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
// flaky:         janitorEmailNotifier3.sendEmail("us-west-1", "", "");
        java.lang.String str9 = null; // flaky: janitorEmailNotifier3.getSourceAddress("");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        amazonWebServiceClient3.setEndpoint("us-west-1");
        java.lang.String str8 = amazonWebServiceClient3.getServiceName();
        java.lang.String str9 = amazonWebServiceClient3.getServiceName();
        java.lang.String str10 = amazonWebServiceClient3.getServiceName();
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "us-west-1" + "'", str9, "us-west-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "us-west-1" + "'", str10, "us-west-1");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext18 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext19 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier20 = null; // flaky: basicJanitorMonkeyContext19.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = null; // flaky: basicJanitorMonkeyContext19.configuration();
        basicJanitorContext18.config = monkeyConfiguration21;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor23 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient17, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier20);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null; // flaky: basicJanitorMonkeyContext0.janitorResourceTracker;
        java.lang.String str13 = null; // flaky: basicJanitorMonkeyContext0.sourceEmail;
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest listIdentityPoliciesRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult listIdentityPoliciesResult2 = amazonSimpleEmailServiceClient0.listIdentityPolicies(listIdentityPoliciesRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient18 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient18;
        com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest verifyDomainDkimRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult verifyDomainDkimResult21 = amazonSimpleEmailServiceClient18.verifyDomainDkim(verifyDomainDkimRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.Class<?> wildcardClass3 = null; // flaky: launchConfigJanitor2.getClass();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray6;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder8 = null; // flaky: basicJanitorMonkeyContext3.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext3.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier12 = null; // flaky: basicJanitorMonkeyContext11.emailNotifier();
// flaky:         basicJanitorMonkeyContext3.emailNotifier = janitorEmailNotifier12;
// flaky:         basicJanitorMonkeyContext3.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null; // flaky: basicJanitorMonkeyContext3.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext17 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier18 = null; // flaky: basicJanitorMonkeyContext17.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null; // flaky: basicJanitorMonkeyContext17.configuration();
        basicJanitorContext16.config = monkeyConfiguration19;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext21.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null; // flaky: basicJanitorMonkeyContext21.calendar();
        basicJanitorContext16.calendar = monkeyCalendar24;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext26 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = null;
        basicJanitorContext26.ruleEngine = janitorRuleEngine27;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler29 = null;
        basicJanitorContext26.crawler = janitorCrawler29;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext31 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient32 = null; // flaky: basicJanitorMonkeyContext31.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration33 = null; // flaky: basicJanitorMonkeyContext31.configuration();
        basicJanitorContext26.config = monkeyConfiguration33;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext35 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext35.monkeyRegion = "us-west-1";
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList38 = null; // flaky: basicJanitorMonkeyContext35.janitors();
        com.netflix.simianarmy.MonkeyRecorder.Event event39 = null;
// flaky:         basicJanitorMonkeyContext35.reportEvent(event39);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder41 = null; // flaky: basicJanitorMonkeyContext35.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext42 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker15, monkeyCalendar24, monkeyConfiguration33, monkeyRecorder41);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder43 = basicJanitorContext42.recorder;
        org.junit.Assert.assertNotNull(strArray6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder8);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier12);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker15);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier18);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration19);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar24);
// flaky:         org.junit.Assert.assertNotNull(aWSClient32);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration33);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList38);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder41);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder43);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient18 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient18;
        com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult setIdentityNotificationTopicResult21 = amazonSimpleEmailServiceClient18.setIdentityNotificationTopic(setIdentityNotificationTopicRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.ImageJanitor imageJanitor11 = basicJanitorMonkeyContext0.getImageJanitor();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Image Janitor only works when Edda is enabled.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext8.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = null; // flaky: basicJanitorMonkeyContext12.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null; // flaky: basicJanitorMonkeyContext12.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar11, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext22.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null; // flaky: basicJanitorMonkeyContext22.configuration();
        basicJanitorContext21.config = monkeyConfiguration24;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext26.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar29 = null; // flaky: basicJanitorMonkeyContext26.calendar();
        basicJanitorContext21.calendar = monkeyCalendar29;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine32 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler33 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker34 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext35 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext35.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar38 = null; // flaky: basicJanitorMonkeyContext35.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier40 = null; // flaky: basicJanitorMonkeyContext39.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration41 = null; // flaky: basicJanitorMonkeyContext39.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder42 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine32, janitorCrawler33, janitorResourceTracker34, monkeyCalendar38, monkeyConfiguration41, monkeyRecorder42);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker20, monkeyCalendar29, monkeyConfiguration41, monkeyRecorder44);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder46 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext47 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar11, monkeyConfiguration41, monkeyRecorder46);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration48 = basicJanitorContext47.configuration();
        java.lang.String str49 = basicJanitorContext47.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine50 = null;
        basicJanitorContext47.ruleEngine = janitorRuleEngine50;
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier13);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration14);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration24);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar29);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar38);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier40);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration41);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Janitor Monkey Notification for hi!" + "'", str49, "Janitor Monkey Notification for hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor6 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection7 = null; // flaky: instanceJanitor6.getMarkedResources();
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor6);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
// flaky:         org.junit.Assert.assertNotNull(aWSClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             launchConfigJanitor2.markResources();
// flaky:             org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: The AWS Access Key Id you provided does not exist in our records. (Service: AmazonSimpleDB; Status Code: 403; Error Code: InvalidClientTokenId; Request ID: e93d8d68-8778-5a52-ab00-5c68d40a934e)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext7.ccEmails = strArray10;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder12 = null; // flaky: basicJanitorMonkeyContext7.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext7.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier16 = null; // flaky: basicJanitorMonkeyContext15.emailNotifier();
// flaky:         basicJanitorMonkeyContext7.emailNotifier = janitorEmailNotifier16;
// flaky:         basicJanitorMonkeyContext7.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = null; // flaky: basicJanitorMonkeyContext7.janitorResourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext20 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier22 = null; // flaky: basicJanitorMonkeyContext21.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null; // flaky: basicJanitorMonkeyContext21.configuration();
        basicJanitorContext20.config = monkeyConfiguration23;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext25 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext25.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null; // flaky: basicJanitorMonkeyContext25.calendar();
        basicJanitorContext20.calendar = monkeyCalendar28;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine31 = null;
        basicJanitorContext30.ruleEngine = janitorRuleEngine31;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler33 = null;
        basicJanitorContext30.crawler = janitorCrawler33;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext35 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient36 = null; // flaky: basicJanitorMonkeyContext35.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration37 = null; // flaky: basicJanitorMonkeyContext35.configuration();
        basicJanitorContext30.config = monkeyConfiguration37;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext39.monkeyRegion = "us-west-1";
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList42 = null; // flaky: basicJanitorMonkeyContext39.janitors();
        com.netflix.simianarmy.MonkeyRecorder.Event event43 = null;
// flaky:         basicJanitorMonkeyContext39.reportEvent(event43);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder45 = null; // flaky: basicJanitorMonkeyContext39.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext46 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker19, monkeyCalendar28, monkeyConfiguration37, monkeyRecorder45);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor47 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient3, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
        org.junit.Assert.assertNotNull(strArray10);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder12);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier16);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker19);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier22);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration23);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar28);
// flaky:         org.junit.Assert.assertNotNull(aWSClient36);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration37);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList42);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder45);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine3 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler4 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker5 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext6 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext7 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier8 = null; // flaky: basicJanitorMonkeyContext7.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null; // flaky: basicJanitorMonkeyContext7.configuration();
        basicJanitorContext6.config = monkeyConfiguration9;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        basicJanitorContext6.calendar = monkeyCalendar14;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext20 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext20.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null; // flaky: basicJanitorMonkeyContext20.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext24 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier25 = null; // flaky: basicJanitorMonkeyContext24.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = null; // flaky: basicJanitorMonkeyContext24.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext28 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine17, janitorCrawler18, janitorResourceTracker19, monkeyCalendar23, monkeyConfiguration26, monkeyRecorder27);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder29 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext30 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine3, janitorCrawler4, janitorResourceTracker5, monkeyCalendar14, monkeyConfiguration26, monkeyRecorder29);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor31 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient1, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(aWSClient1);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier8);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration9);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar14);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar23);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier25);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration26);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor3 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor12 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "Janitor Monkey Notification for hi!";
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (byte) -1;
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor6 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        basicJanitorContext4.ruleEngine = janitorRuleEngine5;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = basicJanitorContext4.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        basicJanitorContext4.ruleEngine = janitorRuleEngine8;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = basicJanitorContext4.ruleEngine;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor11 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient3, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
        org.junit.Assert.assertNull(monkeyRecorder7);
        org.junit.Assert.assertNull(janitorRuleEngine10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verifyDomainIdentityRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult verifyDomainIdentityResult7 = amazonSimpleEmailServiceClient1.verifyDomainIdentity(verifyDomainIdentityRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context3 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.accountName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient2);
// flaky:         org.junit.Assert.assertNotNull(context3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.amazonaws.auth.AWSCredentials aWSCredentials6 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient7 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials6);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient9 = amazonSimpleEmailServiceClient7.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient7.setTimeOffset((int) (byte) 100);
        amazonSimpleEmailServiceClient7.setTimeOffset((int) 'a');
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient7;
        com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verifyDomainIdentityRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult verifyDomainIdentityResult16 = amazonSimpleEmailServiceClient7.verifyDomainIdentity(verifyDomainIdentityRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
        org.junit.Assert.assertNotNull(amazonWebServiceClient9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext1 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext1.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext1.configuration();
        basicJanitorContext0.config = monkeyConfiguration3;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = basicJanitorContext0.janitorCrawler();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
        org.junit.Assert.assertNull(janitorCrawler6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.deleteVerifiedEmailAddress(deleteVerifiedEmailAddressRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        java.lang.String str2 = null; // flaky: basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor3 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.defaultEmail;
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor3);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.region();
// flaky:         org.junit.Assert.assertNotNull(aWSClient1);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient2 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult3 = null; // flaky: amazonSimpleEmailServiceClient2.getSendStatistics();
// flaky:             org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: The security token included in the request is invalid. (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: InvalidClientTokenId; Request ID: 813ecfac-017b-410c-a1e5-9bc3a5aa8b19)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String str0 = com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "owner" + "'", str0, "owner");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        java.lang.String str6 = amazonSimpleEmailServiceClient1.getServiceName();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest7 = null;
        com.amazonaws.ResponseMetadata responseMetadata8 = amazonSimpleEmailServiceClient1.getCachedResponseMetadata(amazonWebServiceRequest7);
        com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult getIdentityVerificationAttributesResult10 = amazonSimpleEmailServiceClient1.getIdentityVerificationAttributes(getIdentityVerificationAttributesRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "email" + "'", str6, "email");
        org.junit.Assert.assertNull(responseMetadata8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient0 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
        com.amazonaws.regions.Regions regions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient0.configureRegion(regions1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext9.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null; // flaky: basicJanitorMonkeyContext9.calendar();
        basicJanitorContext7.calendar = monkeyCalendar12;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier17 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        basicJanitorContext15.config = monkeyConfiguration18;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext15.configuration();
        basicJanitorContext7.config = monkeyConfiguration20;
        org.junit.Assert.assertNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar12);
        org.junit.Assert.assertNull(janitorCrawler14);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier17);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration18);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration20);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor8 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection9 = null; // flaky: eBSVolumeJanitor8.getUnmarkedResources();
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList6);
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor8);
// flaky:         org.junit.Assert.assertNotNull(resourceCollection9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        java.lang.String str7 = null; // flaky: janitorEmailNotifier5.buildEmailSubject("owner");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Janitor Monkey Notification for owner" + "'", str7, "Janitor Monkey Notification for owner");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (byte) -1;
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyRecorder.Event event6 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event6);
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        int int4 = amazonSimpleEmailServiceClient1.getTimeOffset();
        com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest putIdentityPolicyRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult putIdentityPolicyResult6 = amazonSimpleEmailServiceClient1.putIdentityPolicy(putIdentityPolicyRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        amazonSimpleEmailServiceClient1.setTimeOffset((int) 'a');
        com.amazonaws.services.simpleemail.model.GetSendQuotaRequest getSendQuotaRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendQuotaResult getSendQuotaResult9 = amazonSimpleEmailServiceClient1.getSendQuota(getSendQuotaRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        com.amazonaws.regions.Region region6 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.setRegion(region6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient18 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient18;
        com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest listIdentityPoliciesRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult listIdentityPoliciesResult21 = amazonSimpleEmailServiceClient18.listIdentityPolicies(listIdentityPoliciesRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient17);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        java.lang.String str6 = amazonSimpleEmailServiceClient1.getServiceName();
        com.amazonaws.AmazonWebServiceRequest amazonWebServiceRequest7 = null;
        com.amazonaws.ResponseMetadata responseMetadata8 = amazonSimpleEmailServiceClient1.getCachedResponseMetadata(amazonWebServiceRequest7);
        com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest getSendStatisticsRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetSendStatisticsResult getSendStatisticsResult10 = amazonSimpleEmailServiceClient1.getSendStatistics(getSendStatisticsRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "email" + "'", str6, "email");
        org.junit.Assert.assertNull(responseMetadata8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext1 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext1.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext1.configuration();
        basicJanitorContext0.config = monkeyConfiguration3;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext6.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null; // flaky: basicJanitorMonkeyContext6.configuration();
        basicJanitorContext0.config = monkeyConfiguration8;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine10;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext0.janitorRuleEngine();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(janitorRuleEngine12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "owner";
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        int int6 = amazonWebServiceClient3.getTimeOffset();
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = ' ';
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
// flaky:         basicJanitorMonkeyContext0.sourceEmail = "Janitor Monkey Notification for hi!";
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null; // flaky: basicJanitorMonkeyContext0.calendar();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "hi!";
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor5);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient18 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient18;
        com.amazonaws.regions.Region region20 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonSimpleEmailServiceClient18.setRegion(region20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient17);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        java.lang.String str6 = null; // flaky: janitorEmailNotifier4.buildEmailSubject("hi!");
        java.lang.String str8 = null; // flaky: janitorEmailNotifier4.buildEmailSubject("us-west-1");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Janitor Monkey Notification for hi!" + "'", str6, "Janitor Monkey Notification for hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Janitor Monkey Notification for us-west-1" + "'", str8, "Janitor Monkey Notification for us-west-1");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
// flaky:         janitorEmailNotifier3.sendEmail("us-west-1", "hi!", "us-west-1");
        java.lang.String[] strArray9 = null; // flaky: janitorEmailNotifier3.getCcAddresses("hi!");
        java.lang.String[] strArray11 = null; // flaky: janitorEmailNotifier3.getCcAddresses("Janitor Monkey Notification for hi!");
        java.lang.String str13 = null; // flaky: janitorEmailNotifier3.getSourceAddress("");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient1 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.amazonaws.ClientConfiguration clientConfiguration3 = null;
        com.amazonaws.metrics.RequestMetricCollector requestMetricCollector4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient5 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentialsProvider2, clientConfiguration3, requestMetricCollector4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(aWSClient1);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        basicJanitorContext4.ruleEngine = janitorRuleEngine5;
        basicJanitorContext4.region = "";
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor9 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient3, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier5 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier6 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier8 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext4 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder5 = null;
        basicJanitorContext4.recorder = monkeyRecorder5;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext11 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext11.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null; // flaky: basicJanitorMonkeyContext11.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext17 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine8, janitorCrawler9, janitorResourceTracker10, monkeyCalendar14, monkeyConfiguration15, monkeyRecorder16);
        basicJanitorContext4.calendar = monkeyCalendar14;
        basicJanitorContext4.region = "email";
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor21 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient3, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(aWSClient3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        java.lang.String str7 = null; // flaky: basicJanitorMonkeyContext0.defaultEmail;
        com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor eBSVolumeJanitor8 = null; // flaky: basicJanitorMonkeyContext0.getEBSVolumeJanitor();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "default";
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList6);
// flaky:         org.junit.Assert.assertNotNull(eBSVolumeJanitor8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
// flaky:         basicJanitorMonkeyContext0.exportCredentials("us-west-1", "hi!");
        java.lang.String[] strArray6 = null; // flaky: basicJanitorMonkeyContext0.ccEmails;
// flaky:         org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler1 = basicJanitorContext0.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = basicJanitorContext0.recorder();
        org.junit.Assert.assertNull(janitorCrawler1);
        org.junit.Assert.assertNull(monkeyRecorder2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
// flaky:         janitorEmailNotifier3.sendEmail("us-west-1", "hi!", "us-west-1");
        java.lang.String[] strArray9 = null; // flaky: janitorEmailNotifier3.getCcAddresses("hi!");
        java.lang.String str11 = null; // flaky: janitorEmailNotifier3.getSourceAddress("");
        java.util.Map<java.lang.String, java.util.Collection<com.netflix.simianarmy.Resource>> strMap12 = null; // flaky: janitorEmailNotifier3.getInvalidEmailToResources();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
// flaky:         janitorEmailNotifier3.sendEmail("us-west-1", "hi!", "us-west-1");
        java.lang.String[] strArray9 = null; // flaky: janitorEmailNotifier3.getCcAddresses("hi!");
        java.lang.String[] strArray11 = null; // flaky: janitorEmailNotifier3.getCcAddresses("Janitor Monkey Notification for hi!");
        java.lang.String str13 = null; // flaky: janitorEmailNotifier3.buildEmailSubject("owner");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(strArray11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Janitor Monkey Notification for owner" + "'", str13, "Janitor Monkey Notification for owner");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        int int4 = amazonSimpleEmailServiceClient1.getTimeOffset();
        com.amazonaws.handlers.RequestHandler2 requestHandler2_5 = null;
        amazonSimpleEmailServiceClient1.addRequestHandler(requestHandler2_5);
        com.amazonaws.services.simpleemail.model.SendEmailRequest sendEmailRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.SendEmailResult sendEmailResult8 = amazonSimpleEmailServiceClient1.sendEmail(sendEmailRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor5 = null; // flaky: basicJanitorMonkeyContext3.getLaunchConfigJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext6.ccEmails = strArray9;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder11 = null; // flaky: basicJanitorMonkeyContext6.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext3.janitorEmailBuilder = janitorEmailBuilder11;
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor13 = null; // flaky: basicJanitorMonkeyContext3.getInstanceJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext14.ccEmails = strArray17;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder19 = null; // flaky: basicJanitorMonkeyContext14.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext14.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext22.emailNotifier();
// flaky:         basicJanitorMonkeyContext14.emailNotifier = janitorEmailNotifier23;
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null; // flaky: basicJanitorMonkeyContext14.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.janitorResourceTracker = janitorResourceTracker26;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext28.monkeyRegion = "us-west-1";
// flaky:         basicJanitorMonkeyContext28.sourceEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext33.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar36 = null; // flaky: basicJanitorMonkeyContext33.calendar();
// flaky:         basicJanitorMonkeyContext28.monkeyCalendar = monkeyCalendar36;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine39 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler40 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker41 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration43 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine39, janitorCrawler40, janitorResourceTracker41, monkeyCalendar42, monkeyConfiguration43, monkeyRecorder44);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker46 = basicJanitorContext45.resourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext47 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext47.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = null; // flaky: basicJanitorMonkeyContext47.calendar();
        basicJanitorContext45.calendar = monkeyCalendar50;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext52 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient53 = null; // flaky: basicJanitorMonkeyContext52.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration54 = null; // flaky: basicJanitorMonkeyContext52.configuration();
        basicJanitorContext45.config = monkeyConfiguration54;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder56 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext57 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker26, monkeyCalendar36, monkeyConfiguration54, monkeyRecorder56);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker58 = basicJanitorContext57.resourceTracker;
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor5);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder11);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor13);
        org.junit.Assert.assertNotNull(strArray17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder19);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker26);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar36);
        org.junit.Assert.assertNull(janitorResourceTracker46);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar50);
// flaky:         org.junit.Assert.assertNotNull(aWSClient53);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration54);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker58);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder1 = null;
        basicJanitorContext0.recorder = monkeyRecorder1;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext12.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null; // flaky: basicJanitorMonkeyContext12.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext16 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier17 = null; // flaky: basicJanitorMonkeyContext16.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null; // flaky: basicJanitorMonkeyContext16.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext20 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine9, janitorCrawler10, janitorResourceTracker11, monkeyCalendar15, monkeyConfiguration18, monkeyRecorder19);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext25 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier27 = null; // flaky: basicJanitorMonkeyContext26.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null; // flaky: basicJanitorMonkeyContext26.configuration();
        basicJanitorContext25.config = monkeyConfiguration28;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext30 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext30.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar33 = null; // flaky: basicJanitorMonkeyContext30.calendar();
        basicJanitorContext25.calendar = monkeyCalendar33;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine36 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler37 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker38 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext39.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = null; // flaky: basicJanitorMonkeyContext39.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext43 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier44 = null; // flaky: basicJanitorMonkeyContext43.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration45 = null; // flaky: basicJanitorMonkeyContext43.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder46 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext47 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine36, janitorCrawler37, janitorResourceTracker38, monkeyCalendar42, monkeyConfiguration45, monkeyRecorder46);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder48 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext49 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine22, janitorCrawler23, janitorResourceTracker24, monkeyCalendar33, monkeyConfiguration45, monkeyRecorder48);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder50 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext51 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar15, monkeyConfiguration45, monkeyRecorder50);
        basicJanitorContext0.config = monkeyConfiguration45;
        org.junit.Assert.assertNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar15);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier17);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration18);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier27);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration28);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar33);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar42);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier44);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration45);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
// flaky:         basicJanitorMonkeyContext0.sourceEmail = "Janitor Monkey Notification for hi!";
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor5);
// flaky:         org.junit.Assert.assertNotNull(context6);
// flaky:         org.junit.Assert.assertNotNull(context7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext9 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext9.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = null; // flaky: basicJanitorMonkeyContext9.calendar();
        basicJanitorContext7.calendar = monkeyCalendar12;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier16 = null; // flaky: basicJanitorMonkeyContext15.emailNotifier();
        java.lang.String str17 = null; // flaky: basicJanitorMonkeyContext15.defaultEmail;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor18 = null; // flaky: basicJanitorMonkeyContext15.getLaunchConfigJanitor();
        java.util.Set<java.lang.String> strSet19 = null; // flaky: basicJanitorMonkeyContext15.getEnabledResourceSet();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor20 = null; // flaky: basicJanitorMonkeyContext15.getInstanceJanitor();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = null; // flaky: basicJanitorMonkeyContext15.recorder();
        basicJanitorContext7.recorder = monkeyRecorder21;
        org.junit.Assert.assertNull(janitorResourceTracker8);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar12);
        org.junit.Assert.assertNull(janitorCrawler14);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier16);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor18);
// flaky:         org.junit.Assert.assertNotNull(strSet19);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor20);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder21);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient7 = amazonWebServiceClient3.withTimeOffset((int) (short) -1);
        amazonWebServiceClient3.setTimeOffset((int) '4');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_10 = null;
        amazonWebServiceClient3.removeRequestHandler(requestHandler2_10);
        com.amazonaws.regions.Regions regions12 = null;
        // The following exception was thrown during execution in test generation
        try {
            amazonWebServiceClient3.configureRegion(regions12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No region provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertNotNull(amazonWebServiceClient7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        amazonWebServiceClient3.setEndpoint("us-west-1");
        java.lang.String str8 = amazonWebServiceClient3.getServiceName();
        amazonWebServiceClient3.setServiceNameIntern("");
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient12 = amazonWebServiceClient3.withTimeOffset((int) '#');
        java.lang.String str13 = amazonWebServiceClient12.getServiceName();
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
        org.junit.Assert.assertNotNull(amazonWebServiceClient12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: basicJanitorMonkeyContext3.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor5 = null; // flaky: basicJanitorMonkeyContext3.getLaunchConfigJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext6.ccEmails = strArray9;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder11 = null; // flaky: basicJanitorMonkeyContext6.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext3.janitorEmailBuilder = janitorEmailBuilder11;
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor13 = null; // flaky: basicJanitorMonkeyContext3.getInstanceJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext14 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext14.ccEmails = strArray17;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder19 = null; // flaky: basicJanitorMonkeyContext14.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext14.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext22.emailNotifier();
// flaky:         basicJanitorMonkeyContext14.emailNotifier = janitorEmailNotifier23;
// flaky:         basicJanitorMonkeyContext14.resetEventReport();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null; // flaky: basicJanitorMonkeyContext14.janitorResourceTracker;
// flaky:         basicJanitorMonkeyContext3.janitorResourceTracker = janitorResourceTracker26;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext28 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext28.monkeyRegion = "us-west-1";
// flaky:         basicJanitorMonkeyContext28.sourceEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext33 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext33.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar36 = null; // flaky: basicJanitorMonkeyContext33.calendar();
// flaky:         basicJanitorMonkeyContext28.monkeyCalendar = monkeyCalendar36;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine39 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler40 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker41 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar42 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration43 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine39, janitorCrawler40, janitorResourceTracker41, monkeyCalendar42, monkeyConfiguration43, monkeyRecorder44);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker46 = basicJanitorContext45.resourceTracker;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext47 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext47.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar50 = null; // flaky: basicJanitorMonkeyContext47.calendar();
        basicJanitorContext45.calendar = monkeyCalendar50;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext52 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient53 = null; // flaky: basicJanitorMonkeyContext52.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration54 = null; // flaky: basicJanitorMonkeyContext52.configuration();
        basicJanitorContext45.config = monkeyConfiguration54;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder56 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext57 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("us-west-1", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker26, monkeyCalendar36, monkeyConfiguration54, monkeyRecorder56);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder58 = basicJanitorContext57.recorder;
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier4);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor5);
        org.junit.Assert.assertNotNull(strArray9);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder11);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor13);
        org.junit.Assert.assertNotNull(strArray17);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder19);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(janitorResourceTracker26);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar36);
        org.junit.Assert.assertNull(janitorResourceTracker46);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar50);
// flaky:         org.junit.Assert.assertNotNull(aWSClient53);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration54);
        org.junit.Assert.assertNull(monkeyRecorder58);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        amazonWebServiceClient3.setEndpoint("us-west-1");
        amazonWebServiceClient3.setTimeOffset((int) (short) -1);
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
// flaky:         janitorEmailNotifier3.sendEmail("us-west-1", "hi!", "us-west-1");
        java.lang.String[] strArray9 = null; // flaky: janitorEmailNotifier3.getCcAddresses("hi!");
        java.lang.String str11 = null; // flaky: janitorEmailNotifier3.getSourceAddress("");
// flaky:         janitorEmailNotifier3.sendEmail("", "default", "");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
// flaky:         org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context2 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier3 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier4 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context2);
        boolean boolean6 = false; // flaky: janitorEmailNotifier4.isValidEmail("");
        java.util.Map<java.lang.String, java.util.Collection<com.netflix.simianarmy.Resource>> strMap7 = null; // flaky: janitorEmailNotifier4.getInvalidEmailToResources();
        java.lang.String str9 = null; // flaky: janitorEmailNotifier4.buildEmailSubject("hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-west-1" + "'", str1, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNotNull(strMap7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Janitor Monkey Notification for hi!" + "'", str9, "Janitor Monkey Notification for hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonWebServiceClient3.setServiceNameIntern("us-west-1");
        amazonWebServiceClient3.setEndpoint("us-west-1");
        java.lang.String str8 = amazonWebServiceClient3.getServiceName();
        java.net.URI uRI9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.auth.Signer signer10 = amazonWebServiceClient3.getSignerByURI(uRI9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "us-west-1" + "'", str8, "us-west-1");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList5 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext6.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = null; // flaky: basicJanitorMonkeyContext6.calendar();
        java.lang.String str10 = null; // flaky: basicJanitorMonkeyContext6.ownerEmailDomain;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder11 = null; // flaky: basicJanitorMonkeyContext6.janitorEmailBuilder;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str13 = null; // flaky: basicJanitorMonkeyContext12.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context14 = null; // flaky: basicJanitorMonkeyContext12.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier15 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context14);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier16 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context14);
        boolean boolean18 = false; // flaky: janitorEmailNotifier16.isValidEmail("");
        java.util.Map<java.lang.String, java.util.Collection<com.netflix.simianarmy.Resource>> strMap19 = null; // flaky: janitorEmailNotifier16.getInvalidEmailToResources();
// flaky:         janitorEmailBuilder11.setEmailToResources(strMap19);
// flaky:         basicJanitorMonkeyContext0.janitorEmailBuilder = janitorEmailBuilder11;
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList5);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "us-west-1" + "'", str13, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyRecorder.Event event18 = null;
// flaky:         basicJanitorMonkeyContext0.reportEvent(event18);
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.ImageJanitor imageJanitor20 = basicJanitorMonkeyContext0.getImageJanitor();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Image Janitor only works when Edda is enabled.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.client.edda.EddaClient eddaClient4 = null; // flaky: basicJanitorMonkeyContext0.createEddaClient();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(eddaClient4);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
// flaky:         basicJanitorMonkeyContext0.sourceEmail = "Janitor Monkey Notification for hi!";
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        java.lang.String str6 = null; // flaky: instanceJanitor5.getRegion();
        java.util.Collection<com.netflix.simianarmy.Resource> resourceCollection7 = null; // flaky: instanceJanitor5.getMarkedResources();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(resourceCollection7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        amazonWebServiceClient3.setSignerRegionOverride("");
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor4 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = null; // flaky: basicJanitorMonkeyContext0.getAwsCredentialsProvider();
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor4);
// flaky:         org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext1 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = null; // flaky: basicJanitorMonkeyContext1.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration3 = null; // flaky: basicJanitorMonkeyContext1.configuration();
        basicJanitorContext0.config = monkeyConfiguration3;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext6 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient7 = null; // flaky: basicJanitorMonkeyContext6.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = null; // flaky: basicJanitorMonkeyContext6.configuration();
        basicJanitorContext0.config = monkeyConfiguration8;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext0.recorder();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier2);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration3);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration5);
// flaky:         org.junit.Assert.assertNotNull(aWSClient7);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyRecorder10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray6;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList8 = null; // flaky: basicJanitorMonkeyContext3.janitors();
// flaky:         basicJanitorMonkeyContext0.janitors = abstractJanitorList8;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null; // flaky: basicJanitorMonkeyContext0.recorder();
        com.netflix.simianarmy.CloudClient cloudClient11 = null; // flaky: basicJanitorMonkeyContext0.cloudClient();
        org.junit.Assert.assertNotNull(strArray6);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList8);
// flaky:         org.junit.Assert.assertNotNull(monkeyRecorder10);
// flaky:         org.junit.Assert.assertNotNull(cloudClient11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.amazonaws.auth.AWSCredentials aWSCredentials6 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient7 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials6);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient9 = amazonSimpleEmailServiceClient7.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient7.setTimeOffset((int) (byte) 100);
        amazonSimpleEmailServiceClient7.setTimeOffset((int) 'a');
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient7;
        com.amazonaws.services.simpleemail.model.ListIdentitiesRequest listIdentitiesRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentitiesResult listIdentitiesResult16 = amazonSimpleEmailServiceClient7.listIdentities(listIdentitiesRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
        org.junit.Assert.assertNotNull(amazonWebServiceClient9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList3 = null; // flaky: basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext4 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str5 = null; // flaky: basicJanitorMonkeyContext4.monkeyRegion;
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = null; // flaky: basicJanitorMonkeyContext4.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier7 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context6);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier8 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context6);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context6);
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier10 = null; // flaky: new com.netflix.simianarmy.janitor.JanitorEmailNotifier(context6);
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier10;
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration2);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-west-1" + "'", str5, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(context6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        com.amazonaws.handlers.RequestHandler2 requestHandler2_4 = null;
        amazonWebServiceClient3.addRequestHandler(requestHandler2_4);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient7 = amazonWebServiceClient3.withTimeOffset((int) (short) -1);
        amazonWebServiceClient3.setTimeOffset((int) (byte) 100);
        com.amazonaws.handlers.RequestHandler2 requestHandler2_10 = null;
        amazonWebServiceClient3.removeRequestHandler(requestHandler2_10);
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertNotNull(amazonWebServiceClient7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        amazonSimpleEmailServiceClient1.setTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setEndpoint("default");
        com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult getIdentityVerificationAttributesResult11 = amazonSimpleEmailServiceClient1.getIdentityVerificationAttributes(getIdentityVerificationAttributesRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor eBSSnapshotJanitor5 = null; // flaky: basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine7 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext10 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext10.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null; // flaky: basicJanitorMonkeyContext10.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine7, janitorCrawler8, janitorResourceTracker9, monkeyCalendar13, monkeyConfiguration14, monkeyRecorder15);
// flaky:         basicJanitorMonkeyContext0.monkeyCalendar = monkeyCalendar13;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar4);
// flaky:         org.junit.Assert.assertNotNull(eBSSnapshotJanitor5);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        int int4 = amazonSimpleEmailServiceClient1.getTimeOffset();
        com.amazonaws.handlers.RequestHandler2 requestHandler2_5 = null;
        amazonSimpleEmailServiceClient1.addRequestHandler(requestHandler2_5);
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (short) 10);
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier1 = null; // flaky: basicJanitorMonkeyContext0.emailNotifier();
        com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor launchConfigJanitor2 = null; // flaky: basicJanitorMonkeyContext0.getLaunchConfigJanitor();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext3.ccEmails = strArray6;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder8 = null; // flaky: basicJanitorMonkeyContext3.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.janitorEmailBuilder = janitorEmailBuilder8;
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor10 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        java.lang.String str11 = null; // flaky: instanceJanitor10.getRegion();
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier1);
// flaky:         org.junit.Assert.assertNotNull(launchConfigJanitor2);
        org.junit.Assert.assertNotNull(strArray6);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder8);
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "us-west-1" + "'", str11, "us-west-1");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList6 = null; // flaky: basicJanitorMonkeyContext0.janitors();
// flaky:         basicJanitorMonkeyContext0.sourceEmail = "default";
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "email";
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(abstractJanitorList6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        int int4 = amazonSimpleEmailServiceClient1.getTimeOffset();
        com.amazonaws.handlers.RequestHandler2 requestHandler2_5 = null;
        amazonSimpleEmailServiceClient1.addRequestHandler(requestHandler2_5);
        com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest putIdentityPolicyRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult putIdentityPolicyResult8 = amazonSimpleEmailServiceClient1.putIdentityPolicy(putIdentityPolicyRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = null; // flaky: basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = null; // flaky: basicJanitorMonkeyContext0.ownerEmailDomain;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor6 = null; // flaky: basicJanitorMonkeyContext0.getInstanceJanitor();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context7 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertNotNull(instanceJanitor6);
// flaky:         org.junit.Assert.assertNotNull(context7);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.aws.janitor.ASGJanitor aSGJanitor12 = null; // flaky: basicJanitorMonkeyContext0.getASGJanitor();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null; // flaky: basicJanitorMonkeyContext0.configuration();
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
// flaky:         org.junit.Assert.assertNotNull(aSGJanitor12);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration13);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient5 = null; // flaky: basicJanitorMonkeyContext0.sesClient;
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(amazonSimpleEmailServiceClient5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
// flaky:         basicJanitorMonkeyContext0.resetEventReport();
// flaky:         basicJanitorMonkeyContext0.daysBeforeTermination = (byte) -1;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.janitor.AbstractJanitor.Context context18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor19 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient17, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient17);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        java.lang.String str3 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext5 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = basicJanitorContext5.janitorCrawler();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor7 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient4, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-west-1" + "'", str3, "us-west-1");
// flaky:         org.junit.Assert.assertNotNull(aWSClient4);
        org.junit.Assert.assertNull(janitorCrawler6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
// flaky:         basicJanitorMonkeyContext0.defaultEmail = "us-west-1";
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier9 = null; // flaky: basicJanitorMonkeyContext8.emailNotifier();
// flaky:         basicJanitorMonkeyContext0.emailNotifier = janitorEmailNotifier9;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "us-west-1", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray15;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient17 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient18 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient();
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient18;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.ListIdentitiesResult listIdentitiesResult20 = amazonSimpleEmailServiceClient18.listIdentities();
            org.junit.Assert.fail("Expected exception of type com.amazonaws.AmazonServiceException; message: The security token included in the request is invalid. (Service: AmazonSimpleEmailService; Status Code: 403; Error Code: InvalidClientTokenId; Request ID: 290fe528-9230-41ba-9f51-4c6e175d7d03)");
        } catch (com.amazonaws.AmazonServiceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier9);
        org.junit.Assert.assertNotNull(strArray15);
// flaky:         org.junit.Assert.assertNotNull(aWSClient17);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context3 = null; // flaky: basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
// flaky:         org.junit.Assert.assertNotNull(context3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient1 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials0);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient3 = amazonSimpleEmailServiceClient1.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient1.setTimeOffset((int) (byte) 100);
        com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest putIdentityPolicyRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult putIdentityPolicyResult7 = amazonSimpleEmailServiceClient1.putIdentityPolicy(putIdentityPolicyRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(amazonWebServiceClient3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler5 = null; // flaky: basicJanitorMonkeyContext0.scheduler();
        java.lang.String str6 = null; // flaky: basicJanitorMonkeyContext0.monkeyRegion;
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(monkeyScheduler5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-west-1" + "'", str6, "us-west-1");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine5 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler6 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext8.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null; // flaky: basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext12 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier13 = null; // flaky: basicJanitorMonkeyContext12.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null; // flaky: basicJanitorMonkeyContext12.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext16 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine5, janitorCrawler6, janitorResourceTracker7, monkeyCalendar11, monkeyConfiguration14, monkeyRecorder15);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext22 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier23 = null; // flaky: basicJanitorMonkeyContext22.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null; // flaky: basicJanitorMonkeyContext22.configuration();
        basicJanitorContext21.config = monkeyConfiguration24;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext26 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext26.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar29 = null; // flaky: basicJanitorMonkeyContext26.calendar();
        basicJanitorContext21.calendar = monkeyCalendar29;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine32 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler33 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker34 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext35 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
// flaky:         basicJanitorMonkeyContext35.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar38 = null; // flaky: basicJanitorMonkeyContext35.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext39 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier40 = null; // flaky: basicJanitorMonkeyContext39.emailNotifier();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration41 = null; // flaky: basicJanitorMonkeyContext39.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder42 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext43 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine32, janitorCrawler33, janitorResourceTracker34, monkeyCalendar38, monkeyConfiguration41, monkeyRecorder42);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder44 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext45 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine18, janitorCrawler19, janitorResourceTracker20, monkeyCalendar29, monkeyConfiguration41, monkeyRecorder44);
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder46 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext47 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("Janitor Monkey Notification for hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar11, monkeyConfiguration41, monkeyRecorder46);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration48 = basicJanitorContext47.configuration();
        java.lang.String str49 = basicJanitorContext47.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker50 = basicJanitorContext47.janitorResourceTracker();
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar11);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier13);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration14);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier23);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration24);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar29);
// flaky:         org.junit.Assert.assertNotNull(monkeyCalendar38);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailNotifier40);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration41);
// flaky:         org.junit.Assert.assertNotNull(monkeyConfiguration48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Janitor Monkey Notification for hi!" + "'", str49, "Janitor Monkey Notification for hi!");
        org.junit.Assert.assertNull(janitorResourceTracker50);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = null; // flaky: new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
// flaky:         basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = null; // flaky: basicJanitorMonkeyContext0.janitorEmailBuilder;
        com.amazonaws.auth.AWSCredentials aWSCredentials6 = null;
        com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient amazonSimpleEmailServiceClient7 = new com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient(aWSCredentials6);
        com.amazonaws.AmazonWebServiceClient amazonWebServiceClient9 = amazonSimpleEmailServiceClient7.withTimeOffset((int) 'a');
        amazonSimpleEmailServiceClient7.setTimeOffset((int) (byte) 100);
        amazonSimpleEmailServiceClient7.setTimeOffset((int) 'a');
// flaky:         basicJanitorMonkeyContext0.sesClient = amazonSimpleEmailServiceClient7;
        com.netflix.simianarmy.client.aws.AWSClient aWSClient15 = null; // flaky: basicJanitorMonkeyContext0.awsClient();
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertNotNull(janitorEmailBuilder5);
        org.junit.Assert.assertNotNull(amazonWebServiceClient9);
// flaky:         org.junit.Assert.assertNotNull(aWSClient15);
    }
}
